package com.tunc.mvvm_architecture.data.model.response

import com.google.gson.annotations.SerializedName

data class PostResponse(
    @SerializedName("postID")
    var postId: String?,
    @SerializedName("body")
    var body: String?
)