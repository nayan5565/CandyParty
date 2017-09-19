package com.nayan.candyparty;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nayan on 9/19/2017.
 */
public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.MyViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    private ArrayList<MProduct> productArrayList;
    private MProduct mProduct;


    public ColorAdapter(Context context) {
        this.context = context;

        inflater = LayoutInflater.from(context);
    }

    public void setData(ArrayList<MProduct> mProducts) {
        this.productArrayList = mProducts;

        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row_color, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        mProduct = productArrayList.get(position);
        holder.imgColor.setBackgroundColor(mProduct.getColor());


    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imgColor;

        public MyViewHolder(View itemView) {
            super(itemView);
            imgColor = (ImageView) itemView.findViewById(R.id.imgColor);

        }
    }
}
