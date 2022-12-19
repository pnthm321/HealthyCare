package com.example.healthycare

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.healthycare.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button1.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_mainActivity)
            //val intent = Intent(activity, MainActivity::class.java)
            //activity?.startActivity(intent)
            //activity?.finish()
        }
        binding.textView7.setOnClickListener { view ->
            val toRegisterFragment = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            view.findNavController().navigate(toRegisterFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}