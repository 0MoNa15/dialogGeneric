package com.example.dialoggeneric.Util

import android.graphics.drawable.Drawable

/**
 * Clase encargada de realizar las validaciones de los tipos de datos
 * String, Image, Int, Double, entre otros
 */
class ValidateData {

    fun validateTextNotNull(textData : String): Boolean {
        return textData != null
    }

    fun validateTextNotEmpty(textData : String): Boolean {
        return textData.isNotEmpty()
    }

    fun validateImageNotNull(imageData: Drawable?): Boolean {
        return imageData != null
    }

}
