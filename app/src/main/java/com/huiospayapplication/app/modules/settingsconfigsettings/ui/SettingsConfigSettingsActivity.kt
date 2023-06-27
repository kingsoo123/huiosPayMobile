package com.huiospayapplication.app.modules.settingsconfigsettings.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySettingsConfigSettingsBinding
import com.huiospayapplication.app.modules.settingsconfigsettings.`data`.viewmodel.SettingsConfigSettingsVM
import kotlin.String
import kotlin.Unit

class SettingsConfigSettingsActivity :
    BaseActivity<ActivitySettingsConfigSettingsBinding>(R.layout.activity_settings_config_settings)
    {
  private val viewModel: SettingsConfigSettingsVM by viewModels<SettingsConfigSettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsConfigSettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_CONFIG_SETTINGS_ACTIVITY"

  }
}
