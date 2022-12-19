package com.example.healthycare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.healthycare.databinding.FragmentAturDietmuBinding


class AturDietmuFragment : Fragment() {
    private lateinit var binding: FragmentAturDietmuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAturDietmuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonDetailsmakanan2.setOnClickListener {
            val toDetailFragment = AturDietmuFragmentDirections.actionAturDietmuFragmentToDetailFragment()
            requireView().findNavController().navigate(toDetailFragment)
        }
    }
}