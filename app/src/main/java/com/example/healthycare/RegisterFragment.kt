package com.example.healthycare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.healthycare.databinding.FragmentLoginBinding
import com.example.healthycare.databinding.FragmentRegisterBinding



class RegisterFragment : Fragment() {
    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button2.setOnClickListener{
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
            //val intent = Intent(activity, MainActivity::class.java)
            //activity?.startActivity(intent)
            //activity?.finish()
        }
        binding.textView12.setOnClickListener { view ->
            val toLoginFragment = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
            view.findNavController().navigate(toLoginFragment)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RegisterFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}