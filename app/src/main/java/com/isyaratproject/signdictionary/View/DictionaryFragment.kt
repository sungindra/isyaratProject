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
import com.isyaratproject.signdictionary.Adapter.DictionaryAdapter
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.ViewModel.DictionaryViewModel
import kotlinx.android.synthetic.main.fragment_dictionary.*

class DictionaryFragment : Fragment() {

    private lateinit var homeViewModel: DictionaryViewModel
    lateinit var Adapter: DictionaryAdapter

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(DictionaryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dictionary, container, false)
        dictionaryCategoryTxt.text = "Category:"
        // Adapter = DictionaryAdapter(this, "")

        return root
    }
}