package com.isyaratproject.signdictionary.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.ViewModel.DictionaryViewModel

class DictionaryFragment : Fragment() {

    private lateinit var homeViewModel: DictionaryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // load every time the dictionary fragment is called during launch and search based on category
        // category starter is abjad bisindo
        homeViewModel =
                ViewModelProviders.of(this).get(DictionaryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dictionary, container, false)
        val categoryTitle: TextView = root.findViewById(R.id.dictionaryCategoryTxt)
        categoryTitle.text = "Category:"
        return root
    }
}