package com.huiospayapplication.app.modules.transactionsuccessfulone.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseDialogFragment
import com.huiospayapplication.app.databinding.DialogTransactionSuccessfulOneBinding
import com.huiospayapplication.app.modules.transactionsuccessfulone.`data`.viewmodel.TransactionSuccessfulOneVM
import kotlin.String
import kotlin.Unit

class TransactionSuccessfulOneDialog :
    BaseDialogFragment<DialogTransactionSuccessfulOneBinding>(R.layout.dialog_transaction_successful_one)
    {
  private val viewModel: TransactionSuccessfulOneVM by viewModels<TransactionSuccessfulOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.transactionSuccessfulOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRANSACTION_SUCCESSFUL_ONE_DIALOG"

  }
}
