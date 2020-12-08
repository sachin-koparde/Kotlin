fun main() {
    val interestingThings = listOf("Eat", "Code", "Read", "Sleep")

    interestingThings.forEach{ interestingThing ->
        println(interestingThing)
    }

    interestingThings.forEachIndexed{index, interestingThing ->
        println("$interestingThing is at $index")
    }
}