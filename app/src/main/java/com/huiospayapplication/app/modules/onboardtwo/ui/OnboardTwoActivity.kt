package com.huiospayapplication.app.modules.onboardtwo.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityOnboardTwoBinding
import com.huiospayapplication.app.modules.onboardtwo.`data`.viewmodel.OnboardTwoVM
import kotlin.String
import kotlin.Unit

class OnboardTwoActivity : BaseActivity<ActivityOnboardTwoBinding>(R.layout.activity_onboard_two) {
  private val viewModel: OnboardTwoVM by viewModels<OnboardTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARD_TWO_ACTIVITY"

  }
}
