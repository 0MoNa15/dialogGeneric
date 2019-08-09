package com.example.dialoggeneric.dialog.viewModel

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mona15.dialog.dialog.model.DialogModel

class DialogViewModel : ViewModel(){

    // Permite escribir el dato que genera una apertura de actividad
    val openActivity : MutableLiveData<Boolean> = MutableLiveData()
    val backDialog : MutableLiveData<Boolean> = MutableLiveData()
    val mTitle : MutableLiveData<String> = MutableLiveData()
    val mIconButton : MutableLiveData<Int> = MutableLiveData()

    // Permite estar leyendo la orden de
    fun getOpenActivity() : LiveData<Boolean> {
        return openActivity
    }

    fun getBackDialog() : LiveData<Boolean> {
        return backDialog
    }

    fun getTitle() : LiveData<String>{
        return mTitle
    }

    fun getImageIcon() : LiveData<Int>{
        return mIconButton
    }

    // Ingresan los cambios de los datos
    fun setTitle(title : String){
        mTitle.postValue(title)
    }

    fun setIcon(drawable : Int){
        mIconButton.postValue(drawable)
    }

    fun onConfirmationClickButton(view : View){
        openActivity.postValue(true)
    }

    fun iconToGoBackOrClose(view : View) {
        backDialog.postValue(true)
    }
}