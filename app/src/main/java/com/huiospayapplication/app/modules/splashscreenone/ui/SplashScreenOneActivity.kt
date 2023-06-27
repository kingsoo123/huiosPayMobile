package com.huiospayapplication.app.modules.splashscreenone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.huiospayapplication.app.R
import com.huiospayapplication.app.appcomponents.base.BaseActivity
import com.huiospayapplication.app.databinding.ActivitySplashScreenOneBinding
import com.huiospayapplication.app.modules.splashscreen.ui.SplashScreenActivity
import com.huiospayapplication.app.modules.splashscreenone.`data`.viewmodel.SplashScreenOneVM
import kotlin.String
import kotlin.Unit

class SplashScreenOneActivity :
    BaseActivity<ActivitySplashScreenOneBinding>(R.layout.activity_splash_screen_one) {
  private val viewModel: SplashScreenOneVM by viewModels<SplashScreenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "SPLASH_SCREEN_ONE_ACTIVITY"

    }
  }
