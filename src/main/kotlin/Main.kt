import kotlin.random.Random

fun main() {
    val env = FoodEnvironment()

    for (i in 1..10) {
        env.step()
        println(env.animal)


    }
}