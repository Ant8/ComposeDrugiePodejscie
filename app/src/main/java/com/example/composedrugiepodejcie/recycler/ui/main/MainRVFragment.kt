package com.example.composedrugiepodejcie.recycler.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.composedrugiepodejcie.R
import com.example.composedrugiepodejcie.SampleData.conversationSample
import com.example.composedrugiepodejcie.databinding.MainFragmentBinding

class MainRVFragment : Fragment() {

    companion object {
        fun newInstance() = MainRVFragment()
    }

    private lateinit var viewModel: MainRVViewModel
    private var viewBinding: MainFragmentBinding? = null
    private val adapter = MainRVAdapter(conversationSample)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View =
        MainFragmentBinding.inflate(inflater, container, false)
            .apply { viewBinding = this }
            .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding?.listView?.adapter = adapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainRVViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onDestroyView() {
        super.onDestroyView()

        viewBinding = null
    }
}