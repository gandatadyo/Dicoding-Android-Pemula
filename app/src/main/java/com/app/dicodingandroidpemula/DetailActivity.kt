package com.app.dicodingandroidpemula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.annotation.GlideType
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Glide.with(this).load(intent.getStringExtra("urlproduk")).into(imgDetail)
        lblNameProduct.text =intent.getStringExtra("namaproduk")
        lblPriceProduct.text =intent.getStringExtra("hargaproduk")
        lblQtyProduct.text = "Stock : " + intent.getStringExtra("stockproduk") + " /Pcs"
        lblDescriptionProduct.text =intent.getStringExtra("deskripsiproduk")
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return if (item?.itemId == android.R.id.home) {
            finish()
            true
        } else {
            super.onOptionsItemSelected(item)
        }
    }
}
