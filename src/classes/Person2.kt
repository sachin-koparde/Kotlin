package classes

class Person2(val firstName: String ="Sachin", val lastName: String = "Koparde") {
    
    var nickName: String? = null
    set(value) {
        field = value
        println(value)
    }




    fun printInfo(){
        val nickNameToPrint = nickName ?: "No NickName"
        println("$firstName ($nickNameToPrint) $lastName")
    }

}

fun main() {
    val person3 = Person2()
    person3.printInfo()
}