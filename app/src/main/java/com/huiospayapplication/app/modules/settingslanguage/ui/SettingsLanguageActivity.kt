package com.huiospayapplication.app.modules.settingslanguage.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySettingsLanguageBinding
import com.huiospayapplication.app.modules.settingslanguage.`data`.model.SpinnerLanguageModel
import com.huiospayapplication.app.modules.settingslanguage.`data`.viewmodel.SettingsLanguageVM
import kotlin.String
import kotlin.Unit

class SettingsLanguageActivity :
    BaseActivity<ActivitySettingsLanguageBinding>(R.layout.activity_settings_language) {
  private val viewModel: SettingsLanguageVM by viewModels<SettingsLanguageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerLanguageList.value = mutableListOf(
    SpinnerLanguageModel("Item1"),
    SpinnerLanguageModel("Item2"),
    SpinnerLanguageModel("Item3"),
    SpinnerLanguageModel("Item4"),
    SpinnerLanguageModel("Item5")
    )
    val spinnerLanguageAdapter =
    SpinnerLanguageAdapter(this,R.layout.spinner_item,viewModel.spinnerLanguageList.value?:
    mutableListOf())
    binding.spinnerLanguage.adapter = spinnerLanguageAdapter
    binding.settingsLanguageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_LANGUAGE_ACTIVITY"

  }
}
