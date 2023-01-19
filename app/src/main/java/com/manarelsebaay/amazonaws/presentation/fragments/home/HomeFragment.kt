package com.manarelsebaay13.amazonaws.presentation.fragments.home

import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.manarelsebaay13.amazonaws.R
import com.manarelsebaay13.amazonaws.core.utils.Resource
import com.manarelsebaay13.amazonaws.databinding.HomeFragmentBinding
import com.manarelsebaay13.amazonaws.domain.model.Product
import com.manarelsebaay13.amazonaws.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding>() {

    private val viewModel: HomeViewModel by viewModels()
    private lateinit var productsAdapter: ProductsAdapter

        override
        fun getLayoutId() = R.layout.home_fragment

        override
        fun setBindingVariables() {
            binding.viewModel = viewModel
            binding.homeList.baseViewModel = viewModel
        }

        override
        fun setUpViews() { setUpProductsRecyclerView() }

        private fun setUpProductsRecyclerView() {
            productsAdapter = ProductsAdapter { onProductClicked(it) }
            binding.homeList.recyclerView.apply {
                setHasFixedSize(true)
                val productslayoutManager: LinearLayoutManager? = GridLayoutManager(this.context, 2 )
                layoutManager=productslayoutManager
                adapter = productsAdapter
            }
        }

        override
        fun setupObservers() {
                viewModel.productInfoListState().observe(viewLifecycleOwner, { productsInfoListState -> refreshState(productsInfoListState) })
                viewModel.onLoad()
        }

    private fun refreshState(photoInfoListState: Resource<List<Product>>) {
        when (photoInfoListState) {
            is Resource.Loading -> {
                binding.homeList.spinkitProgress.visibility = View.VISIBLE
                binding.homeList.recyclerView.visibility=View.GONE
                binding.homeList.noDataLayout.visibility=View.GONE
            }
            is Resource.Success -> {
                binding.homeList.noDataLayout.visibility=View.GONE
                binding.homeList.spinkitProgress.visibility = View.GONE
                binding.homeList.recyclerView.visibility=View.VISIBLE
                productsAdapter.submitList(photoInfoListState.data)
            }
            is Resource.Error -> {
                binding.homeList.spinkitProgress.visibility = View.GONE
                binding.homeList.noDataLayout.visibility=View.VISIBLE
                Toast.makeText(context, photoInfoListState.message, Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun onProductClicked(product: Product) {
        val action = HomeFragmentDirections.actionProductsFragmentToProductDetailsFragment(product)
        view?.findNavController()?.navigate(action)
    }
}