package com.nayan.candyparty;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
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
    public ArrayList<MProduct> productArrayList;
    private MProduct mProduct;
    public TextView txtPrice, txtDP, txtDPercn;
    private static MainActivity mainActivity;
    ViewPager viewPager;
    TabLayout footerTab;
    private AdFooterTab adapterFooter;

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
        setupFooter();
    }

    private void init() {
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        footerTab = (TabLayout) findViewById(R.id.footerTab);
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

    private void setupFooter() {
        adapterFooter = new AdFooterTab(getSupportFragmentManager());
        adapterFooter.addFragment(FragDetail.newInstance(), "DETAIL");
        adapterFooter.addFragment(FragShiftment.newInstance(), "SHIFTMENT");
        adapterFooter.addFragment(FragReview.newInstance(), "REVIEW");
        viewPager.setAdapter(adapterFooter);
        footerTab.setupWithViewPager(viewPager);
//        footerTab.setSelectedTabIndicatorHeight(2);
//        footerTab.setSelectedTabIndicatorColor(Color.GREEN);
//        footerTab.setTabTextColors(Color.WHITE, Color.GREEN);
//
//        // view all icon pic of footerTab with open
//        for (int i = 0; i < footerTab.getTabCount(); i++) {
//            footerTab.getTabAt(i).setIcon(footerIcon(i, true));
//        }
//// witch select footertab when open app
//        footerTab.getTabAt(selectTabPos).select();
//        footerTab.getTabAt(selectTabPos).setIcon(footerIcon(selectTabPos, true));
//        footerTab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//                tab.setIcon(footerIcon(tab.getPosition(), true));
//
//                //set current item kn use korsis. comment kore rakhar pore o kono change hoi nai kaj
////                viewPager.setCurrentItem(tab.getPosition());
//                footerTab.setTabTextColors(Color.WHITE, Color.GREEN);
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                tab.setIcon(footerIcon(tab.getPosition(), false));
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                tab.setIcon(footerIcon(tab.getPosition(), true));
//            }
//        });
    }

    private void dataGenerate() {
        mainActivity = this;
        mProduct.setColor(Color.GREEN);
        mProduct.setSize("x1");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(300);
        mProduct.setDiscountPrice(270);
        mProduct.setDetail("detals1");
        mProduct.setShiftment("shiftment1");
        mProduct.setReview("Review1");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.RED);
        mProduct.setSize("x2");
        mProduct.setDiscountParcentage("15%");
        mProduct.setPrice(400);
        mProduct.setDiscountPrice(360);
        mProduct.setDetail("detals2");
        mProduct.setShiftment("shiftment2");
        mProduct.setReview("Review2");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.GREEN);
        mProduct.setSize("x3");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(200);
        mProduct.setDiscountPrice(180);
        mProduct.setDetail("detals3");
        mProduct.setShiftment("shiftment3");
        mProduct.setReview("Review3");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.LTGRAY);
        mProduct.setSize("x4");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(300);
        mProduct.setDiscountPrice(270);
        mProduct.setDetail("detals4");
        mProduct.setShiftment("shiftment4");
        mProduct.setReview("Review4");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.DKGRAY);
        mProduct.setSize("x5");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(600);
        mProduct.setDiscountPrice(540);
        mProduct.setDetail("detals5");
        mProduct.setShiftment("shiftment5");
        mProduct.setReview("Review5");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.BLACK);
        mProduct.setSize("x6");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(900);
        mProduct.setDiscountPrice(810);
        mProduct.setDetail("detals6");
        mProduct.setShiftment("shiftment6");
        mProduct.setReview("Review6");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.BLUE);
        mProduct.setSize("x7");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(300);
        mProduct.setDiscountPrice(270);
        mProduct.setDetail("detals7");
        mProduct.setShiftment("shiftment7");
        mProduct.setReview("Review7");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.CYAN);
        mProduct.setSize("x8");
        mProduct.setDiscountParcentage("12%");
        mProduct.setPrice(500);
        mProduct.setDiscountPrice(440);
        mProduct.setDetail("detals8");
        mProduct.setShiftment("shiftment8");
        mProduct.setReview("Review8");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.GRAY);
        mProduct.setSize("x9");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(700);
        mProduct.setDiscountPrice(630);
        mProduct.setDetail("detals9");
        mProduct.setShiftment("shiftment9");
        mProduct.setReview("Review9");
        productArrayList.add(mProduct);
        mProduct = new MProduct();
        mProduct.setColor(Color.MAGENTA);
        mProduct.setSize("x10");
        mProduct.setDiscountParcentage("10%");
        mProduct.setPrice(1000);
        mProduct.setDiscountPrice(900);
        mProduct.setDetail("detals10");
        mProduct.setShiftment("shiftment10");
        mProduct.setReview("Review10");
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
        productArrayList.get(0).setClick(1);
        colorAdapter.setData(productArrayList);
        sizeAdapter.setData(productArrayList);
    }
}
