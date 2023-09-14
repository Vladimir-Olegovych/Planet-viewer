package com.gigcreator.planetviewer.domain.models

import com.fasterxml.jackson.annotation.JsonProperty

class Mars {
    @JsonProperty("photos")
    val photos: List<Photo> = listOf()
}