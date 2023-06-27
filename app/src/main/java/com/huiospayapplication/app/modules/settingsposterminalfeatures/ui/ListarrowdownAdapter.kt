package com.huiospayapplication.app.modules.settingsposterminalfeatures.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.huiospayapplication.app.R
import com.huiospayapplication.app.databinding.RowListarrowdownBinding
import com.huiospayapplication.app.modules.settingsposterminalfeatures.`data`.model.ListardownRowModel
import kotlin.Int
import kotlin.collections.List

class ListarrowdownAdapter(
  var list: List<ListardownRowModel>
) : RecyclerView.Adapter<ListarrowdownAdapter.RowListarrowdownVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListarrowdownVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listarrowdown,parent,false)
    return RowListarrowdownVH(view)
  }

  override fun onBindViewHolder(holder: RowListarrowdownVH, position: Int) {
    val listardownRowModel = ListardownRowModel()
    // TODO uncomment following line after integration with data source
    // val listardownRowModel = list[position]
    holder.binding.listardownRowModel = listardownRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListardownRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListardownRowModel
    ) {
    }
  }

  inner class RowListarrowdownVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListarrowdownBinding = RowListarrowdownBinding.bind(itemView)
  }
}
