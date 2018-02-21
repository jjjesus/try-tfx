package com.johnjesus.com.johnjesus.vmdemo.app

import com.johnjesus.vmdemo.dataservice.PersonData
import tornadofx.*

class PersonViewModel : ItemViewModel<Person>() {
    val name = bind { item?.name?.toProperty() }
    val title = bind { item?.title?.toProperty() }

    // When the GUI commits, create a new Person with updated
    // values from the GUI.  A new Person is required because
    // Person is a *data class*, which is immutable
    //
    override fun onCommit() {
        item = Person(name.value, title.value)
        item.save()
    }
}
