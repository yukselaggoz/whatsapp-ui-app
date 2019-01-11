package com.yukselaggoz.whatsappuidesign.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.yukselaggoz.whatsappuidesign.Activity.SohbetActivity;
import com.yukselaggoz.whatsappuidesign.Model.Sohbetler;
import com.yukselaggoz.whatsappuidesign.R;

import java.util.ArrayList;

public class ListViewSohbetlerAdapter extends BaseAdapter{

    private ArrayList<Sohbetler> liste;
    private LayoutInflater layoutInflater;
    private Context context;

    public ListViewSohbetlerAdapter(Context context, ArrayList<Sohbetler> liste) {
        this.context = context;
        this.liste = liste;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Object getItem(int position) {  //object yerine sohbetller class ı yazılabilir.
        return liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final View view = layoutInflater.inflate(R.layout.custom_sohbetler, null);

        ImageView ivProfil = view.findViewById(R.id.iv_sohbetler_profil);
        final TextView tvAdSoyad = view.findViewById(R.id.tv_sohbetler_adsoyad);
        TextView tvAciklama = view.findViewById(R.id.tv_sohbetler_aciklama);
        TextView tvZaman = view.findViewById(R.id.tv_sohbetler_zaman);

        Picasso.with(context).load(liste.get(position).getResimUrl()).into(ivProfil);
        tvAdSoyad.setText(liste.get(position).getAdSoyad());
        tvAciklama.setText(liste.get(position).getAciklama());
        tvZaman.setText(liste.get(position).getZaman());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), SohbetActivity.class);
                intent.putExtra("adsoyad", tvAdSoyad.getText().toString());
                intent.putExtra("userid", liste.get(position).getId());
                context.startActivity(intent);
            }
        });

        return view;
    }
}