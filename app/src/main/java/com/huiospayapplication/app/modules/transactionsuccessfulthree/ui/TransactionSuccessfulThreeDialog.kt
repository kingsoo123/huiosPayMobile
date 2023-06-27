package com.huiospayapplication.app.modules.transactionsuccessfulthree.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseDialogFragment
import com.huiospayapplication.app.databinding.DialogTransactionSuccessfulThreeBinding
import com.huiospayapplication.app.modules.transactionsuccessfulthree.`data`.viewmodel.TransactionSuccessfulThreeVM
import kotlin.String
import kotlin.Unit

class TransactionSuccessfulThreeDialog :
    BaseDialogFragment<DialogTransactionSuccessfulThreeBinding>(R.layout.dialog_transaction_successful_three)
    {
  private val viewModel: TransactionSuccessfulThreeVM by viewModels<TransactionSuccessfulThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.transactionSuccessfulThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRANSACTION_SUCCESSFUL_THREE_DIALOG"

  }
}
