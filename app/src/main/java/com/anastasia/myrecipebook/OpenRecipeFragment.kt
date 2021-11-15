package com.anastasia.myrecipebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class OpenRecipeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_open_recipe, container, false)
    }

    //creates Banner list to view the Recipes
    val bannerList: List<Banner> = listOf(
        Banner(R.drawable.rice_dish, "Rice dish"),
        Banner(R.drawable.moscow_pastry, "Moscow pastry")
    )
    val bannerRecyclerView: RecyclerView = findViewById(R.id.open_your_recipe_recycle_view)
    bannerRecyclerView.layoutManager =
    LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    bannerRecyclerView.adapter = BannerAdapter(bannerList)
}