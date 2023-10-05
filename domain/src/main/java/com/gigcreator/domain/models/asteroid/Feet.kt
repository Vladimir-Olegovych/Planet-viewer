package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class Feet {
    @JsonProperty("estimated_diameter_max")
    val estimated_diameter_max: Double = 0.0
    @JsonProperty("estimated_diameter_min")
    val estimated_diameter_min: Double = 0.0
}