<<<<<<< HEAD
package com.example.mycinema;public class MovieRecyclerViewAdapter {
=======
package com.example.mycinema;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class MovieRecyclerViewAdapter extends RecyclerView.Adapter<MovieRecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<MovieModel> movieModels;

    public MovieRecyclerViewAdapter(Context context, ArrayList<MovieModel> movieModels) {
        this.context = context;
        this.movieModels = movieModels;
    }

    @NonNull
    @Override
    public MovieRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_layout, parent, false);

        return new MovieRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieRecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvName.setText(movieModels.get(position).getMovieName());
        holder.tvDesc.setText(movieModels.get(position).getMovieDesc());
        holder.imageView.setImageResource(movieModels.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return movieModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvName, tvDesc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            tvName = itemView.findViewById(R.id.name);
            tvDesc = itemView.findViewById(R.id.desc);
        }
    }
>>>>>>> 7ca075f (13/11/2022)
}
