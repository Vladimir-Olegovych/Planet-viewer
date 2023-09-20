package com.gigcreator.planetviewer.presentation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.gigcreator.domain.models.asteroid.NearEarthObject
import com.gigcreator.planetviewer.R
import com.gigcreator.planetviewer.databinding.FragmentAsteroidBinding
import com.gigcreator.planetviewer.presentation.viewmodels.AsteroidViewModel
import com.gigcreator.planetviewer.presentation.viewmodels.DataModel

class AsteroidFragment : Fragment() {

    private lateinit var binding: FragmentAsteroidBinding
    private lateinit var listEarthObjects: List<NearEarthObject>

    private val listData = ArrayList<String>()

    private val marsModel by viewModels<AsteroidViewModel>()
    private val dataModel: DataModel by activityViewModels()



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

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            dataModel.near_earth_objects.value = listEarthObjects[position]
            dataModel.position.value = position
            findNavController().navigate(R.id.action_asteroidFragment_to_asteroidInfoFragment)
        }
    }
    private fun init(){
        val adapter = ArrayAdapter(requireContext(), R.layout.asteroid_card, listData)
        binding.listView.adapter = adapter

        if(!this::listEarthObjects.isInitialized) {
            marsModel.getAsteroid { asteroid ->
                listEarthObjects = asteroid.near_earth_objects

                listEarthObjects.forEach {
                    listData.add(it.name)
                    adapter.notifyDataSetChanged()
                }
            }
        }else {
            adapter.clear()
            listEarthObjects.forEach {
                listData.add(it.name)
                adapter.notifyDataSetChanged()
            }
        }
    }
}