package com.example.fbuapp.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.fbuapp.R;
import com.example.fbuapp.details.ReviewsAdapter;
import com.example.fbuapp.models.Review;

import java.util.List;

/**
 * This class is a child of the ReviewsAdapter class. The difference between this class and the ReviewsAdapter class is that this one gets all the reviews
 * a specific user made, and instead of showing the name of the user who made the review, it shows the name of the restaurant the review is for.
 */

public class ProfileAdapter extends ReviewsAdapter {

    public ProfileAdapter(Context context, List<Review> reviews) {
        super(context, reviews);
    }

    @NonNull
    @Override
    public ReviewsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View reviewView = LayoutInflater.from(context).inflate(R.layout.item_review, parent, false);
        return new ViewHolder(reviewView);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsAdapter.ViewHolder holder, int position) {
        super.onBindViewHolder(holder, position);
    }

    public class ViewHolder extends ReviewsAdapter.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        protected void bind(Review review) {
            super.bind(review);
            tvUsername.setText(review.getRestaurantName());
        }
    }

}
