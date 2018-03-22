open class Alpha {

}
interface Gamma {
    fun ray()
}
interface Delta {
    fun what()
}

class Beta(var x: Delta): Alpha(), Gamma, Delta {
    override fun what() {
    }

    override fun ray() {
    }

}

var b = Beta(object: Delta {
    override fun what() {
    }
})