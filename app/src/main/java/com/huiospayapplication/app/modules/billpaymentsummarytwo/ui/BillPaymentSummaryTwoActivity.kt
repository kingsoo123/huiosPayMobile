package com.huiospayapplication.app.modules.billpaymentsummarytwo.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityBillPaymentSummaryTwoBinding
import com.huiospayapplication.app.modules.billpaymentsummarytwo.`data`.viewmodel.BillPaymentSummaryTwoVM
import kotlin.String
import kotlin.Unit

class BillPaymentSummaryTwoActivity :
    BaseActivity<ActivityBillPaymentSummaryTwoBinding>(R.layout.activity_bill_payment_summary_two) {
  private val viewModel: BillPaymentSummaryTwoVM by viewModels<BillPaymentSummaryTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentSummaryTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_SUMMARY_TWO_ACTIVITY"

  }
}
