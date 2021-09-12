package com.android.button_ui_test

import androidx.test.core.app.ActivityScenario
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import org.junit.Before
import org.junit.Test

class MainActivityInstrumentationTest {

    @Before
    fun setup() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun printHelloTest() {
        onScreen<MainActivityScreen> {
            assertInitialStateOfMainScreen()
            performClickOnHelloButton()
            assertFinalStateOfMainScreen()
        }
    }
}