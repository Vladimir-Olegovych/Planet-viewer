package com.gigcreator.planetviewer.presentation.fragment.asteroid.rcview.holder

import android.graphics.Color
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.gigcreator.domain.models.asteroid.NearEarthObject
import com.gigcreator.planetviewer.databinding.AsteroidCardBinding


class AsteroidHolder(item: View): RecyclerView.ViewHolder(item){

    private val binding = AsteroidCardBinding.bind(item)

    fun bind(neo: NearEarthObject) = with(binding){
        textViewAsteroidName.text = neo.name
        textViewAbsoluteMagnitude.text = neo.absolute_magnitude_h.toString()
        textViewDiameter.text = neo.estimated_diameter.kilometers.estimated_diameter_max.toString()
        textViewOrbitalPeriod.text = neo.orbital_data.orbital_period

        if (neo.is_potentially_hazardous_asteroid) textViewIsPotentiallyHazardousAsteroid.setTextColor(Color.RED)
        else textViewIsPotentiallyHazardousAsteroid.setTextColor(Color.GREEN)

        textViewIsPotentiallyHazardousAsteroid.text = neo.is_potentially_hazardous_asteroid.toString()
    }

    fun getBinding(): AsteroidCardBinding {
        return binding
    }
}