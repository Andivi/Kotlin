import kotlin.random.Random

class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores: MutableMap<Actor, Int> = mutableMapOf()
    var animal: String? = null

    init {
        for (agent in ags) {
            scores.put(agent, 0)
        }

    }

    override fun sense(agent: Actor) {}

    override fun step() {

        //for(i in 1..10) {
            val rand = Random.nextDouble(0.0, 1.0)
            if(rand < 0.5){
                 animal = null
            }
            else if(rand >= 0.5){
                 animal = "Deer"
            }
            println(rand)
        //}

            super.step()

    }

    override fun processAction(agent: Actor, act: Action) {
        when (act) {
                 is ForageAction -> scores[agent] = scores.getValue(agent).plus(1)

        }

    }
}
