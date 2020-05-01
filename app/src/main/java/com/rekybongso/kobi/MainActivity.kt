package com.rekybongso.kobi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvBank: RecyclerView
    private var list: ArrayList<BankModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBank = findViewById(R.id.mainRecyclerView)
        rvBank.setHasFixedSize(true)

        list.addAll(BankData.listBank)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvBank.layoutManager = LinearLayoutManager(this)
        val listBankAdapter = BankAdapter(list)
        rvBank.adapter = listBankAdapter
    }
}
