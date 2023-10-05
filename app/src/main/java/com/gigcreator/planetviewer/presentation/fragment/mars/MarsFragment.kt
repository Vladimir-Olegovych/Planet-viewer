package com.gigcreator.planetviewer.presentation.fragment.mars

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.gigcreator.planetviewer.databinding.FragmentMarsBinding
import com.gigcreator.planetviewer.presentation.functions.toast
import com.gigcreator.planetviewer.presentation.fragment.asteroid.rcview.adapter.AsteroidAdapter
import com.gigcreator.planetviewer.presentation.fragment.mars.rcview.adapter.MarsAdapter
import dagger.hilt.android.AndroidEntryPoint
import ru.tinkoff.decoro.MaskImpl
import ru.tinkoff.decoro.parser.UnderscoreDigitSlotsParser
import ru.tinkoff.decoro.watchers.MaskFormatWatcher

@AndroidEntryPoint
class MarsFragment : Fragment() {

    private lateinit var binding: FragmentMarsBinding
    private lateinit var adapter: MarsAdapter
    private val marsViewModel: MarsViewModel by viewModels()

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
        binding.marsSearchItem.ButtonSearch.setOnClickListener {
            adapter.clear()
            if (!TextUtils.isEmpty(binding.marsSearchItem.EditTextDate.text)){
                toast("loading...", requireContext())
                marsViewModel.getMars(binding.marsSearchItem.EditTextDate.text.toString())
            }
        }
    }

    private fun init(){
        MaskFormatWatcher(MaskImpl.createTerminated(UnderscoreDigitSlotsParser().
        parseSlots("____-__-__"))).installOn(binding.marsSearchItem.EditTextDate)

        adapter = MarsAdapter(requireContext())
        binding.rcView.layoutManager = LinearLayoutManager(requireContext())
        binding.rcView.adapter = adapter

        marsViewModel.resultLiveData.observe(this, Observer {
            it.photos.forEach { photo -> adapter.add(photo) }
        })

    }
}