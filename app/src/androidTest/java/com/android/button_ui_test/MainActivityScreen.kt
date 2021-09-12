package com.android.button_ui_test

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

class MainActivityScreen : Screen<MainActivityScreen>() {

    private val textViewTitle = KTextView {
        withId(R.id.textView_title)
    }

    private val textViewDescription = KTextView {
        withId(R.id.textView_description)
        withText(R.string.print_hello_description)
    }

    private val buttonPrintHello = KButton {
        withId(R.id.button_printHello)
        withText(R.string.button_print_hello_text)
    }

    fun assertInitialStateOfMainScreen() {
        textViewTitle.isVisible()
        textViewTitle.hasEmptyText()
        textViewDescription.isVisible()
        buttonPrintHello.isVisible()
        buttonPrintHello.isEnabled()
    }

    fun performClickOnHelloButton() {
        buttonPrintHello.click()
    }

    fun assertFinalStateOfMainScreen() {
        textViewTitle.isVisible()
        textViewTitle.hasText(R.string.hello_word_title)
        textViewDescription.isVisible()
        buttonPrintHello.isVisible()
        buttonPrintHello.isEnabled()
    }
}