package com.anastasia.myrecipebook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup



class CreateRecipeFragment : Fragment() {

// Create fragment to input recipes that refers to create recipe layout
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view =  inflater.inflate(R.layout.fragment_create_recipe, container, false)

        return view
    }


}
