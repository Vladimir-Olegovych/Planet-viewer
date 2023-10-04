package com.gigcreator.planetviewer.presentation.fragment.mars.rcview.holder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gigcreator.domain.models.mars.Photo
import com.gigcreator.planetviewer.databinding.MarsCardBinding


class MarsHolder(private val context: Context, item: View): RecyclerView.ViewHolder(item){

    private val binding = MarsCardBinding.bind(item)

    fun bind(photo: Photo) = with(binding){

        Glide.with(context).load(photo.img_src).into(imageViewPhoto)
        textViewRover.text = photo.rover.name
        textViewCamera.text = photo.camera.full_name
        textViewEarthDate.text = photo.earth_date
        textViewLaunchLanding.text = "${photo.rover.launch_date} and ${photo.rover.landing_date}"
        textViewRoverStatus.text = photo.rover.status

    }

    fun getBinding(): MarsCardBinding {
        return binding
    }
}