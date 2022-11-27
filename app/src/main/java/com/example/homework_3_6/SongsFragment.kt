package com.example.homework_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_3_6.databinding.FragmentSongsBinding

class SongsFragment : Fragment() {
    private lateinit var binding:FragmentSongsBinding
    private var list= arrayListOf<Song>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter=SongAdapter(list)
        binding.rvSongs.adapter=adapter
    }

    private fun loadData() {
        list.clear()
        list.add(Song(1,"The Hills","The Weeknd","3:56"))
        list.add(Song(2,"Up","Cardi B","3:00"))
        list.add(Song(3,"Розовое вино","Элджей, FEDUK","3:20"))
        list.add(Song(4,"Rasputin","Majestic","2:56"))
        list.add(Song(5,"Ne bo'ldi","SM","3:36"))
        list.add(Song(6,"Stan","Lo fi","3:10"))
        list.add(Song(7,"Sunflower","Post Malone","2:40"))
        list.add(Song(8,"Denzel W.","Ulukmanapo","3:00"))
        list.add(Song(9,"Take on me","a-ha","3:56"))
        list.add(Song(10,"In the End","Linkin Park","3:56"))
        list.add(Song(10,"In the End","Linkin Park","1:30"))
        list.add(Song(10,"In the End","Linkin Park","2:40"))
        list.add(Song(10,"In the End","Linkin Park","3:50"))
        list.add(Song(10,"In the End","Linkin Park","3:33"))
        list.add(Song(10,"In the End","Linkin Park","3:21"))

    }


}