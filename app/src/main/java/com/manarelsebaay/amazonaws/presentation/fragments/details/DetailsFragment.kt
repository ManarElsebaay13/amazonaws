package com.manarelsebaay13.amazonaws.presentation.fragments.details

import androidx.navigation.fragment.navArgs
import coil.load
import com.manarelsebaay13.amazonaws.R
import com.manarelsebaay13.amazonaws.core.utils.backToPreviousScreen
import com.manarelsebaay13.amazonaws.databinding.DetailsFragmentBinding
import com.manarelsebaay13.amazonaws.domain.model.Product
import com.manarelsebaay13.amazonaws.presentation.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : BaseFragment<DetailsFragmentBinding>() {

    private lateinit var product: Product

    override fun getLayoutId() = R.layout.details_fragment

    override
    fun getFragmentArguments() {
        val args: DetailsFragmentArgs by navArgs()
        product = args.product
    }

    override
    fun setUpViews() {
        setUpToolbar()
        setProductDetails()
    }

    private fun setUpToolbar() {
        binding.includedToolbar.toolbarTitle.text = this.getText(R.string.product_details)
        binding.includedToolbar.backIv.setOnClickListener { backToPreviousScreen() }
    }

    private fun setProductDetails() {
        binding.product = product
        binding.imgIV.load(product.imageUrls[0])

    }
}