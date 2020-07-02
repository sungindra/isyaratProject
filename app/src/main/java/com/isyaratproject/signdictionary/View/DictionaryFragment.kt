package com.isyaratproject.signdictionary.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isyaratproject.signdictionary.Adapter.RecyclerView.DictionaryAdapter
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.Utilities.*
import com.isyaratproject.signdictionary.ViewModel.DictionaryViewModel

class DictionaryFragment : Fragment() {

    private lateinit var homeViewModel: DictionaryViewModel
    lateinit var  categoryAdapter: ArrayAdapter<String>

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
        val dictionaryRecyclerVew: RecyclerView = root.findViewById(R.id.dictionaryRecyclerView)
        val categorySpinner: Spinner = root.findViewById(R.id.dictionaryCategorySpinner)

        categoryTitle.text = "Category:"
        dictionaryRecyclerVew.adapter = DictionaryAdapter(root.context, DictionaryDataService.Dictionary_Abjad_Bisindo)
        dictionaryRecyclerVew.layoutManager = LinearLayoutManager(root.context)
        dictionaryRecyclerVew.setHasFixedSize(true)

        return root
    }
}