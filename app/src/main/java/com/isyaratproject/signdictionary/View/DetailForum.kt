package com.isyaratproject.signdictionary.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isyaratproject.signdictionary.R

class DetailForum : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_forum_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DetailForumFragment.newInstance())
                .commitNow()
        }
    }
}