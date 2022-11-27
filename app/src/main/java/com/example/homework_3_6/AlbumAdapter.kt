package com.example.homework_3_6

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework_3_6.databinding.ItemAlbumBinding


class AlbumAdapter(
    val albumList: ArrayList<Album>,
    val onClick: (position: Int) -> Unit
) :
    RecyclerView.Adapter<AlbumAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemAlbumBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            itemView.setOnClickListener {
                onClick(adapterPosition)
            }
            val item = albumList[adapterPosition]
            binding.tvNumber.text = item.number.toString()
            binding.tvAlbum.text = item.album
            binding.tvArtist.text = item.artist
            binding.tvYear.text = item.year
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemAlbumBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = albumList.size

}