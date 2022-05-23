package com.example.project;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Djur> djurList;

    public RecyclerViewAdapter(MainActivity mainActivity, ArrayList<Djur> djurList){
        this.djurList = djurList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView djurNamn;
        private ImageView djurImg;
        private TextView djurSkala;
        private TextView djurKommentar;

        ViewHolder(View view) {
            super(view);
            djurNamn = view.findViewById(R.id.djurNamnTextView);
            djurImg = view.findViewById(R.id.djurImageView);
            djurSkala = view.findViewById(R.id.djurSkalaTextView);
            djurKommentar = view.findViewById(R.id.djurKommentarTextView);
        }
    }
    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_djur, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        String ID = djurList.get(position).getID();
        String Namn = djurList.get(position).getNamn();
        String Img = djurList.get(position).getAuxData().getImg();
        String Skala = djurList.get(position).getAuxData().getSkala();
        String Kommentar = djurList.get(position).getAuxData().getKommentar();

        holder.djurNamn.setText(Namn);
        new ImageDownloader(holder.djurImg).execute(Img);
        holder.djurSkala.setText(Skala);
        holder.djurKommentar.setText(Kommentar);
    }

    @Override
    public int getItemCount() {
        return djurList.size();
    }
}
