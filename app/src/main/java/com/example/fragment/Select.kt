package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.activityViewModels
import com.example.fragment.databinding.FragmentRandomBinding
import com.example.fragment.databinding.FragmentSelectBinding

class Select : Fragment() {

    private val dataModel: DataModel by activityViewModels()
    lateinit var binding: FragmentSelectBinding
    var students = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btToRandon.setOnClickListener {
            //onCheckboxClick()
            dataModel.message.value = "!!!"
            dataModel.messageArray.value = students
           // dataModel.messageArray.value = students
         //   childFragmentManager.beginTransaction().replace(R.id.place_holder, binding.btRandom)

        }
        onCheckboxClick(binding.Jaroslav)
        onCheckboxClick(binding.Nikita)
        onCheckboxClick(binding.Marina)
        onCheckboxClick(binding.Anna)
        onCheckboxClick(binding.Egor)
        onCheckboxClick(binding.Andrey)
        onCheckboxClick(binding.Natasha)
        onCheckboxClick(binding.Anton)
        onCheckboxClick(binding.Dima)
        onCheckboxClick(binding.Darina)
        onCheckboxClick(binding.Nadejda)
        onCheckboxClick(binding.AlexanderK)
        onCheckboxClick(binding.Anastasia)
        onCheckboxClick(binding.Stas)
        onCheckboxClick(binding.AlexanderI)
    }
    companion object {
        @JvmStatic
        fun newInstance() = Select()
    }

    private fun onCheckboxClick(checkBox: CheckBox) {
        checkBox.setOnClickListener {
            if (checkBox.isChecked) students.add(checkBox.text.toString())
            else students.remove(checkBox.text.toString())
        }


        /*
        val checkBox = view as CheckBox
        val checked = checkBox.isChecked
        when (view.id) {
            R.id.Jaroslav -> if (checked) {
                students.add("Jaroslav")
            } else {
                students.remove("Jaroslav")
            }
            R.id.Nikita -> if (checked) {
                students.add("Nikita")
            } else {
                students.remove("Nikita")
            }
            R.id.Marina -> if (checked) {
                students.add("Marina")
            } else {
                students.remove("Marina")
            }
            R.id.Anna -> if (checked) {
                students.add("Anna")
            } else {
                students.remove("Anna")
            }
            R.id.Egor -> if (checked) {
                students.add("Egor")
            } else {
                students.remove("Egor")
            }
            R.id.Andrey -> if (checked) {
                students.add("Andrey")
            } else {
                students.remove("Andrey")
            }
            R.id.Natasha -> if (checked) {
                students.add("Natasha")
            } else {
                students.remove("Natasha")
            }
            R.id.Anton -> if (checked) {
                students.add("Anton")
            } else {
                students.remove("Anton")
            }
            R.id.Dima -> if (checked) {
                students.add("Dima")
            } else {
                students.remove("Dima")
            }
            R.id.Darina -> if (checked) {
                students.add("Darina")
            } else {
                students.remove("Darina")
            }
            R.id.Nadejda -> if (checked) {
                students.add("Nadejda")
            } else {
                students.remove("Nadejda")
            }
            R.id.Alexander_K -> if (checked) {
                students.add("Alexander_K")
            } else {
                students.remove("Alexander_K")
            }
            R.id.Anastasia -> if (checked) {
                students.add("Anastasia")
            } else {
                students.remove("Anastasia")
            }
            R.id.Stas -> if (checked) {
                students.add("Stas")
            } else {
                students.remove("Stas")
            }
            R.id.Alexander_I -> if (checked) {
                students.add("Alexander_I")
            } else {
                students.remove("Alexander_I")
            }
        }
        */

    }

}