package com.raywenderlich.githubrepolist.data

import android.content.ClipData

data class RepoResult(val item: List<ClipData.Item>)

data class Item(
    val id: Long?,
    val name: String?,
    val fullName: String?,
    val owner: String?,
    val private: Boolean,
    val htmlUrl: String?,
    val description: String?
)
data class owner(val login: String?, val id: Long?, val avatarUrl: String?)