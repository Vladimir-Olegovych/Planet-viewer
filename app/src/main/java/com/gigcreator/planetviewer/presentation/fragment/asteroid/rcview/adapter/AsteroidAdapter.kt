package com.gigcreator.planetviewer.presentation.fragment.asteroid.rcview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gigcreator.domain.models.asteroid.NearEarthObject
import com.gigcreator.planetviewer.R
import com.gigcreator.planetviewer.presentation.fragment.asteroid.rcview.holder.AsteroidHolder


class AsteroidAdapter: RecyclerView.Adapter<AsteroidHolder>() {
    private val listNEO = ArrayList<NearEarthObject>()

    fun add(neo: NearEarthObject){
        listNEO.add(neo)
        notifyDataSetChanged()
    }
    fun clear(){
        listNEO.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AsteroidHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.asteroid_card, parent, false)
        return AsteroidHolder(view)
    }

    override fun onBindViewHolder(holder: AsteroidHolder, position: Int) {
        holder.bind(listNEO[position])
        val h = holder.getBinding()

    }

    override fun getItemCount(): Int {
        return listNEO.size
    }
}