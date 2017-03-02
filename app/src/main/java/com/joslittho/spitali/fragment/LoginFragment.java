package com.joslittho.spitali.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.joslittho.spitali.R;
import com.joslittho.spitali.R2;
import com.joslittho.spitali.activity.PatientMainActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 *
 */
// begin fragment LoginFragment
public class LoginFragment extends Fragment {

    /* CONSTANTS */

    /* Integers */
    
    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = LoginFragment.class.getSimpleName();
    
    /* VARIABLES */

    /* CONSTRUCTOR */

    public LoginFragment() {
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
        // 1. bind views
        // last. return the inflated view

        // 0. Inflate the layout for this fragment

        View rootView = inflater.inflate( R.layout.fragment_login, container, false );

        // 1. bind views

        ButterKnife.bind( this, rootView );

        // last. return the inflated view

        return rootView;

    } // end onCreateView
    
    /* Other Methods */

    @OnClick( R2.id.login_b_sign_in )
    // begin onClickSignInButton
    public void onClickSignInButton ( View view ) {

        // 0. start the patient main activity

        // 0. start the patient main activity

        startActivity( new Intent( getActivity(), PatientMainActivity.class ) );

    } // end onClickSignInButton

} // end fragment LoginFragment
