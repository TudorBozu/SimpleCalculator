package com.example.calculatorsimple

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculatorsimple.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.butDel1.setOnClickListener {
            binding.input.text=" "
            binding.out.text = " "
        }
        binding.butDel2.setOnClickListener {
            binding.input.text=" "
        }
        binding.but0.setOnClickListener {
            binding.input.append("0")
        }
        binding.but1.setOnClickListener {
            binding.input.append("1")
        }
        binding.but2.setOnClickListener {
            binding.input.append("2")
        }
        binding.but3.setOnClickListener {
            binding.input.append("3")
        }
        binding.but4.setOnClickListener {
            binding.input.append("4")
        }
        binding.but5.setOnClickListener {
            binding.input.append("5")
        }
        binding.but6.setOnClickListener {
            binding.input.append("6")
        }
        binding.but7.setOnClickListener {
            binding.input.append("7")
        }
        binding.but8.setOnClickListener {
            binding.input.append("8")
        }
        binding.but9.setOnClickListener {
            binding.input.append("9")
        }
        binding.butPlus.setOnClickListener {
            binding.input.append("+")
        }
        binding.butSca.setOnClickListener {
            binding.input.append("-")
        }
        binding.butImu.setOnClickListener {
            binding.input.append("*")
        }
        binding.butInp.setOnClickListener {
            binding.input.append("/")
        }
        binding.butPro.setOnClickListener {
            binding.input.append("%")
        }
        binding.butPunct.setOnClickListener {
            binding.input.append(".")
        }
        binding.butEgal.setOnClickListener {
            val expression=ExpressionBuilder(binding.input.text.toString()).build()
            val result = expression.evaluate()
            val longresult=result.toLong()
            if(result== longresult.toDouble()){
               binding.out.text=longresult.toString()
            }else{
               binding.out.text=result.toString()

            }

        }
    }

}