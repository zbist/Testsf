package com.geekbrains.tests

import android.Manifest
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.rule.GrantPermissionRule
import com.geekbrains.tests.view.MainActivity
import junit.framework.TestCase
import org.junit.Rule
import org.junit.Test

class KaspressoMainActivityTest: TestCase() {

    @Rule
    val runtimePermissionRule: GrantPermissionRule = GrantPermissionRule.grant(
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE
    )

    @Rule
    val activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun activitySearch_isWorking() {
        MainScreen {
            editText {
                isVisible()
                replaceText("algol")
                pressImeAction()
            }
            resultsCountTextView {
                isVisible()
                hasText("Number of results: 42")
            }
            progressBar {
                isVisible()
            }
        }
    }


}