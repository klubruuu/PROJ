package com.example.klau.projekt4googlemaps;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    public void OtworzMape(View view) {
//        Intent Intent = new Intent(this, MapsActivity.class);
//        startActivity(Intent);
//    }

    public void OtworzMape(View view){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void NowyElementActivity(View view){
        Intent intent = new Intent(this, DodajNowyPunkt.class);
        startActivity(intent);
    }

    public void WyswietlDodanePunkty(View view){
        Intent intent = new Intent(this, WyswietlDodanePunkty.class);
        startActivity(intent);
    }
//    public void goToAnotherActivity(View view) {
//        Intent Intent = new Intent(this, AnotherActivity.class);
//        startActivity(Intent);
//    }
    //kubru trying

    
}
