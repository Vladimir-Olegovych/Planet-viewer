package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class OrbitalData {
    @JsonProperty("aphelion_distance")
    val aphelion_distance: String = ""
    @JsonProperty("ascending_node_longitude")
    val ascending_node_longitude: String = ""
    @JsonProperty("data_arc_in_days")
    val data_arc_in_days: Int = 0
    @JsonProperty("eccentricity")
    val eccentricity: String = ""
    @JsonProperty("epoch_osculation")
    val epoch_osculation: String = ""
    @JsonProperty("equinox")
    val equinox: String = ""
    @JsonProperty("first_observation_date")
    val first_observation_date: String = ""
    @JsonProperty("inclination")
    val inclination: String = ""
    @JsonProperty("jupiter_tisserand_invariant")
    val jupiter_tisserand_invariant: String = ""
    @JsonProperty("last_observation_date")
    val last_observation_date: String = ""
    @JsonProperty("mean_anomaly")
    val mean_anomaly: String = ""
    @JsonProperty("mean_motion")
    val mean_motion: String = ""
    @JsonProperty("minimum_orbit_intersection")
    val minimum_orbit_intersection: String = ""
    @JsonProperty("observations_used")
    val observations_used: Int = 0
    @JsonProperty("orbit_class")
    val orbit_class: OrbitClass = OrbitClass()
    @JsonProperty("orbit_determination_date")
    val orbit_determination_date: String = ""
    @JsonProperty("orbit_id")
    val orbit_id: String = ""
    @JsonProperty("orbit_uncertainty")
    val orbit_uncertainty: String = ""
    @JsonProperty("orbital_period")
    val orbital_period: String = ""
    @JsonProperty("perihelion_argument")
    val perihelion_argument: String = ""
    @JsonProperty("perihelion_distance")
    val perihelion_distance: String = ""
    @JsonProperty("perihelion_time")
    val perihelion_time: String = ""
    @JsonProperty("semi_major_axis")
    val semi_major_axis: String = ""
}