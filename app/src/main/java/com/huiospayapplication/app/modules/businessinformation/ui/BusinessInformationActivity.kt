package com.huiospayapplication.app.modules.businessinformation.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityBusinessInformationBinding
import com.huiospayapplication.app.modules.businessinformation.`data`.model.SpinnerGroupFiveModel
import com.huiospayapplication.app.modules.businessinformation.`data`.viewmodel.BusinessInformationVM
import kotlin.String
import kotlin.Unit

class BusinessInformationActivity :
    BaseActivity<ActivityBusinessInformationBinding>(R.layout.activity_business_information) {
  private val viewModel: BusinessInformationVM by viewModels<BusinessInformationVM>()

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
    binding.businessInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BUSINESS_INFORMATION_ACTIVITY"

  }
}
