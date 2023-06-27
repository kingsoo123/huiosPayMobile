package com.huiospayapplication.app.modules.settingsaccountinformation.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySettingsAccountInformationBinding
import com.huiospayapplication.app.modules.settingsaccountinformation.`data`.model.SpinnerGroup1692Model
import com.huiospayapplication.app.modules.settingsaccountinformation.`data`.model.SpinnerGroup308Model
import com.huiospayapplication.app.modules.settingsaccountinformation.`data`.viewmodel.SettingsAccountInformationVM
import kotlin.String
import kotlin.Unit

class SettingsAccountInformationActivity :
    BaseActivity<ActivitySettingsAccountInformationBinding>(R.layout.activity_settings_account_information)
    {
  private val viewModel: SettingsAccountInformationVM by viewModels<SettingsAccountInformationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup1692List.value = mutableListOf(
    SpinnerGroup1692Model("Item1"),
    SpinnerGroup1692Model("Item2"),
    SpinnerGroup1692Model("Item3"),
    SpinnerGroup1692Model("Item4"),
    SpinnerGroup1692Model("Item5")
    )
    val spinnerGroup1692Adapter =
    SpinnerGroup1692Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup1692List.value?:
    mutableListOf())
    binding.spinnerGroup1692.adapter = spinnerGroup1692Adapter
    viewModel.spinnerGroup308List.value = mutableListOf(
    SpinnerGroup308Model("Item1"),
    SpinnerGroup308Model("Item2"),
    SpinnerGroup308Model("Item3"),
    SpinnerGroup308Model("Item4"),
    SpinnerGroup308Model("Item5")
    )
    val spinnerGroup308Adapter =
    SpinnerGroup308Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup308List.value?:
    mutableListOf())
    binding.spinnerGroup308.adapter = spinnerGroup308Adapter
    binding.settingsAccountInformationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_ACCOUNT_INFORMATION_ACTIVITY"

  }
}
