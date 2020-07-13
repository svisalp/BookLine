package com.example.bookline;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BooksAdapter extends RecyclerView.Adapter<BookViewHolder> {

    // Dataset
    private Book[] books;

    public BooksAdapter(Book[] books) {
        this.books = books;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Load a layout file
        LayoutInflater layoutInflater1 = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater1.inflate(R.layout.view_holder_book, parent, false);

        return new BookViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = books[position];
        holder.bind(book);
    }

    @Override
    public int getItemCount() {
        return books.length;
    }
}