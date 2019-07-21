package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val grid = findViewById<GridView>(R.id.gridView)
        val data = Array(31) { x -> x}
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        grid.adapter = adapter
        grid.numColumns = 4
        grid.columnWidth = GridView.AUTO_FIT
    }
}
