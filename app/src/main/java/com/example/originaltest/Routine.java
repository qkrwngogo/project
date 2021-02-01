package com.example.originaltest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Routine extends Fragment {
    private String title;
    private int page;

    public static Routine newInstance (int page, String title) {
        Routine routine = new Routine();
        Bundle args = new Bundle();
        args.putInt("0",page);
        args.putString("someTitle",title);
        routine.setArguments(args);
        return routine;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("0",0);
        title = getArguments().getString("someTitle");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_routine, container, false);
        return view;
    }
}
