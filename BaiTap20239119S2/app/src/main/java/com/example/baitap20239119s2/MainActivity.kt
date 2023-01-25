package com.example.baitap20239119s2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ds = mutableListOf<OutData>()
        ds.add(OutData(R.drawable.anh_a,"siêu nhân Gao 1","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_b,"siêu nhân Gao 2","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_c,"siêu nhân Gao 3","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_d,"siêu nhân Gao 4","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_a,"siêu nhân Gao 1","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_b,"siêu nhân Gao 2","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_c,"siêu nhân Gao 3","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_d,"siêu nhân Gao 4","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_a,"siêu nhân Gao 1","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_b,"siêu nhân Gao 2","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_c,"siêu nhân Gao 3","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_d,"siêu nhân Gao 4","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_a,"siêu nhân Gao 1","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_b,"siêu nhân Gao 2","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_c,"siêu nhân Gao 3","Phim Nhật"))
        ds.add(OutData(R.drawable.anh_d,"siêu nhân Gao 4","Phim Nhật"))

        val adaptervv = RvAdapter(ds)
        rvDemo.adapter=adaptervv
        rvDemo.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,false
        )
    }
}