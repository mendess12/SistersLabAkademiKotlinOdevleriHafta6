package com.example.sisterslabakademikotlinodevlerihafta6soru2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.sisterslabakademikotlinodevlerihafta6soru2.databinding.FragmentGameBinding

class GameFragment : Fragment(R.layout.fragment_game) {

    private lateinit var binding: FragmentGameBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGameBinding.bind(view)

        binding.goToResultButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.navigateToResultScreen)
        }
    }
}