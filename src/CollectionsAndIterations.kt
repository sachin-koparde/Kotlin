fun main(){
    val dailyRoutine = arrayOf("Eat","Code","Sleep")
    println(dailyRoutine.size)
    println(dailyRoutine[0])
    println(dailyRoutine[2])
    println(dailyRoutine.get(0))
    val check = dailyRoutine[0].equals("GetUp")
    println(check)

    //Three types of for loops
    for(eachThing in dailyRoutine){
        print("$eachThing ")
    }

    println()

    dailyRoutine.forEach {
        print("$it ") //here it is a default variable that holds each element from the array at each iteration
    }

    println()

    dailyRoutine.forEach { eachThing ->
        println("$eachThing ")
    }

    //Looping with index

    dailyRoutine.forEachIndexed{ index, eachThing ->
        println("$eachThing is at index $index")
    }

}