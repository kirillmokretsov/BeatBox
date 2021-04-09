package io.github.kirillmokretsov.beatbox

import android.content.res.AssetManager
import android.util.Log

private const val TAG = "BeatBox"
private const val SOUNDS_FOLDER = "sample_sounds"

class BeatBox(private val assets: AssetManager) {

    fun loadSounds(): List<String> {
        val soundNames = assets.list(SOUNDS_FOLDER)
        return if (soundNames != null) {
            Log.d(TAG, "Found ${soundNames.size} sounds")
            soundNames.asList()
        } else {
            Log.e(TAG, "Could not list assets")
            emptyList()
        }
    }

}