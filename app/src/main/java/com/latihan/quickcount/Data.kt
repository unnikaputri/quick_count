package com.latihan.quickcount

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(val username: String? = "",
                val password: String? = "",
                val isLoggedIn: Boolean? = false) : Parcelable