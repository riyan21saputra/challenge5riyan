package id.co.riyan.challenge5riyan

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity () {
    lateinit var ivSingle: ImageView
    lateinit var ivCpu: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val layoutRoot = findViewById<ConstraintLayout>(R.id.layout_root)

        val namaUser = intent.getStringExtra("DATA_USER_NAME")

        Snackbar.make(layoutRoot, "Selamat bertanding $namaUser", Snackbar.LENGTH_LONG).show()

        ivSingle = findViewById(R.id.iv_single)
        ivCpu = findViewById(R.id.iv_cpu)

        Snackbar.make(ivSingle, "Selamat Datang ke Permainan Suit", Snackbar.LENGTH_SHORT).show()

        ivSingle.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
        ivCpu.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }


    }
}





