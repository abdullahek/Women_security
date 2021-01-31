package com.example.women_security;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class chat_dtl extends AppCompatActivity {

    List<Chat_class> list = new ArrayList<>();

    RecyclerView recyclerView;

    RecyclerView.Adapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_dtl);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        recyclerView = (RecyclerView) findViewById(R.id.rc_chat11);

//        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        String name = "I need some help right now";
        String name1 = "Found someone threating near me please help";
        String name2 = "You can i get help instantly";


        com.example.women_security.Chat_class notification_class = new com.example.women_security.Chat_class(name);
        com.example.women_security.Chat_class abd = new com.example.women_security.Chat_class(name1);
        com.example.women_security.Chat_class vabd = new com.example.women_security.Chat_class(name2);





        list.add(notification_class);
        list.add(abd);
        list.add(vabd);

        //  Toast.makeText(getActivity(), list.toString(), Toast.LENGTH_SHORT).show();
        adapter = new ChatdtlRecyclerViewAdapter(getApplicationContext(), list);

        recyclerView.setAdapter(adapter);

    }
}