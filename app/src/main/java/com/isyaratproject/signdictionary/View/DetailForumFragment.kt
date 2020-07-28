package com.isyaratproject.signdictionary.View

import android.app.Activity.*
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isyaratproject.signdictionary.Adapter.DetailForumAdapter
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.Utilities.CommentDataService
import com.isyaratproject.signdictionary.ViewModel.DetailForumViewModel


class DetailForumFragment : Fragment() {

    private val PICK_IMAGE = 100
    var imageUri: Uri? = null

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

    fun openGallery(){
        val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
        startActivityForResult(gallery, PICK_IMAGE)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DetailForumViewModel::class.java)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            if (data != null) {
                imageUri = data.data
            };
            // imageView.setImageURI(imageUri);
        }
    }

}