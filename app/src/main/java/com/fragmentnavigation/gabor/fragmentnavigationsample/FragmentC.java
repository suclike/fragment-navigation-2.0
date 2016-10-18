package com.fragmentnavigation.gabor.fragmentnavigationsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fragmentnavigation.gabor.fragmentnavigationsample.navigation.BaseFragment;


/**
 * Created by gyorgygabor on 21.09.2016.
 */

public class FragmentC extends BaseFragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_c, null);
        super.onCreateView(inflater, container, savedInstanceState);


        root.findViewById(R.id.nextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentD fragmentD = new FragmentD();
                fragmentD.setCustomBehavior( new FragmentDBehavior1());

                navigateTo(fragmentD);

            }
        });

        return root;
    }


    @Override
    public boolean onBackPressed() {
        navigateTo(FragmentB.class);
        return true;
    }
}
