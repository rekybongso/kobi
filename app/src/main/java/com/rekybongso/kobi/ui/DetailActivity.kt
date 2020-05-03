package com.rekybongso.kobi.ui

import android.annotation.SuppressLint
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rekybongso.kobi.R
import com.rekybongso.kobi.util.bind

class DetailActivity : AppCompatActivity(), View.OnClickListener {

    private val tvKodeBank: TextView by bind(R.id.setKodeBank_Tv)
    private val tvKodeSwift: TextView by bind(R.id.swiftCode_Tv)
    private val tvAlamatBank: TextView by bind(R.id.alamatBank_Tv)
    private val tvNoTelpBank: TextView by bind(R.id.noTelpBank_Tv)
    private val tvWebBank: TextView by bind(R.id.websiteBank_Tv)
    private val tvLogoBank: ImageView by bind(R.id.logoBank_Iv)

    @SuppressLint("SourceLockedOrientationActivity")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        this.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT

        val namaBank = intent.getStringExtra(EXTRA_NAMA)
        val kodeBank = intent.getStringExtra(EXTRA_KODE_BANK)
        val kodeSwift =  intent.getStringExtra(EXTRA_KODE_SWIFT)
        val alamatBank = intent.getStringExtra(EXTRA_ALAMAT_BANK)
        val noTelpBank = intent.getStringExtra(EXTRA_NO_TELP)
        val webBank = intent.getStringExtra(EXTRA_WEBSITE)
        val logoBank = intent.getIntExtra(EXTRA_LOGO_BANK, 0)

        val actionBar = supportActionBar

        actionBar.run {
            this!!.title = namaBank
            setDisplayHomeAsUpEnabled(true)
        }

        tvKodeBank.text = kodeBank
        tvKodeSwift.text = kodeSwift
        tvAlamatBank.text = alamatBank
        tvNoTelpBank.text = noTelpBank
        tvWebBank.text = webBank
        Glide.with(this)
            .load(logoBank)
            .apply(RequestOptions())
            .into(tvLogoBank)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.setKodeBank_Tv -> {
                copyText(tvKodeBank,"Kode Bank")
                Toast.makeText(this, "Kode bank berhasil di-Copy", Toast.LENGTH_SHORT).show()
            }
            R.id.swiftCode_Tv -> {
                copyText(tvKodeSwift,"Kode Swift")
                Toast.makeText(this, "Kode swift berhasil di-Copy", Toast.LENGTH_SHORT).show()
            }
            R.id.alamatBank_Tv -> {
                copyText(tvAlamatBank,"Alamat Bank")
                Toast.makeText(this, "Alamat bank berhasil di-Copy", Toast.LENGTH_SHORT).show()
            }
            R.id.noTelpBank_Tv -> {
                dialNum(tvNoTelpBank)
            }
            R.id.websiteBank_Tv -> {
                openUrl(tvWebBank)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_NAMA = "extra_name"
        const val EXTRA_KODE_BANK = "extra_kode_bank"
        const val EXTRA_KODE_SWIFT = "extra_kode_swift"
        const val EXTRA_ALAMAT_BANK = "extra_alamat_bank"
        const val EXTRA_NO_TELP = "extra_no_telp"
        const val EXTRA_WEBSITE = "extra_website"
        const val EXTRA_LOGO_BANK = "extra_logo_bank"
    }

    private fun copyText (textToCopy: TextView, labelForData:String){
        val clipBoard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText(labelForData, textToCopy.text)
        clipBoard.setPrimaryClip(clipData)
    }

    private fun dialNum (numToDial: TextView){
        val dialIntent = Intent(Intent.ACTION_DIAL)
        val telNum = numToDial.text as String?
        dialIntent.data = Uri.parse("tel:$telNum")
        startActivity(dialIntent)
    }

    private fun openUrl (urlToOpen: TextView){
        val webIntent = Intent(Intent.ACTION_VIEW)
        webIntent.data = Uri.parse(urlToOpen.text as String?)
        startActivity(webIntent)
    }

}
