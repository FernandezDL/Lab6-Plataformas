package com.diana.lab6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class LibraryFragment : Fragment(R.layout.fragment_library) {

    private lateinit var bttnCount: ImageButton
    private lateinit var txt: TextView
    private var counter = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bttnCount = view.findViewById(R.id.add)
        txt = view.findViewById(R.id.num)

        setListeners()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun setListeners(){
        bttnCount.setOnClickListener {
            counter++
            txt.setText(counter.toString())
        }
    }
}