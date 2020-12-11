fun greetPerson(greet: String = "Hello", name: String) = println("$greet, $name")

fun main() {
    greetPerson(name = "Sachin", greet = "Hi")
}