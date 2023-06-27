package com.huiospayapplication.app.modules.transactionsuccessful.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TransactionSuccessfulModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTransactionSuc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transaction_suc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourtransactio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_transactio)

)
