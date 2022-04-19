package com.example.newscollect.requests;

import android.content.Context;

import com.android.volley.Response;

public class LinfodromeRequest extends Api {
    private static final String ENDPOINT = "/linfodrome";
    public LinfodromeRequest(Context context) {
        super(context);
    }

    public LinfodromeRequest getArticles() {
        this.get(ENDPOINT);
        return this;
    }

    @Override
    public void onError(Response.ErrorListener errorListener) {
        super.onError(errorListener);
    }

    @Override
    public LinfodromeRequest onSuccess(Response.Listener<String> responseListener) {
        super.onSuccess(responseListener);
        return this;
    }
}
