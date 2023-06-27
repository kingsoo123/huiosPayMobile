package com.huiospayapplication.app.modules.supportcontactus.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySupportContactUsBinding
import com.huiospayapplication.app.modules.supportcontactus.`data`.viewmodel.SupportContactUsVM
import kotlin.String
import kotlin.Unit

class SupportContactUsActivity :
    BaseActivity<ActivitySupportContactUsBinding>(R.layout.activity_support_contact_us) {
  private val viewModel: SupportContactUsVM by viewModels<SupportContactUsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.supportContactUsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUPPORT_CONTACT_US_ACTIVITY"

  }
}
