package com.isyaratproject.signdictionary.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.isyaratproject.signdictionary.R
import kotlinx.android.synthetic.main.activity_login.*
import java.lang.Exception

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val emailTxt = loginEmailTxtField.text.toString()
        val passwordTxt = loginPasswordTxtField.text.toString()
        val rememberMe = rememberMeCheckBox.isChecked
        if (validateUserData(emailTxt, passwordTxt)){
            if (rememberMe){
                // use getSharedPreference for user default
            }
                // use getPreference or intent to distribute data

            finish()
        } else {
            Toast.makeText(this, "Login is not Successful", Toast.LENGTH_LONG).show()
        }



    }

    fun validateUserData(emailTxt: String, passwordTxt: String): Boolean{
        // get json data
        try {

        } catch(e: Exception){
            return false
        }
        // after passed
        if(emailTxt == passwordTxt){
            return true
        } else {
            return false
        }
    }
}