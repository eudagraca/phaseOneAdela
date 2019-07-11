package mz.co.phaseoneadela

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_profile.*

class MyProfile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_profile)

        track.text = "Android"
        phoneNumber.text = "+258 845395142"
        email.text = "euclidiodagraca@gmail.com"
        country.text = "Mozambique"
        nickname.text = "euclidio-venancio"
    }
}
