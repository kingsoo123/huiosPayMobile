package com.huiospayapplication.app.modules.transactionsuccessfultwo.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseDialogFragment
import com.huiospayapplication.app.databinding.DialogTransactionSuccessfulTwoBinding
import com.huiospayapplication.app.modules.transactionsuccessfultwo.`data`.viewmodel.TransactionSuccessfulTwoVM
import kotlin.String
import kotlin.Unit

class TransactionSuccessfulTwoDialog :
    BaseDialogFragment<DialogTransactionSuccessfulTwoBinding>(R.layout.dialog_transaction_successful_two)
    {
  private val viewModel: TransactionSuccessfulTwoVM by viewModels<TransactionSuccessfulTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.transactionSuccessfulTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRANSACTION_SUCCESSFUL_TWO_DIALOG"

  }
}
