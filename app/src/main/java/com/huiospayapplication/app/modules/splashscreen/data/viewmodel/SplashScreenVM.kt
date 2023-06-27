package com.huiospayapplication.app.modules.splashscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.splashscreen.`data`.model.SplashScreenModel
import org.koin.core.KoinComponent

class SplashScreenVM : ViewModel(), KoinComponent {
  val splashScreenModel: MutableLiveData<SplashScreenModel> = MutableLiveData(SplashScreenModel())

  var navArguments: Bundle? = null
}
