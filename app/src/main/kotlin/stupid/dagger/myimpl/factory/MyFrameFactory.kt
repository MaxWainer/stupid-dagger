package stupid.dagger.myimpl.factory

import stupid.dagger.factory.FrameFactory
import stupid.dagger.myimpl.structures.MyFrame
import javax.inject.Inject

class MyFrameFactory @Inject constructor() : FrameFactory {
    override fun createFrame() = MyFrame()
}