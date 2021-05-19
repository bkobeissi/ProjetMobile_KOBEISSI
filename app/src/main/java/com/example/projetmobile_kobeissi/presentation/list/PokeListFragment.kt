package com.example.projetmobile_kobeissi.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projetmobile_kobeissi.R
import java.util.ArrayList

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class PokeListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private val adapter = PokeAdapter(listOf<Pokemon>())
    private val layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_poke_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.poke_recyclerview)

        recyclerView.apply {
            layoutManager = this@PokeListFragment.layoutManager
            adapter = this@PokeListFragment.adapter
        }

        val pokeList = arrayListOf<Pokemon>().apply {
            add(Pokemon("Pikachu"))
            add(Pokemon("Salamèche"))
            add(Pokemon("Carapuce"))
            add(Pokemon("Herbizarre"))
        }

        adapter.updateList(pokeList)

    }
}