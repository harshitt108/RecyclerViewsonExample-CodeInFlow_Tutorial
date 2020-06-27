package com.example.recyclerviewjsonexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static com.example.recyclerviewjsonexample.MainActivity.EXTRA_CREATOR;
import static com.example.recyclerviewjsonexample.MainActivity.EXTRA_LIKES;
import static com.example.recyclerviewjsonexample.MainActivity.EXTRA_URL;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_detail );

        Intent intent = getIntent ();
        String imgUrl = intent.getStringExtra ( EXTRA_URL );
        String creatorName = intent.getStringExtra ( EXTRA_CREATOR );
        int likesCount = intent.getIntExtra ( EXTRA_LIKES,0 );

        ImageView imageView = findViewById ( R.id.image_view_detail );
        TextView textViewCreator = findViewById ( R.id.text_view_creator_detail );
        TextView textViewLikes = findViewById ( R.id.text_view_like_detail );

        Picasso.with ( this ).load ( imgUrl ).fit ().centerCrop ().into ( imageView );
        textViewCreator.setText ( creatorName );
        textViewLikes.setText ( "Likes: "+likesCount );

    }
}