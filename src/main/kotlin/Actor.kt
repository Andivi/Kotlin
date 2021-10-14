
 interface Actor {
    val name : String
    open fun act() : Action
    open fun perceive(vararg facts : Percept) : Unit
}