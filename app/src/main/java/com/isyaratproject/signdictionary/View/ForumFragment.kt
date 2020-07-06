package com.isyaratproject.signdictionary.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.isyaratproject.signdictionary.Adapter.RecyclerView.MainForumAdapter
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.Utilities.DictionaryDataService
import com.isyaratproject.signdictionary.Utilities.ForumDataService
import com.isyaratproject.signdictionary.ViewModel.ForumViewModel
import kotlinx.android.synthetic.main.fragment_dictionary.*

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
        val categoryTitle = root.findViewById<TextView>(R.id.mainForumCategoryTxt)
        val mainForumRecyclerView = root.findViewById<RecyclerView>(R.id.mainForumRecyclerView)
        val categorySpinner = root.findViewById<Spinner>(R.id.mainForumCategorySpinner)
        val createPostBtn = root.findViewById<FloatingActionButton>(R.id.createPostFloatingActionButton)

        categoryTitle.text = "Category:"
        mainForumRecyclerView.adapter = MainForumAdapter(root.context, ForumDataService.Forum_Abjad_Bisindo){ mainForum ->

        }
        mainForumRecyclerView.layoutManager = LinearLayoutManager(root.context)
        mainForumRecyclerView.setHasFixedSize(true)

        createPostBtn.setOnClickListener { createPost ->

        }
        return root
    }
}