package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class EstimatedDiameter {
    @JsonProperty("feet")
    val feet: Feet = Feet()
    @JsonProperty("kilometers")
    val kilometers: Kilometers = Kilometers()
    @JsonProperty("meters")
    val meters: Meters = Meters()
    @JsonProperty("miles")
    val miles: Miles = Miles()
}