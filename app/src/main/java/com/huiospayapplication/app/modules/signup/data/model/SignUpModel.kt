package com.huiospayapplication.app.modules.signup.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputDeviceSe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_input_device_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseinputse: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_input_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiveValue: String? = null
)
