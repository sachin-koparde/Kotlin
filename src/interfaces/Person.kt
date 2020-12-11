package interfaces

class Person(val firstName: String ="Sachin", val lastName: String = "Koparde") {
    
    var nickName: String? = null
    set(value) {
        field = value
    }

    fun printInfo(){
        val nickNameToPrint = nickName ?: "No NickName"
        println("$firstName ($nickNameToPrint) $lastName")
    }

}
