package Classes

class Person(val firstName: String, val lastName: String) {

    init {
        println("Init 1")
    }

    constructor(): this("Gaurav", "Sharma"){
        print("Hello")
    }

    init {
        println("Init 2")
    }

}

fun main() {
    val person = Person()
    println(person.firstName)
    println(person.lastName)
}