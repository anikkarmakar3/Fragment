package com.lock.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lock.fragment.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    lateinit var _binding: FragmentStartBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentStartBinding.inflate(layoutInflater,container,false)
        val view=binding.root
        _binding.firstbtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_startFragment_to_excersizeFragment2)
        )
        // Inflate the layout for this fragment
        return view
    }


}