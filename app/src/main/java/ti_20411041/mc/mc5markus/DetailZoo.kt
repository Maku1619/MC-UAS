package ti_20411041.mc.mc5markus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

@Suppress("DEPRECATION")
class DetailZoo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_detail_zoo)

        val detail = intent.getParcelableExtra<DataModel>(MainActivity.INTENT_PARCELABLE)

        val img = findViewById<ImageView>(R.id.d_img)
        val title = findViewById<TextView>(R.id.d_title)
        val dec = findViewById<TextView>(R.id.d_dec)

        img.setImageResource(detail!!.img)
        title.text = detail.title
        dec.text = detail.dec

        val back = findViewById<ImageView>(R.id.kembali)
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}