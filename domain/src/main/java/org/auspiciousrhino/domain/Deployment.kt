package org.auspiciousrhino.domain

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Deployment(
  @StringRes val name: Int,
  @DrawableRes val image: Int,
  @StringRes val description: Int
)