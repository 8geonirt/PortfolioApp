package com.udacitynanodegree.trino.portfolioapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnAppSpotify:
                displayToast("This button will launch my Spotify Streamer App!");
                break;
            case R.id.btnAppSuperDuo:
                displayToast("This button will launch my Super Duo App!");
                break;
            case R.id.btnAppBuildIt:
                displayToast("This button will launch my Build It Bigger App!");
                break;
            case R.id.btnAppXYZ:
                displayToast("This button will launch my XYZ Reader App!");
                break;
            case R.id.btnAppCapstone:
                displayToast("This button will launch my Capstone App!");
                break;
        }

    }

    private void displayToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();
    }
}
