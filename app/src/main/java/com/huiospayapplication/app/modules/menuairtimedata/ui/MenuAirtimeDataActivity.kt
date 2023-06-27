package com.huiospayapplication.app.modules.menuairtimedata.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityMenuAirtimeDataBinding
import com.huiospayapplication.app.modules.menuairtimedata.`data`.viewmodel.MenuAirtimeDataVM
import kotlin.String
import kotlin.Unit

class MenuAirtimeDataActivity :
    BaseActivity<ActivityMenuAirtimeDataBinding>(R.layout.activity_menu_airtime_data) {
  private val viewModel: MenuAirtimeDataVM by viewModels<MenuAirtimeDataVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuAirtimeDataVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_AIRTIME_DATA_ACTIVITY"

  }
}
