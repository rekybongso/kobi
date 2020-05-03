package com.rekybongso.kobi.ui

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rekybongso.kobi.R
import com.rekybongso.kobi.data.BankData
import com.rekybongso.kobi.model.BankModel
import com.rekybongso.kobi.adapter.BankAdapter
import com.rekybongso.kobi.util.bind

class MainActivity : AppCompatActivity(){
    private val rvBank: RecyclerView by bind(R.id.mainRecyclerView)
    private var list: ArrayList<BankModel> = arrayListOf()

    @SuppressLint("SourceLockedOrientationActivity")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT

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
