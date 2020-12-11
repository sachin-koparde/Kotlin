package interfaces

interface PersonInfoProvider{
    val infoProvider: String
    fun printInfo(person: Person){
        println(infoProvider)
        person.nickName = "Sachin"
        person.printInfo()
    }
}

class BasicInfoProvider: PersonInfoProvider{
    override val infoProvider: String
        get() = "This is from the class"
}

fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
}

