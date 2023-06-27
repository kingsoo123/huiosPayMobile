package com.huiospayapplication.app.modules.settingsterminalreceiptconfig.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySettingsTerminalReceiptConfigBinding
import com.huiospayapplication.app.modules.settingsterminalreceiptconfig.`data`.viewmodel.SettingsTerminalReceiptConfigVM
import kotlin.String
import kotlin.Unit

class SettingsTerminalReceiptConfigActivity :
    BaseActivity<ActivitySettingsTerminalReceiptConfigBinding>(R.layout.activity_settings_terminal_receipt_config)
    {
  private val viewModel: SettingsTerminalReceiptConfigVM by
      viewModels<SettingsTerminalReceiptConfigVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsTerminalReceiptConfigVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_TERMINAL_RECEIPT_CONFIG_ACTIVITY"

  }
}
