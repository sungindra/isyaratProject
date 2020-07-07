package com.isyaratproject.signdictionary.View

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.isyaratproject.signdictionary.R
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
        return inflater.inflate(R.layout.fragment_detail_forum, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailForumViewModel::class.java)

    }

}