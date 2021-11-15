package com.anastasia.myrecipebook

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BannerViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(banner:Banner) {
        val bannerImageView: ImageView = itemView.findViewById(R.id.banner_image_view)
        val bannerDescriptionTextView: TextView = itemView.findViewById(R.id.recipe_name)

        bannerImageView.setImageDrawable(itemView.context.getDrawable(banner.imageRes))
        bannerDescriptionTextView.text = banner.description
    }
}