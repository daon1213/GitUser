package org.techtown.gituserinfo


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.zip.Inflater
import org.techtown.gituserinfo.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    private val mbinding by lazy { ActivityInfoBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mbinding.root)

        mbinding.btn.setOnClickListener {
            User.id = mbinding.inputid.text.toString()
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}

