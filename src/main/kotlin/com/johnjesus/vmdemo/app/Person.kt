package com.johnjesus.com.johnjesus.vmdemo.app

import com.johnjesus.vmdemo.dataservice.PersonData
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

// A *data class* is immutable
//
data class Person(
    var name: String? = null,
    var title: String? = null) {

    // This is how you do a static function in Kotlin
    // This method is provided to upper layers so that they
    // don't need to know about the dataservice
    //
    companion object {
        fun getPersons(): List<Person> = PersonData.getPersons()
    }

    fun save() = PersonData.save(this)
}
