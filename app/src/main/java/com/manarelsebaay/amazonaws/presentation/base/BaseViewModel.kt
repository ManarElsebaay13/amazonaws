package com.manarelsebaay13.amazonaws.presentation.base

import androidx.lifecycle.ViewModel
import com.manarelsebaay13.amazonaws.core.utils.SingleLiveEvent

open class BaseViewModel : ViewModel() {

  var dataLoadingEvent: SingleLiveEvent<Int> = SingleLiveEvent()
}