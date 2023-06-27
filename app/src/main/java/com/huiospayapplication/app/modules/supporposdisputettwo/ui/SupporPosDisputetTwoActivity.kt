package com.huiospayapplication.app.modules.supporposdisputettwo.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySupporPosDisputetTwoBinding
import com.huiospayapplication.app.modules.supporposdisputettwo.`data`.model.SpinnerFrame1656Model
import com.huiospayapplication.app.modules.supporposdisputettwo.`data`.viewmodel.SupporPosDisputetTwoVM
import kotlin.String
import kotlin.Unit

class SupporPosDisputetTwoActivity :
    BaseActivity<ActivitySupporPosDisputetTwoBinding>(R.layout.activity_suppor_pos_disputet_two) {
  private val viewModel: SupporPosDisputetTwoVM by viewModels<SupporPosDisputetTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerFrame1656List.value = mutableListOf(
    SpinnerFrame1656Model("Item1"),
    SpinnerFrame1656Model("Item2"),
    SpinnerFrame1656Model("Item3"),
    SpinnerFrame1656Model("Item4"),
    SpinnerFrame1656Model("Item5")
    )
    val spinnerFrame1656Adapter =
    SpinnerFrame1656Adapter(this,R.layout.spinner_item,viewModel.spinnerFrame1656List.value?:
    mutableListOf())
    binding.spinnerFrame1656.adapter = spinnerFrame1656Adapter
    binding.supporPosDisputetTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SUPPOR_POS_DISPUTET_TWO_ACTIVITY"

  }
}
