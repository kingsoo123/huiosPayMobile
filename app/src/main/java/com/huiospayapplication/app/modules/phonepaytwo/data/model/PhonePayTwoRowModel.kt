package com.huiospayapplication.app.modules.phonepaytwo.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PhonePayTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup1562: String? = MyApp.getInstance().resources.getString(R.string.lbl_bc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_bright_cyph)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZenithBankZero: String? =
      MyApp.getInstance().resources.getString(R.string.msg_2233445566_gt)

)
