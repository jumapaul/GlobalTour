package com.pauljuma.globaltour.city

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.pauljuma.globaltour.R
import com.pauljuma.globaltour.adapters.CityFragmentsAdapter
import kotlinx.android.synthetic.main.fragment_city.view.*

class CityFragment : Fragment() {

    private lateinit var myAdapter: CityFragmentsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_city, container, false)

        myAdapter = CityFragmentsAdapter()
        view.rvCities.apply {
            hasFixedSize()
            adapter = myAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }

        return view
    }

}