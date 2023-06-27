package com.huiospayapplication.app.modules.personalinformation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.huiospayapplication.app.modules.personalinformation.`data`.model.PersonalInformationModel
import com.huiospayapplication.app.modules.personalinformation.`data`.model.SpinnerGroup111Model
import com.huiospayapplication.app.modules.personalinformation.`data`.model.SpinnerGroupTwentyModel
import com.huiospayapplication.app.modules.personalinformation.`data`.model.SpinnerGroupTwentyThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PersonalInformationVM : ViewModel(), KoinComponent {
  val personalInformationModel: MutableLiveData<PersonalInformationModel> =
      MutableLiveData(PersonalInformationModel())

  var navArguments: Bundle? = null

  val spinnerGroupTwentyList: MutableLiveData<MutableList<SpinnerGroupTwentyModel>> =
      MutableLiveData()

  val spinnerGroupTwentyThreeList: MutableLiveData<MutableList<SpinnerGroupTwentyThreeModel>> =
      MutableLiveData()

  val spinnerGroup111List: MutableLiveData<MutableList<SpinnerGroup111Model>> = MutableLiveData()
}
