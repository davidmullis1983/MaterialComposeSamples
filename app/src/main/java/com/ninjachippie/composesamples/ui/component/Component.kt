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

package com.ninjachippie.composesamples.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import com.ninjachippie.composesamples.model.Component
import com.ninjachippie.composesamples.model.Example
import com.ninjachippie.composesamples.model.Theme
import com.ninjachippie.composesamples.ui.common.CatalogScaffold
import com.ninjachippie.composesamples.ui.example.ExampleItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ninjachippie.composesamples.R

@Composable
fun Component(
    component: Component,
    theme: Theme,
    onThemeChange: (theme: Theme) -> Unit,
    onExampleClick: (example: Example) -> Unit,
    onBackClick: () -> Unit,
    favorite: Boolean = false,
    onFavoriteClick: () -> Unit,
) {
    val ltr = LocalLayoutDirection.current
    CatalogScaffold(
        topBarTitle = component.name,
        showBackNavigationIcon = true,
        theme = theme,
        guidelinesUrl = component.guidelinesUrl,
        docsUrl = component.docsUrl,
        sourceUrl = component.sourceUrl,
        onThemeChange = onThemeChange,
        onBackClick = onBackClick,
        favorite = favorite,
        onFavoriteClick = onFavoriteClick
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier.consumeWindowInsets(paddingValues),
            contentPadding = PaddingValues(
                start = paddingValues.calculateStartPadding(ltr) + componentPadding,
                top = paddingValues.calculateTopPadding() + componentPadding,
                end = paddingValues.calculateEndPadding(ltr) + componentPadding,
                bottom = paddingValues.calculateBottomPadding() + componentPadding
            )
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = componentIconVerticalPadding)
                ) {
                    Image(
                        painter = painterResource(id = component.icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(componentIconSize)
                            .align(Alignment.Center),
                        colorFilter = if (component.tintIcon) {
                            ColorFilter.tint(LocalContentColor.current)
                        } else {
                            null
                        }
                    )
                }
            }
            item {
                Text(
                    text = stringResource(id = R.string.description),
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(componentPadding))
                Text(
                    text = component.description,
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(componentDescriptionPadding))
            }
            item {
                Text(
                    text = stringResource(id = R.string.examples),
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(modifier = Modifier.height(componentPadding))
            }
            if (component.examples.isNotEmpty()) {
                items(component.examples) { example ->
                    ExampleItem(
                        example = example,
                        onClick = onExampleClick
                    )
                    Spacer(modifier = Modifier.height(exampleItemPadding))
                }
            } else {
                item {
                    Text(
                        text = stringResource(id = R.string.no_examples),
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(componentPadding))
                }
            }
        }
    }
}

private val componentIconSize = 108.dp
private val componentIconVerticalPadding = 42.dp
private val componentPadding = 16.dp
private val componentDescriptionPadding = 32.dp
private val exampleItemPadding = 8.dp
