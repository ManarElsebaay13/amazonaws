package com.manarelsebaay13.amazonaws.presentation.fragments.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.manarelsebaay13.amazonaws.core.utils.Resource
import com.manarelsebaay13.amazonaws.domain.model.Product
import com.manarelsebaay13.amazonaws.domain.use_case.GetProductsListUseCase
import com.manarelsebaay13.amazonaws.presentation.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
     private val getProductsListUseCase: GetProductsListUseCase
): BaseViewModel() {
     fun productInfoListState(): LiveData<Resource<List<Product>>> = productInfoListState
     private val productInfoListState: MutableLiveData<Resource<List<Product>>> = MutableLiveData()

     fun onLoad() {
          productInfoListState.value = Resource.Loading()

          viewModelScope.launch {
               try {
                    productInfoListState.value = Resource.Success(getProductsListUseCase.getProductsInfoList())
               } catch (e: HttpException) {
                    productInfoListState.value = Resource.Error(e.localizedMessage ?: "An unexpected error occurred")
               } catch (e: IOException) {
                    productInfoListState.value = Resource.Error("Please," +
                            " Check your internet connection!")
               }
          }
     }
}

