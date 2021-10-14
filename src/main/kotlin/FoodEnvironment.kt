class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores: MutableMap<Actor, Int> = mutableMapOf()

    init {
        for (actorInstance in ags) {
            scores.getValue(actorInstance) = 0
        }

    }

    override fun sense(agent: Actor) {}
    override fun processAction(agent: Actor, act: Action) {
        when (act) {
                 is ForageAction -> scores.put()

        }

    }
}
