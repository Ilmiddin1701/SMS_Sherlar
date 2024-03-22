package com.example.smssherlar.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smssherlar.R
import com.example.smssherlar.databinding.ItemRv1Binding
import com.example.smssherlar.models.Data1

class Adapter1(var rvAction: RvAction,var list: ArrayList<Data1> = ArrayList()): RecyclerView.Adapter<Adapter1.Vh>() {

    inner class Vh(var itemRv1Binding: ItemRv1Binding) : RecyclerView.ViewHolder(itemRv1Binding.root) {
        fun onBinding(data1: Data1, position: Int) {
            itemRv1Binding.tvTitle1.text = data1.tvTitle1
            if (data1.like3==false){
                itemRv1Binding.like.setImageResource(R.drawable.ic_like3)
            }else{
                itemRv1Binding.like.setImageResource(R.drawable.ic_like2)
            }
            itemRv1Binding.tvAbout.text = data1.tvAbout

            itemRv1Binding.root.setOnClickListener {
                rvAction.itemClick(data1, position)
            }
            itemRv1Binding.like.setOnClickListener {
                rvAction.likeClick(data1,position)
                if (data1.like3==false){
                    itemRv1Binding.like.setImageResource(R.drawable.ic_like2)
                    data1.like3 = true
                }else{
                    itemRv1Binding.like.setImageResource(R.drawable.ic_like3)
                    data1.like3 = false
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRv1Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBinding(list[position], position)
    }

    interface RvAction{
        fun itemClick(data1: Data1, position: Int)
        fun likeClick(data1: Data1, position: Int)
    }
}