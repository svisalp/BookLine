package com.example.bookline.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookline.LoginActivity;
import com.example.bookline.R;
import com.example.bookline.RegisterActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Context mContext;
    private ArrayList<String> titlelist;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        mContext = MainActivity.this;
//
//        titlelist = new ArrayList<>();
//        titlelist.add(Constants.TITLE1);
//
//////        recyclerView = recyclerView.findViewById(R.id.recycler_view);
//////        recyclerView = recyclerView.findViewById(R.id.abc);
////        recyclerView.setHasFixedSize(true);
////        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false);
////        recyclerView.setLayoutManager(layoutManager);
////
////        TitleAdapter titleAdapter= new TitleAdapter(mContext, titlelist, new TitleClickListener() {
////            @Override
////            public void onItemClick(View itemview, int position) {
////                Toast.makeText(mContext, "Title clicker position" + position, Toast.LENGTH_SHORT).show();
//            }
//        });
//        recyclerView.setAdapter(titleAdapter);
    }
    public void Login(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void Register(View view1){
        Intent intent1 = new Intent(this, RegisterActivity.class);
        startActivity(intent1);
    }



}