package dev.bakhita.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.bakhita.workoutlog.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvLogin.setOnClickListener {
            val intent= Intent(this,LogInActivity::class.java)
            startActivity(intent)
        }

        binding.btnSignup.setOnClickListener {
            validateLogin()

        }
    }
    fun validateLogin(){
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()
        var firstname = binding.etFirstname.text.toString()
        var lastname = binding.etLastname.text.toString()
        var confirm = binding.etConfirm.text.toString()
        if (email.isBlank()){
            binding.tilEmail.error=getString(R.string.email_required)
        }

        if (password.isBlank()){
            binding.tilPassword.error=getString(R.string.password_required)
        }

        if (firstname.isBlank()){
            binding.tilFirstname.error=getString(R.string.first_name_is_required)
        }

        if (lastname.isBlank()){
            binding.tilLastname.error=getString(R.string.last_name_is_required)
        }

        if (confirm.isBlank()){
            binding.tilConfirm.error=getString(R.string.confirm_password)
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilEmail.error=getString(R.string.email_is_invalid)
        }
        else{
            binding.tilConfirm.error=getString(R.string.password_mismatch)
        }

    }

}