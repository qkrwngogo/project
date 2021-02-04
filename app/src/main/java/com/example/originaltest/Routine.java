package com.example.originaltest;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.zip.Inflater;

public class Routine extends Fragment {

    public static Routine newInstance () {
        Routine routine = new Routine();
        return routine;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_routine, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // 루틴 버튼 클릭 시 로그인 모달창 띄우기
        Button routineBtn = getView().findViewById(R.id.routine);
        routineBtn.setOnClickListener(v -> {
            // 모달창 내부 버튼 설정
            final Dialog dialog = new Dialog(getContext());
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setContentView(R.layout.style_login);
            // 회원 가입 버튼 클릭시 창 이동
            Button signUpBtn = dialog.findViewById(R.id.btn_sign_up);
            signUpBtn.setOnClickListener(v1 -> {
                View signInPage = dialog.findViewById(R.id.sign_in_page);
                signInPage.setVisibility(View.INVISIBLE);
                View signUpPage = dialog.findViewById(R.id.sign_up_page);
                signUpPage.setVisibility(View.VISIBLE);
            });
            // 닫기 버튼 클릭시 화면 닫힘
            ImageView closeBtn = dialog.findViewById(R.id.close);
            closeBtn.setOnClickListener(v12 -> dialog.dismiss());
            dialog.show();
        });
    }
}
