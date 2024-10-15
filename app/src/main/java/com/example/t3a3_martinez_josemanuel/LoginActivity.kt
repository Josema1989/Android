package com.example.t3a3_martinez_josemanuel



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    private lateinit var dniInput: TextInputEditText
    private lateinit var passwordInput: TextInputEditText
    private lateinit var dniLayout: TextInputLayout
    private lateinit var passwordLayout: TextInputLayout
    private lateinit var entrarButton: Button
    private lateinit var salirButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        dniInput = findViewById(R.id.dniEditText)
        passwordInput = findViewById(R.id.passwordEditText)
        dniLayout = findViewById(R.id.dniInputLayout)
        passwordLayout = findViewById(R.id.passwordInputLayout)
        entrarButton = findViewById(R.id.entrarButton)
        salirButton = findViewById(R.id.salirButton)

        entrarButton.setOnClickListener {
            val dni = dniInput.text.toString()
            val password = passwordInput.text.toString()

            if (dni.isEmpty()) {
                dniLayout.error = "Por favor, ingresa tu DNI"
            } else {
                dniLayout.error = null
            }

            if (password.isEmpty()) {
                passwordLayout.error = "Por favor, ingresa tu contraseña"
            } else {
                passwordLayout.error = null
            }

            if (dni.isNotEmpty() && password.isNotEmpty()) {
                // Lanzar la actividad de bienvenida
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("DNI", dni)
                startActivity(intent)
            }
        }

        salirButton.setOnClickListener {
            finish() // Sale de la aplicación
        }
    }
}
