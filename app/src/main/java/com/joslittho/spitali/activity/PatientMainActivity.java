package com.joslittho.spitali.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.joslittho.spitali.R;
import com.joslittho.spitali.R2;
import com.mikepenz.materialdrawer.AccountHeader;
import com.mikepenz.materialdrawer.AccountHeaderBuilder;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.ProfileDrawerItem;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 *
 */
// begin activity PatientMainActivity
public class PatientMainActivity extends AppCompatActivity {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /**
     * The logger.
     */
    private static final String LOG_TAG = PatientMainActivity.class.getSimpleName();
    
    /* VARIABLES */
    
    /* CONSTRUCTOR */
    
    /* METHODS */

    /* Toolbars */

    @BindView( R2.id.patient_main_toolbar )
    Toolbar toolbar; // ditto
    
    /* Getters and Setters */
    
    /* Overrides */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super stuff
        // 1. use the patient main layout
        // 2. bind
        // 3. set up toolbar
        // 4. set up drawer

        // 0. super stuff

        super.onCreate( savedInstanceState );

        // 1. use the patient main layout

        setContentView( R.layout.activity_patient_main );

        // 2. bind

        ButterKnife.bind( this );

        // 3. set up toolbar

        setSupportActionBar( toolbar );

        // 4. set up drawer

        AccountHeader header = new AccountHeaderBuilder().withActivity( this )
                .withHeaderBackground( R.color.colorAccent )
                .addProfiles(
                        new ProfileDrawerItem().withName( "Jamie Kamau" )
                                .withEmail( getString( R.string.sample_email ) )
                                .withIcon( getResources().getDrawable( R.drawable.profile, null ) )
                )
                .build();

        PrimaryDrawerItem eventsDrawerItem = new PrimaryDrawerItem()
                .withName( "Events" )
                .withIcon( R.drawable.ic_event_black_24dp );
        PrimaryDrawerItem appointmentsDrawerItem = new PrimaryDrawerItem()
                .withName( "Appointments" )
                .withIcon( R.drawable.ic_appointments_black_24dp );
        PrimaryDrawerItem pregnancyAndBabyDrawerItem = new PrimaryDrawerItem()
                .withName( "Pregnancy and Baby" )
                .withIcon( R.drawable.ic_pregnancy_and_baby_black_24dp );
        PrimaryDrawerItem subscriptionsDrawerItem = new PrimaryDrawerItem()
                .withName( "Subscriptions" )
                .withIcon( R.drawable.ic_subscriptions_black_24dp );
        PrimaryDrawerItem aboutDrawerItem = new PrimaryDrawerItem()
                .withName( "About" )
                .withIcon( R.drawable.ic_about_black_24dp );
        PrimaryDrawerItem signOutDrawerItem = new PrimaryDrawerItem()
                .withName( "Sign Out" )
                .withIcon( R.drawable.ic_sign_out_black_24dp );
        DividerDrawerItem dividerDrawerItem = new DividerDrawerItem();

        Drawer drawer = new DrawerBuilder()
                .withActivity( this )
                .withAccountHeader( header )
                .withToolbar( toolbar )
                .addDrawerItems(
                        eventsDrawerItem,
                        appointmentsDrawerItem,
                        pregnancyAndBabyDrawerItem,
                        subscriptionsDrawerItem,
                        aboutDrawerItem,
                        dividerDrawerItem,
                        signOutDrawerItem )
                .build();

    } // end onCreate
    
    /* Other Methods */

} // end activity PatientMainActivity
