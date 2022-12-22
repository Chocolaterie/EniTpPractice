package com.example.enitppractice

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Article (
    val id :Int,
    val title : String,
    val content: String
        ) : Parcelable {

    override fun toString(): String {
        return title
    }
}