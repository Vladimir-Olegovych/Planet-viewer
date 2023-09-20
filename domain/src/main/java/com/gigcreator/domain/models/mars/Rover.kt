package com.gigcreator.domain.models.mars

import com.fasterxml.jackson.annotation.JsonProperty

class Rover {
    @JsonProperty("cameras")
    val cameras: List<CameraX> = listOf()
    @JsonProperty("id")
    val id: Int = 0
    @JsonProperty("landing_date")
    val landing_date: String = ""
    @JsonProperty("launch_date")
    val launch_date: String = ""
    @JsonProperty("max_date")
    val max_date: String = ""
    @JsonProperty("max_sol")
    val max_sol: Int = 0
    @JsonProperty("name")
    val name: String = ""
    @JsonProperty("status")
    val status: String = ""
    @JsonProperty("total_photos")
    val total_photos: Int = 0
}