package com.rekybongso.kobi.ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.rekybongso.kobi.R

class AboutActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionBar = supportActionBar

        actionBar.run {
            this!!.title = "Tentang Saya"
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(view: View) {
        if (view.id == R.id.my_email){
            val mailToIntent = Intent(Intent.ACTION_SENDTO)
            mailToIntent.data = Uri.parse("mailto:rekybongso@gmail.com")
            startActivity(mailToIntent)
        }
    }
}
