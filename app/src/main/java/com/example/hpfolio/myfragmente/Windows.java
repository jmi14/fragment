package com.example.hpfolio.myfragmente;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HP FOLIO on 11/20/2017.
 */

public class Windows extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View windows = inflater.inflate(R.layout.activity_windows, container, false);
        return windows;
    }
}
