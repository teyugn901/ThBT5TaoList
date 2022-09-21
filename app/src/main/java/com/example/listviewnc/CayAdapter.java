package com.example.listviewnc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class CayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Cay> cayList;

    public CayAdapter(Context context, int layout, List<Cay> cayList) {
        this.context = context;
        this.layout = layout;
        this.cayList = cayList;
    }

    @Override
    public int getCount() {
        return cayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView txtTen, txtMoTa;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null){

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout,null);

            //khởi tại viewholder

            holder = new ViewHolder();

            // ánh xạ view
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            holder.txtMoTa = (TextView) view.findViewById(R.id.textMoTa);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }



        //gán giá trị
        Cay cay = cayList.get(i);

        holder.txtTen.setText(cay.getTen());
        holder.txtMoTa.setText(cay.getMoTa());
        holder.imgHinh.setImageResource(cay.getHinh());


        return view;
    }
}
