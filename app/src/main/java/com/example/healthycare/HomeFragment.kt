package com.example.healthycare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.healthycare.databinding.FragmentHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding
    private val list = ArrayList<Gelas>()
    var gelasItem : Gelas = Gelas(false)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomNav : BottomNavigationView = requireActivity().findViewById(R.id.bottomNavigationView)
        for (i in 1..8) {
            list.add(gelasItem)
        }
        binding.imHome1.setOnClickListener{
            NavigationUI.onNavDestinationSelected(bottomNav.menu.findItem(R.id.aturDietmuFragment), findNavController())
        }
        binding.imHome2.setOnClickListener{
            NavigationUI.onNavDestinationSelected(bottomNav.menu.findItem(R.id.aturBmiFragment), findNavController())
        }
        binding.rvGelas.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        }
        showList()
    }
    private fun showList(){
        val adapter = GelasAdapter(list)
        binding.rvGelas.adapter = adapter

        adapter.setOnItemClickCallback(object: GelasAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Gelas, position: Int) {
                //data.status = !data.status
                list.set(position, Gelas(!data.status))
                showList()
            }
        })
    }

}