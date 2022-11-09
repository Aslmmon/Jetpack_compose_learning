package com.example.playingwithcompose.foodNinjaApp.feature.auth.login

import android.os.Parcelable
import android.util.Log
import android.util.Patterns
import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
) : ViewModel() {
    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()


    fun setEmail(email: String){
        _uiState.value.copy(email = email)
    }
    fun setPassword(password: String){
        _uiState.value.copy(password = password)
    }

    fun isFormValid(emailAddress: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(emailAddress).matches()
    }

}
data class LoginUiState(
    val email: String = "",
    val password: String = ""

)

