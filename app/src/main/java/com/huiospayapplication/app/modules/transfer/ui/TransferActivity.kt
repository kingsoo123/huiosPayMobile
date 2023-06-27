package com.huiospayapplication.app.modules.transfer.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityTransferBinding
import com.huiospayapplication.app.modules.transfer.`data`.viewmodel.TransferVM
import kotlin.String
import kotlin.Unit

class TransferActivity : BaseActivity<ActivityTransferBinding>(R.layout.activity_transfer) {
  private val viewModel: TransferVM by viewModels<TransferVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.transferVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TRANSFER_ACTIVITY"

  }
}
