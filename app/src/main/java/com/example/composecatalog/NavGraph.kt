/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.composecatalog

import androidx.compose.material3.catalog.library.ui.example.Example
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composecatalog.data.UserPreferencesRepository
import com.example.composecatalog.model.Component
import com.example.composecatalog.model.Components
import com.example.composecatalog.model.Example
import com.example.composecatalog.model.Theme
import com.example.composecatalog.ui.component.Component
import com.example.composecatalog.ui.home.Home
import kotlinx.coroutines.launch

@Composable
fun NavGraph(
    initialFavoriteRoute: String?,
    theme: Theme,
    onThemeChange: (theme: Theme) -> Unit
) {
    val context = LocalContext.current
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val userPreferencesRepository = remember { UserPreferencesRepository(context) }
    var favoriteRoute by rememberSaveable { mutableStateOf(initialFavoriteRoute) }
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE
    ) {
        composable(HOME_ROUTE) {
            Home(
                components = Components,
                theme = theme,
                onThemeChange = onThemeChange,
                onComponentClick = { component -> navController.navigate(component.route()) },
                favorite = favoriteRoute == HOME_ROUTE,
                onFavoriteClick = {
                    favoriteRoute = if (favoriteRoute == HOME_ROUTE) null else HOME_ROUTE
                    coroutineScope.launch {
                        userPreferencesRepository.saveFavoriteRoute(favoriteRoute)
                    }
                }
            )
        }
        composable(
            route = "$COMPONENT_ROUTE/" +
                    "{$COMPONENT_ID_ARG_NAME}",
            arguments = listOf(
                navArgument(COMPONENT_ID_ARG_NAME) { type = NavType.IntType }
            )
        ) { navBackStackEntry ->
            val arguments = requireNotNull(navBackStackEntry.arguments) { "No arguments" }
            val componentId = arguments.getInt(COMPONENT_ID_ARG_NAME)
            val component = Components.first { component -> component.id == componentId }
            val componentRoute = component.route()
            Component(
                component = component,
                theme = theme,
                onThemeChange = onThemeChange,
                onExampleClick = { example -> navController.navigate(example.route(component)) },
                onBackClick = { navController.popBackStack() },
                favorite = favoriteRoute == componentRoute,
                onFavoriteClick = {
                    favoriteRoute = if (favoriteRoute == componentRoute) null else componentRoute
                    coroutineScope.launch {
                        userPreferencesRepository.saveFavoriteRoute(favoriteRoute)
                    }
                }
            )
        }
        composable(
            route = "$EXAMPLE_ROUTE/" +
                    "{$COMPONENT_ID_ARG_NAME}/" +
                    "{$EXAMPLE_INDEX_ARG_NAME}",
            arguments = listOf(
                navArgument(COMPONENT_ID_ARG_NAME) { type = NavType.IntType },
                navArgument(EXAMPLE_INDEX_ARG_NAME) { type = NavType.IntType }
            )
        ) { navBackStackEntry ->
            val arguments = requireNotNull(navBackStackEntry.arguments) { "No arguments" }
            val componentId = arguments.getInt(COMPONENT_ID_ARG_NAME)
            val exampleIndex = arguments.getInt(EXAMPLE_INDEX_ARG_NAME)
            val component = Components.first { component -> component.id == componentId }
            val example = component.examples[exampleIndex]
            val exampleRoute = example.route(component)
            Example(
                component = component,
                example = example,
                theme = theme,
                onThemeChange = onThemeChange,
                onBackClick = { navController.popBackStack() },
                favorite = favoriteRoute == exampleRoute,
                onFavoriteClick = {
                    favoriteRoute = if (favoriteRoute == exampleRoute) null else exampleRoute
                    coroutineScope.launch {
                        userPreferencesRepository.saveFavoriteRoute(favoriteRoute)
                    }
                }
            )
        }
    }

    var initialLaunch by rememberSaveable { mutableStateOf(true) }
    if (initialLaunch) {
        // Navigate to the favorite route only on initial launch, if there is one saved.
        maybeNavigate(navController, initialFavoriteRoute)
        initialLaunch = false
    }
}

private fun maybeNavigate(navController: NavHostController, route: String?) {
    if (route == null || navController.currentDestination?.route == route) {
        // Never navigate to a null route or the current route if we're already there.
        return
    }
    if (route.startsWith(EXAMPLE_ROUTE)) {
        // Navigate to the Component screen first so it's in the back stack as expected.
        val componentRoute =
            route.replace(EXAMPLE_ROUTE, COMPONENT_ROUTE).substringBeforeLast("/")
        navController.navigate(componentRoute)
    }
    navController.navigate(route)
}

private fun Component.route() = "$COMPONENT_ROUTE/$id"

private fun Example.route(component: Component) =
    "$EXAMPLE_ROUTE/${component.id}/${component.examples.indexOf(this)}"

const val Material3Route = "material3"
private const val HOME_ROUTE = "home"
private const val COMPONENT_ROUTE = "component"
private const val EXAMPLE_ROUTE = "example"
private const val COMPONENT_ID_ARG_NAME = "componentId"
private const val EXAMPLE_INDEX_ARG_NAME = "exampleIndex"
