package com.example.finalproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterChat  (private val listDokter:List<DokterModel>): RecyclerView.Adapter<AdapterChat.ViewHolder>() {

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView){
        val image: ImageView = itemView.findViewById(R.id.imageDokter)
        val nama: TextView = itemView.findViewById(R.id.textNama)
        val spesialis: TextView = itemView.findViewById(R.id.Spesialis)
        val kerja: TextView = itemView.findViewById(R.id.textkerja)
        val like: TextView = itemView.findViewById(R.id.textsuka)
        val harga: TextView = itemView.findViewById(R.id.textharga)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterChat.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterChat.ViewHolder, position: Int) {
        val modelDokter = listDokter[position]

        holder.image.setImageResource(modelDokter.image)
        holder.nama.text = modelDokter.nama
        holder.spesialis.text = modelDokter.spesialis
        holder.kerja.text = modelDokter.kerja
        holder.like.text = modelDokter.like
        holder.harga.text = modelDokter.harga
    }

    override fun getItemCount(): Int {
        return listDokter.size
    }
}