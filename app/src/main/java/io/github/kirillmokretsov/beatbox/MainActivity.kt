package io.github.kirillmokretsov.beatbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.kirillmokretsov.beatbox.databinding.ActivityMainBinding
import io.github.kirillmokretsov.beatbox.databinding.ListItemSoundBinding

class MainActivity : AppCompatActivity() {

    private lateinit var beatBox: BeatBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        beatBox = BeatBox(assets)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(context, 3)
            adapter = SoundAdapter()
        }
    }

    private inner class SoundHolder(binding: ListItemSoundBinding) :
        RecyclerView.ViewHolder(binding.root)

    private inner class SoundAdapter : RecyclerView.Adapter<SoundHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundHolder =
            SoundHolder(
                DataBindingUtil.inflate(
                    layoutInflater,
                    R.layout.list_item_sound,
                    parent,
                    false
                )
            )

        override fun onBindViewHolder(holder: SoundHolder, position: Int) {
        }

        override fun getItemCount(): Int = 0

    }
}