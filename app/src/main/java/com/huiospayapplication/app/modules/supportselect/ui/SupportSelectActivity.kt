package com.huiospayapplication.app.modules.supportselect.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySupportSelectBinding
import com.huiospayapplication.app.modules.supportselect.`data`.viewmodel.SupportSelectVM
import kotlin.String
import kotlin.Unit

class SupportSelectActivity :
    BaseActivity<ActivitySupportSelectBinding>(R.layout.activity_support_select) {
  private val viewModel: SupportSelectVM by viewModels<SupportSelectVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.supportSelectVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUPPORT_SELECT_ACTIVITY"

  }
}
