package com.example.android.tembisamykasi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
/**
 * Created by eKasiLab Alex CDTB on 2017/10/13.
 */

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {

    Context context;
    List<Contact> contactList;

    public MyAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_view,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Contact contact = contactList.get(position);
        holder.txtTitle.setText(contact.getTitle());
        holder.txtName.setText(contact.getName());
        holder.txtEmail.setText(contact.getEmail());
        holder.txtSurname.setText(contact.getSurname());
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;
        TextView txtSurname;
        TextView txtEmail;
        TextView txtTitle;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtName =  (TextView) itemView.findViewById(R.id.txtName);
            txtSurname = (TextView)  itemView.findViewById(R.id.txtSurname);
            txtEmail = (TextView)  itemView.findViewById(R.id.txtEmail);
            txtTitle = (TextView) itemView.findViewById(R.id.title);
        }
    }
}


