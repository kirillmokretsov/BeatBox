package io.github.kirillmokretsov.beatbox

import androidx.lifecycle.ViewModel

class BeatBoxViewModel() : ViewModel() {
    lateinit var beatBox: BeatBox

    override fun onCleared() {
        super.onCleared()
        beatBox.release()
    }

}