package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class NearEarthObject {
    @JsonProperty("absolute_magnitude_h")
    val absolute_magnitude_h: Double = 0.0
    @JsonProperty("close_approach_data")
    val close_approach_data: List<CloseApproachData> = listOf()
    @JsonProperty("designation")
    val designation: String = ""
    @JsonProperty("estimated_diameter")
    val estimated_diameter: EstimatedDiameter = EstimatedDiameter()
    @JsonProperty("id")
    val id: String = ""
    @JsonProperty("is_potentially_hazardous_asteroid")
    val is_potentially_hazardous_asteroid: Boolean = false
    @JsonProperty("is_sentry_object")
    val is_sentry_object: Boolean = false
    @JsonProperty("links")
    val links: LinksX = LinksX()
    @JsonProperty("name")
    val name: String = ""
    @JsonProperty("name_limited")
    val name_limited: String = ""
    @JsonProperty("nasa_jpl_url")
    val nasa_jpl_url: String = ""
    @JsonProperty("neo_reference_id")
    val neo_reference_id: String = ""
    @JsonProperty("orbital_data")
    val orbital_data: OrbitalData = OrbitalData()
}