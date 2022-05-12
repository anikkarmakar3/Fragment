package com.lock.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lock.fragment.databinding.FragmentStartBinding
import com.lock.fragment.databinding.FragmentWelldoneBinding


class WelldoneFragment : Fragment() {


    lateinit var _binding: FragmentWelldoneBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentWelldoneBinding.inflate(inflater,container,false)
        val view=binding.root

        nextworkout(view)
        return view
    }

    private fun nextworkout(view: View) {
        binding.workout2.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_welldoneFragment_to_excersizeFragment2)
        )
    }


}