package com.gigcreator.domain.models.mars

import com.fasterxml.jackson.annotation.JsonProperty

class Mars {
    @JsonProperty("photos")
    val photos: List<com.gigcreator.domain.models.mars.Photo> = listOf()
}