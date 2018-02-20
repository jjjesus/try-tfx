package com.johnjesus.controllerdemo.view

import javafx.scene.paint.Color
import tornadofx.*

class MainView : View() {
    val controller: MyController by inject()
    override val root = vbox {
        label("Input")
        val inputField = textfield()
        button("Commit") {
            action {
                controller.writeToDb(inputField.text)
                inputField.clear()
            }
        }
    }
}

class MyController: Controller() {
    fun writeToDb(inputValue: String) {
        println("Writing $inputValue to database!")
    }
}
