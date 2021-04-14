package com.tarun.simplemvvm.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.tarun.simplemvvm.R
import com.tarun.simplemvvm.viewmodel.MainViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.fetchData.observe(viewLifecycleOwner, Observer {
            Log.e("data", "$it+ ")
        })
        viewModel.storeData.observe(viewLifecycleOwner, Observer {
            Log.e("data", "$it+ ")
        })
    }
}