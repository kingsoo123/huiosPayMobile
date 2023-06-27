package com.huiospayapplication.app.modules.billpaymentsummaryone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.billpaymentsummaryone.`data`.model.BillPaymentSummaryOneModel
import org.koin.core.KoinComponent

class BillPaymentSummaryOneVM : ViewModel(), KoinComponent {
  val billPaymentSummaryOneModel: MutableLiveData<BillPaymentSummaryOneModel> =
      MutableLiveData(BillPaymentSummaryOneModel())

  var navArguments: Bundle? = null
}
