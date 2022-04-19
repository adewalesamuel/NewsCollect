package com.example.newscollect.views;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newscollect.R;

public class AbidjanNetFragment extends Fragment {

    public static AbidjanNetFragment newInstance() {
        return new AbidjanNetFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.abidjan_net_fragment, container, false);
    }

}