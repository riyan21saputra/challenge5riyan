package id.co.riyan.challenge5riyan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitysplash)

        Handler(Looper.getMainLooper()).postDelayed( {
            val intentRadio = Intent(this@SplashActivity, MainActivity::class.java)

            startActivity(intentRadio)
    },1000)
}
}