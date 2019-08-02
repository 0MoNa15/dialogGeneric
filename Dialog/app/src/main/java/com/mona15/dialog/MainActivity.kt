package com.mona15.dialog

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.appcompat.app.AppCompatActivity
import com.example.dialoggeneric.Dialog.DialogFullscreen
import com.example.dialoggeneric.Util.Internet.Model.ConnectionModel
import com.example.dialoggeneric.Util.Internet.ValidInternetConnection

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mTitleTextView : TextView = findViewById(R.id.example)
        val timestamp = System.currentTimeMillis() / 1000
        mTitleTextView.setText(timestamp.toString())

        ValidInternetConnection(this).observe(this,
            Observer<ConnectionModel>{
                if (it!!.conectionStatus){
                    Log.e("Internet", "VERDADERO NO HAY")
                    Toast.makeText(this, "VERDADERO", Toast.LENGTH_SHORT)
                } else {
                    Log.e("Internet", "FALSO SI HAY")
                    Toast.makeText(this, "FALSO", Toast.LENGTH_SHORT)
                }
            }
        )
    }

    fun openDialog(view : View){
        /*val dialgo = DialogFullscreen()
        val fm = this@MainActivity.fragmentManager
        dialgo.show(fm, "name")*/

        val dialogFragment = DialogFullscreen()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.addToBackStack(null)
        dialogFragment.show(fragmentTransaction, "name")
    }
}
