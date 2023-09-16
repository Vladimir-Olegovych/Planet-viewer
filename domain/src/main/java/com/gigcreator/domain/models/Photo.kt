package com.gigcreator.domain.models

import com.fasterxml.jackson.annotation.JsonProperty

class Photo {
    @JsonProperty("camera")
    val camera: Camera = Camera()
    @JsonProperty("earth_date")
    val earth_date: String = ""
    @JsonProperty("id")
    val id: Int = 0
    @JsonProperty("img_src")
    val img_src: String = ""
    @JsonProperty("rover")
    val rover: Rover = Rover()
    @JsonProperty("sol")
    val sol: Int = 0
}