package com.geekbrains.tests

import com.geekbrains.tests.view.MainActivity
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.progress.KProgressBar
import io.github.kakaocup.kakao.text.KTextView

object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int = R.layout.activity_main
    override val viewClass: Class<*> = MainActivity::class.java

    val editText = KEditText { withId(R.id.searchEditText) }
    val progressBar = KProgressBar { withId(R.id.progressBar) }
    val resultsCountTextView = KTextView { withId(R.id.resultsCountTextView) }
}