package com.rekybongso.kobi.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rekybongso.kobi.R
import com.rekybongso.kobi.adapter.BankAdapter
import com.rekybongso.kobi.data.BankData
import com.rekybongso.kobi.model.BankModel
import com.rekybongso.kobi.util.bind
import org.intellij.lang.annotations.JdkConstants

class MainActivity : AppCompatActivity(){
    private val recyclerViewBank: RecyclerView by bind(R.id.mainRecyclerView)
    private var arrayList: ArrayList<BankModel> = arrayListOf()

    @SuppressLint("SourceLockedOrientationActivity")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        actionBar?.run {
            setHomeAsUpIndicator(R.drawable.main_logo)
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowTitleEnabled(false)
        }

        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT

        recyclerViewBank.setHasFixedSize(true)

        arrayList.addAll(BankData.listBank)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.tentang_saya){
            val openAboutIntent = Intent(this@MainActivity,AboutActivity::class.java)
            startActivity(openAboutIntent)
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList(){
        recyclerViewBank.layoutManager = LinearLayoutManager(this)

        val listBankAdapter = BankAdapter(arrayList)
        recyclerViewBank.adapter = listBankAdapter
    }
}
