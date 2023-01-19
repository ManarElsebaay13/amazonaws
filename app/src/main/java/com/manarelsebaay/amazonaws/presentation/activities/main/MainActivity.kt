package com.manarelsebaay13.amazonaws.presentation.activities.main

import com.manarelsebaay13.amazonaws.R
import com.manarelsebaay13.amazonaws.databinding.ActivityMainBinding
import com.manarelsebaay13.amazonaws.presentation.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override
    fun getLayoutId() = R.layout.activity_main
}