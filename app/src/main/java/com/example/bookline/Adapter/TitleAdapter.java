package com.example.bookline.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookline.R;
import com.example.bookline.Adapter.Interface.TitleClickListener;

import java.util.ArrayList;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.MyViewHolder> {

    private Context mContex;
    private ArrayList<String> titleList;
    private TitleClickListener clickListener;

    public TitleAdapter(Context mContex, ArrayList<String> titleList, TitleClickListener clickListener) {
        this.mContex = mContex;
        this.titleList = titleList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public TitleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContex).inflate(R.layout.title_layout,viewGroup,false);

        final MyViewHolder myViewHolder= new MyViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClick(v,myViewHolder.getPosition() );
            }
        });
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TitleAdapter.MyViewHolder myViewHolder, int i) {
        myViewHolder.title.setText(titleList.get(i).replace("_", " "));

    }

    @Override
    public int getItemCount() {
        return titleList.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        public  MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);

        }
    }
}
