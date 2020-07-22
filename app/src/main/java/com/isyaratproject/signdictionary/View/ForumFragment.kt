package com.isyaratproject.signdictionary.View

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.isyaratproject.signdictionary.Adapter.MainForumAdapter
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.Utilities.CategoryListDataService
import com.isyaratproject.signdictionary.Utilities.ForumDataService
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
        val mainForumRecyclerView = root.findViewById<RecyclerView>(R.id.mainForumRecyclerView)
        val categorySpinner = root.findViewById<Spinner>(R.id.mainForumCategorySpinner)
        val createPostBtn = root.findViewById<FloatingActionButton>(R.id.createPostFloatingActionButton)

        val arrayAdapter = ArrayAdapter<String>(root.context, android.R.layout.simple_spinner_item, CategoryListDataService.categoryDropDownList)

        categorySpinner.adapter = arrayAdapter

        categorySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                mainForumRecyclerView.adapter = MainForumAdapter(root.context, ForumDataService.getSearchedForum(CategoryListDataService.categoryDropDownList[position])){ mainForum ->
                    val mainForumIntent = Intent(root.context, DetailForumFragment:: class.java)
                    startActivity(mainForumIntent)
                }
                mainForumRecyclerView.layoutManager = LinearLayoutManager(root.context)
                mainForumRecyclerView.setHasFixedSize(true)
            }

        }



        createPostBtn.setOnClickListener { createPost ->
            val createPostIntent = Intent(root.context, CreatePost:: class.java)
            startActivity(createPostIntent)
        }
        return root
    }
}