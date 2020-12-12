package practice

interface PracticeInterface {
    fun giveID(): String?
}

class SomeClass: PracticeInterface{
    override fun giveID(): String? {
        print("Enter the ID: ")
        val id =  readLine()
        return id
    }
}

fun main() {
    val id = SomeClass()
    val provideid = id.giveID()
    print(provideid)
}

