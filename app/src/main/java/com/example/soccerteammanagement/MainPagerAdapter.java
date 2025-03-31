package com.example.soccerteammanagement;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.soccerteammanagement.ui.ListFragment;

public class MainPagerAdapter extends FragmentStateAdapter {

    public MainPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Create a single ListFragment and pass the type of data
        switch (position) {
            case 0:
                return ListFragment.newInstance("teams");
            case 1:
                return ListFragment.newInstance("players");
            case 2:
                return ListFragment.newInstance("matches");
            default:
                throw new IllegalArgumentException("Invalid position");
        }
    }

    @Override
    public int getItemCount() {
        return 3; // Number of tabs
    }
}
