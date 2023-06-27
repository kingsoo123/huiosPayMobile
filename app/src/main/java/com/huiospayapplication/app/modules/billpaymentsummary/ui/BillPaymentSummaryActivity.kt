package com.huiospayapplication.app.modules.billpaymentsummary.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityBillPaymentSummaryBinding
import com.huiospayapplication.app.modules.billpaymentsummary.`data`.viewmodel.BillPaymentSummaryVM
import kotlin.String
import kotlin.Unit

class BillPaymentSummaryActivity :
    BaseActivity<ActivityBillPaymentSummaryBinding>(R.layout.activity_bill_payment_summary) {
  private val viewModel: BillPaymentSummaryVM by viewModels<BillPaymentSummaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentSummaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_SUMMARY_ACTIVITY"

  }
}
