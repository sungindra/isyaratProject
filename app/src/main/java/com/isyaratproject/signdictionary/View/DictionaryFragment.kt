package com.isyaratproject.signdictionary.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.isyaratproject.signdictionary.Adapter.DictionaryAdapter
import com.isyaratproject.signdictionary.R
import com.isyaratproject.signdictionary.Utilities.*
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
        val dictionaryRecyclerVew: RecyclerView = root.findViewById(R.id.dictionaryRecyclerView)
        val categorySpinner: Spinner = root.findViewById(R.id.dictionaryCategorySpinner)

        val arrayAdapter = ArrayAdapter<String>(root.context, android.R.layout.simple_spinner_item, CategoryListDataService.categoryDropDownList)

        categorySpinner.adapter = arrayAdapter

        categorySpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                dictionaryRecyclerVew.adapter = DictionaryAdapter(root.context, DictionaryDataService.getSearchedDictionary(CategoryListDataService.categoryDropDownList[position]))
                dictionaryRecyclerVew.layoutManager = LinearLayoutManager(root.context)
                dictionaryRecyclerVew.setHasFixedSize(true)
            }

        }

        return root
    }
}