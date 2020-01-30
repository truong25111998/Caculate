package com.t3h.duoihinhbatchu

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.caculate.*

class CaculateActivity : AppCompatActivity(), View.OnClickListener {


    override fun onClick(p0: View?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.caculate)
        caculate()
    }
    public fun caculate(){
        btncong.setOnClickListener{
            var sothu1: Int = (et1.text.toString()).toInt()
            var sothu2: Int = (et2.text.toString()).toInt()
            var ketqua: Int = sothu1 + sothu2
            tvketqua.text = ketqua.toString()
        }
        btntru.setOnClickListener{
            var sothu1: Int = (et1.text.toString()).toInt()
            var sothu2: Int = (et2.text.toString()).toInt()
            var ketqua: Int = sothu1 - sothu2
            tvketqua.text = ketqua.toString()
        }
        btnnhan.setOnClickListener{
            var sothu1: Int = (et1.text.toString()).toInt()
            var sothu2: Int = (et2.text.toString()).toInt()
            var ketqua: Int = sothu1 * sothu2
            tvketqua.text = ketqua.toString()
        }
        btnchia.setOnClickListener{
            var sothu1: Int = (et1.text.toString()).toInt()
            var sothu2: Int = (et2.text.toString()).toInt()
            var ketqua: Int = sothu1 / sothu2
            tvketqua.text = ketqua.toString()
        }
    }


}