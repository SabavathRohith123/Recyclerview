package com.example.myrecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecyclerview.MainActivity;
import com.example.myrecyclerview.R;
import com.example.myrecyclerview.model.moviemodel;

import java.util.List;

public class mycustomadapter  extends RecyclerView.Adapter<mycustomadapter.movieViewHolder> {
    List<moviemodel> moviemodelList;

    public mycustomadapter(MainActivity mainActivity, List<moviemodel> moviemodelList) {
        this.moviemodelList = moviemodelList;
    }

    @NonNull
    @Override
    public mycustomadapter.movieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new movieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mycustomadapter.movieViewHolder holder, int position) {
        moviemodel moviemodel = moviemodelList.get(position);

        holder.actorname.setText(moviemodel.getActorname());
        holder.moviecount.setText(String.valueOf(moviemodel.getMoviecount()));
        holder.movieimage.setImageResource(moviemodel.getMovieimage());

    }

    @Override
    public int getItemCount() {
        return moviemodelList.size();
    }

    public static class movieViewHolder extends RecyclerView.ViewHolder {
        TextView actorname, moviecount;
        ImageView movieimage;

        public movieViewHolder(@NonNull View itemView) {
            super(itemView);
            actorname = itemView.findViewById(R.id.actorname);
            moviecount = itemView.findViewById(R.id.moviecount);
            movieimage = itemView.findViewById(R.id.movieimage);
        }
    }
}

