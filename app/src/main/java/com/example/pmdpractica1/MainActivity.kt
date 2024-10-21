package com.example.pmdpractica1


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pmdpractica1.databinding.ActivityMainBinding
import operacion.Operaciones

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            accionbotonClick()
        }
    }

    private fun accionbotonClick() {
        val buttonText = binding.button.text.toString()
        if (buttonText == getString(R.string.btcomprobar)) {
            try {
                val number = binding.editTextNumber.text.toString().toInt()
                if (Operaciones.isPrimeNumber(number)) {
                    binding.textView.text = getString(R.string.primo)
                } else {
                    binding.textView.text = getString(R.string.noprimo)
                }
                binding.button.text = getString(R.string.btreiniciar)
            } catch (e: Exception) {
                binding.textView.text = getString(R.string.noprimo)
                binding.button.text = getString(R.string.btreiniciar)
            }
        } else {
            binding.textView.text = getString(R.string.etintroprimo)
            binding.button.text = getString(R.string.btcomprobar)
            binding.editTextNumber.setText("")
        }
    }
}
