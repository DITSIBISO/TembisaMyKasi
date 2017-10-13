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
 * Created by eKasiLab Alex CDTB on 2017/10/12.
 */

public class DetailsActivity2 extends AppCompatActivity{
    public static final String EXTRA_POSITION = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details2);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set title of Detail page
        collapsingToolbar.setTitle(getString(R.string.resturantspubs_title));

        int postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();
        String[] places = resources.getStringArray(R.array.resturantspubs);
        collapsingToolbar.setTitle(places[postion % places.length]);

        String[] resturantspubsDetails = resources.getStringArray(R.array.resturantspubs_details);
        TextView resturantspubsDetail = (TextView) findViewById(R.id.resturantspubs_detail);
        resturantspubsDetail.setText(resturantspubsDetails[postion % resturantspubsDetails.length]);

        String[] resturantspubsLocations = resources.getStringArray(R.array.resturantspubs_locations);
        TextView resturantspubsLocation =  (TextView) findViewById(R.id.resturantspubs_location);
        resturantspubsLocation.setText(resturantspubsLocations[postion % resturantspubsLocations.length]);

        TypedArray placePictures = resources.obtainTypedArray(R.array.resturantspubs_picture);
        ImageView placePicutre = (ImageView) findViewById(R.id.image);
        placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));




        placePictures.recycle();
    }
}
