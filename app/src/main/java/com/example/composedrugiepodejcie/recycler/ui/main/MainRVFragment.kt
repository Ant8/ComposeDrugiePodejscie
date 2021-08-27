package com.example.composedrugiepodejcie.recycler.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.composedrugiepodejcie.R

class MainRVFragment : Fragment() {

    companion object {
        fun newInstance() = MainRVFragment()
    }

    private lateinit var viewModel: MainRVViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View = inflater.inflate(R.layout.main_fragment, container, false)

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainRVViewModel::class.java)
        // TODO: Use the ViewModel
    }
}