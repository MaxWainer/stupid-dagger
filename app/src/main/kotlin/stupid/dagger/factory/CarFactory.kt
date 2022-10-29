package stupid.dagger.factory

import stupid.dagger.structures.Car

interface CarFactory {

    fun createCar(): Car

}