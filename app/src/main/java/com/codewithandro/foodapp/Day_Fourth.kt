package com.codewithandro.foodapp
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.codewithandro.foodapp.R.color.bgcolor
import com.codewithandro.foodapp.databinding.ActivityDayFourthBinding
import com.codewithandro.kotlinseries.burgerFragment
import com.codewithandro.kotlinseries.fruitsFragment
import com.codewithandro.kotlinseries.pizzaFragment
import com.codewithandro.kotlinseries.sandwichFragment

class Day_Fourth : AppCompatActivity() {

    lateinit var binding: ActivityDayFourthBinding // Correct the binding class

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setBackgroundDrawable(resources.getDrawable(bgcolor))

        // Inflate the layout with the correct binding class
        binding = ActivityDayFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)


        replaceFragment(burgerFragment()) // Auto-fragment load
        //burgerBtn,pizzaBtn,sandwichBtn,fruitsBtn

        //Set up button click to replace the fragment
        binding.burgerBtn.setOnClickListener {

            replaceFragment(burgerFragment())
            intent= Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)

        }

        //pizzaBtn Fragment Function
        binding.pizzaBtn.setOnClickListener {
            replaceFragment(pizzaFragment())  // Assuming this is the fragment you want to load
        }


        // sandwichBtn Fragment Function
        binding.sandwichBtn.setOnClickListener {
            replaceFragment(sandwichFragment())  // Assuming this is the fragment you want to load
        }

        // fruitsBtn Fragment Function
        binding.fruitsBtn.setOnClickListener {
            replaceFragment(fruitsFragment())  // Assuming this is the fragment you want to load
        }
    }

    // Method to replace the current fragment one time automatic
    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContenir, fragment)
        fragmentTransaction.commit()

    }

    //order Button Function start
}





