package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val _textView: TextView) : RecyclerView.ViewHolder (_textView) {
        val textView = _textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    //Step 3b: Complete function definitions for adapter

}