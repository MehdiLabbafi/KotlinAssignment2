import kotlin.random.Random

// Vehicle.kt
open class Vehicle(val color: String, val make: String, val model: String) {

    open fun accelerate() {
        println("The $make $model is accelerating.")
    }

    open fun stop() {
        println("The $make $model has stopped.")
    }
}

// Car.kt
class Car(color: String, make: String, model: String, val numberOfDoors: Int) : Vehicle(color, make, model) {

    override fun accelerate() {
        println("The $make $model car with $numberOfDoors doors is accelerating.")
    }

    override fun stop() {
        println("The $make $model car with $numberOfDoors doors has stopped.")
    }

    fun parallelPark() {
        println("The $make $model car is parallel parking.")
    }
}

// Bus.kt
class Bus(color: String, make: String, model: String, val passengerCapacity: Int) : Vehicle(color, make, model) {

    override fun accelerate() {
        println("The $make $model bus with capacity of $passengerCapacity passengers is accelerating.")
    }

    override fun stop() {
        println("The $make $model bus with capacity of $passengerCapacity passengers has stopped.")
    }

    fun openRearDoor() {
        println("The $make $model bus is opening the rear door.")
    }
}

// Main.kt
fun main() {
    val colors = listOf("Red", "Blue", "Green", "Black", "White")
    val makes = listOf("Toyota", "Mercedes", "BMW", "Honda", "Ford")
    val models = listOf("Corolla", "Sprinter", "X5", "Civic", "Focus")

    // Randomly create instances of Car and Bus
    val randomColor = colors.random()
    val randomMake = makes.random()
    val randomModel = models.random()

    val randomCar = Car(randomColor, randomMake, randomModel, Random.nextInt(2, 5))
    val randomBus = Bus(randomColor, randomMake, randomModel, Random.nextInt(20, 50))

    // Randomly choose which vehicle to test
    if (Random.nextBoolean()) {
        println("Car:")
        println("Color: ${randomCar.color}")
        println("Make: ${randomCar.make}")
        println("Model: ${randomCar.model}")
        println("Number of Doors: ${randomCar.numberOfDoors}")
        randomCar.accelerate()
        randomCar.stop()
        randomCar.parallelPark()
    } else {
        println("Bus:")
        println("Color: ${randomBus.color}")
        println("Make: ${randomBus.make}")
        println("Model: ${randomBus.model}")
        println("Passenger Capacity: ${randomBus.passengerCapacity}")
        randomBus.accelerate()
        randomBus.stop()
        randomBus.openRearDoor()
    }
}
