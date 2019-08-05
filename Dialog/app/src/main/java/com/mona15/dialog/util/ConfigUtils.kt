package com.example.dialoggeneric.Util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

class ConfigUtils {

    companion object {

        /**
         * Valida que la aplicación tenga conexión con internet
         * @return retorna verdadero si la app si cuenta con internet
         */
        fun checkInternetConnection(context : Context?) : Boolean?{
            /*val mConnectivityManager : ConnectivityManager? = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
            val mNetworkInfo : NetworkInfo? = mConnectivityManager?.activeNetworkInfo

            when (mConnectivityManager != null){
                mNetworkInfo != null, mNetworkInfo?.isConnectedOrConnecting, mNetworkInfo?.isAvailable -> return true
            }*/

            return false
        }
    }
}