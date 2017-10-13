package com.example.android.tembisamykasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eKasiLab Alex CDTB on 2017/10/13.
 */

public class ThreeActivity extends AppCompatActivity {

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        RecyclerView recList = (RecyclerView) findViewById(R.id.cardList);

        recList.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(llm);

        List<Contact> contactList = new ArrayList<>();
        Contact contact1 = new Contact();
        contact1.setEmail("ditsibisomasete@gmail.com");
        contact1.setName("Valenciah");
        contact1.setTitle("MS");


        Contact contact2 = new Contact();
        contact2.setEmail("ditsibisomasete@gmail.com");
        contact2.setName("Valenciah");
        contact2.setTitle("MS");



        contactList.add(contact1);
        contactList.add(contact1);


        adapter = new MyAdapter(this, contactList);
        recList.setAdapter(adapter);

    }
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_gallery) {
            // Handle the camera action
            Intent intent = new Intent(this, GalleryActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_events) {
            Intent intent = new Intent(this, EventsActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_Three) {
            Intent intent = new Intent(this, ThreeActivity.class);
            startActivity(intent);

//        } else if (id == R.id.nav_share) {
//            Intent intent = new Intent(Intent.ACTION_SENDTO);
//            intent.setType("text/plain");
//            intent.putExtra(intent.EXTRA_SUBJECT, "Try our new Tembisa tour guide");
//            intent.putExtra(intent.EXTRA_TEXT, "www.mylocationtour.co.za");
//            Intent mailer = Intent.createChooser(intent, null);
//            startActivity(mailer);
//
//        } else if (id == R.id.nav_send) {
//        } else  if (id == R.id.action_settings){
//            Intent intent = new Intent(this, SettingsActivity.class);
//            startActivity(intent);
//            return true;
//
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activityt_main_drawer, menu);
        return true;
    }
}



