package com.oa.ht.application.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oa.ht.application.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link WorkBenchFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link WorkBenchFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkBenchFragment extends Fragment {


    public WorkBenchFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work_bench, container, false);
    }
}
