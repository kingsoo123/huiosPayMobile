package com.huiospayapplication.app.modules.welcomeback.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeBackModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomeBackSt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_back_st)

)
