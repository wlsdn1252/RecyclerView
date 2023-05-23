package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view.view.*

class Adapter(private val items: ArrayList<Data>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    // 아이템의 개수 정의
    override fun getItemCount(): Int = items.size

    // 항목 뷰에 데이터 연결
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {

        val item = items[position]
        val listener = View.OnClickListener { it ->
            Toast.makeText(it.context, "Clicked -> ID : ${item.mediName}, Name : ${item.textVal}", Toast.LENGTH_SHORT).show()
        }
        holder.apply {
            bind(listener, item)
            itemView.tag = item
        }
    }

    // 항목에 사용할 View를 생성하고 ViewHolder를 반환
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(inflatedView)
    }

    // 각 항목에 필요한 기능을 구현
    class ViewHolder(v:View): RecyclerView.ViewHolder(v){
        private var view: View = v
        fun bind(listener:View.OnClickListener, item:Data){
            view.mainPageMedi.text = item.mediName
            view.text1_1.text = item. textVal
            view.setOnClickListener(listener)
        }
    }

}