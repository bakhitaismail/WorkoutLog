package dev.bakhita.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var tilFirstname: TextInputLayout
    lateinit var etFirstname: TextInputEditText
    lateinit var tilLastname: TextInputLayout
    lateinit var etLastname: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var tilConfirm: TextInputLayout
    lateinit var etConfirm: TextInputEditText
    lateinit var btnSignup: Button
    lateinit var tvLogin: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        tilFirstname =findViewById(R.id.tilFirstname)
        etFirstname = findViewById(R.id.etFirstname)
        tilLastname= findViewById(R.id.tilLastname)
        etLastname= findViewById(R.id.etLastname)
        tilEmail= findViewById(R.id.tilEmail)
        etEmail= findViewById(R.id.etEmail)
        tilPassword= findViewById(R.id.tilPassword)
        etPassword= findViewById(R.id.etPassword)
        tilConfirm= findViewById(R.id.tilConfirm)
        etConfirm= findViewById(R.id.etConfirm)
        btnSignup= findViewById(R.id.btnSignup)
        tvLogin= findViewById(R.id.tvLogin)

        tvLogin.setOnClickListener {
            val intent= Intent(this,LogInActivity::class.java)
            startActivity(intent)
        }

        btnSignup.setOnClickListener {
            validateLogin()

        }
    }
    fun validateLogin(){
        var email = etEmail.text.toString()
        var password = etPassword.text.toString()
        var firstname = etFirstname.text.toString()
        var lastname = etLastname.text.toString()
        var confirm = etConfirm.text.toString()
        if (email.isBlank()){
            tilEmail.error="Email is required"
        }

        if (password.isBlank()){
            tilPassword.error="Password is required"
        }

        if (firstname.isBlank()){
            tilFirstname.error="First name is required"
        }

        if (lastname.isBlank()){
            tilLastname.error="Last name is required"
        }

        if (confirm.isBlank()){
            tilConfirm.error="Confirm Password"
        }

    }
}