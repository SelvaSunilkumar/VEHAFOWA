package com.example.vehafowa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class vehaCon extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private NavigationView navigationView;
    private ActionBarDrawerToggle toggle;

    Intent nextActivity;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veha_con);

        drawerLayout = findViewById(R.id.drawer);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId())
        {
            case R.id.home:
                //Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
                nextActivity = new Intent(this,home.class);
                startActivity(nextActivity);
                finish();
                break;
            case R.id.about:
                //Toast.makeText(getApplicationContext(),"About Us",Toast.LENGTH_SHORT).show();
                nextActivity = new Intent(this,AboutUs.class);
                startActivity(nextActivity);
                break;
            case R.id.circular:
                //Toast.makeText(getApplicationContext(),"Disclaimer: Currently the Circular activity is suspended temporarily, will be available from next update.",Toast.LENGTH_SHORT).show();
                AlertDialog.Builder dialog=new AlertDialog.Builder(this);
                dialog.setMessage("visit : www.myvehafowa.org/circulars/");
                dialog.setTitle("View the circular from website");
                dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"please wait...",Toast.LENGTH_SHORT).show();
                        Uri urluri = Uri.parse("https://www.myvehafowa.org/circulars/");
                        Intent launchbrowser = new Intent(Intent.ACTION_VIEW,urluri);
                        startActivity(launchbrowser);
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT).show();
                        return;
                    }
                });
                AlertDialog alertDialog = dialog.create();
                alertDialog.show();
                break;
            case R.id.issue:
                //Toast.makeText(getApplicationContext(),"Issue Tracking",Toast.LENGTH_SHORT).show();
                dialog = new AlertDialog.Builder(this);
                dialog.setMessage("directing to : www.myvehafowa.org/issue-tracking/");
                dialog.setTitle("To view the issue tracking from website");
                dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"please wait...",Toast.LENGTH_SHORT).show();
                        Uri urluri = Uri.parse("https://www.myvehafowa.org/issue-tracking/");
                        Intent launchbrowser = new Intent(Intent.ACTION_VIEW,urluri);
                        startActivity(launchbrowser);
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"please wait for other update",Toast.LENGTH_SHORT).show();
                        return;
                    }
                });
                alertDialog = dialog.create();
                alertDialog.show();
                break;
            case R.id.kyc:
                //Toast.makeText(getApplicationContext(),"KYC",Toast.LENGTH_SHORT).show();
                dialog = new AlertDialog.Builder(this);
                dialog.setMessage("directing to : www.myvehafowa.org/kyc");
                dialog.setTitle("View the kyc form from website");
                dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Visit myvehafowa.org",Toast.LENGTH_SHORT).show();
                        Uri urluri = Uri.parse("http://project.tce.edu:6543/login?");
                        Intent launchbrowser = new Intent(Intent.ACTION_VIEW,urluri);
                        startActivity(launchbrowser);
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"please wait for other update",Toast.LENGTH_SHORT).show();
                    }
                });
                alertDialog = dialog.create();
                alertDialog.show();
                break;
            case R.id.gallery:
                //Toast.makeText(getApplicationContext(),"Gallery",Toast.LENGTH_SHORT).show();
                dialog = new AlertDialog.Builder(this);
                dialog.setMessage("directing to : https://www.myvehafowa.org/gallery/");
                dialog.setTitle("To View the gallery form from website");
                dialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"please wait...",Toast.LENGTH_SHORT).show();
                        Uri urluri = Uri.parse("https://www.myvehafowa.org/gallery/");
                        Intent launchbrowser = new Intent(Intent.ACTION_VIEW,urluri);
                        startActivity(launchbrowser);
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //Toast.makeText(getApplicationContext(),"please wait for other update",Toast.LENGTH_SHORT).show();
                        return;
                    }
                });
                alertDialog = dialog.create();
                alertDialog.show();
                break;
            case R.id.contact:
                //Toast.makeText(getApplicationContext(),"Contact",Toast.LENGTH_SHORT).show();
                nextActivity = new Intent(this,vehaCon.class);
                startActivity(nextActivity);
                break;
        }
        return false;
    }
}
