package com.huiospayapplication.app.modules.billpaymentsummarytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.billpaymentsummarytwo.`data`.model.BillPaymentSummaryTwoModel
import org.koin.core.KoinComponent

class BillPaymentSummaryTwoVM : ViewModel(), KoinComponent {
  val billPaymentSummaryTwoModel: MutableLiveData<BillPaymentSummaryTwoModel> =
      MutableLiveData(BillPaymentSummaryTwoModel())

  var navArguments: Bundle? = null
}
