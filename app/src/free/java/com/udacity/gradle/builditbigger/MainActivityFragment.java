package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivityFragment extends Fragment {

    AdView adView;
    Button JkBtn;
    ProgressBar progressBar;
    AdRequest adRequest;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        adView= (AdView) view.findViewById(R.id.adView);
        JkBtn =(Button)view.findViewById(R.id.btn_chk);
        progressBar=(ProgressBar)view.findViewById(R.id.progressBar);
        adRequest=new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        adView.loadAd(adRequest);
        adView.loadAd(adRequest);
        return view;
    }

}
