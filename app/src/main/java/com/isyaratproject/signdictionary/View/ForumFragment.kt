package com.isyaratproject.signdictionary.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.ViewModel.ForumViewModel

class ForumFragment : Fragment() {

    private lateinit var forumViewModel: ForumViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // load every time the forum fragment called during launch, switch fragments between detailed one and everytime for search a category
        // category starter is abjad bisindo
        forumViewModel =
                ViewModelProviders.of(this).get(ForumViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_forum, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        forumViewModel.text.observe(viewLifecycleOwner, Observer { forumVM->
            textView.text = forumVM
        })
        return root
    }
}