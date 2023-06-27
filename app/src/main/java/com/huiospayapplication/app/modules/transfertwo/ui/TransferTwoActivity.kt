package com.huiospayapplication.app.modules.transfertwo.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityTransferTwoBinding
import com.huiospayapplication.app.modules.transfertwo.`data`.viewmodel.TransferTwoVM
import kotlin.String
import kotlin.Unit

class TransferTwoActivity : BaseActivity<ActivityTransferTwoBinding>(R.layout.activity_transfer_two)
    {
  private val viewModel: TransferTwoVM by viewModels<TransferTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.transferTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TRANSFER_TWO_ACTIVITY"

  }
}
