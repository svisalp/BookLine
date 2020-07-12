package com.example.bookline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Menu(View view2){
        Intent intent2 = new Intent(this, MenuActivity.class);
        startActivity(intent2);
    }
    public void Register(View view3){
        Intent intent3 = new Intent(this, RegisterActivity.class);
        startActivity(intent3);
    }

    public void Email(View view4){
        Intent intent4 = new Intent(this, EmailsActivity.class);
        startActivity(intent4);
    }
}
