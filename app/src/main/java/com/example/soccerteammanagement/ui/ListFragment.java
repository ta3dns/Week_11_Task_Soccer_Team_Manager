package com.example.soccerteammanagement.ui;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.soccerteammanagement.R;
import com.example.soccerteammanagement.adapter.ListAdapter;
import com.example.soccerteammanagement.data.DataProvider;

import java.util.List;

public class ListFragment extends Fragment {

    private static final String ARG_TYPE = "type";

    public ListFragment() {
        super(R.layout.fragment_list); // Use the same layout for all fragments
    }

    public static ListFragment newInstance(String type) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TYPE, type);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Determine the type of data to display
        String type = getArguments() != null ? getArguments().getString(ARG_TYPE) : null;
        List<?> data = null;

        if ("teams".equals(type)) {
            data = DataProvider.createSampleTeams();
        } else if ("players".equals(type)) {
            data = DataProvider.createSamplePlayers();
        } else if ("matches".equals(type)) {
            data = DataProvider.createSampleMatches();
        }

        // Set up the adapter with the data
        ListAdapter adapter = new ListAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
