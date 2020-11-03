package com.example.th4_14_10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fgm_below extends Fragment {
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View frag = inflater.inflate(R.layout.fragment_below,container,false);
        tv = (TextView) frag.findViewById(R.id.textView_below);
        return frag;
    }
    public void UpdateData(String text){
        tv.setText(text);
    }
}
