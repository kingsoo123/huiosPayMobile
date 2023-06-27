package com.huiospayapplication.app.modules.airtimedatasummaryone.ui

import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivityAirtimeDataSummaryOneBinding
import com.huiospayapplication.app.modules.airtimedatasummaryone.`data`.viewmodel.AirtimeDataSummaryOneVM
import kotlin.String
import kotlin.Unit

class AirtimeDataSummaryOneActivity :
    BaseActivity<ActivityAirtimeDataSummaryOneBinding>(R.layout.activity_airtime_data_summary_one) {
  private val viewModel: AirtimeDataSummaryOneVM by viewModels<AirtimeDataSummaryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.airtimeDataSummaryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "AIRTIME_DATA_SUMMARY_ONE_ACTIVITY"

  }
}
