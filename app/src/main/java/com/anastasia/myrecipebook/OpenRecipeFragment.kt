package com.anastasia.myrecipebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class OpenRecipeFragment : Fragment() {

// Describe th logic of implementing recycle view to Open recipe fragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_open_recipe, container, false)

        val bannerList: List<Banner> = listOf(
            Banner(R.drawable.rice_dish, "Rice dish"),
            Banner(R.drawable.moscow_pastry, "Moscow pastry"),
            Banner(R.drawable.praga_cake, "Prague"),
            Banner(R.drawable.pancakes, "Pancakes"),
            Banner(R.drawable.salad, "Salad")
        )
        val bannerRecyclerView: RecyclerView = view.findViewById(R.id.open_your_recipe_recycle_view)
        bannerRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        bannerRecyclerView.adapter = BannerAdapter(bannerList)

              return view

    }
}