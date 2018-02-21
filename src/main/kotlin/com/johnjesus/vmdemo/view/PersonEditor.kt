package com.johnjesus.com.johnjesus.vmdemo.view


import com.johnjesus.com.johnjesus.vmdemo.app.Person
import com.johnjesus.com.johnjesus.vmdemo.app.PersonViewModel
import javafx.collections.ObservableList
import javafx.scene.layout.BorderPane
import tornadofx.*

class PersonEditor : View("Person Editor") {
    override val root = BorderPane()
    // Some fake data for our table
    val persons : ObservableList<Person>
    val model : PersonViewModel by inject()

    init {
        persons = Person.getPersons().observable()
        with(root) {
            center {
                tableview(persons) {
                    column("Name", Person::name)
                    column("Title", Person::title)
                    // Update the person inside the view model on selection change
                    bindSelected(model)                    }
            }
            right {
                form {
                    fieldset("Edit person") {
                        field("Name") {
                            textfield(model.name)
                        }
                        field("Title") {
                            textfield(model.title)
                        }
                        button("Save") {
                            enableWhen(model.dirty)
                            action {
                                save()
                            }
                        }
                        button("Reset").action {
                            model.rollback()
                        }
                    }
                }
            }
        }
    }

    private fun save() {

        // The commit updates the ViewModel with the GUI values
        // through the onCommit() method in the ViewModel
        //
        model.commit()
    }
}
