

fun createGreeter (name: String,
                   greeting: String = "Hello"): () -> String {

    var greeter: () -> String = {
        "$greeting $name"
    }

    return greeter
}

fun main(args: Array<String>) {
    var janeGreeter = createGreeter("JANE")
    var johnGreeter = createGreeter("JOHN", "HI")
    println(janeGreeter())
    println(johnGreeter())
}

