package com.example.healthycare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.healthycare.databinding.FragmentAturBmiBinding
import com.example.healthycare.databinding.FragmentHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class AturBmiFragment : Fragment() {

    private lateinit var binding: FragmentAturBmiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAturBmiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bottomNav : BottomNavigationView = requireActivity().findViewById(R.id.bottomNavigationView)
        setButttonListener()


    }

    private fun setButttonListener(){
        binding.buttonCalculate.setOnClickListener {
            val tinggi = binding.etTinggi.text.toString().toFloat()
            val beratbadan = binding.etBeratbadan.text.toString().toFloat()
            val umur = binding.etUmur.text.toString().toInt()
            val bmi = (beratbadan/(tinggi*tinggi))*10000.0
            Toast.makeText(context, bmi.toString(), Toast.LENGTH_SHORT).show()
            binding.tvBmiresult.text = bmi.toString()
        }
    }


}