package com.mona15.dialog.dialog.model

class DialogModel {

    var mTitle : String = ""
    var mIcon : Int = 0
    var mActionButtonText : String = ""

    constructor(){}

    constructor(title : String, icon : Int, actionButtonText : String){
        mTitle = title
        mIcon = icon
        mActionButtonText = actionButtonText
    }

    fun getTitle() : String{
        return mTitle
    }

    fun getActionButtonText() : String{
        return mActionButtonText
    }

    fun getIcon() : Int{
        return mIcon
    }

    fun setTitle(title : String){
        mTitle = title
    }

    fun setActionButtonText(actionButtonText: String){
        mActionButtonText = actionButtonText
    }

    fun setIcon(icon : Int){
        mIcon = icon
    }
}