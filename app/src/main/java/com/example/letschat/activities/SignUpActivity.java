package com.example.letschat.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.letschat.R;
import com.example.letschat.databinding.ActivitySignInBinding;
import com.example.letschat.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textSignIn.setOnClickListener(v -> onBackPressed());
        }


    }

