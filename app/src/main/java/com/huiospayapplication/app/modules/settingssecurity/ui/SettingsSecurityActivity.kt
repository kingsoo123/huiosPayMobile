package com.huiospayapplication.app.modules.settingssecurity.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySettingsSecurityBinding
import com.huiospayapplication.app.modules.settingssecurity.`data`.viewmodel.SettingsSecurityVM
import kotlin.String
import kotlin.Unit

class SettingsSecurityActivity :
    BaseActivity<ActivitySettingsSecurityBinding>(R.layout.activity_settings_security) {
  private val viewModel: SettingsSecurityVM by viewModels<SettingsSecurityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsSecurityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_SECURITY_ACTIVITY"

  }
}
