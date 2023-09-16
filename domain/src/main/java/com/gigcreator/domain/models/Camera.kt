package com.gigcreator.domain.models

import com.fasterxml.jackson.annotation.JsonProperty

class Camera {
    @JsonProperty("full_name")
    val full_name: String = ""
    @JsonProperty("id")
    val id: Int = 0
    @JsonProperty("name")
    val name: String = ""
    @JsonProperty("rover_id")
    val rover_id: Int = 0
}