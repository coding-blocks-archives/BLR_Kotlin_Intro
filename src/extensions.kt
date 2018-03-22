class Vehicle (var wheels: Int = 4) {
    var numAxles = wheels / 2
    fun getAxles (): Int = wheels / 2
}

fun Vehicle.numTyres (): Int {
    return this.wheels + 1
}

fun main(args: Array<String>) {
    var car = Vehicle(4)
    car.wheels = 6
    println("Axles = ${car.getAxles()}")
    println("Axles = ${car.numAxles}")
    println("Tyres = ${car.numTyres()}")


}