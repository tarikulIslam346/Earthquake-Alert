package com.tarikul.myapplication4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.EventLogTags;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    ImageButton btn, btn1, btn2, btn3, btn4, btn5, btn6, btn7;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //        //
        btn = (ImageButton) findViewById(R.id.info);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(tp);
            }
        });
        btn1 = (ImageButton) findViewById(R.id.gmap);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.earthquakealart.eu.pn/AndroidMap.php"));
                startActivity(tp);
            }
        });


        btn3 = (ImageButton) findViewById(R.id.photo);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(MainActivity.this, PhotoActivity.class);
                startActivity(tp);
            }
        });

        btn5 = (ImageButton) findViewById(R.id.imageButton4);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(tp);
            }
        });

        ;
        btn7 = (ImageButton) findViewById(R.id.imageButton6);
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(MainActivity.this, NewsActivity.class);
                startActivity(tp);
            }
        });
        btn6 = (ImageButton) findViewById(R.id.imageButton);
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                //phoneIntent.setData(Uri.parse("tel:01796248701"));
                Intent tp = new Intent(MainActivity.this,PhoneActivity.class);
                startActivity(tp);
            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Add here", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.navigate) {
            startActivity(new Intent(this, InfoActivity.class));
        }
        //

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            startActivity(new Intent(this, AboutActivity.class));
        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(this, MotoActivity.class));
        } else if (id == R.id.nav_slideshow) {
            startActivity(new Intent(this, EnvironmentActivity.class));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.tarikul.myapplication4/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.tarikul.myapplication4/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
