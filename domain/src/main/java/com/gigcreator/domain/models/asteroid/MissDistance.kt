package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class MissDistance {
    @JsonProperty("astronomical")
    val astronomical: String = ""
    @JsonProperty("kilometers")
    val kilometers: String = ""
    @JsonProperty("lunar")
    val lunar: String = ""
    @JsonProperty("miles")
    val miles: String = ""
}