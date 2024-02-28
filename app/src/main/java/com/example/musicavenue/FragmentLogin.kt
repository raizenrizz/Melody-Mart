package com.example.musicavenue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.musicavenue.databinding.FragmentLoginBinding


class FragmentLogin : Fragment() {

    private lateinit var binding:FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.bTLogin.setOnClickListener {

            val uname = binding.etUsername.text.toString()
            val pword = binding.etPassword.text.toString()

            if (uname == pword) {

            }
        }

        binding.tvSignup.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentLogin_to_fragmentSignup)
        }


        return binding.root
    }


}