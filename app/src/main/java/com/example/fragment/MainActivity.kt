package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.constraintlayout.widget.ConstraintSet.GONE
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val dataModel: DataModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btRandom.setOnClickListener {
            openFrag( Random(), binding.btRandom, binding.btSelect, binding.tvRandom, binding.tvSelect)
        }
        binding.btSelect.setOnClickListener {
            openFrag(Select(), binding.btSelect, binding.btRandom, binding.tvSelect, binding.tvRandom)
        }
        openFrag(Select(), binding.btSelect, binding.btRandom, binding.tvSelect, binding.tvRandom)
        dataModel.message.observe(this, {})

        dataModel.messageArray.observe(this,{})
    }
    private fun openFrag(f: Fragment, b1: Button, b2: Button, tv1: TextView, tv2: TextView){
        supportFragmentManager.beginTransaction().replace(R.id.place_holder, f).commit()
        b1.visibility = View.GONE
        b2.visibility = View.VISIBLE
        tv1.visibility = View.GONE
        tv2.visibility = View.VISIBLE

    }
}