package com.huiospayapplication.app.modules.menusupport.ui

import android.view.View
import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityMenuSupportBinding
import com.huiospayapplication.app.modules.menusupport.`data`.model.MenuSupportRowModel
import com.huiospayapplication.app.modules.menusupport.`data`.viewmodel.MenuSupportVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MenuSupportActivity : BaseActivity<ActivityMenuSupportBinding>(R.layout.activity_menu_support)
    {
  private val viewModel: MenuSupportVM by viewModels<MenuSupportVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val menuSupportAdapter =
    MenuSupportAdapter(viewModel.menuSupportList.value?:mutableListOf())
    binding.recyclerMenuSupport.adapter = menuSupportAdapter
    menuSupportAdapter.setOnItemClickListener(
    object : MenuSupportAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MenuSupportRowModel) {
        onClickRecyclerMenuSupport(view, position, item)
      }
    }
    )
    viewModel.menuSupportList.observe(this) {
      menuSupportAdapter.updateData(it)
    }
    binding.menuSupportVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMenuSupport(
    view: View,
    position: Int,
    item: MenuSupportRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MENU_SUPPORT_ACTIVITY"

  }
}
