package com.gigcreator.planetviewer.presentation.fragment.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.gigcreator.planetviewer.R
import com.gigcreator.planetviewer.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root
    }
    private fun onClick(){
        binding.asteroidsItem.asteroidsLayout.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_asteroidFragment)
        }
        binding.marsItem.marsLayout.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_marsFragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }
}