package com.isyaratproject.signdictionary.View

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isyaratproject.signdictionary.Adapter.DetailForumAdapter
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.Utilities.CommentDataService
import com.isyaratproject.signdictionary.ViewModel.DetailForumViewModel

class DetailForumFragment : Fragment() {

    companion object {
        fun newInstance() =
            DetailForumFragment()
    }

    private lateinit var viewModel: DetailForumViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_detail_forum, container, false)
        val postTitle = root.findViewById<TextView>(R.id.detailPostTitileTxt)
        val postAuthor = root.findViewById<TextView>(R.id.detailPostAuthorTxt)
        val postDate = root.findViewById<TextView>(R.id.detailPostDateTxt)
        val postPoint = root.findViewById<TextView>(R.id.detailPointCounterTxt)
        val detailRecyclerView = root.findViewById<RecyclerView>(R.id.detailRecyclerView)

        detailRecyclerView.adapter = DetailForumAdapter(root.context, CommentDataService.comments)
        detailRecyclerView.layoutManager = LinearLayoutManager(root.context)
        detailRecyclerView.setHasFixedSize(true)

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailForumViewModel::class.java)

    }

}