package stupid.dagger.component

import dagger.Component
import stupid.dagger.App
import stupid.dagger.module.MyCarModule

// Component = heart of the dagger
@Component(modules = [MyCarModule::class]) // here, we provide target modules, which holds injectable components
// for example, we can inject in [stupid.dagger.App], [stupid.dagger.factory.EngineFactory] (Not interface, take a look at modules)
interface AppComponent {

    fun app(): App

}