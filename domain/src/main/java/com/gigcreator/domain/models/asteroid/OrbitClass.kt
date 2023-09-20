package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class OrbitClass {
    @JsonProperty("orbit_class_description")
    val orbit_class_description: String = ""
    @JsonProperty("orbit_class_range")
    val orbit_class_range: String = ""
    @JsonProperty("orbit_class_type")
    val orbit_class_type: String = ""
}