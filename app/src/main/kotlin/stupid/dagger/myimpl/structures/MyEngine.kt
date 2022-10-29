package stupid.dagger.myimpl.structures

import stupid.dagger.structures.Engine

class MyEngine : Engine {
    override val power = 120
    override var durability = 200.0
    override val name = "Super engine"
    override val vendor = "SuperCompany LLC"
}