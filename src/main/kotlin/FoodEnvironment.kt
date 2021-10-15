class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores: MutableMap<Actor, Int> = mutableMapOf()

    init {
        for (agent in ags) {
            scores.put(agent, 0)
        }

    }

    override fun sense(agent: Actor) {}
    override fun processAction(agent: Actor, act: Action) {
        when (act) {
                 is ForageAction -> scores[agent] = scores.getValue(agent).plus(1)

        }

    }
}
