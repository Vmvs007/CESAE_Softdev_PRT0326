package com.example.instapet

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.instapet.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.buttonLogin.setOnClickListener {

            var usernameIntroduzido = binding.editUsername.text.toString()
            var passwordIntroduzida = binding.editPassword.text.toString()

            if (usernameIntroduzido.isEmpty() || passwordIntroduzida.isEmpty()) {

                Toast.makeText(
                    applicationContext,
                    "Por favor, preencha todos os dados",
                    Toast.LENGTH_LONG
                ).show()

            } else {

                if (passwordIntroduzida.equals("sardinha")) {
                    // Login correto

                    var i = Intent(this, MainActivity::class.java)

                    i.putExtra("username",usernameIntroduzido)

                    startActivity(i)

                } else {
                    // Login incorreto
                    binding.editPassword.setText("")

                    Toast.makeText(
                        applicationContext,
                        "Login incorreto",
                        Toast.LENGTH_LONG
                    ).show()
                }

            }

        }
    }
}