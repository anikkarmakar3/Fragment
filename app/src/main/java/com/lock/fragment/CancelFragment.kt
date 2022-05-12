package com.lock.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lock.fragment.databinding.FragmentCancelBinding
import com.lock.fragment.databinding.FragmentWelldoneBinding


class CancelFragment : Fragment() {
    lateinit var _binding: FragmentCancelBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentCancelBinding.inflate(inflater,container,false)
        val view=binding.root
        _binding.tryagain.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_cancelFragment_to_excersizeFragment2)
        )
        return view
    }


}