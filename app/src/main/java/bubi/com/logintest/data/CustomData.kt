package bubi.com.logintest.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CustomData(var itemNumber: Int,
                      var title: String,
                      var description: String) : Parcelable