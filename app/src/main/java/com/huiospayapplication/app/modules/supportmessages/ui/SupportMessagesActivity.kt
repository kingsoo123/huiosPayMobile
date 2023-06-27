package com.huiospayapplication.app.modules.supportmessages.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySupportMessagesBinding
import com.huiospayapplication.app.modules.supportmessages.`data`.viewmodel.SupportMessagesVM
import kotlin.String
import kotlin.Unit

class SupportMessagesActivity :
    BaseActivity<ActivitySupportMessagesBinding>(R.layout.activity_support_messages) {
  private val viewModel: SupportMessagesVM by viewModels<SupportMessagesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.supportMessagesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUPPORT_MESSAGES_ACTIVITY"

  }
}
