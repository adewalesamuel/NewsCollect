package com.example.newscollect.requests;

import android.content.Context;

import com.android.volley.Response;

public class AbidjanNetRequest extends Api {
    private static final String ENDPOINT = "/abidjan_net";
    public AbidjanNetRequest(Context context) {
        super(context);
    }

    public AbidjanNetRequest getArticles() {
        this.get(ENDPOINT);
        return this;
    }

    @Override
    public void onError(Response.ErrorListener errorListener) {
        super.onError(errorListener);
    }

    @Override
    public AbidjanNetRequest onSuccess(Response.Listener<String> responseListener) {
        super.onSuccess(responseListener);
        return this;
    }
}
