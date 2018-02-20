package com.johnjesus.datacontrollerdemo.view

import javafx.collections.FXCollections
import javafx.scene.paint.Color
import tornadofx.*

class DataControllerView : View() {
    val controller: MyController by inject()
    override val root = vbox {
        label("My items")
        listview(controller.values)
    }
}

class MyController : Controller() {
    val values = FXCollections.observableArrayList("Alpha", "Beta", "Gamma", "Delta")
}