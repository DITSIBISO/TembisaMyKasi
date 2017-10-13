package com.example.android.tembisamykasi;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.location.Location;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/13.
 */

public class DetailsActivity3 extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details3);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set title of Detail page
        collapsingToolbar.setTitle(getString(R.string.ziwaphi_title));

        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.ziwaphi);
        collapsingToolbar.setTitle(places[postion % places.length]);

        String[] ziwaphiDetails = resources.getStringArray(R.array.ziwaphi_details);
        TextView ziwaphiDetail = (TextView) findViewById(R.id.ziwaphi_detail);
        ziwaphiDetail.setText(ziwaphiDetails[postion % ziwaphiDetails.length]);

        String[] ziwaphiLocations = resources.getStringArray(R.array.ziwaphi_locations);
        TextView ziwaphiLocation =  (TextView) findViewById(R.id.ziwaphi_location);
        ziwaphiLocation.setText(ziwaphiLocations[postion % ziwaphiLocations.length]);

        TypedArray placePictures = resources.obtainTypedArray(R.array.ziwaphi_picture);
        ImageView placePicutre = (ImageView) findViewById(R.id.image);
        placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));




        placePictures.recycle();
    }


}
