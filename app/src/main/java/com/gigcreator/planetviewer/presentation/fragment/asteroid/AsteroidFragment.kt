package com.gigcreator.planetviewer.presentation.fragment.asteroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.gigcreator.planetviewer.databinding.FragmentAsteroidBinding
import com.gigcreator.planetviewer.presentation.fragment.asteroid.rcview.adapter.AsteroidAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AsteroidFragment : Fragment() {

    private lateinit var binding: FragmentAsteroidBinding
    private val adapter = AsteroidAdapter()
    private val viewModel: AsteroidViewModel by viewModels()

    private var retrofitInit = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        binding = FragmentAsteroidBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        if (!retrofitInit) viewModel.getAsteroid()
    }
    private fun init(){
        binding.rcView.layoutManager = LinearLayoutManager(requireContext())
        binding.rcView.adapter = adapter
        adapter.clear()
        viewModel.resultLiveData.observe(this, Observer { asteroid ->
            retrofitInit = true
            asteroid.near_earth_objects.forEach { adapter.add(it) }
        })
    }
}