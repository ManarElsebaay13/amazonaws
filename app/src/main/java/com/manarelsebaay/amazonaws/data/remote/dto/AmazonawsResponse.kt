package com.manarelsebaay13.amazonaws.data.remote.dto

import com.google.gson.annotations.SerializedName

data class AmazonawsResponse(
    @SerializedName("pagination")
    val pagination: Pagination,
    @SerializedName("results")
    val results: List<Result>
)