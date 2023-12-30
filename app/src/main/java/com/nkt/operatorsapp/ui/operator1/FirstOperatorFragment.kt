package com.nkt.operatorsapp.ui.operator1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.nkt.operatorsapp.MainActivity
import com.nkt.operatorsapp.R
import com.nkt.operatorsapp.databinding.FragmentFirstOperatorBinding


class FirstOperatorFragment : Fragment() {

    private lateinit var binding: FragmentFirstOperatorBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)

        (requireActivity() as MainActivity).binding.topAppBar.setTitle(R.string.operator_1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_first_operator, container, false)
        binding = FragmentFirstOperatorBinding.bind(view)

        return binding.root
    }

}