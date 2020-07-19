package com.example.bookline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Menu(View view2){
        Intent intent2 = new Intent(this, BooksActivity.class);
        startActivity(intent2);
    }
    public void Login(View view3){
        Intent intent3 = new Intent(this, LoginActivity.class);
        startActivity(intent3);
    }

}
