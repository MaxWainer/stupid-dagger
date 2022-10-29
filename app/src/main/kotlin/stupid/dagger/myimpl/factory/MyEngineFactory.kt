package stupid.dagger.myimpl.factory

import stupid.dagger.factory.EngineFactory
import stupid.dagger.myimpl.structures.MyEngine
import javax.inject.Inject

class MyEngineFactory @Inject constructor() : EngineFactory {
    override fun createEngine() = MyEngine()
}