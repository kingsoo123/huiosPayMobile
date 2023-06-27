package com.huiospayapplication.app.modules.bankinformation.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityBankInformationBinding
import com.huiospayapplication.app.modules.bankinformation.`data`.model.SpinnerGroupFiveModel
import com.huiospayapplication.app.modules.bankinformation.`data`.viewmodel.BankInformationVM
import kotlin.String
import kotlin.Unit

class BankInformationActivity :
    BaseActivity<ActivityBankInformationBinding>(R.layout.activity_bank_information) {
  private val viewModel: BankInformationVM by viewModels<BankInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFiveList.value = mutableListOf(
    SpinnerGroupFiveModel("Item1"),
    SpinnerGroupFiveModel("Item2"),
    SpinnerGroupFiveModel("Item3"),
    SpinnerGroupFiveModel("Item4"),
    SpinnerGroupFiveModel("Item5")
    )
    val spinnerGroupFiveAdapter =
    SpinnerGroupFiveAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFiveList.value?:
    mutableListOf())
    binding.spinnerGroupFive.adapter = spinnerGroupFiveAdapter
    binding.bankInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BANK_INFORMATION_ACTIVITY"

  }
}
