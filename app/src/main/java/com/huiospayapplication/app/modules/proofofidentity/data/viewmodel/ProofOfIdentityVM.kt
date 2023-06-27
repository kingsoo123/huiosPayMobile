package com.huiospayapplication.app.modules.proofofidentity.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.proofofidentity.`data`.model.ProofOfIdentityModel
import org.koin.core.KoinComponent

class ProofOfIdentityVM : ViewModel(), KoinComponent {
  val proofOfIdentityModel: MutableLiveData<ProofOfIdentityModel> =
      MutableLiveData(ProofOfIdentityModel())

  var navArguments: Bundle? = null
}
