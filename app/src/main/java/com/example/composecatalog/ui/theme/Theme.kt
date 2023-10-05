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

package com.example.composecatalog.ui.theme

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import com.example.composecatalog.model.ColorMode
import com.example.composecatalog.model.FontScaleMode
import com.example.composecatalog.model.TextDirection
import com.example.composecatalog.model.Theme
import com.example.composecatalog.model.ThemeMode
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.core.view.WindowCompat

@Composable
fun CatalogTheme(
        theme: Theme,
        content: @Composable () -> Unit
) {
    val colorScheme = if (theme.colorMode == ColorMode.Dynamic && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        val context = LocalContext.current
        colorSchemeFromThemeMode(
                themeMode = theme.themeMode,
                lightColorScheme = QvcLightColorScheme,
                darkColorScheme = QvcDarkColorScheme,
        )
    } else if (theme.colorMode == ColorMode.Custom) {
        colorSchemeFromThemeMode(
                themeMode = theme.themeMode,
                lightColorScheme = QvcLightColorScheme,
                darkColorScheme = QvcDarkColorScheme,
        )
    } else {
        colorSchemeFromThemeMode(
                themeMode = theme.themeMode,
                lightColorScheme = QvcLightColorScheme,
                darkColorScheme = QvcDarkColorScheme,
        )
    }

    val layoutDirection = when (theme.textDirection) {
        TextDirection.LTR -> LayoutDirection.Ltr
        TextDirection.RTL -> LayoutDirection.Rtl
        TextDirection.System -> LocalLayoutDirection.current
    }

    val view = LocalView.current
    val context = LocalContext.current
    val darkTheme = isSystemInDarkTheme()
    SideEffect {
        WindowCompat.getInsetsController(
                context.findActivity().window,
                view
        ).isAppearanceLightStatusBars = !darkTheme
    }

    CompositionLocalProvider(
            LocalLayoutDirection provides layoutDirection,
            LocalDensity provides Density(
                    density = LocalDensity.current.density,
                    fontScale = if (theme.fontScaleMode == FontScaleMode.System) {
                        LocalDensity.current.fontScale
                    } else {
                        theme.fontScale
                    }
            )
    ) {
        MaterialTheme(
                colorScheme = colorScheme,
                content = content,
        )
    }
}

@Composable
fun colorSchemeFromThemeMode(
        themeMode: ThemeMode,
        lightColorScheme: ColorScheme,
        darkColorScheme: ColorScheme
): ColorScheme {
    return when (themeMode) {
        ThemeMode.Light -> lightColorScheme
        ThemeMode.Dark -> darkColorScheme
        ThemeMode.System -> if (!isSystemInDarkTheme()) {
            lightColorScheme
        } else {
            darkColorScheme
        }
    }
}

private val QvcLightColorScheme = lightColorScheme(
        primary = qvc_light_primary,
        onPrimary = qvc_light_onPrimary,
        primaryContainer = qvc_light_primaryContainer,
        onPrimaryContainer = qvc_light_onPrimaryContainer,
        inversePrimary = qvc_light_inversePrimary,
        secondary = qvc_light_secondary,
        onSecondary = qvc_light_onSecondary,
        secondaryContainer = qvc_light_onSecondaryContainer,
        onSecondaryContainer = qvc_light_onSecondaryContainer,
        tertiary = qvc_light_tertiary,
        onTertiary = qvc_light_onTertiary,
        tertiaryContainer = qvc_light_tertiaryContainer,
        onTertiaryContainer = qvc_light_onTertiaryContainer,
        background = qvc_light_background,
        onBackground = qvc_light_onBackground,
        surface = qvc_light_surface,
        onSurface = qvc_light_onSurface,
        surfaceVariant = qvc_light_surfaceVariant,
        onSurfaceVariant = qvc_light_onSurfaceVariant,
        inverseSurface = qvc_light_inverseSurface,
        inverseOnSurface = qvc_light_inverseOnSurface,
        error = qvc_light_error,
        onError = qvc_light_onError,
        errorContainer = qvc_light_errorContainer,
        onErrorContainer = qvc_light_onErrorContainer,
        outline = qvc_light_outline,
        outlineVariant = qvc_light_outlineVariant,
        scrim = qvc_light_scrim,
        surfaceTint = qvc_light_surfaceTint
//    surfaceContainerHighest = Color(0xFFDEE4DA),
//    surfaceContainerHigh = Color(0xFFE4EADF),
//    surfaceContainer = Color(0xFFE9F0E5),
//    surfaceContainerLow = Color(0xFFEFF6EB),
//    surfaceContainerLowest = Color(0xFFFFFFFF),
//    surfaceBright = Color(0xFFF5FBF0),
//    surfaceDim = Color(0xFFD5DCD1)
)

private val QvcDarkColorScheme = darkColorScheme(
        primary = qvc_dark_primary,
        onPrimary = qvc_light_onPrimary,
        primaryContainer = qvc_dark_primaryContainer,
        onPrimaryContainer = qvc_dark_onPrimaryContainer,
        inversePrimary = qvc_dark_inversePrimary,
        secondary = qvc_dark_secondary,
        onSecondary = qvc_dark_onSecondary,
        secondaryContainer = qvc_dark_onSecondaryContainer,
        onSecondaryContainer = qvc_dark_onSecondaryContainer,
        tertiary = qvc_dark_tertiary,
        onTertiary = qvc_dark_onTertiary,
        tertiaryContainer = qvc_dark_tertiaryContainer,
        onTertiaryContainer = qvc_dark_onTertiaryContainer,
        background = qvc_dark_background,
        onBackground = qvc_dark_onBackground,
        surface = qvc_dark_surface,
        onSurface = qvc_dark_onSurface,
        surfaceVariant = qvc_dark_surfaceVariant,
        onSurfaceVariant = qvc_dark_onSurfaceVariant,
        inverseSurface = qvc_dark_inverseSurface,
        inverseOnSurface = qvc_dark_inverseOnSurface,
        error = qvc_dark_error,
        onError = qvc_dark_onError,
        errorContainer = qvc_dark_errorContainer,
        onErrorContainer = qvc_dark_onErrorContainer,
        outline = qvc_dark_outline,
        outlineVariant = qvc_dark_outlineVariant,
        scrim = qvc_dark_scrim,
        surfaceTint = qvc_dark_surfaceTint
//    surfaceContainerHighest = Color(0xFF30362F),
//    surfaceContainerHigh = Color(0xFF252C25),
//    surfaceContainer = Color(0xFF1B211B),
//    surfaceContainerLow = Color(0xFF171D17),
//    surfaceContainerLowest = Color(0xFF0A100A),
//    surfaceBright = Color(0xFF343B34),
//    surfaceDim = Color(0xFF0F150F)
)

private tailrec fun Context.findActivity(): Activity = when (this) {
    is Activity -> this
    is ContextWrapper -> this.baseContext.findActivity()
    else -> throw IllegalArgumentException("Could not find activity!")
}
