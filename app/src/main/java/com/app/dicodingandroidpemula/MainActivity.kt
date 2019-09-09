package com.app.dicodingandroidpemula

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var mydata = arrayListOf<dataschemarecycler>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recylerview.layoutManager = GridLayoutManager(this, 1) as RecyclerView.LayoutManager?
        ShowData()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menumain, menu) //your file name
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menuProfile -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun ShowData(){
        mydata.add(dataschemarecycler("http://www.indomie.com/Content/Product/indomie-goreng-spesial_big.png", "Indomie Rasa Goreng","Rp.2500","100 Unit","Produk terpopuler dari brand Indomie, Indomie Goreng pertama diluncurkan pada tahun 1982 dan telah merambah banyak negara termasuk Amerika Serikat, Australia, Inggris, Timur Tengah dan China. Jangan lewatkan berbagai pilihan rasa yang ditawarkan, Indomie Goreng memang yang paling komplit!"))
        mydata.add(dataschemarecycler("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/1/13/0/0_1841467b-297b-4c43-84ef-79c3b71e0089_600_600.jpg", "Indomie Rasa Soto","Rp.2300","300 Unit","Indomie kuah merupakan salah satu varian yang rasanya khusus diambil dari bumbu-bumbu makanan khas Indonesia. Perpaduan antara mi, kuah dan bumbu otentik makanan khas Indonesia menjadikan Indomie kuah makanan yang sangat spesial apalagi bila disajikan dikala cuaca dingin atau hujan"))
        mydata.add(dataschemarecycler("https://cdn.kmall.id/media/catalog/product/cache/c687aa7517cf01e65c009f6943c2b1e9/i/n/indomie_kari_ayam_72g.jpg", "Indomie Rasa Kari Ayam","Rp.2300","200 Unit","Terinspirasi dari cita rasa khas kuliner lokal Indonesia asal Padang dan Lamongan, Indomie kini hadir dengan Indomie Goreng rasa Dendeng Balado dan Indomie rasa Soto Lamongan. Aroma yang khas dan topping ekstra lezat yang unik, suguhkan rasa asli kuliner khas yang ngegigit!"))
        mydata.add(dataschemarecycler("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/9/21/2193324/2193324_7f8edaa0-9d9b-467e-ad3c-b7175d26afee_300_300.jpg", "Indomie Rasa Goreng Jumbo","Rp.5500","400 Unit","Untuk mereka yang menganggap 1 porsi terlalu sedikit, varian ini hadir dengan porsi yang lebih besar dengan rasa Indomie Goreng yang otentik."))
        mydata.add(dataschemarecycler("https://s2.bukalapak.com/img/2593575181/w-1000/Indomie_Rasa_Coto_Makassar_Per_Dus__isi_40_pcs__Mie_Instant_.jpg", "Indomie Rasa Coto Makasar","Rp.2350","100 Unit","Indomie kuah merupakan salah satu varian yang rasanya khusus diambil dari bumbu-bumbu makanan khas Indonesia. Perpaduan antara mi, kuah dan bumbu otentik makanan khas Indonesia menjadikan Indomie kuah makanan yang sangat spesial apalagi bila disajikan dikala cuaca dingin atau hujan"))
        mydata.add(dataschemarecycler("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/9/3/3611450/3611450_52e08a01-7349-4971-bbec-938de32dd7dc_384_384.jpg", "Indomie Rasa Soto Padang","Rp.2700","100 Unit","Sebagai mi instan asli Indonesia, Varian Indomie Selera Nusantara hadir dengan rasa-rasa terpopuler dari berbagai makanan khas Indonesia. Melalui varian ini, Indomie memperkenalkan varian ini sebagai wisata kuliner Indonesia."))
        mydata.add(dataschemarecycler("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/9/28/3193480/3193480_0a4c2665-3f5e-43ed-8e1d-3d859e789d26_373_373.jpg", "Indomie Rasa Ayam Panggang","Rp.2700","100 Unit","Produk terpopuler dari brand Indomie, Indomie Goreng pertama diluncurkan pada tahun 1982 dan telah merambah banyak negara termasuk Amerika Serikat, Australia, Inggris, Timur Tengah dan China. Jangan lewatkan berbagai pilihan rasa yang ditawarkan, Indomie Goreng memang yang paling komplit!"))
        mydata.add(dataschemarecycler("https://ecs7.tokopedia.net/img/cache/700/product-1/2018/8/22/1316276/1316276_ac279517-efa5-4d1c-b6ce-7660db32320e_373_373.jpg", "Indomie Rasa Rendang","Rp.2600","100 Unit","Produk terpopuler dari brand Indomie, Indomie Goreng pertama diluncurkan pada tahun 1982 dan telah merambah banyak negara termasuk Amerika Serikat, Australia, Inggris, Timur Tengah dan China. Jangan lewatkan berbagai pilihan rasa yang ditawarkan, Indomie Goreng memang yang paling komplit!"))
        mydata.add(dataschemarecycler("http://www.indomie.com/Content/Product/indomie-rasa-baso-sapi_big.png", "Indomie Rasa Baso Sapi","Rp.2500","100 Unit","Indomie kuah merupakan salah satu varian yang rasanya khusus diambil dari bumbu-bumbu makanan khas Indonesia. Perpaduan antara mi, kuah dan bumbu otentik makanan khas Indonesia menjadikan Indomie kuah makanan yang sangat spesial apalagi bila disajikan dikala cuaca dingin atau hujan"))
        mydata.add(dataschemarecycler("https://ecs7.tokopedia.net/img/product-1/2019/1/19/45633585/45633585_58bfd018-40fc-4bc3-acc8-a8082b63d732_436_373.png", "Indomie Rasa Ayam Spesial","Rp.2900","100 Unit","Sebagai mi instan asli Indonesia, Varian Indomie Selera Nusantara hadir dengan rasa-rasa terpopuler dari berbagai makanan khas Indonesia. Melalui varian ini, Indomie memperkenalkan varian ini sebagai wisata kuliner Indonesia."))
        recylerview.adapter = RecylerAdapter(mydata, this)
    }

    class RecylerAdapter(private val dataList: ArrayList<dataschemarecycler>, val context: Context) : RecyclerView.Adapter<RecylerAdapter.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return ViewHolder(
                LayoutInflater.from(context).inflate(
                    R.layout.card_recyler,
                    parent,
                    false
                )
            )
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.bindItems(context,dataList[position])
        }
        override fun getItemCount(): Int {
            return dataList.size
        }
        class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bindItems(context: Context, dataitem: dataschemarecycler) {
                val lblitem1 = itemView.findViewById<TextView>(R.id.lblitem1)
                val lblitem2 = itemView.findViewById<TextView>(R.id.lblitem2)
                val imgItem = itemView.findViewById<ImageView>(R.id.imgHolder)
                lblitem1.text = dataitem.namaproduk
                lblitem2.text = dataitem.hargaproduk
                Glide.with(context).load(dataitem.urlproduk).into(imgItem)

                itemView.setOnClickListener {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("urlproduk",dataitem.urlproduk)
                    intent.putExtra("namaproduk",dataitem.namaproduk)
                    intent.putExtra("hargaproduk",dataitem.hargaproduk)
                    intent.putExtra("stockproduk",dataitem.stockproduk)
                    intent.putExtra("deskripsiproduk",dataitem.deskripsiproduk)
                    context.startActivity(intent)
                }
            }
        }
    }

    class dataschemarecycler{
        var urlproduk =""
        var namaproduk =""
        var hargaproduk =""
        var stockproduk =""
        var deskripsiproduk =""
        constructor(urlproduk:String,namaproduk:String,hargaproduk:String,stockproduk:String,deskripsiproduk:String){
            this.urlproduk=urlproduk
            this.namaproduk=namaproduk
            this.hargaproduk=hargaproduk
            this.stockproduk=stockproduk
            this.deskripsiproduk=deskripsiproduk
        }
    }

}
