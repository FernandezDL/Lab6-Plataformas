package com.diana.lab6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var navBttn:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navBttn= findViewById(R.id.Menu)
        setListeners()
    }

    private fun setListeners(){
        navBttn.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.homeMenu -> setFragment(HomeFragment())
                R.id.menuLibreria -> setFragment(LibraryFragment())
                R.id.searchMenu -> setFragment(serchFragment())
            }
            true
        }
    }

    private fun setFragment(fragment: Fragment){
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.Container1, fragment)
        }
    }
}