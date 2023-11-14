package com.johnson.webcomicreader;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {
    ViewGroup linearLayout;
    Button baldoBtn;
    Button bCBtn;
    Button bleachersBtn;
    Button foxTrotBtn;
    Button explosimBtn;
    Button hagarBtn;
    Button orangeBtn;
    Button pearlsBtn;
    Button xkcdBtn;
    Button zitsBtn;
    Button washPostBtn;


    private boolean isNetworkAvailable() {
        ConnectivityManager cm = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        assert cm != null;

        Network currentNetwork = cm.getActiveNetwork();
        NetworkCapabilities caps = cm.getNetworkCapabilities(currentNetwork);

        return (currentNetwork != null && caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_VALIDATED));
    }

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.layout);
        this.linearLayout = (ViewGroup) findViewById(R.id.layout);
        this.linearLayout.setScrollContainer(true);

        // Baldo
        this.baldoBtn = new Button((Context) this);
        this.baldoBtn.setText(R.string.baldo);
        this.baldoBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.baldoBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/baldo/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.baldoBtn);

        // BC
        this.bCBtn = new Button((Context) this);
        this.bCBtn.setText(R.string.BC);
        this.bCBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.bCBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/bc/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.bCBtn);

        // In The Bleachers
        this.bleachersBtn = new Button((Context) this);
        this.bleachersBtn.setText(R.string.bleachers);
        this.bleachersBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.bleachersBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/in-the-bleachers/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.bleachersBtn);

        // Fox-Trot
        this.foxTrotBtn = new Button((Context) this);
        this.foxTrotBtn.setText(R.string.foxtrot);
        this.foxTrotBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.foxTrotBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/fox-trot/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.foxTrotBtn);

        // Explosm
        this.explosimBtn = new Button((Context) this);
        this.explosimBtn.setText(R.string.explosim);
        this.explosimBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.explosimBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "http://www.explosm.net/comics/new/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.explosimBtn);

        // Hagar The Horrible
        this.hagarBtn = new Button((Context) this);
        this.hagarBtn.setText(R.string.hagar);
        this.hagarBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.hagarBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/hagar-the-horrible/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.hagarBtn);

        // Rhymes With Orange
        this.orangeBtn = new Button((Context) this);
        this.orangeBtn.setText(R.string.orange);
        this.orangeBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.orangeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/rhymes-with-orange/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.orangeBtn);

        // Pearls Before Swine
        this.pearlsBtn = new Button((Context) this);
        this.pearlsBtn.setText(R.string.pearls);
        this.pearlsBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.pearlsBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/pearls-before-swine/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.pearlsBtn);

        // XKCD
        this.xkcdBtn = new Button((Context) this);
        this.xkcdBtn.setText(R.string.xkcd);
        this.xkcdBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.xkcdBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "http://xkcd.com"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.xkcdBtn);

        // Zits
        this.zitsBtn = new Button((Context) this);
        this.zitsBtn.setText(R.string.zits);
        this.zitsBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.zitsBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/zits/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.zitsBtn);

        // Washington Post Comics
        this.washPostBtn = new Button((Context) this);
        this.washPostBtn.setText(R.string.washpost);
        this.washPostBtn.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.washPostBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View param1View) {
                if (!Main.this.isNetworkAvailable()) {
                    Toast.makeText(Main.this.getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(
                        "https://www.washingtonpost.com/entertainment/comics/"));
                Main.this.startActivity(intent);
            }
        });
        this.linearLayout.addView((View) this.washPostBtn);
    }

    protected void onResume() {
        super.onResume();
        if (!isNetworkAvailable()) {
            Toast.makeText(getApplicationContext(), "No Network Connection", Toast.LENGTH_SHORT).show();
        }
    }
}
