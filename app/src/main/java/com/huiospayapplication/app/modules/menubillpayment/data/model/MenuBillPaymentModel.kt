package com.huiospayapplication.app.modules.menubillpayment.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuBillPaymentModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEnteranAccoun: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_select_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtime: String? = MyApp.getInstance().resources.getString(R.string.lbl_cable_tv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtimeOne: String? = MyApp.getInstance().resources.getString(R.string.msg_betting_lotte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllTransaction: String? =
      MyApp.getInstance().resources.getString(R.string.msg_beetle_taxi_inc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllTransactionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_transaction)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTransfers: String? = MyApp.getInstance().resources.getString(R.string.lbl_transfer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAirtimeData: String? = MyApp.getInstance().resources.getString(R.string.lbl_airtime_data2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBillPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_bill_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhonePay: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_pay)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPOS: String? = MyApp.getInstance().resources.getString(R.string.lbl_pos_terminals)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDisputes: String? = MyApp.getInstance().resources.getString(R.string.lbl_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVersionCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_version_1_1_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHello: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDafeStanley: String? = MyApp.getInstance().resources.getString(R.string.lbl_dafe_stanley)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup1477Value: String? = null
)
