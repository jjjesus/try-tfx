package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    // The inject() delegate will lazily assign a given component
    // to a property. The inject() will assign the component only
    // after that component is called (instead of during construction)
    //
    val topView: TopView by inject()
    val bottomView: BottomView by inject()
    override val root = BorderPane()

    init {
        with(root) {
            top = topView.root
            bottom = bottomView.root
        }
    }
}

class TopView : View() {
    override val root = Label("Top View")
}

class BottomView : View() {
    override val root = Label("Bottom View")
}
