package com.huiospayapplication.app.modules.menuphonepay.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityMenuPhonePayBinding
import com.huiospayapplication.app.modules.menuphonepay.`data`.viewmodel.MenuPhonePayVM
import kotlin.String
import kotlin.Unit

class MenuPhonePayActivity :
    BaseActivity<ActivityMenuPhonePayBinding>(R.layout.activity_menu_phone_pay) {
  private val viewModel: MenuPhonePayVM by viewModels<MenuPhonePayVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuPhonePayVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_PHONE_PAY_ACTIVITY"

  }
}
