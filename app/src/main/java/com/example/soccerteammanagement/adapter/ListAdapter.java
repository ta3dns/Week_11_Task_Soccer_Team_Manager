package com.example.soccerteammanagement.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.soccerteammanagement.R;
import com.example.soccerteammanagement.model.Team;
import com.example.soccerteammanagement.model.Player;
import com.example.soccerteammanagement.model.Match;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private final List<?> items;

    public ListAdapter(List<?> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Object item = items.get(position);

        if (item instanceof Team) {
            Team team = (Team) item;
            holder.titleTextView.setText(team.getName());
            holder.subtitle1TextView.setText("League: " + team.getLeague());
            holder.subtitle2TextView.setText("Country: " + team.getCountry());
        } else if (item instanceof Player) {
            Player player = (Player) item;
            holder.titleTextView.setText(player.getName());
            holder.subtitle1TextView.setText("Position: " + player.getPosition());
            holder.subtitle2TextView.setText("Team: " + player.getTeam());
        } else if (item instanceof Match) {
            Match match = (Match) item;
            holder.titleTextView.setText(match.getHomeTeam() + " vs " + match.getAwayTeam());
            holder.subtitle2TextView.setText("Score: " + match.getScore());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, subtitle1TextView, subtitle2TextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            subtitle1TextView = itemView.findViewById(R.id.subtitle1TextView);
            subtitle2TextView = itemView.findViewById(R.id.subtitle2TextView);
        }
    }
}
