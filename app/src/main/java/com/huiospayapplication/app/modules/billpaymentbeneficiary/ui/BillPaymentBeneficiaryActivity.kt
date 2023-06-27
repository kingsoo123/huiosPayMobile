package com.huiospayapplication.app.modules.billpaymentbeneficiary.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityBillPaymentBeneficiaryBinding
import com.huiospayapplication.app.modules.billpaymentbeneficiary.`data`.viewmodel.BillPaymentBeneficiaryVM
import kotlin.String
import kotlin.Unit

class BillPaymentBeneficiaryActivity :
    BaseActivity<ActivityBillPaymentBeneficiaryBinding>(R.layout.activity_bill_payment_beneficiary)
    {
  private val viewModel: BillPaymentBeneficiaryVM by viewModels<BillPaymentBeneficiaryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentBeneficiaryVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_BENEFICIARY_ACTIVITY"

  }
}
