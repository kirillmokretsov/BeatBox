package io.github.kirillmokretsov.beatbox

class SoundViewModel {

    var sound: Sound? = null

    val title: String?
        get() = sound?.name

}