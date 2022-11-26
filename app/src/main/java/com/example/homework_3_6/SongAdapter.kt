package com.example.homework_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


import com.example.homework_3_6.databinding.ItemSongBinding

class SongAdapter(val songList: ArrayList<Song>) : RecyclerView.Adapter<SongAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemSongBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = songList[adapterPosition]
            binding.tvNumber.text = item.number.toString()
            binding.tvSong.text = item.song
            binding.tvArtist.text = item.artist
            binding.tvDuration.text = item.duration
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongAdapter.ViewHolder {
        return ViewHolder(
            ItemSongBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        )
    }

    override fun onBindViewHolder(holder: SongAdapter.ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = songList.size
}