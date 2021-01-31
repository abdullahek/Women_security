package com.example.women_security.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.women_security.ChatRecyclerViewAdapter;
import com.example.women_security.Chat_class;
import com.example.women_security.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryFragment extends Fragment {

//

    List<Chat_class> list = new ArrayList<>();
    RecyclerView recyclerView;

    RecyclerView.Adapter adapter ;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);


        recyclerView = (RecyclerView) root.findViewById(R.id.rc_chat);

//        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        String name = "Hira";
        String name1 = "Ayesha";
        String name2 = "Yusra";


        com.example.women_security.Chat_class notification_class = new com.example.women_security.Chat_class(name);
        com.example.women_security.Chat_class abd = new com.example.women_security.Chat_class(name1);
        com.example.women_security.Chat_class vabd = new com.example.women_security.Chat_class(name2);





        list.add(notification_class);
        list.add(abd);
        list.add(vabd);

        //  Toast.makeText(getActivity(), list.toString(), Toast.LENGTH_SHORT).show();
        adapter = new ChatRecyclerViewAdapter(getActivity(), list);

        recyclerView.setAdapter(adapter);
        return root;
    }
}