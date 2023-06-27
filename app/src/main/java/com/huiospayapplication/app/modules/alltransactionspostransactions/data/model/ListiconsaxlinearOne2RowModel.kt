package com.huiospayapplication.app.modules.alltransactionspostransactions.`data`.model

import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListiconsaxlinearOne2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPOSCardTran: String? = MyApp.getInstance().resources.getString(R.string.msg_pos_card_tran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.msg_02_12_2022_at_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtN2500000: String? = MyApp.getInstance().resources.getString(R.string.lbl_n25_000_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSuccessful: String? = MyApp.getInstance().resources.getString(R.string.lbl_successful)

)
