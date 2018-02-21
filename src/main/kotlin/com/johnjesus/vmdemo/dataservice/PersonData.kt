package com.johnjesus.vmdemo.dataservice

import com.johnjesus.com.johnjesus.vmdemo.app.Person

class PersonData {

    // This is how you do static functions in Kotlin
    //
    companion object {
        fun save(person: Person?) {
            println("Saving ${person?.name} / ${person?.title}")
        }
        fun getPersons(): List<Person> = listOf(
                Person("John", "Manager"),
                Person("Jay", "Worker bee"))
    }
}
