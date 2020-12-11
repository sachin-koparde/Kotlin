package classes

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

    val person2 = Person2()
    person2.firstName
    person2.lastName
    person2.nickName = "Sach"
    person2.nickName = "Sacchu"
    println(person2.nickName)
}