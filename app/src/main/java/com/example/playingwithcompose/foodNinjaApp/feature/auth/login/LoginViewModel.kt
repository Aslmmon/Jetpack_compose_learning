package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import android.os.Parcelable
import android.util.Log
import android.util.Patterns
import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()


    fun setEmail(email: String) {
        _uiState.update { _ ->
            uiState.value.copy(email = email)
        }
        isFormValid()
    }

    fun setPassword(password: String) {
        _uiState.update { _ ->
            uiState.value.copy(password = password)
        }
        isFormValid()
    }
    fun  clearState(){
        _uiState.value = LoginUiState()
    }
    private fun isFormValid(): Boolean {
        _uiState.update { _ ->
            uiState.value.copy(isValid = uiState.value.email.isNotEmpty() && _uiState.value.password.isNotEmpty())
        }
        return uiState.value.isValid
    }

}

data class LoginUiState(
    val email: String = "",
    val password: String = "",
    val isValid :Boolean = false

)

