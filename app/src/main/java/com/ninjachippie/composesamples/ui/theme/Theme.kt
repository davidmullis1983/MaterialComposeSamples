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

package com.ninjachippie.composesamples.ui.theme

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import com.ninjachippie.composesamples.model.ColorMode
import com.ninjachippie.composesamples.model.FontScaleMode
import com.ninjachippie.composesamples.model.TextDirection
import com.ninjachippie.composesamples.model.Theme
import com.ninjachippie.composesamples.model.ThemeMode
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.core.view.WindowCompat

@Composable
fun CatalogTheme(
    theme: Theme, content: @Composable () -> Unit
) {
    val useDynamicTheme: Boolean =
        theme.colorMode == ColorMode.Dynamic && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S
    val useBrandingColorModeBoolean = theme.colorMode == ColorMode.Branding
    val useCustomColorMode: Boolean = theme.colorMode == ColorMode.Custom

    val colorScheme = when {
        useDynamicTheme -> {
            val context = LocalContext.current
            colorSchemeFromThemeMode(
                themeMode = theme.themeMode,
                lightColorScheme = dynamicLightColorScheme(context),
                darkColorScheme = dynamicDarkColorScheme(context),
            )
        }
        useBrandingColorModeBoolean -> {
            colorSchemeFromThemeMode(
                themeMode = theme.themeMode,
                lightColorScheme = brandingLightColorScheme,
                darkColorScheme = brandingDarkColorScheme,
            )
        }
        useCustomColorMode -> {
            colorSchemeFromThemeMode(
                themeMode = theme.themeMode,
                lightColorScheme = customLightColorScheme,
                darkColorScheme = customDarkColorScheme,
            )
        }
        else -> {
            colorSchemeFromThemeMode(
                themeMode = theme.themeMode,
                lightColorScheme = lightColorScheme(),
                darkColorScheme = darkColorScheme(),
            )
        }
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
        val window = (view.context as Activity).window
        window.statusBarColor = colorScheme.primary.toArgb()
        window.navigationBarColor = colorScheme.primary.toArgb()
        WindowCompat.getInsetsController(
            context.findActivity().window, view
        ).isAppearanceLightStatusBars = !darkTheme
    }

    CompositionLocalProvider(
        LocalLayoutDirection provides layoutDirection, LocalDensity provides Density(
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
    themeMode: ThemeMode, lightColorScheme: ColorScheme, darkColorScheme: ColorScheme
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

private val brandingLightColorScheme = lightColorScheme(
    primary = branding_light_primary,
    onPrimary = branding_light_onPrimary,
    primaryContainer = branding_light_primaryContainer,
    onPrimaryContainer = branding_light_onPrimaryContainer,
    inversePrimary = branding_light_inversePrimary,
    secondary = branding_light_secondary,
    onSecondary = branding_light_onSecondary,
    secondaryContainer = branding_light_secondaryContainer,
    onSecondaryContainer = branding_light_onSecondaryContainer,
    tertiary = branding_light_tertiary,
    onTertiary = branding_light_onTertiary,
    tertiaryContainer = branding_light_tertiaryContainer,
    onTertiaryContainer = branding_light_onTertiaryContainer,
    background = branding_light_background,
    onBackground = branding_light_onBackground,
    surface = branding_light_surface,
    onSurface = branding_light_onSurface,
    surfaceVariant = branding_light_surfaceVariant,
    onSurfaceVariant = branding_light_onSurfaceVariant,
    inverseSurface = branding_light_inverseSurface,
    inverseOnSurface = branding_light_inverseOnSurface,
    error = branding_light_error,
    onError = branding_light_onError,
    errorContainer = branding_light_errorContainer,
    onErrorContainer = branding_light_onErrorContainer,
    outline = branding_light_outline,
    outlineVariant = branding_light_outlineVariant,
    scrim = branding_light_scrim,
    surfaceTint = branding_light_surfaceTint
)

private val brandingDarkColorScheme = lightColorScheme(
    primary = branding_dark_primary,
    onPrimary = branding_dark_onPrimary,
    primaryContainer = branding_dark_primaryContainer,
    onPrimaryContainer = branding_dark_onPrimaryContainer,
    inversePrimary = branding_dark_inversePrimary,
    secondary = branding_dark_secondary,
    onSecondary = branding_dark_onSecondary,
    secondaryContainer = branding_dark_secondaryContainer,
    onSecondaryContainer = branding_dark_onSecondaryContainer,
    tertiary = branding_dark_tertiary,
    onTertiary = branding_dark_onTertiary,
    tertiaryContainer = branding_dark_tertiaryContainer,
    onTertiaryContainer = branding_dark_onTertiaryContainer,
    background = branding_dark_background,
    onBackground = branding_dark_onBackground,
    surface = branding_dark_surface,
    onSurface = branding_dark_onSurface,
    surfaceVariant = branding_dark_surfaceVariant,
    onSurfaceVariant = branding_dark_onSurfaceVariant,
    inverseSurface = branding_dark_inverseSurface,
    inverseOnSurface = branding_dark_inverseOnSurface,
    error = branding_dark_error,
    onError = branding_dark_onError,
    errorContainer = branding_dark_errorContainer,
    onErrorContainer = branding_dark_onErrorContainer,
    outline = branding_dark_outline,
    outlineVariant = branding_dark_outlineVariant,
    scrim = branding_dark_scrim,
    surfaceTint = branding_dark_surfaceTint
)

private val customLightColorScheme = lightColorScheme(
    primary = custom_light_primary,
    onPrimary = custom_light_onPrimary,
    primaryContainer = custom_light_primaryContainer,
    onPrimaryContainer = custom_light_onPrimaryContainer,
    inversePrimary = custom_light_inversePrimary,
    secondary = custom_light_secondary,
    onSecondary = custom_light_onSecondary,
    secondaryContainer = custom_light_secondaryContainer,
    onSecondaryContainer = custom_light_onSecondaryContainer,
    tertiary = custom_light_tertiary,
    onTertiary = custom_light_onTertiary,
    tertiaryContainer = custom_light_tertiaryContainer,
    onTertiaryContainer = custom_light_onTertiaryContainer,
    background = custom_light_background,
    onBackground = custom_light_onBackground,
    surface = custom_light_surface,
    onSurface = custom_light_onSurface,
    surfaceVariant = custom_light_surfaceVariant,
    onSurfaceVariant = custom_light_onSurfaceVariant,
    inverseSurface = custom_light_inverseSurface,
    inverseOnSurface = custom_light_inverseOnSurface,
    error = custom_light_error,
    onError = custom_light_onError,
    errorContainer = custom_light_errorContainer,
    onErrorContainer = custom_light_onErrorContainer,
    outline = custom_light_outline,
    outlineVariant = custom_light_outlineVariant,
    scrim = custom_light_scrim,
    surfaceTint = custom_light_surfaceTint
)

private val customDarkColorScheme = darkColorScheme(
    primary = custom_dark_primary,
    onPrimary = custom_dark_onPrimary,
    primaryContainer = custom_dark_primaryContainer,
    onPrimaryContainer = custom_dark_onPrimaryContainer,
    inversePrimary = custom_dark_inversePrimary,
    secondary = custom_dark_secondary,
    onSecondary = custom_dark_onSecondary,
    secondaryContainer = custom_dark_secondaryContainer,
    onSecondaryContainer = custom_dark_onSecondaryContainer,
    tertiary = custom_dark_tertiary,
    onTertiary = custom_dark_onTertiary,
    tertiaryContainer = custom_dark_tertiaryContainer,
    onTertiaryContainer = custom_dark_onTertiaryContainer,
    background = custom_dark_background,
    onBackground = custom_dark_onBackground,
    surface = custom_dark_surface,
    onSurface = custom_dark_onSurface,
    surfaceVariant = custom_dark_surfaceVariant,
    onSurfaceVariant = custom_dark_onSurfaceVariant,
    inverseSurface = custom_dark_inverseSurface,
    inverseOnSurface = custom_dark_inverseOnSurface,
    error = custom_dark_error,
    onError = custom_dark_onError,
    errorContainer = custom_dark_errorContainer,
    onErrorContainer = custom_dark_onErrorContainer,
    outline = custom_dark_outline,
    outlineVariant = custom_dark_outlineVariant,
    scrim = custom_dark_scrim,
    surfaceTint = custom_dark_surfaceTint
)

private tailrec fun Context.findActivity(): Activity = when (this) {
    is Activity -> this
    is ContextWrapper -> this.baseContext.findActivity()
    else -> throw IllegalArgumentException("Could not find activity!")
}
