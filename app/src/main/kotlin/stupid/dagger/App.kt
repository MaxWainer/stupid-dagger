package stupid.dagger

import stupid.dagger.component.DaggerAppComponent
import stupid.dagger.factory.CarFactory
import stupid.dagger.factory.EngineFactory
import stupid.dagger.factory.FrameFactory
import stupid.dagger.factory.WheelFactory
import stupid.dagger.structures.Car
import stupid.dagger.structures.Engine
import stupid.dagger.structures.Frame
import stupid.dagger.structures.Wheel
import javax.inject.Inject

class App @Inject constructor(
    wheelFactory: WheelFactory,
    frameFactory: FrameFactory,
    engineFactory: EngineFactory
) {

    val independentCarFactory: CarFactory = IndependentCarFactory(wheelFactory, frameFactory, engineFactory)

}

fun main() {
    val app = DaggerAppComponent.create().app() // it's auto-generated

    // get our independent factory
    val factory = app.independentCarFactory

    println(factory.createCar())
}

class IndependentCarFactory(
    val wheelFactory: WheelFactory,
    val frameFactory: FrameFactory,
    val engineFactory: EngineFactory
) : CarFactory {
    override fun createCar() = IndependentCar(arrayOf(
        wheelFactory.createWheel(),
        wheelFactory.createWheel(),
        wheelFactory.createWheel(),
        wheelFactory.createWheel()
    ), engineFactory.createEngine(), frameFactory.createFrame())
}

class IndependentCar(override val wheels: Array<Wheel>, override val engine: Engine, override val frame: Frame) : Car {

    override fun toString(): String {
        return "IndependentCar(wheels=${wheels.contentToString()}, engine=$engine, frame=$frame)"
    }
}