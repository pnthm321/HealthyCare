package com.example.healthycare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.healthycare.databinding.FragmentHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeFragment : Fragment() {

    private lateinit var binding:FragmentHomeBinding

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
        binding.imHome1.setOnClickListener{
            NavigationUI.onNavDestinationSelected(bottomNav.menu.findItem(R.id.aturDietmuFragment), findNavController())
        }
        binding.imHome2.setOnClickListener{
            NavigationUI.onNavDestinationSelected(bottomNav.menu.findItem(R.id.aturBmiFragment), findNavController())
        }
    }

}