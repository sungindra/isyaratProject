package com.isyaratproject.signdictionary.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.Toast
import com.isyaratproject.signdictionary.R
import kotlinx.android.synthetic.main.activity_create_post.*
import java.lang.Exception

class CreatePost : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)

        val categorySelected = findViewById<Spinner>(R.id.postCategorySpinner)

        val selected = categorySelected.selectedItemPosition

        val categoryName = sortingBasedOnCategory(selected)
        val postTitle = postForumTitleTxtField.text.toString()
        if (upload2Forum(categoryName,postTitle)){
            // success on send data

            finish()
        } else {
            // failed to send data

            Toast.makeText(this, "Your Post could not be uploaded", Toast.LENGTH_LONG).show()
        }


    }

    fun sortingBasedOnCategory(selected: Int): String{
        return when (selected){
            0 -> "Abjad"
            1 -> "Angka"
            2 -> "Kata Kerja"
            3 -> "Kata Sapaan"
            4 -> "Kata Sifat"
            else -> "Not Found"
        }
    }

    fun upload2Forum(CategoryName: String, postTitle: String): Boolean{

        try {
            // sending new post to server

        } catch (e: Exception) {
            // failed to upload to server

            return false
        }
        // if successful to send data 2 server

        return true
    }
}