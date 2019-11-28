package bubi.com.logintest.ui.list

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import bubi.com.logintest.R
import bubi.com.logintest.data.CustomData
import org.jetbrains.annotations.NotNull

class CustomViewHolder(@NotNull itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: CustomData) = with(itemView) {
        with(itemView.findViewById<TextView>(R.id.title_text_view)) {
            text = item.title
        }
        with(itemView.findViewById<TextView>(R.id.description_text_view)) {
            text = item.description
        }
    }
}