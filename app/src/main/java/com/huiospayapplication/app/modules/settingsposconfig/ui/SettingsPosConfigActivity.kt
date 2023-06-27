package com.huiospayapplication.app.modules.settingsposconfig.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySettingsPosConfigBinding
import com.huiospayapplication.app.modules.settingsposconfig.`data`.viewmodel.SettingsPosConfigVM
import kotlin.String
import kotlin.Unit

class SettingsPosConfigActivity :
    BaseActivity<ActivitySettingsPosConfigBinding>(R.layout.activity_settings_pos_config) {
  private val viewModel: SettingsPosConfigVM by viewModels<SettingsPosConfigVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsPosConfigVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_POS_CONFIG_ACTIVITY"

  }
}
