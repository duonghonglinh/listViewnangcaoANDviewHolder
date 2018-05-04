package com.example.admin.listviewadaptercustom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {


    private Context context;
    private int layout;
    //danh sach luu doi tuong
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    //tra ve so phan tu cua mang List
    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }


    // tao class ViewHolder
    //su dung cac thuoc tinh cua ViewHolder
    private class ViewHolder{
        TextView txtTen,txtMoTa;
        ImageView imgHinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //khai bao view holder
        ViewHolder viewHolder ;

        //lan dau convertView se rong
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //lay layout vao convertView tu nguon xml
            convertView = inflater.inflate(layout, null);

            viewHolder = new ViewHolder();


            //axa tV , Img vao view , bien viewHolde se luu tru anh xa VIEW
            viewHolder.txtTen = convertView.findViewById(R.id.tvTen);
            viewHolder.txtMoTa = convertView.findViewById(R.id.tvMoTa);
            viewHolder.imgHinh = convertView.findViewById(R.id.img);

            //set tag de luu tru trang thai anhxa trong viewHolder,
            convertView.setTag(viewHolder);
        }

        else {
            //lay ra trang thai anhxa trong View
            viewHolder = (ViewHolder) convertView.getTag();

        }


        //gan gia tri cua mang TraiCay cho doi tuong trai cay
        TraiCay traiCay = traiCayList.get(position);

        viewHolder.txtMoTa.setText(traiCay.getMota());
        viewHolder.txtTen.setText(traiCay.getTen());
        viewHolder.imgHinh.setImageResource(traiCay.getHinh());


        return convertView;
    }
}
