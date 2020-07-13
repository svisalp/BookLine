package com.example.bookline;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BookViewHolder extends  RecyclerView.ViewHolder{

    private TextView txtTitle;
    private TextView txtFirst_name;
    private TextView txtLast_name;
    private TextView txtEmail;

    public BookViewHolder(@NonNull View itemView) {
        super(itemView);

        txtEmail = itemView.findViewById(R.id.txt_email);
        txtFirst_name = itemView.findViewById(R.id.txt_firstname);
        txtEmail = itemView.findViewById(R.id.txt_lastname);
        txtEmail = itemView.findViewById(R.id.txt_title);


//
//        txt = itemView.findViewById(R.id.txt_sender);
//        txtSubject = itemView.findViewById(R.id.txt_subject);
//        txtBody = itemView.findViewById(R.id.txt_body);
    }

    public void bind(Book book){
        txtEmail.setText(book.getEmail());
        txtFirst_name.setText(book.getFirst_name());
        txtLast_name.setText(book.getLast_name());
        txtTitle.setText(book.getTitle());
    }

}
