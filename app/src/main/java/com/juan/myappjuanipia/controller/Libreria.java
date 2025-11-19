package com.juan.myappjuanipia.controller;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.juan.myappjuanipia.R;
import com.squareup.picasso.Picasso;

public class Libreria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libreria);

        ImageView img = findViewById(R.id.imgPicasso);

        String url = "https://images.unsplash.com/photo-1568605117036-5fe5e7bab0b7?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D";

        Picasso.get()
                .load(url)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(img);
    }
}
