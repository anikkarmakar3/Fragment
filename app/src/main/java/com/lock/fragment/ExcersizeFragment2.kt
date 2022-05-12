package com.lock.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.lock.fragment.databinding.FragmentExcersize2Binding


class ExcersizeFragment2 : Fragment() {
    lateinit var _binding:FragmentExcersize2Binding
    private val binding get() = _binding

    private val excersize:MutableList<Excersizemodel> = mutableListOf(
        Excersizemodel("gifone",8),
        Excersizemodel("giftwo",8),
        Excersizemodel("gifthree",8),
        Excersizemodel("giffour",8),
        Excersizemodel("giffive",8)
    )
    private  lateinit var currentexcersize:Excersizemodel
    private  var count=0
    private  var excersizeIndex:Int=0
    private var excersizesize=Math.min((excersize.size+1)/2,3)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExcersize2Binding.inflate(inflater,container,false)
        val view = binding.root

        opearationnexercise(view)
        randomexcersize()
        return view
    }
    private fun opearationnexercise(view: View){
        binding.btn1.setOnClickListener {
            excersizeIndex++
            if (excersizeIndex < excersizesize){
                 currentexcersize = excersize[excersizeIndex]
                setexcersize()
            }
            else
            {
                view.findNavController().navigate(R.id.action_excersizeFragment2_to_welldoneFragment)
            }
        }
        binding.stpbtn.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_excersizeFragment2_to_cancelFragment)
        )
    }
    private fun randomexcersize(){
        excersize.shuffle()
        excersizeIndex = 0
        setexcersize()
    }
    private fun setexcersize(){
        currentexcersize=excersize[excersizeIndex]
        count=currentexcersize.excersizecount
        binding.timer.text=String.format("%d items",count)
        binding.image.setImageResource(resources.getIdentifier(currentexcersize.excersize,"drawable",
            (activity as AppCompatActivity).packageName))
        (activity as AppCompatActivity).supportActionBar?.title= String.format("Excersize Number: (%d,%d)"
            ,excersizeIndex+1,excersizesize)
    }
}