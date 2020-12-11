fun main() {
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")

    println(map[1])

    map.forEach{ key, value ->
        println("$key -> $value")
    }

    //Mutable Map

    val mapMutable = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    mapMutable[4] = "d"
}