package com.example.healthycare

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class LandingFragment : Fragment() {
    private val argumentPosition = "position"
    private var fragmentPosition : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentPosition = arguments?.getInt(argumentPosition) ?: 0
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return when (fragmentPosition){
            1 -> inflater.inflate(R.layout.fragment_welcome, container, false)
            else -> inflater.inflate(R.layout.fragment_welcome, container, false)
        }
    }

    companion object {
        @JvmStatic
        fun getInstance(position : Int) =
            LandingFragment().apply {
                arguments = Bundle().apply {
                    putInt(argumentPosition, position)
                }
            }
    }
}