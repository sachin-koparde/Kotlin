package inheritance

class UserInfo: BasicInfoProvider() {
    override val infoProvider: String
        get() = "This is from the UserInfo class"
    override val sessionID: String
        get() = super.sessionID
}