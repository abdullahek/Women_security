package com.example.women_security;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatdtlRecyclerViewAdapter extends RecyclerView.Adapter<ChatdtlRecyclerViewAdapter.ViewHolder> {

    Context context;
    List<Chat_class> MainImageUploadInfoList;

    public ChatdtlRecyclerViewAdapter(Context context, List<Chat_class> TempList) {

        this.MainImageUploadInfoList = TempList;

        this.context = context;
    }
    @NonNull
    @Override
    public com.example.women_security.ChatdtlRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_dtl_layout, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.women_security.ChatdtlRecyclerViewAdapter.ViewHolder holder, int position) {

        Chat_class studentDetails = MainImageUploadInfoList.get(position);

        holder.StudentNameTextView.setText(studentDetails.getText());
//        holder.StudentNameTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(view.getContext(),Chat_dtl.class);
//                view.getContext().startActivity(i);
//            }
   //     });
        holder.imageView.setImageResource(R.drawable.women);
    }

    @Override
    public int getItemCount() {
        return MainImageUploadInfoList.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView StudentNameTextView;

        public ImageView imageView;


        public ViewHolder(View itemView) {

            super(itemView);

            StudentNameTextView = (TextView) itemView.findViewById(R.id.tv_not_text);
            imageView = (ImageView) itemView.findViewById(R.id.iv_image);


        }
    }
}
