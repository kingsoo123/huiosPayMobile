package com.huiospayapplication.app.modules.otptransfer.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityOtpTransferBinding
import com.huiospayapplication.app.modules.otptransfer.`data`.viewmodel.OtpTransferVM
import kotlin.String
import kotlin.Unit

class OtpTransferActivity : BaseActivity<ActivityOtpTransferBinding>(R.layout.activity_otp_transfer)
    {
  private val viewModel: OtpTransferVM by viewModels<OtpTransferVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpTransferVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OTP_TRANSFER_ACTIVITY"

  }
}
