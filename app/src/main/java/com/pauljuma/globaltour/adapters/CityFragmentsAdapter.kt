package com.pauljuma.globaltour.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pauljuma.globaltour.R
import com.pauljuma.globaltour.data.CityData
import kotlinx.android.synthetic.main.cityrecycleview.view.*

class CityFragmentsAdapter : RecyclerView.Adapter<CityFragmentsAdapter.CityViewHolder>() {

    var listOfCities: MutableList<CityData> = ArrayList()

    inner class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(cityData: CityData) {
            itemView.apply {
                tvCityName.text = cityData.cityName
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.cityrecycleview, parent, false)

        return CityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {

        holder.bind(listOfCities[position])
    }

    override fun getItemCount(): Int {
        return listOfCities.size
    }
}