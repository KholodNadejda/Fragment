package com.example.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.LifecycleOwner
import com.example.fragment.databinding.FragmentRandomBinding

class Random : Fragment() {

    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentRandomBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentRandomBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dataModel.message.observe(activity as LifecycleOwner) {
            //binding.tvPerson.text = it
        }
        binding.tvPerson.text = "Push the button"
        binding.btChoise.setOnClickListener {
            randomStd()
        }
    }

    private fun randomStd(){
        dataModel.messageArray.observe(activity as LifecycleOwner) {
            // Log.d("MyLog", it.toString())
            binding.tvPerson.text = it[kotlin.random.Random.nextInt(it.size)]
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = Random()
    }
}