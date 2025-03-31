

/***************************************
*
* Deniz Özmalkoc
* OOP Course Week 11 Exercise
* 31.03.2025, Lappeenranta
*
* MAIN ACTIVITY
***************************************/


package com.example.soccerteammanagement;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager2 viewPager = findViewById(R.id.viewPager);

        // Set up ViewPager with the adapter
        MainPagerAdapter adapter = new MainPagerAdapter(this);
        viewPager.setAdapter(adapter);

        // Link TabLayout with ViewPager
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            switch (position) {
                case 0:
                    tab.setText("Teams");
                    break;
                case 1:
                    tab.setText("Players");
                    break;
                case 2:
                    tab.setText("Matches");
                    break;
            }
        }).attach();
    }
}
