package com.example.homework_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.homework_3_6.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var list = arrayListOf<Album>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = AlbumAdapter(list)
        binding.rvArtistAlbum.adapter=adapter
    }

    private fun loadData() {
        list.add(Album(1, "Rare", "Selena Gomez", "2020"))
        list.add(Album(2, "2004", "Скриптонит", "2020"))
        list.add(Album(3, "After Hours", "The Weeknd", "2020"))
        list.add(Album(4, "Код доступа 996", "Ulukmanapo", "2020"))
        list.add(Album(5, "Hajime, Pt.3", "MiyaGi & Эндшпиль", "2018"))
        list.add(Album(6, "Curtain Call", "Eminem", "2005"))
    }

}