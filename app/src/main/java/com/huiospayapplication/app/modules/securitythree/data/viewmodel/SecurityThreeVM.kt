package com.huiospayapplication.app.modules.securitythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.securitythree.`data`.model.SecurityThreeModel
import com.huiospayapplication.app.modules.securitythree.`data`.model.SecurityThreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SecurityThreeVM : ViewModel(), KoinComponent {
  val securityThreeModel: MutableLiveData<SecurityThreeModel> =
      MutableLiveData(SecurityThreeModel())

  var navArguments: Bundle? = null

  val securityThreeList: MutableLiveData<MutableList<SecurityThreeRowModel>> =
      MutableLiveData(mutableListOf())
}
