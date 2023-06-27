package com.huiospayapplication.app.modules.start.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StartModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoHuio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_huio)

)
