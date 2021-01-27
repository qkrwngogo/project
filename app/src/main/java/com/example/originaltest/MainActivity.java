package com.example.originaltest;

import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    Fragment routine;
    Fragment exercise;
    Fragment record;
    Fragment profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        routine = new Routine();
        exercise = new Exercise();
        record = new Record();
        profile = new Profile();
        // 초기화면
        getSupportFragmentManager().beginTransaction().replace(R.id.container, routine).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch(item.getItemId()) {
                            case R.id.tab_routine:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container,routine).commit();
                                return true;
                            case R.id.tab_exercise:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container,exercise).commit();
                                return true;
                            case R.id.tab_record:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container,record).commit();
                                return true;
                            case R.id.tab_profile:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container,profile).commit();
                                return true;
                        }
                        return false;
                    }
                }
        );
    }
}