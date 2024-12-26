package org.auspiciousrhino.quicksetup.navigation

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ErrorParams(
  @SerializedName("error") val errorMessage: String
) : Parcelable