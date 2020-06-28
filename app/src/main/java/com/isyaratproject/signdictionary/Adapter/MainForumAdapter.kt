package com.isyaratproject.signdictionary.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isyaratproject.signdictionary.Model.Post
import com.isyaratproject.signdictionary.R

class MainForumAdapter(val context: Context, val postEntries: List<Post>, val itemClick: (Post) -> Unit): RecyclerView.Adapter<MainForumAdapter.Holder>() {
    inner class Holder(itemView: View, val itemClick: (Post) -> Unit) : RecyclerView.ViewHolder(itemView) {

        fun bindPostForum(post: Post, context: Context){

            itemView.setOnClickListener { itemClick(post) }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_forum_list_item, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return postEntries.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindPostForum(postEntries[position], context)
    }
}