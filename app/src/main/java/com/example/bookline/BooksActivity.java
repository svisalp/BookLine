package com.example.bookline;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.google.gson.Gson;

public class BooksActivity extends AppCompatActivity {





    private ProgressBar progressBar;
    private RecyclerView recyclerView;
    Book[] books;
    protected void onCreate(Bundle savedInstanceState)  {

        super.onCreate(savedInstanceState);
        Fresco.initialize(this);
        setContentView(R.layout.activity_books);

//        make view
        recyclerView = findViewById(R.id.recycler_view1);
//        create set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        loadBooks();
    }


    private void loadBooks() {

        // Show loading
//           showLoading(true);

        // Load books from the server using Volley library
        String url = "https://my.api.mockaroo.com/sal.json?key=fb310fc0";

        // Create a request
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // Convert json string to array of Email using Gson
                Gson gson1 = new Gson();
                Book[] books = gson1.fromJson(response, Book[].class);
                // Create and set an adapter
                BooksAdapter adapter1 = new BooksAdapter(books);
                recyclerView.setAdapter(adapter1);

                // Hide the progress bar and show recycler view
//                   showLoading(false);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(BooksActivity.this, "Something error while loading data from the server", Toast.LENGTH_LONG).show();
                Log.d("Error", "Load data error: " + error.getMessage());

            }
        });
        // Add the request to the Queue
        Volley.newRequestQueue(this).add(request);
    }

//    public void onBookClick(int position) {
//        Log.d("click","position: "+position);
//        Intent intent = new Intent(this,BookDetailActivity.class);
//        intent.putExtra("title",books[position].getTitle());
//        intent.putExtra("author",books[position].getLast_name());
//        intent.putExtra("email",books[position].getEmail());
//        startActivity(intent);
//    }
        }


