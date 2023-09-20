package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class Page {
    @JsonProperty("number")
    val number: Int = 0
    @JsonProperty("size")
    val size: Int = 0
    @JsonProperty("total_elements")
    val total_elements: Int = 0
    @JsonProperty("total_pages")
    val total_pages: Int = 0
}