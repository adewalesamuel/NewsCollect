package com.example.newscollect.viewmodels;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.newscollect.models.Article;
import com.example.newscollect.requests.AbidjanNetRequest;
import com.google.gson.Gson;

public class AbidjanNetViewModel {
    private AbidjanNetRequest abidjanNetRequest;
    private final MutableLiveData<Article[]> articles = new MutableLiveData<>();
    public final MutableLiveData<Boolean> hasError = new MutableLiveData<>();

    public AbidjanNetViewModel(Context context) {
        this.abidjanNetRequest = new AbidjanNetRequest(context);
        this.hasError.setValue(false);
    }

    public LiveData<Article[]> getArticles() {
        abidjanNetRequest.getArticles()
                .onSuccess(response -> articles.setValue(
                        new Gson().fromJson(response,Article[].class))
                )
                .onError(error -> hasError.setValue(true));

        return articles;
    }
}
