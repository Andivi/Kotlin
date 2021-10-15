fun main() {
    val env = FoodEnvironment(RandomAgent("Charlie",0.8), RandomAgent("Bob", 0.2), RandomAgent("Alice", 0.6))
    for (i in 1..100)
        env.step()
    println(env.scores)
}