package com.isyaratproject.signdictionary.Adapter.RecyclerView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isyaratproject.signdictionary.Model.ImageSign
import com.isyaratproject.signdictionary.R

class DictionaryAdapter(val context: Context, val dictionaryEntries: List<ImageSign>): RecyclerView.Adapter<DictionaryAdapter.Holder>(){
    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dictionaryTitle = itemView.findViewById<TextView>(R.id.dictionaryTitleTxt)
        val dictionaryAuthor = itemView.findViewById<TextView>(R.id.dictionaryAuthorTxt)
        val dictionaryDate = itemView.findViewById<TextView>(R.id.dictionaryDateTxt)
        val dictionaryImage = itemView.findViewById<ImageView>(R.id.dictionaryImage)

        fun bindDictionary(dictionary: ImageSign, context: Context){
            val ResourceID = context.resources.getIdentifier("ic_launcher_background","drawable", context.packageName)
            dictionaryTitle?.text = dictionary.ImageTitle
            dictionaryAuthor?.text = "By: " + dictionary.Username
            dictionaryDate?.text = dictionary.ImageDate
            dictionaryImage?.setImageResource(ResourceID)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.dictionary_list_item, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return dictionaryEntries.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindDictionary(dictionaryEntries[position], context)
    }
}