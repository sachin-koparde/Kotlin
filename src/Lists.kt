fun main() {
    val interestingThings = listOf("Eat", "Code", "Read", "Sleep")

    interestingThings.forEach{ interestingThing ->
        println(interestingThing)
    }

    interestingThings.forEachIndexed{index, interestingThing ->
        println("$interestingThing is at $index")
    }


    //mutable List

    val interestingThingsMutable = mutableListOf("Eat", "Code", "Read", "Sleep")

    interestingThingsMutable.forEach{ interestingThing ->
        println(interestingThing)
    }

    println("After new addition to the list: ")
    interestingThingsMutable.add("GetUp")
    interestingThingsMutable.forEach{ interestingThing->
        println(interestingThing)
    }

}