package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class Links {
    @JsonProperty("next")
    val next: String = ""
    @JsonProperty("self")
    val self: String = ""
}