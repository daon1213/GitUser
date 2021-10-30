package org.techtown.gituserinfo

data class UserInfo(
    val login: String,
    val followers: Int,
    val following: Int,
    val avatar_url: String
)