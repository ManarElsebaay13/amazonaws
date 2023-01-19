package com.manarelsebaay13.amazonaws.presentation.fragments.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.google.android.material.imageview.ShapeableImageView
import com.manarelsebaay13.amazonaws.R
import com.manarelsebaay13.amazonaws.databinding.ItemProductBinding
import com.manarelsebaay13.amazonaws.domain.model.Product

class ProductsAdapter(
  private var itemClick: ((item: Product) -> Unit)
) : ListAdapter<Product, ProductsAdapter.ViewHolder>(DIFF_CALLBACK) {

  companion object {
    private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Product>() {
      override
      fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean =
        oldItem.uid == newItem.uid
      override
      fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean =
        oldItem == newItem
    }
  }

  override
  fun onCreateViewHolder(
    parent: ViewGroup,
    viewType: Int
  ): ViewHolder {
    val binding: ItemProductBinding =
      DataBindingUtil.inflate(
        LayoutInflater.from(parent.context),
        R.layout.item_product,
        parent,
        false
      )
    return ViewHolder(binding)
  }

  override
  fun onBindViewHolder(holder: ViewHolder, position: Int) { holder.bind(getItem(position)) }

  inner class ViewHolder(private val itemBinding: ItemProductBinding) : RecyclerView.ViewHolder(itemBinding.root) {
    private lateinit var currentItem: Product
    private val img: ShapeableImageView=itemView.findViewById(R.id.img_IV)

    init {
      itemBinding.productItem.setOnClickListener {
        itemClick.invoke(currentItem)
      }
    }

    fun bind(item: Product) {
      currentItem = item
      itemBinding.item = currentItem
      img.load(currentItem.imageUrlsThumbnails[0])

    }
  }
}