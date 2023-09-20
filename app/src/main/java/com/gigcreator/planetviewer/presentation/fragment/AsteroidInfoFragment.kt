package com.gigcreator.planetviewer.presentation.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.gigcreator.planetviewer.databinding.FragmentAsteroidInfoBinding
import com.gigcreator.planetviewer.presentation.viewmodels.DataModel

class AsteroidInfoFragment : Fragment() {

    private lateinit var binding: FragmentAsteroidInfoBinding
    private val dataModel: DataModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAsteroidInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataModel.position.observe(viewLifecycleOwner) { position ->
            dataModel.near_earth_objects.observe(viewLifecycleOwner) { neo ->
                binding.toolbarTitle.text = neo.name
                binding.absoluteMagnitudeH.text = "absolute_magnitude_h: ${neo.absolute_magnitude_h}"
                binding.closeApproachDate.text = "close_approach_date: ${neo.close_approach_data[position].close_approach_date}"
                binding.closeApproachDateFull.text = "close_approach_date_full: ${neo.close_approach_data[position].close_approach_date_full}"
                binding.epochDateCloseApproach.text = "epoch_date_close_approach: ${neo.close_approach_data[position].epoch_date_close_approach}"
                binding.astronomical.text = "astronomical: ${neo.close_approach_data[position].miss_distance.astronomical}"
                binding.kilometers.text = "kilometers: ${neo.close_approach_data[position].miss_distance.kilometers}"
                binding.lunar.text = "kilometers: ${neo.close_approach_data[position].miss_distance.lunar}"
                binding.miles.text = "kilometers: ${neo.close_approach_data[position].miss_distance.miles}"
                binding.orbitingBody.text = "orbiting_body: ${neo.close_approach_data[position].orbiting_body}"
                binding.kilometersPerHour.text = "kilometers_per_hour: ${neo.close_approach_data[position].relative_velocity.kilometers_per_hour}"
                binding.kilometersPerSecond.text = "kilometers_per_second: ${neo.close_approach_data[position].relative_velocity.kilometers_per_second}"
                binding.milesPerHour.text = "miles_per_hour: ${neo.close_approach_data[position].relative_velocity.miles_per_hour}"
                binding.designation.text = "designation: ${neo.designation}"
                binding.estimatedDiameterMax.text = "estimated_diameter_max_feet: ${neo.estimated_diameter.feet.estimated_diameter_max}"
                binding.estimatedDiameterMin.text = "estimated_diameter_min_feet: ${neo.estimated_diameter.feet.estimated_diameter_min}"
                binding.estimatedDiameterMax0.text = "estimated_diameter_max_kilometers: ${neo.estimated_diameter.kilometers.estimated_diameter_max}"
                binding.estimatedDiameterMin0.text = "estimated_diameter_min_kilometers: ${neo.estimated_diameter.kilometers.estimated_diameter_min}"
                binding.estimatedDiameterMax1.text = "estimated_diameter_max_meters: ${neo.estimated_diameter.meters.estimated_diameter_max}"
                binding.estimatedDiameterMin1.text = "estimated_diameter_min_meters: ${neo.estimated_diameter.meters.estimated_diameter_min}"
                binding.estimatedDiameterMax2.text = "estimated_diameter_max_miles: ${neo.estimated_diameter.miles.estimated_diameter_max}"
                binding.estimatedDiameterMin2.text = "estimated_diameter_min_miles: ${neo.estimated_diameter.miles.estimated_diameter_min}"
                binding.id.text = "id: ${neo.id}"
                binding.isPotentiallyHazardousAsteroid.text = "is_potentially_hazardous_asteroid: ${neo.is_potentially_hazardous_asteroid}"
                binding.isSentryObject.text = "is_sentry_object: ${neo.is_sentry_object}"
                binding.self.text = "linksX_self: ${neo.links.self}"
                binding.name.text = "name: ${neo.name}"
                binding.nameLimited.text = "name_limited: ${neo.name_limited}"
                binding.nasaJplUrl.text = "nasa_jpl_url: ${neo.nasa_jpl_url}"
                binding.neoReferenceId.text = "neo_reference_id: ${neo.neo_reference_id}"
                binding.aphelionDistance.text = "aphelion_distance: ${neo.orbital_data.aphelion_distance}"
                binding.ascendingNodeLongitude.text = "ascending_node_longitude: ${neo.orbital_data.ascending_node_longitude}"
                binding.dataArcInDays.text = "data_arc_in_days: ${neo.orbital_data.data_arc_in_days}"
                binding.eccentricity.text = "eccentricity: ${neo.orbital_data.eccentricity}"
                binding.epochOsculation.text = "epoch_osculation: ${neo.orbital_data.epoch_osculation}"
                binding.equinox.text = "equinox: ${neo.orbital_data.equinox}"
                binding.firstObservationDate.text = "first_observation_date: ${neo.orbital_data.first_observation_date}"
                binding.inclination.text = "inclination: ${neo.orbital_data.inclination}"
                binding.jupiterTisserandInvariant.text = "jupiter_tisserand_invariant: ${neo.orbital_data.jupiter_tisserand_invariant}"
                binding.lastObservationDate.text = "last_observation_date: ${neo.orbital_data.last_observation_date}"
                binding.meanAnomaly.text = "mean_anomaly: ${neo.orbital_data.mean_anomaly}"
                binding.meanMotion.text = "mean_motion: ${neo.orbital_data.mean_motion}"
                binding.minimumOrbitIntersection.text = "minimum_orbit_intersection: ${neo.orbital_data.minimum_orbit_intersection}"
                binding.observationsUsed.text = "observations_used: ${neo.orbital_data.observations_used}"
                binding.orbitClassDescription.text = "orbit_class_description: ${neo.orbital_data.orbit_class.orbit_class_description}"
                binding.orbitClassRange.text = "orbit_class_range: ${neo.orbital_data.orbit_class.orbit_class_range}"
                binding.orbitClassType.text = "orbit_class_type: ${neo.orbital_data.orbit_class.orbit_class_type}"
                binding.orbitDeterminationDate.text = "orbit_determination_date: ${neo.orbital_data.orbit_determination_date}"
                binding.orbitId.text = "orbit_id: ${neo.orbital_data.orbit_id}"
                binding.orbitUncertainty.text = "orbit_uncertainty: ${neo.orbital_data.orbit_uncertainty}"
                binding.orbitalPeriod.text = "orbital_period: ${neo.orbital_data.orbital_period}"
                binding.perihelionArgument.text = "perihelion_argument: ${neo.orbital_data.perihelion_argument}"
                binding.perihelionDistance.text = "perihelion_distance: ${neo.orbital_data.perihelion_distance}"
                binding.perihelionTime.text = "perihelion_time: ${neo.orbital_data.perihelion_time}"
                binding.semiMajorAxis.text = "semi_major_axis: ${neo.orbital_data.semi_major_axis}"
            }
        }
    }
}