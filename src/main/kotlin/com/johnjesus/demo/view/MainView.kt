package com.johnjesus.demo.view

import com.johnjesus.demo.app.Styles
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import tornadofx.*

class MainView : View("Hello TornadoFX") {

    // This is called the 'builder' syntax
    //
    override val root = borderpane {
        top(TopView::class)
        bottom(BottomView::class)
    }
}

class TopView : View() {
    override val root = Label("Top View")
}

class BottomView : View() {
    override val root = Label("Bottom View")
}
