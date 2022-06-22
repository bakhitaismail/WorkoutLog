package dev.bakhita.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.bakhita.workoutlog.databinding.ActivityLogInBinding

class LogInActivity : AppCompatActivity() {
       lateinit var binding:ActivityLogInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLogInBinding.inflate(layoutInflater)   //used binding
        setContentView(binding.root)


        binding.tvSignup.setOnClickListener {
            val intent= Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.btnLogin.setOnClickListener {
            validateLogin()
                val intent= Intent(this,HomeActivity::class.java)
                startActivity(intent)

        }
    }
    fun validateLogin(){
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()

        if (email.isBlank()){
            binding.tilEmail.error=getString(R.string.email_is_required)
        }

        if (password.isBlank()){
            binding.tilPassword.error=getString(R.string.password_is_required)
        }

    }

}