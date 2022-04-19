package com.example.newscollect.views.adapters;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.newscollect.R;
import com.example.newscollect.models.Article;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * {@link RecyclerView.Adapter} that can display a {@link Article}.
 */
public class ArticleRecyclerViewAdapter extends RecyclerView.Adapter<ArticleRecyclerViewAdapter.ViewHolder> {

    private final Context context;
    private final ArrayList<Article> articleList = new ArrayList<>();

    public ArticleRecyclerViewAdapter(Context context, Article[] items) {
        this.context = context;

        if (items != null) articleList.addAll(Arrays.asList(items));
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.fragment_article,parent, false));

    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Article article = articleList.get(position);

        holder.title.setText(article.getTitle());
        holder.date.setText(article.getDate());

        Glide.with(context)
                .load(article.getImg_url())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView title;
        public final TextView date;
        public final ImageView image;

        public final LinearLayout container;

        public ViewHolder(View view) {
            super(view);

            title =  view.findViewById(R.id.title);
            date = view.findViewById(R.id.date);
            image = view.findViewById(R.id.image);
            container = view.findViewById(R.id.article);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + date.getText() + "'";
        }
    }
}