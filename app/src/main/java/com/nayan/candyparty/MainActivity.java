package com.nayan.candyparty;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recColor, recSize;
    private SizeAdapter sizeAdapter;
    private ColorAdapter colorAdapter;
    private ArrayList<MProduct> productArrayList;
    private MProduct mProduct;
    public TextView txtPrice, txtDP, txtDPercn;
    private static MainActivity mainActivity;

    public static MainActivity getInstance() {
        return mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        dataGenerate();
        prepareDisplay();
    }

    private void init() {
        txtDP = (TextView) findViewById(R.id.txtDP);
        txtDPercn = (TextView) findViewById(R.id.txtDPerc);
        txtPrice = (TextView) findViewById(R.id.txtPrice);
        mProduct = new MProduct();
        productArrayList = new ArrayList<>();
        recColor = (RecyclerView) findViewById(R.id.recColor);
        recSize = (RecyclerView) findViewById(R.id.recSize);
        colorAdapter = new ColorAdapter(this);
        sizeAdapter = new SizeAdapter(this);

    }

    private void dataGenerate() {
        mainActivity = this;
        mProduct.setColor(Color.GREEN);
        mProduct.setSize("x1");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(300);
        mProduct.setDiscountPrice(270);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.RED);
        mProduct.setSize("x2");
        mProduct.setDiscountParcentage("15%");
        mProduct.setPrice(400);
        mProduct.setDiscountPrice(360);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.YELLOW);
        mProduct.setSize("x3");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(200);
        mProduct.setDiscountPrice(180);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.LTGRAY);
        mProduct.setSize("x4");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(300);
        mProduct.setDiscountPrice(270);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.DKGRAY);
        mProduct.setSize("x5");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(600);
        mProduct.setDiscountPrice(540);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.BLACK);
        mProduct.setSize("x6");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(900);
        mProduct.setDiscountPrice(810);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.BLUE);
        mProduct.setSize("x7");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(300);
        mProduct.setDiscountPrice(270);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.CYAN);
        mProduct.setSize("x8");
        mProduct.setDiscountParcentage("12%");
        mProduct.setPrice(500);
        mProduct.setDiscountPrice(440);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.GRAY);
        mProduct.setSize("x9");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(700);
        mProduct.setDiscountPrice(630);
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.MAGENTA);
        mProduct.setSize("x10");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(1000);
        mProduct.setDiscountPrice(900);
        productArrayList.add(mProduct);
    }

    private void prepareDisplay() {
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager2
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recSize.setLayoutManager(layoutManager);
        recColor.setLayoutManager(layoutManager2);
        recColor.setAdapter(colorAdapter);
        recSize.setAdapter(sizeAdapter);
        colorAdapter.setData(productArrayList);
        sizeAdapter.setData(productArrayList);
    }
}
