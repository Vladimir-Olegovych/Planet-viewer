package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class Asteroid {
    @JsonProperty("links")
    val links: Links = Links()
    @JsonProperty("near_earth_objects")
    val near_earth_objects: List<NearEarthObject> = listOf()
    @JsonProperty("page")
    val page: Page = Page()
}