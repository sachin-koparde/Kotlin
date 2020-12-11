fun sayHello(wish: String, vararg name: String ){
    name.forEach(){ sayName->
        println("$wish $sayName")
    }
}


fun main() {
    val nameList = arrayOf("Kiran", "Arjun", "Madan")
    sayHello("Hi", *nameList)
}