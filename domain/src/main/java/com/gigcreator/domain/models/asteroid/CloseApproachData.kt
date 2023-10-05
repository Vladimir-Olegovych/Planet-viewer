package com.gigcreator.domain.models.asteroid

import com.fasterxml.jackson.annotation.JsonProperty

class CloseApproachData {
    @JsonProperty("close_approach_date")
    val close_approach_date: String = ""
    @JsonProperty("close_approach_date_full")
    val close_approach_date_full: String = ""
    @JsonProperty("epoch_date_close_approach")
    val epoch_date_close_approach: Long = 0
    @JsonProperty("miss_distance")
    val miss_distance: MissDistance = MissDistance()
    @JsonProperty("orbiting_body")
    val orbiting_body: String = ""
    @JsonProperty("relative_velocity")
    val relative_velocity: RelativeVelocity = RelativeVelocity()
}