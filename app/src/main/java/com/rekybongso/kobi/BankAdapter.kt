package com.rekybongso.kobi

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class BankAdapter (private val listBank: ArrayList<BankModel>) : RecyclerView.Adapter<BankAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BankAdapter.ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_items, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBank.size
    }

    override fun onBindViewHolder(holder: BankAdapter.ListViewHolder, position: Int) {
        val (nama, kodeBank,kodeSwift,alamat,telepon,website,gambar) = listBank[position]

        Glide.with(holder.itemView.context)
            .load(gambar)
            .apply(RequestOptions())
            .into(holder.logoBank)

        holder.namaBank.text = nama
        holder.kodeBank.text = "Kode Bank: $kodeBank"
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var namaBank: TextView = itemView.findViewById(R.id.bankName_Tv)
        var kodeBank: TextView = itemView.findViewById(R.id.bankCode_Tv)
        var logoBank: ImageView = itemView.findViewById(R.id.bankIcon_Img)
    }
}