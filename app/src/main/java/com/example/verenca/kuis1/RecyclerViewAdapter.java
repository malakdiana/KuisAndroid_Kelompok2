package com.example.verenca.kuis1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvData,rvKeterangan;
    //untuk menambahkan parameter pada konstruktor
    public RecyclerViewAdapter(ArrayList<String> inputData,ArrayList<String> rvNomer) {
        rvData = inputData;
        this.rvKeterangan = rvNomer;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        // di tutorial ini kita hanya menggunakan data String untuk tiap item
        public TextView tvTitle;
        public TextView tvSubtitle;
        //nambah variable imageview / icon
        public ImageView tvIcon;
        public ViewHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tv_title);
            tvSubtitle = (TextView) v.findViewById(R.id.tv_subtitle);
            tvIcon = (ImageView) v.findViewById(R.id.tv_icon);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_item, parent,
                        false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - mengambil elemen dari dataset (ArrayList) pada posisi tertentu
        // - mengeset isi view dengan elemen dari dataset tersebut
        final String name = rvData.get(position);
        holder.tvTitle.setText(rvData.get(position));
        holder.tvSubtitle.setText(rvKeterangan.get(position));
        int[] i = new int[10];

        i[0] = R.drawable.hall;
        i[1] = R.drawable.room;
        i[2] = R.drawable.room;
        i[3] = R.drawable.masjid;
        i[4] = R.drawable.parkir;
        i[5] = R.drawable.toilet;
//        i[6] = R.drawable.images7;
//        i[7] = R.drawable.images8;
//        i[8] = R.drawable.images9;
//        i[9] = R.drawable.images10;
        holder.tvIcon.setImageResource(i[position]);
    }
    @Override
    public int getItemCount() {
        // menghitung ukuran dataset / jumlah data yang ditampilkan di RecyclerView
        return rvData.size();
    }
}
