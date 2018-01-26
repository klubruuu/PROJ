package com.example.klau.projekt4googlemaps;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WyswietlDodanePunkty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyswietl_dodane_punkty);

        SharedPreferences sharedPreferences = this.getSharedPreferences("Dane", Context.MODE_PRIVATE);
        Integer iloscElementow = sharedPreferences.getInt("IloscElementow",0);
        TextView text = (TextView) findViewById(R.id.WYswietlPunktyTextView);
        String wynik = "";
        for(int i = 0; i<=iloscElementow;i++){

            String nazwa = sharedPreferences.getString("Nazwa"+i,"");
            String opis = sharedPreferences.getString("Opis"+i,"");
            String szerokosc = sharedPreferences.getString("Szerokosc"+i,"");
            String wysokosc = sharedPreferences.getString("Wysokosc"+i,"");

            if(!nazwa.equals("") && !szerokosc.equals("") && !wysokosc.equals("")){
                wynik= wynik + "Nazwa: " + nazwa + "\n";
                wynik = wynik +"Opis: " + opis + "\n";
                wynik = wynik + "Szerokosc: " + szerokosc + "\n";
                wynik = wynik + "Wysokosc: " + wysokosc + "\n";
            }
        }
        text.setText(wynik);

    }
}
