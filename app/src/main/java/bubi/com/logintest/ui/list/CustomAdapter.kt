package bubi.com.logintest.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bubi.com.logintest.R
import bubi.com.logintest.data.CustomData

class CustomAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    private var itemsList = ArrayList<CustomData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CustomViewHolder(layoutInflater.inflate(R.layout.item_custom_data, parent, false))
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bind(itemsList[position])
    }

    override fun getItemCount(): Int =
            itemsList.size

    fun setItems(list: ArrayList<CustomData>) {
        itemsList.addAll(list)
    }
}