package com.example.newscollect.requests;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

class Api {
    private static final String TAG = "Api";
    //private final String URL = "http://192.168.0.108:8000";
    private final String URL = "https://news-collect.herokuapp.com";
    private final RequestQueue queue;
    private String endpoint;
    private Response.Listener<String> responseListener;
    private Response.ErrorListener errorListener;

    public Api(Context context) {
        this.queue = Volley.newRequestQueue(context);
    }

    public Api get(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    private void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    private void setResponseListener(Response.Listener<String> responseListener) {
        this.responseListener = responseListener;
    }

    private void setErrorListener(Response.ErrorListener errorListener) {
        this.errorListener = errorListener;
    }

    public Api onSuccess(Response.Listener<String> responseListener) {
        setResponseListener(responseListener);
        return this;
    }

    public void onError(Response.ErrorListener errorListener) {
        setErrorListener(errorListener);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL + endpoint,
                this.responseListener, this.errorListener);

        queue.add(stringRequest);
    }

}
