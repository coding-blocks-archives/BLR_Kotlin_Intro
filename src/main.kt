fun hello () {
    println("HELLO WORLD")
}

object myObj {
    var someVar = 10
    fun saySomething() {
        println("yo")
    }
}

interface MyListener {
    fun onListen(x: Boolean)
}

fun createGreeting(name: String): String {
    return "Hello " + name
}

fun main(args: Array<String>) {
    var x = 10
    val y = 20

    var aInt: Int? = null

    var listener = object : MyListener {
        override fun onListen(x: Boolean) {

        }

    }

    println(createGreeting("Arnav"))


    println(x)
    hello()

    // named constructor calls are not java interoperable
    val p = Person(name = "John", age = 10)

    val c1 = Car("Dzire")
    val c2 = Car("Amaze", 400000)

    myObj.saySomething()
}