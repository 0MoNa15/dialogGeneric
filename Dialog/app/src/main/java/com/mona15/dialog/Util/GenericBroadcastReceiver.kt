package com.example.dialoggeneric.Util

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.lifecycle.LiveData

/**
 * Permite tener el acceso a un broadcast de forma general,
 * podrá ser llamada esta clase por cualquier módulo que
 * necesite abrir esta comunicación
 */
abstract class GenericBroadcastReceiver<T>(val context: Context, val intentFilter: IntentFilter) : LiveData<T>(){
    /**
     * Método que se activa cuando el Lycicle
     * se encuentra en un estado vigente
     * (Ej: onCreate, onResume)
     */
    override fun onActive() {
        super.onActive()
        context.registerReceiver(receiver, intentFilter)
    }

    /**
     * Método que se activa cuando el Lycicle
     * se encuentra en un estado desactivado
     * (Ej: onDestroy, onStop)
     */
    override fun onInactive() {
        super.onInactive()
        context.unregisterReceiver(receiver)
    }

    /**
     * Creamos un método abstracto con el fin de que, cuando esta clase
     * vaya a extender o a ser implementada, no obligue a utilizar este
     * método
     */

    abstract fun onReceive(intent: Intent?)

    /**
     * Creamos variable de tipo Broadcast, que activará este
     * protocolo de comunicación
     */
    val receiver = object : BroadcastReceiver(){
        override fun onReceive(context: Context?, intent: Intent?) {
            onReceive(intent)
        }
    }
}