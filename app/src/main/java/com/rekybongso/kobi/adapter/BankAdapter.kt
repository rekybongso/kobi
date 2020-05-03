package com.rekybongso.kobi.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rekybongso.kobi.R
import com.rekybongso.kobi.model.BankModel
import com.rekybongso.kobi.ui.DetailActivity

class BankAdapter (private val listBank: ArrayList<BankModel>) : RecyclerView.Adapter<BankAdapter.ListViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.row_items, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBank.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (namaBank, kodeBank,kodeSwift,alamatBank,teleponBank,websiteBank,logoBank) = listBank[position]
        val nContext = holder.itemView.context

        Glide.with(holder.itemView.context)
            .load(logoBank)
            .apply(RequestOptions())
            .into(holder.logoBank)

        holder.namaBank.text = namaBank
        holder.kodeBank.text = "Kode Bank: $kodeBank"

        holder.itemView.setOnClickListener{
            val nDetail = Intent(nContext, DetailActivity::class.java)
                nDetail.putExtra(DetailActivity.EXTRA_NAME, namaBank)
                nDetail.putExtra(DetailActivity.EXTRA_BANK_CODE, kodeBank)
                nDetail.putExtra(DetailActivity.EXTRA_SWIFT_CODE, kodeSwift)
                nDetail.putExtra(DetailActivity.EXTRA_ALAMAT_BANK, alamatBank)
                nDetail.putExtra(DetailActivity.EXTRA_NO_TELP, teleponBank)
                nDetail.putExtra(DetailActivity.EXTRA_WEBSITE, websiteBank)
                nDetail.putExtra(DetailActivity.EXTRA_LOGO_BANK, logoBank)
                nContext.startActivity(nDetail)
        }

    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var namaBank: TextView = itemView.findViewById(R.id.bankName_Tv)
        var kodeBank: TextView = itemView.findViewById(R.id.bankCode_Tv)
        var logoBank: ImageView = itemView.findViewById(R.id.bankIcon_Img)
    }
}