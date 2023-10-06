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

package com.ninjachippie.composesamples.ui.common

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberModalBottomSheetState
import com.ninjachippie.composesamples.model.Theme
import com.ninjachippie.composesamples.ui.theme.ThemePicker
import com.ninjachippie.composesamples.util.GuidelinesUrl
import com.ninjachippie.composesamples.util.IssueUrl
import com.ninjachippie.composesamples.util.LicensesUrl
import com.ninjachippie.composesamples.util.PrivacyUrl
import com.ninjachippie.composesamples.util.ReleasesUrl
import com.ninjachippie.composesamples.util.SourceUrl
import com.ninjachippie.composesamples.util.TermsUrl
import com.ninjachippie.composesamples.util.openUrl
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CatalogScaffold(
    topBarTitle: String,
    showBackNavigationIcon: Boolean = false,
    theme: Theme,
    guidelinesUrl: String = GuidelinesUrl,
    docsUrl: String = ReleasesUrl,
    sourceUrl: String = SourceUrl,
    issueUrl: String = IssueUrl,
    termsUrl: String = TermsUrl,
    privacyUrl: String = PrivacyUrl,
    licensesUrl: String = LicensesUrl,
    onThemeChange: (theme: Theme) -> Unit,
    onBackClick: () -> Unit = {},
    favorite: Boolean,
    onFavoriteClick: () -> Unit,
    content: @Composable (PaddingValues) -> Unit
) {
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val sheetState = rememberModalBottomSheetState()
    var openThemePicker by rememberSaveable { mutableStateOf(false) }

    Scaffold(
        topBar = {
            CatalogTopAppBar(
                title = topBarTitle,
                showBackNavigationIcon = showBackNavigationIcon,
                scrollBehavior = scrollBehavior,
                onBackClick = onBackClick,
                favorite = favorite,
                onFavoriteClick = onFavoriteClick,
                onThemeClick = { openThemePicker = true },
                onGuidelinesClick = { context.openUrl(guidelinesUrl) },
                onDocsClick = { context.openUrl(docsUrl) },
                onSourceClick = { context.openUrl(sourceUrl) },
                onIssueClick = { context.openUrl(issueUrl) },
                onTermsClick = { context.openUrl(termsUrl) },
                onPrivacyClick = { context.openUrl(privacyUrl) },
                onLicensesClick = { context.openUrl(licensesUrl) }
            )
        },
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        content = content
    )

    if (openThemePicker) {
        ModalBottomSheet(
            onDismissRequest = { openThemePicker = false },
            sheetState = sheetState,
            windowInsets = WindowInsets(0),
            content = {
                ThemePicker(
                    theme = theme,
                    onThemeChange = { theme ->
                        coroutineScope.launch {
                            sheetState.hide()
                            onThemeChange(theme)
                        }.invokeOnCompletion {
                            if (!sheetState.isVisible) {
                                openThemePicker = false
                            }
                        }
                    }
                )
            },
        )
    }
}
