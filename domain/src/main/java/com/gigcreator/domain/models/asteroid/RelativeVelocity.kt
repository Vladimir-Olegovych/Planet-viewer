package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class RelativeVelocity {
    @JsonProperty("kilometers_per_hour")
    val kilometers_per_hour: String = ""
    @JsonProperty("kilometers_per_second")
    val kilometers_per_second: String = ""
    @JsonProperty("miles_per_hour")
    val miles_per_hour: String = ""
}
