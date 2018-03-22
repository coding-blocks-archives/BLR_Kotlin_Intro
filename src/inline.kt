class Human (var age: Int) {
    inline fun isAdult (): Boolean = age > 18
}

fun main(args: Array<String>) {
    val h = Human(10)
    val h2 = Human(20)
    println(h.isAdult())
    println(h2.isAdult())
}