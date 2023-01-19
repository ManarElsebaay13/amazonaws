package com.manarelsebaay13.amazonaws.presentation.activities.splash

import android.os.Handler
import android.os.Looper
import com.manarelsebaay13.amazonaws.R
import com.manarelsebaay13.amazonaws.core.utils.openActivityAndClearStack
import com.manarelsebaay13.amazonaws.databinding.ActivitySplashBinding
import com.manarelsebaay13.amazonaws.presentation.activities.main.MainActivity
import com.manarelsebaay13.amazonaws.presentation.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override
    fun getLayoutId() = R.layout.activity_splash

    override
    fun setUpViews() {
        decideNavigationLogic()
    }

    private fun decideNavigationLogic() {
        Handler(Looper.getMainLooper()).postDelayed({

            openActivityAndClearStack( MainActivity::class.java)

        }, 2000)

    }
}