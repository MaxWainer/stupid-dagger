package stupid.dagger.module

import dagger.Binds
import dagger.Module
import stupid.dagger.factory.EngineFactory
import stupid.dagger.factory.FrameFactory
import stupid.dagger.factory.WheelFactory
import stupid.dagger.myimpl.factory.MyEngineFactory
import stupid.dagger.myimpl.factory.MyFrameFactory
import stupid.dagger.myimpl.factory.MyWheelFactory

// modules holds specific implementation
// for our dependencies, in our case, everything which prefixed with My*
// provided here
@Module
abstract class MyCarModule {

    @Binds // we are binding our implementation, for specific class, in this case it's EngineFactory
    abstract fun provideMyEngineFactory(factory: MyEngineFactory): EngineFactory

    @Binds
    abstract fun provideMyWheelFactory(factory: MyWheelFactory): WheelFactory

    @Binds
    abstract fun provideMyFrameFactory(factory: MyFrameFactory): FrameFactory

}