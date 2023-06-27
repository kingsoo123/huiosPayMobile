package com.huiospayapplication.app.modules.supportemail.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SupportEmailModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSendusanemai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_send_us_an_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_info_huiospay_c)

)
