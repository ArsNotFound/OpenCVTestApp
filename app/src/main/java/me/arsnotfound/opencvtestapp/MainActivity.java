package me.arsnotfound.opencvtestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.opencv.android.OpenCVLoader;

import me.arsnotfound.opencvtestapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        if (OpenCVLoader.initDebug()) {
            binding.textView.setText("OpenCV configured successfully!");
        } else {
            binding.textView.setText("OpenCV doesn't configured successfully!");
        }
    }
}