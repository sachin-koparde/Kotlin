package inheritance

interface PersonInfoProvider{
    val infoProvider: String
    fun printInfo(person: Person){
        println(infoProvider)
        person.nickName = "Sachin"
        person.printInfo()
    }
}

interface sessionInfoProvider{
    fun getSessionId(): String
}

open class BasicInfoProvider: PersonInfoProvider, sessionInfoProvider{
    override val infoProvider: String
        get() = "This is from the class"

    protected open val sessionID = "SOMEID"

    override fun getSessionId(): String {
        return sessionID
    }
}

fun main() {
    val provider = UserInfo()
    provider.printInfo(Person())

    checkTypes(provider)
}

fun checkTypes( infoProvider: PersonInfoProvider){
    if(infoProvider is sessionInfoProvider){
        print("is a session info provider")
    }
    else{
        print("not a session info provider")
    }
}

