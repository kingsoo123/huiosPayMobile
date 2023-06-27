package com.huiospayapplication.app.modules.supportemail.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.supportemail.`data`.model.SupportEmailModel
import org.koin.core.KoinComponent

class SupportEmailVM : ViewModel(), KoinComponent {
  val supportEmailModel: MutableLiveData<SupportEmailModel> = MutableLiveData(SupportEmailModel())

  var navArguments: Bundle? = null
}
