package com.huiospayapplication.app.modules.airtimedatabeneficiaryone.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AirtimeDataBeneficiaryOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRD: String? = MyApp.getInstance().resources.getString(R.string.lbl_data)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOWNYOURWEIRDOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_beetle_taxi_inc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAcctNo001122: String? =
      MyApp.getInstance().resources.getString(R.string.msg_acct_no_001122)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? =
      MyApp.getInstance().resources.getString(R.string.msg_choose_benefici)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipien: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_receipien2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_11)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterReceipienOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_customer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSendTo: String? = MyApp.getInstance().resources.getString(R.string.msg_add_to_benefi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectBenefici: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_benefici)
  ,
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
      MyApp.getInstance().resources.getString(R.string.msg_mtn_081600112)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZenithBankZeroOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_view_all_benefi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1687Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1687OneValue: String? = null
)
