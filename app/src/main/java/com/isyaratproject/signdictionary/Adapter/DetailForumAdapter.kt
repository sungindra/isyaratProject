package com.isyaratproject.signdictionary.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isyaratproject.signdictionary.Model.Comment
import com.isyaratproject.signdictionary.R

class DetailForumAdapter(val context: Context, val comments: List<Comment>): RecyclerView.Adapter<DetailForumAdapter.Holder>() {
    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){
        val detailPoint = itemView.findViewById<TextView>(R.id.commentPointCounterTxt)
        val detailTitle = itemView.findViewById<TextView>(R.id.commentTitleTxt)
        val detailAuthor = itemView.findViewById<TextView>(R.id.commentAuthorTxt)
        val detailDate = itemView.findViewById<TextView>(R.id.commentDateTxt)
        val detailImage = itemView.findViewById<ImageView>(R.id.commentSignImage)
        val detailValidate = itemView.findViewById<ImageView>(R.id.validateImage)

        fun bindComment(comment: Comment, context: Context){
            // binding with CommentID called ImageID

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.detail_forum_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return comments.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindComment(comments[position], context)
    }
}