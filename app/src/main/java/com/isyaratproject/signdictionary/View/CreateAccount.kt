package com.isyaratproject.signdictionary.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.isyaratproject.signdictionary.R
import kotlinx.android.synthetic.main.activity_create_account.*
import java.lang.Exception

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        if (registerPassword2TxtField.text.toString() == registerPasswordTxtField.text.toString()){
            val usernameTxt = registerUsernameTxtField.text.toString()
            val emailTxt = registerEmailTxtField.text.toString()
            val passwordTxt = registerPasswordTxtField.text.toString()
            if (sendNewUserData2Server(usernameTxt, emailTxt, passwordTxt)){
                // successful send to server
                // use getPreferance or Intent to pass data

                finish()
            } else {
                // failed send to server
                Toast.makeText(this, "Failed to create account due to server error", Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, "Your password is incorrect, check your password and your re-type password", Toast.LENGTH_LONG).show()
        }
    }

    fun sendNewUserData2Server(usernameTxt: String, emailTxt: String, passwordTxt: String): Boolean{


        try{

        } catch (e: Exception){
            // if save to server is failed
            return false
        }
        // if did not catch any server problem
        return true
    }
}