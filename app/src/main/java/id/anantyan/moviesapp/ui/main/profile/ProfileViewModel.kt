package id.anantyan.moviesapp.ui.main.profile

import android.graphics.Bitmap
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.anantyan.moviesapp.model.Profile
import id.anantyan.moviesapp.model.Users
import id.anantyan.moviesapp.repository.UsersRepository
import id.anantyan.utils.Resource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.MultipartBody

class ProfileViewModel(private val repository: UsersRepository) : ViewModel() {

    val showAccount: LiveData<Resource<List<Profile>>> = repository._showAccount
    val showPhoto: LiveData<Resource<String>> = repository._showPhoto
    val setProfile: LiveData<Resource<List<Profile>>> = repository._setProfile
    val setPassword: LiveData<Resource<String>> = repository._setPassword
    val setPhoto: LiveData<Resource<String>> = repository._setPhoto
    val getAccount: LiveData<Resource<Users>> = repository._getAccount

    fun showAccount(userId: Int?) = CoroutineScope(Dispatchers.IO).launch {
        repository.showAccount(userId)
    }

    fun showPhoto(userId: Int?) = CoroutineScope(Dispatchers.IO).launch {
        repository.showPhoto(userId)
    }

    fun setProfile(item: Users) = CoroutineScope(Dispatchers.IO).launch {
        repository.setProfile(item)
    }

    fun setPassword(item: Users) = CoroutineScope(Dispatchers.IO).launch {
        repository.setPassword(item)
    }

    fun setPhoto(userId: Int?, photo: MultipartBody.Part) = CoroutineScope(Dispatchers.IO).launch {
        repository.setPhoto(userId, photo)
    }

    fun getAccount(userId: Int?) = CoroutineScope(Dispatchers.IO).launch {
        repository.getAccount(userId)
    }
}