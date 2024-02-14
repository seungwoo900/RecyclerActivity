package edu.temple.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(_numbers: IntArray) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* Step 3a: Provide Adapter Parent */ {

    private val numbers = _numbers

    class NumberViewHolder (val _textView: TextView) : RecyclerView.ViewHolder (_textView) {
        val textView = _textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
//        val layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false)
//        return NumberViewHolder(layout.findViewById(R.id.textView))

        return NumberViewHolder(
            TextView (
                parent.context
            )
        )
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    //Step 3b: Complete function definitions for adapter

}