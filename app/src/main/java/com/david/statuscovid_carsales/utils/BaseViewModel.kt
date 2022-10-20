package com.david.statuscovid_carsales.utils

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.david.statuscovid_carsales.data.util.State
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

open class BaseViewModel : ViewModel() {
    val isLoading = ObservableBoolean(false)
    val isContent = ObservableBoolean(false)
    val isError = ObservableBoolean(false)

    fun <V> manageView(
        flow: Flow<State<V>>,
        liveData: MutableLiveData<State<V>>,
        onLoading: () -> Unit = {},
        onSuccess: (V) -> Unit = {}
    ) = viewModelScope.launch(Dispatchers.IO) {
        onLoading()
        flow.collect {

            if (it is State.Success) {
                onSuccess(it.data)
            }

            liveData.postValue(it)

            updateView(it)
        }
    }

    private fun <V> updateView(state: State<V>) {
        isLoading.set(state is State.Loading)
        isContent.set(state is State.Success)
        isError.set(state is State.Error)
    }
}