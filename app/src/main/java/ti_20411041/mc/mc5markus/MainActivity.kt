package ti_20411041.mc.mc5markus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENTS"
    }

    private var ZooList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        ZooList = ArrayList()


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ZooAdapter(this, ZooList) {
            val intent = Intent(this, DetailZoo::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

        prepareZooListData()
    }

    private fun prepareZooListData() {
        var zoo = DataModel(
            R.drawable.cenderawasih1,
            "Cenderawasih",
            "Burung Cenderawasih adalah anggota famili Paradisaeidae dari ordo Passeriformes. Cenderawasih biasanya ditemukan di Indonesia seperti di bagian Timur Papua,"+
                    "Papua Nugini, pulau-pulau selat Torres, dan Australia timur."
        )
        ZooList.add(zoo)

        zoo = DataModel(
            R.drawable.kangroo2,
            "Kangguru pohon",
            "Kanguru Pohon Goodfellow memiliki nama latin Dendrolagus goodfellowi. Binatang unik ini dalam bahasa Inggris dikenal dengan nama Goodfellow's tree-kangaroo atau ornate tree-kangaroo."+
                    "Nama kanguru ini diambil dari nama seorang kolektor zoological berkebangsaan Inggris yang bernama Walter Goodfellow. "
        )
        ZooList.add(zoo)

        zoo = DataModel(
            R.drawable.kasuari3,
            "Kasuari",
            "Kasuari adalah salah satu dari dua genus burung di dalam suku Casuariidae. Genus ini terdiri dari tiga spesies kasuari yang berukuran sangat besar dan tidak dapat terbang.\n" +
                    "\n" +
                    "Kasuari adalah ratites atau burung yang memiliki tulang dada datar dan tidak dapat terbang, berasal dari hutan tropis Australia dan Asia Tenggara. Penampilan burung ini mencolok, memiliki bulu yang keras dan tajam di ujungnya, wajah biru yang cerah, sepasang lipatan kulit merah, yang dikenal sebagai pial yang tergantung di lehernya dan helm (atau pelindung kepala) yang menonjol di atas kepalanya."
        )
        ZooList.add(zoo)
    }
}