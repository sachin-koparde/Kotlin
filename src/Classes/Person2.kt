package Classes

class Person2(val firstName: String ="Sachin", val lastName: String = "Koparde") {
    
    var nickName: String? = null
    set(value) {
        field = value
        println(value)
    }

    get() {
        println("The new nickname is $field")
        return field
    }
}