package com.huiospayapplication.app.modules.personalinformation.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PersonalInformationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonalInform: String? =
      MyApp.getInstance().resources.getString(R.string.msg_personal_inform)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputyourpers: String? =
      MyApp.getInstance().resources.getString(R.string.msg_input_your_pers)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTenOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_house_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreetName: String? = MyApp.getInstance().resources.getString(R.string.lbl_street_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupNineteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupElevenValue: String? = null
)
