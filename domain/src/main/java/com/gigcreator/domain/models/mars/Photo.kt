package com.gigcreator.domain.models.mars

import com.fasterxml.jackson.annotation.JsonProperty

class Photo {
    @JsonProperty("camera")
    val camera: com.gigcreator.domain.models.mars.Camera =
        com.gigcreator.domain.models.mars.Camera()
    @JsonProperty("earth_date")
    val earth_date: String = ""
    @JsonProperty("id")
    val id: Int = 0
    @JsonProperty("img_src")
    val img_src: String = ""
    @JsonProperty("rover")
    val rover: com.gigcreator.domain.models.mars.Rover = com.gigcreator.domain.models.mars.Rover()
    @JsonProperty("sol")
    val sol: Int = 0
}