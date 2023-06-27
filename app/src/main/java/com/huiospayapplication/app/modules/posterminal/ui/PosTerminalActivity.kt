package com.huiospayapplication.app.modules.posterminal.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityPosTerminalBinding
import com.huiospayapplication.app.modules.posterminal.`data`.viewmodel.PosTerminalVM
import kotlin.String
import kotlin.Unit

class PosTerminalActivity : BaseActivity<ActivityPosTerminalBinding>(R.layout.activity_pos_terminal)
    {
  private val viewModel: PosTerminalVM by viewModels<PosTerminalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.posTerminalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "POS_TERMINAL_ACTIVITY"

  }
}
