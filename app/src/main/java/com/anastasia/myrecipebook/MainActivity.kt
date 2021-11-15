package com.anastasia.myrecipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"

class MainActivity : AppCompatActivity() {

    private lateinit var recipeBookNavigationMenu : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recipeBookNavigationMenu = findViewById(R.id.recipe_book_navigation_menu)

        recipeBookNavigationMenu.setOnItemSelectedListener { item->
           var fragment: Fragment? = null
           when(item.itemId) {
               R.id.open_recipe->{
                   fragment = OpenRecipeFragment()
               }
               R.id.create_recipe -> {
                   fragment = CreateRecipeFragment()

               }
           }
            replaceFragment(fragment!!)
            true
        }
        recipeBookNavigationMenu.selectedItemId = savedInstanceState?.getInt(LAST_SELECTED_ITEM)?:R.id.open_recipe
    }

        override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, recipeBookNavigationMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
