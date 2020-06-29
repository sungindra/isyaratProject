package com.isyaratproject.signdictionary.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isyaratproject.signdictionary.Adapter.DictionaryAdapter
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.Utilities.SampleDataService.Abjad_Sibi
import com.isyaratproject.signdictionary.ViewModel.DictionaryViewModel
import kotlinx.android.synthetic.main.fragment_dictionary.*

class DictionaryFragment : Fragment() {

    private lateinit var homeViewModel: DictionaryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(DictionaryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dictionary, container, false)
        val categoryTitle: TextView = root.findViewById(R.id.dictionaryCategoryTxt)
        categoryTitle.text = "Category:"
        return root
    }
}