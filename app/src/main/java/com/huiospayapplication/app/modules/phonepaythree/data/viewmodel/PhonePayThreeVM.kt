package com.huiospayapplication.app.modules.phonepaythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.phonepaythree.`data`.model.PhonePayThreeModel
import org.koin.core.KoinComponent

class PhonePayThreeVM : ViewModel(), KoinComponent {
  val phonePayThreeModel: MutableLiveData<PhonePayThreeModel> =
      MutableLiveData(PhonePayThreeModel())

  var navArguments: Bundle? = null
}
