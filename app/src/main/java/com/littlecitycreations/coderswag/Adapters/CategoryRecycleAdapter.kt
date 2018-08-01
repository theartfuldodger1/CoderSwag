package com.littlecitycreations.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.littlecitycreations.coderswag.Model.Category

class CategoryRecycleAdapter(val context : Context, val categories: List<Category>) : RecyclerView.Adapter <CategoryRecycleAdapter.holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: holder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    inner class holder(itemView: View?) : RecyclerView.ViewHolder(itemView)
}