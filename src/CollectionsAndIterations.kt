fun main(){
    val dailyRoutine = arrayOf("Eat","Code","Sleep")
    println(dailyRoutine.size)
    println(dailyRoutine[0])
    println(dailyRoutine[2])
    println(dailyRoutine.get(0))
    val check = dailyRoutine[0].equals("GetUp")
    print(check)
}