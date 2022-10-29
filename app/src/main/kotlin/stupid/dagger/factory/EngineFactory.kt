package stupid.dagger.factory

import stupid.dagger.structures.Engine

interface EngineFactory {

    fun createEngine(): Engine

}