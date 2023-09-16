package com.gigcreator.planetviewer.presentation.rc_view.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gigcreator.planetviewer.R
import com.gigcreator.domain.models.Photo
import com.gigcreator.planetviewer.presentation.fragment.MarsFragment
import com.gigcreator.planetviewer.presentation.rc_view.holder.MarsHolder


class MarsAdapter(private val context: Context, private val fragment: MarsFragment): RecyclerView.Adapter<MarsHolder>() {
    private val listPhoto = ArrayList<Photo>()

    fun add(photo: Photo){
        listPhoto.add(photo)
        notifyDataSetChanged()
    }
    fun clear(){
        listPhoto.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.mars_card, parent, false)
        return MarsHolder(context, view)
    }

    override fun onBindViewHolder(holder: MarsHolder, position: Int) {
        holder.bind(listPhoto[position])
        val h = holder.getBinding()

        h.imageViewPhoto.setOnClickListener { context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(listPhoto[position].img_src))) }
    }

    override fun getItemCount(): Int {
        return listPhoto.size
    }
}