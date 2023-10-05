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

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.platform.LocalContext
import com.example.composecatalog.data.UserPreferencesRepository
import com.example.composecatalog.model.Theme
import com.example.composecatalog.ui.theme.CatalogTheme
import kotlinx.coroutines.launch

@Composable
fun Material3CatalogApp(initialFavoriteRoute: String?) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val userPreferencesRepository = remember { UserPreferencesRepository(context) }
    val theme = userPreferencesRepository.theme.collectAsState(Theme()).value
    CatalogTheme(theme = theme) {
        NavGraph(initialFavoriteRoute = initialFavoriteRoute,
                theme = theme,
                onThemeChange = {
                    coroutineScope.launch {
                        userPreferencesRepository.saveTheme(it)
                    }
                })
    }
}
