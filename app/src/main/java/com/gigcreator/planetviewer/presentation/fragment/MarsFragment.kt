package com.gigcreator.planetviewer.presentation.fragment

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.gigcreator.planetviewer.databinding.FragmentMarsBinding
import com.gigcreator.planetviewer.presentation.functions.toast
import com.gigcreator.planetviewer.presentation.viewmodels.MarsViewModel
import com.gigcreator.planetviewer.presentation.rcview.adapter.MarsAdapter
import ru.tinkoff.decoro.MaskImpl
import ru.tinkoff.decoro.parser.UnderscoreDigitSlotsParser
import ru.tinkoff.decoro.watchers.MaskFormatWatcher


class MarsFragment : Fragment() {

    private lateinit var binding: FragmentMarsBinding
    private lateinit var adapter: MarsAdapter
    private val marsModel by viewModels<MarsViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMarsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
        onClick()
    }

    private fun init(){
        MaskFormatWatcher(MaskImpl.createTerminated(UnderscoreDigitSlotsParser().
        parseSlots("____-__-__"))).installOn(binding.marsSearchItem.EditTextDate)

        adapter = MarsAdapter(requireContext(), this@MarsFragment)
        binding.rcView.layoutManager = LinearLayoutManager(requireContext())
        binding.rcView.adapter = adapter
    }

    private fun onClick(){
        binding.marsSearchItem.ButtonSearch.setOnClickListener {
            adapter.clear()
            toast("loading...", requireContext())
            if (!TextUtils.isEmpty(binding.marsSearchItem.EditTextDate.text))
                marsModel.setDate(binding.marsSearchItem.EditTextDate.text.toString())
            marsModel.getMars { it.photos.forEach { photo -> adapter.add(photo) } }
        }
    }
}