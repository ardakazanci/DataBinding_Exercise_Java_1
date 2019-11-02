package com.ardakazanci.databinding_exercise_java_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.ardakazanci.databinding_exercise_java_1.databinding.ActivityMainBinding;
import com.ardakazanci.databinding_exercise_java_1.model.User;

public class MainActivity extends AppCompatActivity {

    private User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        user = new User();
        user.setName("Test User");
        user.setEmail("test@gmail.com");

        mainBinding.setUser(user);

    }
}
