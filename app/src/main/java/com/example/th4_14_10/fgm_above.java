package com.example.th4_14_10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fgm_above extends Fragment {
    Button btn;
    sendData listener;
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View frag = inflater.inflate(R.layout.fragment_above,container,false);
        btn = frag.findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(),"da thanh toan",Toast.LENGTH_SHORT).show();
                listener = (sendData) getActivity();
                listener.send("đây lầ dữ liệu trong frgment");
            }
        });
        return frag;
    }
}
