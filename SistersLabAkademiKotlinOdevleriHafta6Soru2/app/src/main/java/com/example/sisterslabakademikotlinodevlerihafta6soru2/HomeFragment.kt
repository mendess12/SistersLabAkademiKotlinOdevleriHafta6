package com.example.sisterslabakademikotlinodevlerihafta6soru2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.sisterslabakademikotlinodevlerihafta6soru2.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding : FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        binding.goToGameButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.navigateToGameScreen)
        }
    }
}