package com.huiospayapplication.app.modules.supportdispute.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySupportDisputeBinding
import com.huiospayapplication.app.modules.supportdispute.`data`.viewmodel.SupportDisputeVM
import kotlin.String
import kotlin.Unit

class SupportDisputeActivity :
    BaseActivity<ActivitySupportDisputeBinding>(R.layout.activity_support_dispute) {
  private val viewModel: SupportDisputeVM by viewModels<SupportDisputeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.supportDisputeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUPPORT_DISPUTE_ACTIVITY"

  }
}
