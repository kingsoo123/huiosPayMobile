package com.huiospayapplication.app.modules.onboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.onboard.`data`.model.OnboardModel
import org.koin.core.KoinComponent

class OnboardVM : ViewModel(), KoinComponent {
  val onboardModel: MutableLiveData<OnboardModel> = MutableLiveData(OnboardModel())

  var navArguments: Bundle? = null
}
