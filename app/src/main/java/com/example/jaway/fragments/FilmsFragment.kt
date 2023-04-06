package com.example.jaway.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jaway.models.Film
import com.example.jaway.R
import com.example.jaway.recycler.RecyclerViewAdapter
import java.time.LocalDate

class FilmsFragment : Fragment() {
    var llistat: ArrayList<Film> = ArrayList()
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var asd: Film = Film(arrayListOf("Drama", "Romance"),9876,"Una historia de amor en tiempos difíciles.",
            "/ruta/al/poster.jpg",LocalDate.of(2022, 5, 20),"Manzana")
        var eee: Film = Film(arrayListOf("Acción", "Aventura"),9876,"Una história muy macabra.",
            "/ruta/al/film_poster.jpg",LocalDate.of(1999, 2, 21),"Guillem de Frutem")
        llistat.add(asd)
        llistat.add(eee)
        val ala = inflater.inflate(R.layout.fragment_films, container, false)
        recyclerView = ala.findViewById(R.id.recyclerView)
        showRecycler()
        return ala
    }

    fun showRecycler(){
        recyclerView.layoutManager = GridLayoutManager(context,2);
        val adapter : RecyclerViewAdapter = RecyclerViewAdapter(llistat, context);
        recyclerView.adapter = adapter
    }
}