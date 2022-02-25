package com.example.paramfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.paramfragmentdemo.databinding.FragmentABinding
import java.util.zip.Inflater

class AFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding:FragmentABinding = DataBindingUtil.inflate(inflater, R.layout.fragment_a, container, false)
        binding.btnSent.setOnClickListener(){
            val name = binding.tfName.text.toString()
            val action = AFragmentDirections.actionAFragmentToBFragment(name)

            Navigation.findNavController(it).navigate(action)
        }
        return binding.root
    }
}