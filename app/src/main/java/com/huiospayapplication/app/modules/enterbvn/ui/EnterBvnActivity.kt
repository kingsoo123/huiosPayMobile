package com.huiospayapplication.app.modules.enterbvn.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.appcomponents.views.DatePickerFragment
import com.huiospayapplication.app.databinding.ActivityEnterBvnBinding
import com.huiospayapplication.app.modules.enterbvn.`data`.viewmodel.EnterBvnVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class EnterBvnActivity : BaseActivity<ActivityEnterBvnBinding>(R.layout.activity_enter_bvn) {
  private val viewModel: EnterBvnVM by viewModels<EnterBvnVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.enterBvnVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowdateofbirth.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateofbirth(selectedDate)
      }
    }
  }

  private fun onDateSelectedLinearRowdateofbirth(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "ENTER_BVN_ACTIVITY"

  }
}
