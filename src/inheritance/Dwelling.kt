import kotlin.math.*

fun main() {
   val squareCabin = SquareCabin(6, 50.0)
   val roundHut = RoundHut(3, 10.0)
   val roundTower= RoundTower(4, 10.0)
   with(squareCabin){
       println("Building material: ${buildingMaterial}")
   	   println("Total capacity: ${capacity}")
       println("Has room?: ${hasRoom()}")
       getRoom()
       println("Floor area: ${floorArea()}\n")
   }
   
    with(roundHut){
       println("Building material: ${buildingMaterial}")
   	   println("Total capacity: ${capacity}")
       println("Has room?: ${hasRoom()}")
       getRoom()
       println("Floor area: ${floorArea()}")
       println("Maximum carpet Size: ${calculateMaxCarpetSize()}\n")
    }
    
    with(roundTower){
       println("Building material: ${buildingMaterial}")
   	   println("Total capacity: ${capacity}")
       println("Has room?: ${hasRoom()}")
       getRoom()
       println("Floor area: ${floorArea()}")
    }
   
}

abstract class Dwelling(private var residents: Int){
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
    fun hasRoom(): Boolean{
        return residents < capacity
    }
    
    abstract fun floorArea(): Double
    
    fun getRoom(){
        if(capacity > residents){
            residents++
            println("Congrats! You got a room.")
        } else {
            println("Sorry, no rooms left.")
        }
    }
}

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents){
    override val buildingMaterial = "Wood"
    override val capacity = 6
    
    override fun floorArea(): Double{
        return length * length
    }
}

open class RoundHut(residents: Int, val radius: Double) : Dwelling(residents){
    override val buildingMaterial = "Straw"
    override val capacity = 4
    
    override fun floorArea(): Double{
        return PI * radius * radius
    }
    
    fun calculateMaxCarpetSize(): Double{
        val diameter = 2 * radius
        return sqrt((diameter * diameter) / 2)
    }
}

class RoundTower(
    residents: Int,
    radius: Double,
	val floors: Int = 2) : RoundHut(residents, radius){
    override val buildingMaterial = "Stone"
    override val capacity = floors * 4
    
    override fun floorArea(): Double{
        return PI * radius * radius * floors
    }
}





