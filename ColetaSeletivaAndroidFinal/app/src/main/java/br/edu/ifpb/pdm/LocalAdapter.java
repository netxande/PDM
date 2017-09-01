package br.edu.ifpb.pdm;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rusem on 29/08/2017.
 */

public class LocalAdapter extends BaseAdapter {
    private ArrayList<Local> locais;
    private Context context;

    public LocalAdapter(ArrayList<Local> locais, Context context){
        this.locais = locais;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.locais.size();
    }

    @Override
    public Object getItem(int position) {
        return this.locais.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View layout;

        if (convertView == null){
            LayoutInflater li = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            layout = li.inflate(R.layout.local_layout, null);
        }else layout = convertView;

        TextView tvEndereco = (TextView) layout.findViewById(R.id.tvEndereco);
        ImageView ivImagem = (ImageView) layout.findViewById(R.id.ivImagem);

        Local l = this.locais.get(position);

        tvEndereco.setText(l.toString());

        if(l.getImage() != null){
            ivImagem.setImageBitmap(l.getImage());
        }

        layout.setMinimumHeight(300);

        if (position % 2 == 0)
            layout.setBackgroundColor(Color.rgb(220, 220, 220));
        else
            layout.setBackgroundColor(Color.WHITE);

        return layout;
    }
}
