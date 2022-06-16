package id.co.riyan.challenge5riyan

import android.app.GameManager
import android.content.Intent
import android.os.Bundle
import android.text.Layout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class HomeActivity : AppCompatActivity () {
    lateinit var ivSingle : ImageView
    lateinit var ivcpu : ImageView
    lateinit var tv_single : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        ivSingle = findViewById(R.id.iv_single)
        ivcpu   = findViewById(R.id.iv_cpu)
        tv_single =findViewById(R.id.tv_single)
        tv_single =findViewById(R.id.tv_cpu)

        ivSingle.setOnClickListener {
            startActivity(Intent(this, GameActivity ::class.java))
        }
        ivcpu.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }

        val txtWelcome1 = findViewById<TextView>(R.id.tv_single)
        val txtWelcome2 = findViewById<TextView>(R.id.tv_cpu)

        val layoutRoot = findViewById<ConstraintLayout>(R.id.layout_root)

        val namaUser = intent.getStringExtra("DATA_USER_NAME")

        txtWelcome1.text= " $namaUser Vs Pemain"
        txtWelcome2.text= " $namaUser Vs Computer"


        Snackbar.make(layoutRoot, "Selamat Datang  $namaUser", Snackbar.LENGTH_LONG)
            .setAction("Tutup", ){
                Toast.makeText(this,"Toast Dari Action",
                    Toast.LENGTH_LONG).show()
            }.show()

    }
}





