package com.example.newscollect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

import com.example.newscollect.models.Article;
import com.example.newscollect.viewmodels.AbidjanNetViewModel;
import com.example.newscollect.views.ArticleFragment;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbidjanNetViewModel abidjanNetViewModel = new AbidjanNetViewModel(this);

        abidjanNetViewModel.getArticles().observe(this, articles -> {
            Fragment articleFragment = ArticleFragment.newInstance(1,articles);

            getSupportFragmentManager().beginTransaction().replace(R.id.articles, articleFragment)
            .commit();
        });

        abidjanNetViewModel.hasError.observe(this, hasError -> {
            if (hasError) {
                Log.d(TAG, "onChanged: an error wes detected");
            }

        });

    }

}