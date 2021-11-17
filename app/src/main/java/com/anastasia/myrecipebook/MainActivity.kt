package com.anastasia.myrecipebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

// Initiate constant for the KEY to save the last selected item
private const val LAST_SELECTED_ITEM = "LAST_SELECTED_ITEM"

class MainActivity : AppCompatActivity() {

// 3. Initiate variable to work with NavigationView and describe the logic of application
    private lateinit var recipeBookNavigationMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recipeBookNavigationMenu = findViewById(R.id.recipe_book_navigation_menu)

        recipeBookNavigationMenu.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.open_recipe -> {
                    fragment = OpenRecipeFragment()
                }
                R.id.create_recipe -> {
                    fragment = CreateRecipeFragment()

                }
            }
            replaceFragment(fragment!!)
            true
        }
        // Select saved state and set default view of saved screen (if null)
        recipeBookNavigationMenu.selectedItemId =
            savedInstanceState?.getInt(LAST_SELECTED_ITEM) ?: R.id.open_recipe
    }
        // Save the last selected item
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt(LAST_SELECTED_ITEM, recipeBookNavigationMenu.selectedItemId)
        super.onSaveInstanceState(outState)
    }
        // Implement support Fragment Manager function to switch between fragments
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
