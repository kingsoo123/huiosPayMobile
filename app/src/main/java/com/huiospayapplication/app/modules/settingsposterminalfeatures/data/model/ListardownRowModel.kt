package com.huiospayapplication.app.modules.settingsposterminalfeatures.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListardownRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWithdrawal: String? = MyApp.getInstance().resources.getString(R.string.lbl_withdrawal)

)
