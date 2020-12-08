
var name = "Sachin"
var greeting: String? = null

fun main() {

    val updatedGreet = if(greeting != null) greeting else "Hello"
    print("$updatedGreet $name")

}