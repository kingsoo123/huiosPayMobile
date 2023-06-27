package com.huiospayapplication.app.modules.splashscreen.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHuios: String? = MyApp.getInstance().resources.getString(R.string.lbl_huiospay)

)
