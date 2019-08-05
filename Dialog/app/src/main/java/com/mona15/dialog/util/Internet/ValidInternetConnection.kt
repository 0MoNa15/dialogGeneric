package com.example.dialoggeneric.Util.Internet

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import com.example.dialoggeneric.Util.ConfigUtils
import com.example.dialoggeneric.Util.GenericBroadcastReceiver
import com.example.dialoggeneric.Util.Internet.Model.ConnectionModel

/**
 * Clase encargada de validar si lo que llega a través
 * de los cambios del teléfono es un cambio por conectividad
 * a la red (Internet)
 */

class ValidInternetConnection(context :Context) : GenericBroadcastReceiver<ConnectionModel>
    (context, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)){

    override fun onReceive(intent: Intent?) {
        intent!!.action.let {
            if (ConfigUtils.checkInternetConnection(context)!!){
                // Si hay internet
                if (value!!.conectionStatus){
                    // No habia internet pero ahora si hay
                    postValue(ConnectionModel(false))
                }
            } else {
                // No hay internet
                postValue(ConnectionModel(true))
            }
        }
    }
}