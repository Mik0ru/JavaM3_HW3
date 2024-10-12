package com.example.javam3_hw3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsViewHolder> {
    private  LayoutInflater inflater;
    private  ArrayList<Contacts> contacts;

    public ContactsAdapter(LayoutInflater inflater, ArrayList<Contacts> contacts) {
        this.inflater = inflater;
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_contacts, parent, false);
        return new ContactsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        Contacts video = contacts.get(position);
        holder.onBind(video);
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
}
