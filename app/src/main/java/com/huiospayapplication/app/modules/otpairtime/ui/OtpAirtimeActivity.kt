package com.huiospayapplication.app.modules.otpairtime.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityOtpAirtimeBinding
import com.huiospayapplication.app.modules.otpairtime.`data`.viewmodel.OtpAirtimeVM
import kotlin.String
import kotlin.Unit

class OtpAirtimeActivity : BaseActivity<ActivityOtpAirtimeBinding>(R.layout.activity_otp_airtime) {
  private val viewModel: OtpAirtimeVM by viewModels<OtpAirtimeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.otpAirtimeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OTP_AIRTIME_ACTIVITY"

  }
}
