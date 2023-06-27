package com.huiospayapplication.app.modules.resetpassword.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ResetPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgottenPassw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgotten_passw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputyouremai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_input_your_emai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null
)
