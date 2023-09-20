package com.gigcreator.domain.models.asteroid

data class Asteroid(
    val links: Links,
    val near_earth_objects: List<NearEarthObject>,
    val page: Page
)