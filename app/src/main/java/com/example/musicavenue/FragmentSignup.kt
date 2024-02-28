package com.example.musicavenue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.musicavenue.databinding.FragmentSignupBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import java.util.zip.DataFormatException


class FragmentSignup : Fragment() {

    private lateinit var binding: FragmentSignupBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var database: DataFormatException

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentSignupBinding.inflate(inflater, container, false)

        binding.bTSignUp.setOnClickListener {

            val name = binding.etUsername.text.toString()
            val pass = binding.etPassword.text.toString()
            val compass = binding.etUsername.text.toString()

            if (name.isBlank() || pass.isBlank() || compass.isBlank()){
                Toast.makeText(requireContext(), "Enter your Username & Password", Toast.LENGTH_SHORT).show()
            }else{
                findNavController().navigate(R.id.action_fragmentSignup_to_fragmentLogin)
            }

        }

        binding.tvLogin.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentSignup_to_fragmentLogin)
        }

        return binding.root

    }


}