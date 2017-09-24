package com.nayan.candyparty;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Nayan on 9/25/2017.
 */
public class FragDetail extends Fragment {
    public TextView txtDeatils;
    SizeAdapter sizeAdapter;
    private static FragDetail fragDetail;


    @Nullable
    public static FragDetail newInstance() {
        return new FragDetail();
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_detail, container, false);
        txtDeatils = (TextView) view.findViewById(R.id.txtDetails);
        txtDeatils.setText(MainActivity.getInstance().productArrayList.get(0).getDetail());
        sizeAdapter=new SizeAdapter(getContext());
        return view;
    }
}