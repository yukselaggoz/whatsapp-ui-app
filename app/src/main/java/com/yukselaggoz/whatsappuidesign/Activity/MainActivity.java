package com.yukselaggoz.whatsappuidesign.Activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.yukselaggoz.whatsappuidesign.Adapter.FragmentSayfalamaAdaptoru;
import com.yukselaggoz.whatsappuidesign.R;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.toolbar);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewPager);

        //this.getSupportActionBar().hide();  //manifest dosyasından actionbar kaldırılmazsa buradan kaldırılır
        this.setSupportActionBar(toolbar);  //toolbarı nesne üzerinden ürettik
        this.getSupportActionBar().setDisplayShowTitleEnabled(false);

        tabLayout.addTab(tabLayout.newTab().setText("Sohbetler"));
        tabLayout.addTab(tabLayout.newTab().setText("Durum"));
        tabLayout.addTab(tabLayout.newTab().setText("Aramalar"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        FragmentSayfalamaAdaptoru fsa = new FragmentSayfalamaAdaptoru(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(fsa);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item_search:
                break;
            case R.id.item_message:
                break;
            case R.id.item_newGroup:
                break;
            case R.id.item_messageToplu:
                break;
            case R.id.item_messageYildizli:
                break;
            case R.id.item_wpweb:
                break;
            case R.id.item_settings:
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
