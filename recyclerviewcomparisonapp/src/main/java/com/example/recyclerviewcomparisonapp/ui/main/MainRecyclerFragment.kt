package com.example.recyclerviewcomparisonapp.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recyclerviewcomparisonapp.R

class MainRecyclerFragment : Fragment() {

    companion object {
        fun newInstance() = MainRecyclerFragment()
    }

    private lateinit var viewModel: MainRecyclerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainRecyclerViewModel::class.java)
        // TODO: Use the ViewModel
    }
}