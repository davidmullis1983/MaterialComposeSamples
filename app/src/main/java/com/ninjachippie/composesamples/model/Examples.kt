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

@file:Suppress("COMPOSABLE_FUNCTION_REFERENCE")

package com.ninjachippie.composesamples.model

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth

import com.ninjachippie.composesamples.util.SampleSourceUrl
import com.ninjachippie.composesamples.ui.samples.AlertDialogSample
import com.ninjachippie.composesamples.ui.samples.AlertDialogWithCustomContentSample
import com.ninjachippie.composesamples.ui.samples.AlertDialogWithIconSample
import com.ninjachippie.composesamples.ui.samples.AnimatedExtendedFloatingActionButtonSample
import com.ninjachippie.composesamples.ui.samples.AssistChipSample
import com.ninjachippie.composesamples.ui.samples.BottomAppBarWithFAB
import com.ninjachippie.composesamples.ui.samples.BottomSheetScaffoldNestedScrollSample
import com.ninjachippie.composesamples.ui.samples.ButtonSample
import com.ninjachippie.composesamples.ui.samples.ButtonWithIconSample
import com.ninjachippie.composesamples.ui.samples.CardSample
import com.ninjachippie.composesamples.ui.samples.CheckboxSample
import com.ninjachippie.composesamples.ui.samples.CheckboxWithTextSample
import com.ninjachippie.composesamples.ui.samples.ChipGroupReflowSample
import com.ninjachippie.composesamples.ui.samples.ChipGroupSingleLineSample
import com.ninjachippie.composesamples.ui.samples.CircularProgressIndicatorSample
import com.ninjachippie.composesamples.ui.samples.ClickableCardSample
import com.ninjachippie.composesamples.ui.samples.ClickableElevatedCardSample
import com.ninjachippie.composesamples.ui.samples.ClickableOutlinedCardSample
import com.ninjachippie.composesamples.ui.samples.DateInputSample
import com.ninjachippie.composesamples.ui.samples.DatePickerDialogSample
import com.ninjachippie.composesamples.ui.samples.DatePickerSample
import com.ninjachippie.composesamples.ui.samples.DatePickerWithDateSelectableDatesSample
import com.ninjachippie.composesamples.ui.samples.DateRangePickerSample
import com.ninjachippie.composesamples.ui.samples.DismissibleNavigationDrawerSample
import com.ninjachippie.composesamples.ui.samples.DockedSearchBarSample
import com.ninjachippie.composesamples.ui.samples.EditableExposedDropdownMenuSample
import com.ninjachippie.composesamples.ui.samples.ElevatedAssistChipSample
import com.ninjachippie.composesamples.ui.samples.ElevatedButtonSample
import com.ninjachippie.composesamples.ui.samples.ElevatedCardSample
import com.ninjachippie.composesamples.ui.samples.ElevatedFilterChipSample
import com.ninjachippie.composesamples.ui.samples.ElevatedSuggestionChipSample
import com.ninjachippie.composesamples.ui.samples.EnterAlwaysTopAppBar
import com.ninjachippie.composesamples.ui.samples.ExitAlwaysBottomAppBar
import com.ninjachippie.composesamples.ui.samples.ExitUntilCollapsedLargeTopAppBar
import com.ninjachippie.composesamples.ui.samples.ExitUntilCollapsedMediumTopAppBar
import com.ninjachippie.composesamples.ui.samples.ExposedDropdownMenuSample
import com.ninjachippie.composesamples.ui.samples.ExtendedFloatingActionButtonSample
import com.ninjachippie.composesamples.ui.samples.ExtendedFloatingActionButtonTextSample
import com.ninjachippie.composesamples.ui.samples.FancyIndicatorContainerTabs
import com.ninjachippie.composesamples.ui.samples.FancyIndicatorTabs
import com.ninjachippie.composesamples.ui.samples.FancyTabs
import com.ninjachippie.composesamples.ui.samples.FilledIconButtonSample
import com.ninjachippie.composesamples.ui.samples.FilledIconToggleButtonSample
import com.ninjachippie.composesamples.ui.samples.FilledTonalButtonSample
import com.ninjachippie.composesamples.ui.samples.FilledTonalIconButtonSample
import com.ninjachippie.composesamples.ui.samples.FilledTonalIconToggleButtonSample
import com.ninjachippie.composesamples.ui.samples.FilterChipSample
import com.ninjachippie.composesamples.ui.samples.FilterChipWithLeadingIconSample
import com.ninjachippie.composesamples.ui.samples.FloatingActionButtonSample
import com.ninjachippie.composesamples.ui.samples.IconButtonSample
import com.ninjachippie.composesamples.ui.samples.IconTabs
import com.ninjachippie.composesamples.ui.samples.IconToggleButtonSample
import com.ninjachippie.composesamples.ui.samples.IndeterminateCircularProgressIndicatorSample
import com.ninjachippie.composesamples.ui.samples.IndeterminateLinearProgressIndicatorSample
import com.ninjachippie.composesamples.ui.samples.InputChipSample
import com.ninjachippie.composesamples.ui.samples.InputChipWithAvatarSample
import com.ninjachippie.composesamples.ui.samples.LargeFloatingActionButtonSample
import com.ninjachippie.composesamples.ui.samples.LeadingIconTabs
import com.ninjachippie.composesamples.ui.samples.LinearProgressIndicatorSample
import com.ninjachippie.composesamples.ui.samples.MenuSample
import com.ninjachippie.composesamples.ui.samples.MenuWithScrollStateSample
import com.ninjachippie.composesamples.ui.samples.ModalBottomSheetSample
import com.ninjachippie.composesamples.ui.samples.ModalNavigationDrawerSample
import com.ninjachippie.composesamples.ui.samples.NavigationBarItemWithBadge
import com.ninjachippie.composesamples.ui.samples.NavigationBarSample
import com.ninjachippie.composesamples.ui.samples.NavigationBarWithOnlySelectedLabelsSample
import com.ninjachippie.composesamples.ui.samples.NavigationRailBottomAlignSample
import com.ninjachippie.composesamples.ui.samples.NavigationRailSample
import com.ninjachippie.composesamples.ui.samples.NavigationRailWithOnlySelectedLabelsSample
import com.ninjachippie.composesamples.ui.samples.OneLineListItem
import com.ninjachippie.composesamples.ui.samples.OutlinedButtonSample
import com.ninjachippie.composesamples.ui.samples.OutlinedCardSample
import com.ninjachippie.composesamples.ui.samples.OutlinedIconButtonSample
import com.ninjachippie.composesamples.ui.samples.OutlinedIconToggleButtonSample
import com.ninjachippie.composesamples.ui.samples.OutlinedTextFieldSample
import com.ninjachippie.composesamples.ui.samples.PasswordTextField
import com.ninjachippie.composesamples.ui.samples.PermanentNavigationDrawerSample
import com.ninjachippie.composesamples.ui.samples.PinnedTopAppBar
import com.ninjachippie.composesamples.ui.samples.PlainTooltipSample
import com.ninjachippie.composesamples.ui.samples.PlainTooltipWithManualInvocationSample
import com.ninjachippie.composesamples.ui.samples.PrimaryIconTabs
import com.ninjachippie.composesamples.ui.samples.PrimaryTabs
import com.ninjachippie.composesamples.ui.samples.RadioButtonSample
import com.ninjachippie.composesamples.ui.samples.RadioGroupSample
import com.ninjachippie.composesamples.ui.samples.RangeSliderSample
import com.ninjachippie.composesamples.ui.samples.RangeSliderWithCustomComponents
import com.ninjachippie.composesamples.ui.samples.RichTooltipSample
import com.ninjachippie.composesamples.ui.samples.RichTooltipWithManualInvocationSample
import com.ninjachippie.composesamples.ui.samples.ScaffoldWithCoroutinesSnackbar
import com.ninjachippie.composesamples.ui.samples.ScaffoldWithCustomSnackbar
import com.ninjachippie.composesamples.ui.samples.ScaffoldWithIndefiniteSnackbar
import com.ninjachippie.composesamples.ui.samples.ScaffoldWithMultilineSnackbar
import com.ninjachippie.composesamples.ui.samples.ScaffoldWithSimpleSnackbar
import com.ninjachippie.composesamples.ui.samples.ScrollingFancyIndicatorContainerTabs
import com.ninjachippie.composesamples.ui.samples.ScrollingPrimaryTabs
import com.ninjachippie.composesamples.ui.samples.ScrollingSecondaryTabs
import com.ninjachippie.composesamples.ui.samples.ScrollingTextTabs
import com.ninjachippie.composesamples.ui.samples.SearchBarSample
import com.ninjachippie.composesamples.ui.samples.SecondaryTabs
import com.ninjachippie.composesamples.ui.samples.SegmentedButtonMultiSelectSample
import com.ninjachippie.composesamples.ui.samples.SegmentedButtonSingleSelectSample
import com.ninjachippie.composesamples.ui.samples.SimpleBottomAppBar
import com.ninjachippie.composesamples.ui.samples.SimpleBottomSheetScaffoldSample
import com.ninjachippie.composesamples.ui.samples.SimpleCenterAlignedTopAppBar
import com.ninjachippie.composesamples.ui.samples.SimpleOutlinedTextFieldSample
import com.ninjachippie.composesamples.ui.samples.SimpleTextFieldSample
import com.ninjachippie.composesamples.ui.samples.SimpleTopAppBar
import com.ninjachippie.composesamples.ui.samples.SliderSample
import com.ninjachippie.composesamples.ui.samples.SliderWithCustomThumbSample
import com.ninjachippie.composesamples.ui.samples.SliderWithCustomTrackAndThumb
import com.ninjachippie.composesamples.ui.samples.SmallFloatingActionButtonSample
import com.ninjachippie.composesamples.ui.samples.StepRangeSliderSample
import com.ninjachippie.composesamples.ui.samples.StepsSliderSample
import com.ninjachippie.composesamples.ui.samples.SuggestionChipSample
import com.ninjachippie.composesamples.ui.samples.SwitchSample
import com.ninjachippie.composesamples.ui.samples.SwitchWithThumbIconSample
import com.ninjachippie.composesamples.ui.samples.TextAndIconTabs
import com.ninjachippie.composesamples.ui.samples.TextArea
import com.ninjachippie.composesamples.ui.samples.TextButtonSample
import com.ninjachippie.composesamples.ui.samples.TextFieldSample
import com.ninjachippie.composesamples.ui.samples.TextFieldWithErrorState
import com.ninjachippie.composesamples.ui.samples.TextFieldWithHideKeyboardOnImeAction
import com.ninjachippie.composesamples.ui.samples.TextFieldWithIcons
import com.ninjachippie.composesamples.ui.samples.TextFieldWithPlaceholder
import com.ninjachippie.composesamples.ui.samples.TextFieldWithPrefixAndSuffix
import com.ninjachippie.composesamples.ui.samples.TextFieldWithSupportingText
import com.ninjachippie.composesamples.ui.samples.TextTabs
import com.ninjachippie.composesamples.ui.samples.ThreeLineListItemWithExtendedSupporting
import com.ninjachippie.composesamples.ui.samples.ThreeLineListItemWithOverlineAndSupporting
import com.ninjachippie.composesamples.ui.samples.TimeInputSample
import com.ninjachippie.composesamples.ui.samples.TimePickerSample
import com.ninjachippie.composesamples.ui.samples.TimePickerSwitchableSample
import com.ninjachippie.composesamples.ui.samples.TriStateCheckboxSample
import com.ninjachippie.composesamples.ui.samples.TwoLineListItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class Example(
    val name: String,
    val description: String,
    val sourceUrl: String,
    val content: @Composable () -> Unit
)

private const val BADGE_EXAMPLE_DESCRIPTION = "Badge examples"
private const val BADGE_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/BadgeSamples.kt"
val BadgeExamples =
    listOf(
        Example(
            name = ::NavigationBarItemWithBadge.name,
            description = BADGE_EXAMPLE_DESCRIPTION,
            sourceUrl = BADGE_EXAMPLE_SOURCE_URL
        ) { NavigationBarItemWithBadge() }
    )

private const val BOTTOM_SHEET_EXAMPLE_DESCRIPTION = "Bottom Sheet examples"
private const val BOTTOM_SHEET_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/BottomSheetSamples.kt"
val BottomSheetExamples =
    listOf(
        Example(
            name = ::ModalBottomSheetSample.name,
            description = BOTTOM_SHEET_EXAMPLE_DESCRIPTION,
            sourceUrl = BOTTOM_SHEET_EXAMPLE_SOURCE_URL
        ) { ModalBottomSheetSample() },
        Example(
            name = ::SimpleBottomSheetScaffoldSample.name,
            description = BOTTOM_SHEET_EXAMPLE_DESCRIPTION,
            sourceUrl = BOTTOM_SHEET_EXAMPLE_SOURCE_URL
        ) { SimpleBottomSheetScaffoldSample() },
        Example(
            name = ::BottomSheetScaffoldNestedScrollSample.name,
            description = BOTTOM_SHEET_EXAMPLE_DESCRIPTION,
            sourceUrl = BOTTOM_SHEET_EXAMPLE_SOURCE_URL
        ) { BottomSheetScaffoldNestedScrollSample() }
    )

private const val BUTTONS_EXAMPLE_DESCRIPTION = "Button examples"
private const val BUTTONS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/ButtonSamples.kt"
val ButtonsExamples =
    listOf(
        Example(
            name = ::ButtonSample.name,
            description = BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = BUTTONS_EXAMPLE_SOURCE_URL,
        ) { ButtonSample() },
        Example(
            name = ::ElevatedButtonSample.name,
            description = BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = BUTTONS_EXAMPLE_SOURCE_URL,
        ) { ElevatedButtonSample() },
        Example(
            name = ::FilledTonalButtonSample.name,
            description = BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = BUTTONS_EXAMPLE_SOURCE_URL,
        ) { FilledTonalButtonSample() },
        Example(
            name = ::OutlinedButtonSample.name,
            description = BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = BUTTONS_EXAMPLE_SOURCE_URL,
        ) { OutlinedButtonSample() },
        Example(
            name = ::TextButtonSample.name,
            description = BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = BUTTONS_EXAMPLE_SOURCE_URL,
        ) { TextButtonSample() },
        Example(
            name = ::ButtonWithIconSample.name,
            description = BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = BUTTONS_EXAMPLE_SOURCE_URL,
        ) { ButtonWithIconSample() }
    )

private const val CARDS_EXAMPLE_DESCRIPTION = "Cards examples"
private const val CARDS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/CardSamples.kt"
val CardExamples = listOf(
    Example(
        name = ::CardSample.name,
        description = CARDS_EXAMPLE_DESCRIPTION,
        sourceUrl = CARDS_EXAMPLE_SOURCE_URL
    ) {
        CardSample()
    },
    Example(
        name = ::ClickableCardSample.name,
        description = CARDS_EXAMPLE_DESCRIPTION,
        sourceUrl = CARDS_EXAMPLE_SOURCE_URL
    ) {
        ClickableCardSample()
    },
    Example(
        name = ::ElevatedCardSample.name,
        description = CARDS_EXAMPLE_DESCRIPTION,
        sourceUrl = CARDS_EXAMPLE_SOURCE_URL
    ) {
        ElevatedCardSample()
    },
    Example(
        name = ::ClickableElevatedCardSample.name,
        description = CARDS_EXAMPLE_DESCRIPTION,
        sourceUrl = CARDS_EXAMPLE_SOURCE_URL
    ) {
        ClickableElevatedCardSample()
    },
    Example(
        name = ::OutlinedCardSample.name,
        description = CARDS_EXAMPLE_DESCRIPTION,
        sourceUrl = CARDS_EXAMPLE_SOURCE_URL
    ) {
        OutlinedCardSample()
    },
    Example(
        name = ::ClickableOutlinedCardSample.name,
        description = CARDS_EXAMPLE_DESCRIPTION,
        sourceUrl = CARDS_EXAMPLE_SOURCE_URL
    ) {
        ClickableOutlinedCardSample()
    }
)

private const val CHECKBOXES_EXAMPLE_DESCRIPTION = "Checkboxes examples"
private const val CHECKBOXES_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/CheckboxSamples.kt"
val CheckboxesExamples = listOf(
    Example(
        name = ::CheckboxSample.name,
        description = CHECKBOXES_EXAMPLE_DESCRIPTION,
        sourceUrl = CHECKBOXES_EXAMPLE_SOURCE_URL
    ) {
        CheckboxSample()
    },
    Example(
        name = ::CheckboxWithTextSample.name,
        description = CHECKBOXES_EXAMPLE_DESCRIPTION,
        sourceUrl = CHECKBOXES_EXAMPLE_SOURCE_URL
    ) {
        CheckboxWithTextSample()
    },
    Example(
        name = ::TriStateCheckboxSample.name,
        description = CHECKBOXES_EXAMPLE_DESCRIPTION,
        sourceUrl = CHECKBOXES_EXAMPLE_SOURCE_URL
    ) {
        TriStateCheckboxSample()
    }
)

private const val CHIPS_EXAMPLE_DESCRIPTION = "Chips examples"
private const val CHIPS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/ChipSamples.kt"
val ChipsExamples = listOf(
    Example(
        name = ::AssistChipSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        AssistChipSample()
    },
    Example(
        name = ::ElevatedAssistChipSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        ElevatedAssistChipSample()
    },
    Example(
        name = ::FilterChipSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        FilterChipSample()
    },
    Example(
        name = ::ElevatedFilterChipSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        ElevatedFilterChipSample()
    },
    Example(
        name = ::FilterChipWithLeadingIconSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        FilterChipWithLeadingIconSample()
    },
    Example(
        name = ::InputChipSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        InputChipSample()
    },
    Example(
        name = ::InputChipWithAvatarSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        InputChipWithAvatarSample()
    },
    Example(
        name = ::SuggestionChipSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        SuggestionChipSample()
    },
    Example(
        name = ::ElevatedSuggestionChipSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        ElevatedSuggestionChipSample()
    },
    Example(
        name = ::ChipGroupSingleLineSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        ChipGroupSingleLineSample()
    },
    Example(
        name = ::ChipGroupReflowSample.name,
        description = CHIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = CHIPS_EXAMPLE_SOURCE_URL
    ) {
        ChipGroupReflowSample()
    }
)

private const val DATE_PICKER_EXAMPLE_DESCRIPTION = "Date picker examples"
private const val DATE_PICKER_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/DatePickerSamples.kt"
val DatePickerExamples = listOf(
    Example(
        name = ::DatePickerSample.name,
        description = DATE_PICKER_EXAMPLE_DESCRIPTION,
        sourceUrl = DATE_PICKER_EXAMPLE_SOURCE_URL
    ) {
        DatePickerSample()
    },
    Example(
        name = ::DatePickerDialogSample.name,
        description = DATE_PICKER_EXAMPLE_DESCRIPTION,
        sourceUrl = DATE_PICKER_EXAMPLE_SOURCE_URL
    ) {
        DatePickerDialogSample()
    },
    Example(
        name = ::DatePickerWithDateSelectableDatesSample.name,
        description = DATE_PICKER_EXAMPLE_DESCRIPTION,
        sourceUrl = DATE_PICKER_EXAMPLE_SOURCE_URL
    ) {
        DatePickerWithDateSelectableDatesSample()
    },
    Example(
        name = ::DateInputSample.name,
        description = DATE_PICKER_EXAMPLE_DESCRIPTION,
        sourceUrl = DATE_PICKER_EXAMPLE_SOURCE_URL
    ) {
        DateInputSample()
    },
    Example(
        name = ::DateRangePickerSample.name,
        description = DATE_PICKER_EXAMPLE_DESCRIPTION,
        sourceUrl = DATE_PICKER_EXAMPLE_SOURCE_URL
    ) {
        DateRangePickerSample()
    },
)

private const val DIALOG_EXAMPLE_DESCRIPTION = "Dialog examples"
private const val DIALOG_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/AlertDialogSamples.kt"
val DialogExamples =
    listOf(
        Example(
            name = ::AlertDialogSample.name,
            description = DIALOG_EXAMPLE_DESCRIPTION,
            sourceUrl = DIALOG_EXAMPLE_SOURCE_URL,
        ) { AlertDialogSample() },
        Example(
            name = ::AlertDialogWithIconSample.name,
            description = DIALOG_EXAMPLE_DESCRIPTION,
            sourceUrl = DIALOG_EXAMPLE_SOURCE_URL,
        ) { AlertDialogWithIconSample() },
        Example(
            name = ::AlertDialogWithCustomContentSample.name,
            description = DIALOG_EXAMPLE_DESCRIPTION,
            sourceUrl = DIALOG_EXAMPLE_SOURCE_URL,
        ) { AlertDialogWithCustomContentSample() },
    )

private const val BOTTOM_APP_BARS_EXAMPLE_DESCRIPTION = "Bottom app bar examples"
private const val BOTTOM_APP_BARS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/AppBarSamples.kt"
val BottomAppBarsExamples = listOf(
    Example(
        name = ::SimpleBottomAppBar.name,
        description = BOTTOM_APP_BARS_EXAMPLE_DESCRIPTION,
        sourceUrl = BOTTOM_APP_BARS_EXAMPLE_SOURCE_URL,
    ) { SimpleBottomAppBar() },
    Example(
        name = ::BottomAppBarWithFAB.name,
        description = BOTTOM_APP_BARS_EXAMPLE_DESCRIPTION,
        sourceUrl = BOTTOM_APP_BARS_EXAMPLE_SOURCE_URL,
    ) { BottomAppBarWithFAB() },
    Example(
        name = ::ExitAlwaysBottomAppBar.name,
        description = BOTTOM_APP_BARS_EXAMPLE_DESCRIPTION,
        sourceUrl = BOTTOM_APP_BARS_EXAMPLE_SOURCE_URL,
    ) { ExitAlwaysBottomAppBar() }
)

private const val TOP_APP_BARS_EXAMPLE_DESCRIPTION = "Top app bar examples"
private const val TOP_APP_BARS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/AppBarSamples.kt"
val TopAppBarExamples =
    listOf(
        Example(
            name = ::SimpleTopAppBar.name,
            description = TOP_APP_BARS_EXAMPLE_DESCRIPTION,
            sourceUrl = TOP_APP_BARS_EXAMPLE_SOURCE_URL,
        ) { SimpleTopAppBar() },
        Example(
            name = ::SimpleCenterAlignedTopAppBar.name,
            description = TOP_APP_BARS_EXAMPLE_DESCRIPTION,
            sourceUrl = TOP_APP_BARS_EXAMPLE_SOURCE_URL,
        ) { SimpleCenterAlignedTopAppBar() },
        Example(
            name = ::PinnedTopAppBar.name,
            description = TOP_APP_BARS_EXAMPLE_DESCRIPTION,
            sourceUrl = TOP_APP_BARS_EXAMPLE_SOURCE_URL,
        ) { PinnedTopAppBar() },
        Example(
            name = ::EnterAlwaysTopAppBar.name,
            description = TOP_APP_BARS_EXAMPLE_DESCRIPTION,
            sourceUrl = TOP_APP_BARS_EXAMPLE_SOURCE_URL,
        ) { EnterAlwaysTopAppBar() },
        Example(
            name = ::ExitUntilCollapsedMediumTopAppBar.name,
            description = TOP_APP_BARS_EXAMPLE_DESCRIPTION,
            sourceUrl = TOP_APP_BARS_EXAMPLE_SOURCE_URL,
        ) { ExitUntilCollapsedMediumTopAppBar() },
        Example(
            name = ::ExitUntilCollapsedLargeTopAppBar.name,
            description = TOP_APP_BARS_EXAMPLE_DESCRIPTION,
            sourceUrl = TOP_APP_BARS_EXAMPLE_SOURCE_URL,
        ) { ExitUntilCollapsedLargeTopAppBar() },
    )

private const val EXTENDED_FAB_EXAMPLE_DESCRIPTION = "Extended FAB examples"
private const val EXTENDED_FAB_EXAMPLE_SOURCE_URL =
    "$SampleSourceUrl/FloatingActionButtonSamples.kt"
val ExtendedFABExamples =
    listOf(
        Example(
            name = ::ExtendedFloatingActionButtonSample.name,
            description = EXTENDED_FAB_EXAMPLE_DESCRIPTION,
            sourceUrl = EXTENDED_FAB_EXAMPLE_SOURCE_URL,
        ) { ExtendedFloatingActionButtonSample() },
        Example(
            name = ::ExtendedFloatingActionButtonTextSample.name,
            description = EXTENDED_FAB_EXAMPLE_DESCRIPTION,
            sourceUrl = EXTENDED_FAB_EXAMPLE_SOURCE_URL,
        ) { ExtendedFloatingActionButtonTextSample() },
        Example(
            name = ::AnimatedExtendedFloatingActionButtonSample.name,
            description = EXTENDED_FAB_EXAMPLE_DESCRIPTION,
            sourceUrl = EXTENDED_FAB_EXAMPLE_SOURCE_URL,
        ) { AnimatedExtendedFloatingActionButtonSample() },
    )

private const val FLOATING_ACTION_BUTTONS_EXAMPLE_DESCRIPTION = "Floating action button examples"
private const val FLOATING_ACTION_BUTTONS_EXAMPLE_SOURCE_URL =
    "$SampleSourceUrl/FloatingActionButtonSamples.kt"
val FloatingActionButtonsExamples =
    listOf(
        Example(
            name = ::FloatingActionButtonSample.name,
            description = FLOATING_ACTION_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = FLOATING_ACTION_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { FloatingActionButtonSample() },
        Example(
            name = ::LargeFloatingActionButtonSample.name,
            description = FLOATING_ACTION_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = FLOATING_ACTION_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { LargeFloatingActionButtonSample() },
        Example(
            name = ::SmallFloatingActionButtonSample.name,
            description = FLOATING_ACTION_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = FLOATING_ACTION_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { SmallFloatingActionButtonSample() }
    )

private const val LISTS_EXAMPLE_DESCRIPTION = "List examples"
private const val LISTS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/ListSamples.kt"
val ListsExamples = listOf(
    Example(
        name = ::OneLineListItem.name,
        description = LISTS_EXAMPLE_DESCRIPTION,
        sourceUrl = LISTS_EXAMPLE_SOURCE_URL
    ) {
        OneLineListItem()
    },
    Example(
        name = ::TwoLineListItem.name,
        description = LISTS_EXAMPLE_DESCRIPTION,
        sourceUrl = LISTS_EXAMPLE_SOURCE_URL
    ) {
        TwoLineListItem()
    },
    Example(
        name = ::ThreeLineListItemWithOverlineAndSupporting.name,
        description = LISTS_EXAMPLE_DESCRIPTION,
        sourceUrl = LISTS_EXAMPLE_SOURCE_URL
    ) {
        ThreeLineListItemWithOverlineAndSupporting()
    },
    Example(
        name = ::ThreeLineListItemWithExtendedSupporting.name,
        description = LISTS_EXAMPLE_DESCRIPTION,
        sourceUrl = LISTS_EXAMPLE_SOURCE_URL
    ) {
        ThreeLineListItemWithExtendedSupporting()
    },
)

private const val ICON_BUTTONS_EXAMPLE_DESCRIPTION = "Icon button examples"
private const val ICON_BUTTONS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/IconButtonSamples.kt"
val IconButtonExamples =
    listOf(
        Example(
            name = ::IconButtonSample.name,
            description = ICON_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = ICON_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { IconButtonSample() },
        Example(
            name = ::IconToggleButtonSample.name,
            description = ICON_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = ICON_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { IconToggleButtonSample() },
        Example(
            name = ::FilledIconButtonSample.name,
            description = ICON_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = ICON_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { FilledIconButtonSample() },
        Example(
            name = ::FilledIconToggleButtonSample.name,
            description = ICON_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = ICON_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { FilledIconToggleButtonSample() },
        Example(
            name = ::FilledTonalIconButtonSample.name,
            description = ICON_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = ICON_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { FilledTonalIconButtonSample() },
        Example(
            name = ::FilledTonalIconToggleButtonSample.name,
            description = ICON_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = ICON_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { FilledTonalIconToggleButtonSample() },
        Example(
            name = ::OutlinedIconButtonSample.name,
            description = ICON_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = ICON_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { OutlinedIconButtonSample() },
        Example(
            name = ::OutlinedIconToggleButtonSample.name,
            description = ICON_BUTTONS_EXAMPLE_DESCRIPTION,
            sourceUrl = ICON_BUTTONS_EXAMPLE_SOURCE_URL,
        ) { OutlinedIconToggleButtonSample() }
    )

private const val MENUS_EXAMPLE_DESCRIPTION = "Menus examples"
private const val MENUS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/MenuSamples.kt"
val MenusExamples = listOf(
    Example(
        name = ::MenuSample.name,
        description = MENUS_EXAMPLE_DESCRIPTION,
        sourceUrl = MENUS_EXAMPLE_SOURCE_URL
    ) {
        MenuSample()
    },
    Example(
        name = ::MenuWithScrollStateSample.name,
        description = MENUS_EXAMPLE_DESCRIPTION,
        sourceUrl = MENUS_EXAMPLE_SOURCE_URL
    ) {
        MenuWithScrollStateSample()
    },
    Example(
        name = ::ExposedDropdownMenuSample.name,
        description = MENUS_EXAMPLE_DESCRIPTION,
        sourceUrl = MENUS_EXAMPLE_SOURCE_URL
    ) {
        ExposedDropdownMenuSample()
    },
    Example(
        name = ::EditableExposedDropdownMenuSample.name,
        description = MENUS_EXAMPLE_DESCRIPTION,
        sourceUrl = MENUS_EXAMPLE_SOURCE_URL
    ) {
        EditableExposedDropdownMenuSample()
    },
)

private const val NAVIGATION_BAR_EXAMPLE_DESCRIPTION = "Navigation bar examples"
private const val NAVIGATION_BAR_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/NavigationBarSamples.kt"
val NavigationBarExamples =
    listOf(
        Example(
            name = ::NavigationBarSample.name,
            description = NAVIGATION_BAR_EXAMPLE_DESCRIPTION,
            sourceUrl = NAVIGATION_BAR_EXAMPLE_SOURCE_URL,
        ) { NavigationBarSample() },
        Example(
            name = ::NavigationBarWithOnlySelectedLabelsSample.name,
            description = NAVIGATION_BAR_EXAMPLE_DESCRIPTION,
            sourceUrl = NAVIGATION_BAR_EXAMPLE_SOURCE_URL,
        ) { NavigationBarWithOnlySelectedLabelsSample() },
    )

private const val NAVIGATION_RAIL_EXAMPLE_DESCRIPTION = "Navigation rail examples"
private const val NAVIGATION_RAIL_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/NavigationRailSamples.kt"
val NavigationRailExamples =
    listOf(
        Example(
            name = ::NavigationRailSample.name,
            description = NAVIGATION_RAIL_EXAMPLE_DESCRIPTION,
            sourceUrl = NAVIGATION_RAIL_EXAMPLE_SOURCE_URL,
        ) { NavigationRailSample() },
        Example(
            name = ::NavigationRailWithOnlySelectedLabelsSample.name,
            description = NAVIGATION_RAIL_EXAMPLE_DESCRIPTION,
            sourceUrl = NAVIGATION_RAIL_EXAMPLE_SOURCE_URL,
        ) { NavigationRailWithOnlySelectedLabelsSample() },
        Example(
            name = ::NavigationRailBottomAlignSample.name,
            description = NAVIGATION_RAIL_EXAMPLE_DESCRIPTION,
            sourceUrl = NAVIGATION_RAIL_EXAMPLE_SOURCE_URL,
        ) { NavigationRailBottomAlignSample() },
    )

private const val NAVIGATION_DRAWER_EXAMPLE_DESCRIPTION = "Navigation drawer examples"
private const val NAVIGATION_DRAWER_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/DrawerSamples.kt"
val NavigationDrawerExamples = listOf(
    Example(
        name = ::ModalNavigationDrawerSample.name,
        description = NAVIGATION_DRAWER_EXAMPLE_DESCRIPTION,
        sourceUrl = NAVIGATION_DRAWER_EXAMPLE_SOURCE_URL
    ) {
        ModalNavigationDrawerSample()
    },
    Example(
        name = ::PermanentNavigationDrawerSample.name,
        description = NAVIGATION_DRAWER_EXAMPLE_DESCRIPTION,
        sourceUrl = NAVIGATION_DRAWER_EXAMPLE_SOURCE_URL
    ) {
        PermanentNavigationDrawerSample()
    },
    Example(
        name = ::DismissibleNavigationDrawerSample.name,
        description = NAVIGATION_DRAWER_EXAMPLE_DESCRIPTION,
        sourceUrl = NAVIGATION_DRAWER_EXAMPLE_SOURCE_URL
    ) {
        DismissibleNavigationDrawerSample()
    }
)

//private const val NavigationSuiteScaffoldExampleDescription = "Navigation suite scaffold examples"
//private const val NavigationSuiteScaffoldExampleSourceUrl =
//    "$AdaptiveSampleSourceUrl/NavigationSuiteScaffoldSamples.kt"
//val NavigationSuiteScaffoldExamples =
//    listOf(
//        Example(
//            name = ::NavigationSuiteScaffoldSample.name,
//            description = NavigationSuiteScaffoldExampleDescription,
//            sourceUrl = NavigationSuiteScaffoldExampleSourceUrl,
//        ) { NavigationSuiteScaffoldSample() },
//        Example(
//            name = ::NavigationSuiteScaffoldCustomConfigSample.name,
//            description = NavigationSuiteScaffoldExampleDescription,
//            sourceUrl = NavigationSuiteScaffoldExampleSourceUrl,
//        ) { NavigationSuiteScaffoldCustomConfigSample() },
//    )

private const val PROGRESS_INDICATORS_EXAMPLE_DESCRIPTION = "Progress indicators examples"
private const val PROGRESS_INDICATORS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/" +
        "ProgressIndicatorSamples.kt"
val ProgressIndicatorsExamples = listOf(
    Example(
        name = ::LinearProgressIndicatorSample.name,
        description = PROGRESS_INDICATORS_EXAMPLE_DESCRIPTION,
        sourceUrl = PROGRESS_INDICATORS_EXAMPLE_SOURCE_URL
    ) {
        LinearProgressIndicatorSample()
    },
    Example(
        name = ::IndeterminateLinearProgressIndicatorSample.name,
        description = PROGRESS_INDICATORS_EXAMPLE_DESCRIPTION,
        sourceUrl = PROGRESS_INDICATORS_EXAMPLE_SOURCE_URL
    ) {
        IndeterminateLinearProgressIndicatorSample()
    },
    Example(
        name = ::CircularProgressIndicatorSample.name,
        description = PROGRESS_INDICATORS_EXAMPLE_DESCRIPTION,
        sourceUrl = PROGRESS_INDICATORS_EXAMPLE_SOURCE_URL
    ) {
        CircularProgressIndicatorSample()
    },
    Example(
        name = ::IndeterminateCircularProgressIndicatorSample.name,
        description = PROGRESS_INDICATORS_EXAMPLE_DESCRIPTION,
        sourceUrl = PROGRESS_INDICATORS_EXAMPLE_SOURCE_URL
    ) {
        IndeterminateCircularProgressIndicatorSample()
    }
)

private const val RADIO_BUTTONS_EXAMPLE_DESCRIPTION = "Radio buttons examples"
private const val RADIO_BUTTONS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/RadioButtonSamples.kt"
val RadioButtonsExamples = listOf(
    Example(
        name = ::RadioButtonSample.name,
        description = RADIO_BUTTONS_EXAMPLE_DESCRIPTION,
        sourceUrl = RADIO_BUTTONS_EXAMPLE_SOURCE_URL
    ) {
        RadioButtonSample()
    },
    Example(
        name = ::RadioGroupSample.name,
        description = RADIO_BUTTONS_EXAMPLE_DESCRIPTION,
        sourceUrl = RADIO_BUTTONS_EXAMPLE_SOURCE_URL
    ) {
        RadioGroupSample()
    },
)

private const val SEARCH_BAR_EXAMPLE_DESCRIPTION = "Search bar examples"
private const val SEARCH_BAR_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/SearchBarSamples.kt"
val SearchBarExamples = listOf(
    Example(
        name = ::SearchBarSample.name,
        description = SEARCH_BAR_EXAMPLE_DESCRIPTION,
        sourceUrl = SEARCH_BAR_EXAMPLE_SOURCE_URL
    ) {
        SearchBarSample()
    },
    Example(
        name = ::DockedSearchBarSample.name,
        description = SEARCH_BAR_EXAMPLE_DESCRIPTION,
        sourceUrl = SEARCH_BAR_EXAMPLE_SOURCE_URL
    ) {
        DockedSearchBarSample()
    }
)

private const val SEGMENTED_BUTTON_EXAMPLE_DESCRIPTION = "Segmented Button examples"
private const val SEGMENTED_BUTTON_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/SegmentedButtonSamples.kt"
val SegmentedButtonExamples = listOf(
    Example(
        name = ::SegmentedButtonSingleSelectSample.name,
        description = SEGMENTED_BUTTON_EXAMPLE_DESCRIPTION,
        sourceUrl = SEGMENTED_BUTTON_EXAMPLE_SOURCE_URL
    ) {
        SegmentedButtonSingleSelectSample()
    },
    Example(
        name = ::SegmentedButtonMultiSelectSample.name,
        description = SEGMENTED_BUTTON_EXAMPLE_DESCRIPTION,
        sourceUrl = SEGMENTED_BUTTON_EXAMPLE_SOURCE_URL
    ) {
        SegmentedButtonMultiSelectSample()
    },
)

private const val SLIDERS_EXAMPLE_DESCRIPTION = "Sliders examples"
private const val SLIDERS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/SliderSamples.kt"
val SlidersExamples = listOf(
    Example(
        name = ::SliderSample.name,
        description = SLIDERS_EXAMPLE_DESCRIPTION,
        sourceUrl = SLIDERS_EXAMPLE_SOURCE_URL
    ) {
        SliderSample()
    },
    Example(
        name = ::StepsSliderSample.name,
        description = SLIDERS_EXAMPLE_DESCRIPTION,
        sourceUrl = SLIDERS_EXAMPLE_SOURCE_URL
    ) {
        StepsSliderSample()
    },
    Example(
        name = ::SliderWithCustomThumbSample.name,
        description = SLIDERS_EXAMPLE_DESCRIPTION,
        sourceUrl = SLIDERS_EXAMPLE_SOURCE_URL
    ) {
        SliderWithCustomThumbSample()
    },
    Example(
        name = ::SliderWithCustomTrackAndThumb.name,
        description = SLIDERS_EXAMPLE_DESCRIPTION,
        sourceUrl = SLIDERS_EXAMPLE_SOURCE_URL
    ) {
        SliderWithCustomTrackAndThumb()
    },
    Example(
        name = ::RangeSliderSample.name,
        description = SLIDERS_EXAMPLE_DESCRIPTION,
        sourceUrl = SLIDERS_EXAMPLE_SOURCE_URL
    ) {
        RangeSliderSample()
    },
    Example(
        name = ::StepRangeSliderSample.name,
        description = SLIDERS_EXAMPLE_DESCRIPTION,
        sourceUrl = SLIDERS_EXAMPLE_SOURCE_URL
    ) {
        StepRangeSliderSample()
    },
    Example(
        name = ::RangeSliderWithCustomComponents.name,
        description = SLIDERS_EXAMPLE_DESCRIPTION,
        sourceUrl = SLIDERS_EXAMPLE_SOURCE_URL
    ) {
        RangeSliderWithCustomComponents()
    }
)

private const val SNACKBARS_EXAMPLE_DESCRIPTION = "Snackbars examples"
private const val SNACKBARS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/ScaffoldSamples.kt"
val SnackbarsExamples = listOf(
    Example(
        name = ::ScaffoldWithSimpleSnackbar.name,
        description = SNACKBARS_EXAMPLE_DESCRIPTION,
        sourceUrl = SNACKBARS_EXAMPLE_SOURCE_URL
    ) {
        ScaffoldWithSimpleSnackbar()
    },
    Example(
        name = ::ScaffoldWithIndefiniteSnackbar.name,
        description = SNACKBARS_EXAMPLE_DESCRIPTION,
        sourceUrl = SNACKBARS_EXAMPLE_SOURCE_URL
    ) {
        ScaffoldWithIndefiniteSnackbar()
    },
    Example(
        name = ::ScaffoldWithCustomSnackbar.name,
        description = SNACKBARS_EXAMPLE_DESCRIPTION,
        sourceUrl = SNACKBARS_EXAMPLE_SOURCE_URL
    ) {
        ScaffoldWithCustomSnackbar()
    },
    Example(
        name = ::ScaffoldWithCoroutinesSnackbar.name,
        description = SNACKBARS_EXAMPLE_DESCRIPTION,
        sourceUrl = SNACKBARS_EXAMPLE_SOURCE_URL
    ) {
        ScaffoldWithCoroutinesSnackbar()
    },
    Example(
        name = ::ScaffoldWithMultilineSnackbar.name,
        description = SNACKBARS_EXAMPLE_DESCRIPTION,
        sourceUrl = SNACKBARS_EXAMPLE_SOURCE_URL
    ) {
        ScaffoldWithMultilineSnackbar()
    }
)

private const val SWITCH_EXAMPLE_DESCRIPTION = "Switch examples"
private const val SWITCH_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/SwitchSamples.kt"
val SwitchExamples = listOf(
    Example(
        name = ::SwitchSample.name,
        description = SWITCH_EXAMPLE_DESCRIPTION,
        sourceUrl = SWITCH_EXAMPLE_SOURCE_URL
    ) {
        SwitchSample()
    },

    Example(
        name = ::SwitchWithThumbIconSample.name,
        description = SWITCH_EXAMPLE_DESCRIPTION,
        sourceUrl = SWITCH_EXAMPLE_SOURCE_URL
    ) {
        SwitchWithThumbIconSample()
    },
)

private const val TABS_EXAMPLE_DESCRIPTION = "Tabs examples"
private const val TABS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/TabSamples.kt"
val TabsExamples = listOf(
    Example(
        name = ::PrimaryTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        PrimaryTabs()
    },
    Example(
        name = ::PrimaryIconTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        PrimaryIconTabs()
    },
    Example(
        name = ::SecondaryTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        SecondaryTabs()
    },
    Example(
        name = ::TextTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        TextTabs()
    },
    Example(
        name = ::IconTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        IconTabs()
    },
    Example(
        name = ::TextAndIconTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        TextAndIconTabs()
    },
    Example(
        name = ::LeadingIconTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        LeadingIconTabs()
    },
    Example(
        name = ::ScrollingPrimaryTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        ScrollingPrimaryTabs()
    },
    Example(
        name = ::ScrollingSecondaryTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        ScrollingSecondaryTabs()
    },
    Example(
        name = ::ScrollingTextTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        ScrollingTextTabs()
    },
    Example(
        name = ::FancyTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        FancyTabs()
    },
    Example(
        name = ::FancyIndicatorTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        FancyIndicatorTabs()
    },
    Example(
        name = ::FancyIndicatorContainerTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        FancyIndicatorContainerTabs()
    },
    Example(
        name = ::ScrollingFancyIndicatorContainerTabs.name,
        description = TABS_EXAMPLE_DESCRIPTION,
        sourceUrl = TABS_EXAMPLE_SOURCE_URL
    ) {
        ScrollingFancyIndicatorContainerTabs()
    }
)

private const val TIME_PICKER_EXAMPLE_DESCRIPTION = "Time Picker examples"
private const val TIME_PICKER_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/TimePicker.kt"
val TimePickerExamples = listOf(
    Example(
        name = ::TimePickerSample.name,
        description = TIME_PICKER_EXAMPLE_DESCRIPTION,
        sourceUrl = TIME_PICKER_EXAMPLE_SOURCE_URL
    ) {
        TimePickerSample()
    },
    Example(
        name = ::TimeInputSample.name,
        description = TIME_PICKER_EXAMPLE_DESCRIPTION,
        sourceUrl = TIME_PICKER_EXAMPLE_SOURCE_URL
    ) {
        TimeInputSample()
    },
    Example(
        name = ::TimePickerSwitchableSample.name,
        description = TIME_PICKER_EXAMPLE_DESCRIPTION,
        sourceUrl = TIME_PICKER_EXAMPLE_SOURCE_URL
    ) {
        TimePickerSwitchableSample()
    },
)

private const val TEXT_FIELDS_EXAMPLE_DESCRIPTION = "Text fields examples"
private const val TEXT_FIELDS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/TextFieldSamples.kt"
val TextFieldsExamples = listOf(
    Example(
        name = ::SimpleTextFieldSample.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        SimpleTextFieldSample()
    },
    Example(
        name = ::TextFieldSample.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        TextFieldSample()
    },
    Example(
        name = ::SimpleOutlinedTextFieldSample.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        SimpleOutlinedTextFieldSample()
    },
    Example(
        name = ::OutlinedTextFieldSample.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        OutlinedTextFieldSample()
    },
    Example(
        name = ::TextFieldWithIcons.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        TextFieldWithIcons()
    },
    Example(
        name = ::TextFieldWithPlaceholder.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        TextFieldWithPlaceholder()
    },
    Example(
        name = ::TextFieldWithPrefixAndSuffix.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        TextFieldWithPrefixAndSuffix()
    },
    Example(
        name = ::TextFieldWithErrorState.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        TextFieldWithErrorState()
    },
    Example(
        name = ::TextFieldWithSupportingText.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        TextFieldWithSupportingText()
    },
    Example(
        name = ::PasswordTextField.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        PasswordTextField()
    },
    Example(
        name = ::TextFieldWithHideKeyboardOnImeAction.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        TextFieldWithHideKeyboardOnImeAction()
    },
    Example(
        name = ::TextArea.name,
        description = TEXT_FIELDS_EXAMPLE_DESCRIPTION,
        sourceUrl = TEXT_FIELDS_EXAMPLE_SOURCE_URL
    ) {
        TextArea()
    }
).map {
    // By default text field samples are minimal and don't have a `width` modifier to restrict the
    // width. As a result, they grow horizontally if enough text is typed. To prevent this behavior
    // in Catalog app the code below restricts the width of every text field sample
    it.copy(content = {
        Box(
            Modifier
                .wrapContentWidth()
                .width(280.dp)
        ) { it.content() }
    })
}

private const val TOOLTIPS_EXAMPLE_DESCRIPTION = "Tooltips examples"
private const val TOOLTIPS_EXAMPLE_SOURCE_URL = "$SampleSourceUrl/TooltipSamples.kt"
val TooltipsExamples = listOf(
    Example(
        name = ::PlainTooltipSample.name,
        description = TOOLTIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = TOOLTIPS_EXAMPLE_SOURCE_URL
    ) {
        PlainTooltipSample()
    },
    Example(
        name = ::PlainTooltipWithManualInvocationSample.name,
        description = TOOLTIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = TOOLTIPS_EXAMPLE_SOURCE_URL
    ) {
        PlainTooltipWithManualInvocationSample()
    },
    Example(
        name = ::RichTooltipSample.name,
        description = TOOLTIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = TOOLTIPS_EXAMPLE_SOURCE_URL
    ) {
        RichTooltipSample()
    },
    Example(
        name = ::RichTooltipWithManualInvocationSample.name,
        description = TOOLTIPS_EXAMPLE_DESCRIPTION,
        sourceUrl = TOOLTIPS_EXAMPLE_SOURCE_URL
    ) {
        RichTooltipWithManualInvocationSample()
    }
)
