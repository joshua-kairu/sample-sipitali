package com.joslittho.spitali.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.spitali.R;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;

/**
 *
 */
// begin fragment PatientMainFragment
public class PatientMainFragment extends Fragment {

    /* CONSTANTS */

    /* Integers */
    
    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = PatientMainFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* CONSTRUCTOR */

    public PatientMainFragment() {
        // Required empty public constructor
    }

    /* METHODS */

    /* Getters and Setters */

    /* Overrides */

    @Override
    // begin onCreateView
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState ) {

        // 0. inflate the layout for this fragment
        // 1. set up the drawer
        // last. return the inflated view

        // 0. Inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_patient_main, container, false );

        // 1. set up the drawer




        // last. return the inflated view

        return rootView;

    } // end onCreateView
    
    /* Other Methods */

} // end fragment PatientMainFragment
