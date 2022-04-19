package com.example.newscollect.requests;

import android.content.Context;

import com.android.volley.Response;

public class KoaciRequest extends Api {
    private static final String ENDPOINT = "/koaci";
    public KoaciRequest(Context context) {
        super(context);
    }

    public KoaciRequest getArticles() {
        this.get(ENDPOINT);
        return this;
    }

    @Override
    public void onError(Response.ErrorListener errorListener) {
        super.onError(errorListener);
    }

    @Override
    public KoaciRequest onSuccess(Response.Listener<String> responseListener) {
        super.onSuccess(responseListener);
        return this;
    }
}
