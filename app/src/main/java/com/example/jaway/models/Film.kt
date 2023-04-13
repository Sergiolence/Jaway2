package com.example.jaway.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Film (var genre : ArrayList<String>?=null, var id: Int=0, var overview: String?="",
            var poster_path: String?="", var release_date: String?="", var title: String?=""):
    java.io.Serializable, Parcelable {
}