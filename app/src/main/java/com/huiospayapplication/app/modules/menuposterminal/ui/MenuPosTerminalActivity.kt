package com.huiospayapplication.app.modules.menuposterminal.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityMenuPosTerminalBinding
import com.huiospayapplication.app.modules.menuposterminal.`data`.viewmodel.MenuPosTerminalVM
import kotlin.String
import kotlin.Unit

class MenuPosTerminalActivity :
    BaseActivity<ActivityMenuPosTerminalBinding>(R.layout.activity_menu_pos_terminal) {
  private val viewModel: MenuPosTerminalVM by viewModels<MenuPosTerminalVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuPosTerminalVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_POS_TERMINAL_ACTIVITY"

  }
}
