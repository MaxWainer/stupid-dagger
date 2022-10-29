package stupid.dagger.myimpl.factory

import stupid.dagger.factory.WheelFactory
import stupid.dagger.myimpl.structures.MyWheel
import javax.inject.Inject

class MyWheelFactory @Inject constructor() : WheelFactory {
    override fun createWheel() = MyWheel()
}