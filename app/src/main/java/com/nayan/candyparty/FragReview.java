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
public class FragReview extends Fragment {
    TextView txtReview;
    @Nullable
    public static FragReview newInstance() {
        return new FragReview();
    }

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_review, container, false);
        txtReview=(TextView)getActivity().findViewById(R.id.txtReview);
        return view;
    }
}
