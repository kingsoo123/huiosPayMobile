package com.huiospayapplication.app.modules.billpaymentbeneficiaryone.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityBillPaymentBeneficiaryOneBinding
import com.huiospayapplication.app.modules.billpaymentbeneficiaryone.`data`.viewmodel.BillPaymentBeneficiaryOneVM
import kotlin.String
import kotlin.Unit

class BillPaymentBeneficiaryOneActivity :
    BaseActivity<ActivityBillPaymentBeneficiaryOneBinding>(R.layout.activity_bill_payment_beneficiary_one)
    {
  private val viewModel: BillPaymentBeneficiaryOneVM by viewModels<BillPaymentBeneficiaryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.billPaymentBeneficiaryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "BILL_PAYMENT_BENEFICIARY_ONE_ACTIVITY"

  }
}
