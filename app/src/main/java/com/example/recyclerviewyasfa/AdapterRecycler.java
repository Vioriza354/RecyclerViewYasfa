package com.example.recyclerviewyasfa;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.MailViewHolder>{

    private ArrayList<Mail> dataList;

    public AdapterRecycler(ArrayList<Mail> dataList) {
        this.dataList = dataList;
    }

    public void MailAdapter(ArrayList<Mail> dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.layout_mail,parent,false);
        return new MailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MailViewHolder holder, int position) {
        holder.txtSender.setText(dataList.get(position).getSender());
        holder.txtTitle.setText(dataList.get(position).getTitle());
        holder.txtContent.setText(dataList.get(position).getContent());
        holder.txtDate.setText(dataList.get(position).getDate());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }


    public class MailViewHolder extends RecyclerView.ViewHolder {
        private TextView txtSender,txtTitle,txtContent,txtDate;

        public MailViewHolder(View itemView) {
            super(itemView);
            txtSender = (TextView) itemView.findViewById(R.id.txtsender);
            txtTitle = (TextView) itemView.findViewById(R.id.txttitle);
            txtContent = (TextView) itemView.findViewById(R.id.txtcontent);
            txtDate = (TextView) itemView.findViewById(R.id.txtdate);
        }
    }
}
