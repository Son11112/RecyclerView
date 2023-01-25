package com.example.baitap20239119s2


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*

class RvAdapter(var ds:List<OutData>):RecyclerView.Adapter<RvAdapter.PhimView>(){
    inner class PhimView(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhimView {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)
        return PhimView(view)
    }

    override fun onBindViewHolder(holder: PhimView, position: Int) {
        holder.itemView.apply {
            txtMieuTa.text = ds[position].mieuta
            txtTenPhim.text = ds[position].tenphim
            imgPhim.setImageResource(ds[position].image)
        }
    }

    override fun getItemCount(): Int {
        return  ds.size
    }
}