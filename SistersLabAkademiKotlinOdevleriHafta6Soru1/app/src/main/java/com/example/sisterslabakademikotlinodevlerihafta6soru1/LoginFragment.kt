package com.example.sisterslabakademikotlinodevlerihafta6soru1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.sisterslabakademikotlinodevlerihafta6soru1.databinding.FragmentLoginBinding
import com.google.android.material.snackbar.Snackbar

class LoginFragment : Fragment(R.layout.fragment_login) {

    private lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding.loginButton.setOnClickListener {
            val userName = binding.userNameEt.text
            val password = binding.passwordEt.text

            if (userName.isEmpty() || password.isEmpty()) {
                Snackbar.make(it, "Boş alanları doldurunuz!", Snackbar.LENGTH_SHORT).show()
            } else {
                Navigation.findNavController(it).navigate(R.id.navigateToHomeScreen)
            }

        }
    }
}