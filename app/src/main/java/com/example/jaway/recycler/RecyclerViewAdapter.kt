package com.example.jaway.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jaway.models.Film
import com.example.jaway.R

class RecyclerViewAdapter (llistat: MutableList<Film>, context: Context?): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    var llistat: MutableList<Film> = llistat;
    var context: Context? = context;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.card_layout, parent, false))
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.setText(llistat.get(position).title);
        holder.image.setImageResource(R.drawable.starwars)
    }


    override fun getItemCount(): Int {
        return llistat.size;
    }

    class ViewHolder (view: View): RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.film_name)
        val image: ImageView = view.findViewById((R.id.film_image))
    }
}