package com.example.bookline;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.view.SimpleDraweeView;

public class BookViewHolder extends  RecyclerView.ViewHolder{




    private TextView txtTitle;
    private TextView txtFirst_name;
    private TextView txtLast_name;
    private TextView txtEmail;
    private SimpleDraweeView imgBook;

//    BooksAdapter.onBookListener onBookListener;
//    public BookViewHolder(@NonNull View itemView, BooksAdapter.onBookListener onBookListener) {
public BookViewHolder(@NonNull View itemView){
        super(itemView);

        txtEmail = itemView.findViewById(R.id.txt_email);
        txtFirst_name = itemView.findViewById(R.id.txt_firstname);
        txtLast_name = itemView.findViewById(R.id.txt_lastname);
        txtTitle = itemView.findViewById(R.id.txt_title);
        imgBook = itemView.findViewById(R.id.img_book);

//        this.onBookListener = onBookListener;
//        itemView.setOnClickListener(this);

    }

    public void bind(Book book){
        txtEmail.setText(book.getEmail());
        txtFirst_name.setText(book.getFirst_name());
        txtLast_name.setText(book.getLast_name());
        txtTitle.setText(book.getTitle());
        imgBook.setImageURI(book.getImage());
    }

//    public void onClick(View v){
//
//        onBookListener.onBookClick(getAdapterPosition());
//    }

}