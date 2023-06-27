package com.huiospayapplication.app.modules.securitytwo.ui

import android.view.View
import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySecurityTwoBinding
import com.huiospayapplication.app.modules.securitytwo.`data`.model.SecurityTwoRowModel
import com.huiospayapplication.app.modules.securitytwo.`data`.viewmodel.SecurityTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SecurityTwoActivity : BaseActivity<ActivitySecurityTwoBinding>(R.layout.activity_security_two)
    {
  private val viewModel: SecurityTwoVM by viewModels<SecurityTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val securityTwoAdapter =
    SecurityTwoAdapter(viewModel.securityTwoList.value?:mutableListOf())
    binding.recyclerSecurityTwo.adapter = securityTwoAdapter
    securityTwoAdapter.setOnItemClickListener(
    object : SecurityTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SecurityTwoRowModel) {
        onClickRecyclerSecurityTwo(view, position, item)
      }
    }
    )
    viewModel.securityTwoList.observe(this) {
      securityTwoAdapter.updateData(it)
    }
    binding.securityTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSecurityTwo(
    view: View,
    position: Int,
    item: SecurityTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SECURITY_TWO_ACTIVITY"

  }
}
