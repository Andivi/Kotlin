import kotlin.random.Random

//import kotlin.random.Random

class RandomAgent(override val name: String, val probability: Double ) :Actor {


    override fun act(): Action {
        val probability = Random.nextDouble()
            return ForageAction()
        }

    override fun perceive(vararg facts: Percept) {

    }

    override fun toString(): String {
        return "RandomAgent(name='$name', probability=$probability)"
    }
}