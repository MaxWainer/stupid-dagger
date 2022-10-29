package stupid.dagger.factory

import stupid.dagger.structures.Wheel

interface WheelFactory {

    fun createWheel(): Wheel

}