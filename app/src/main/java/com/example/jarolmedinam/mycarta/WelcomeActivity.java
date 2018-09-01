package com.example.jarolmedinam.mycarta;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    void VerMapa(View v){

        Intent intencion = new Intent(this, MapsActivity.class);

        startActivity(intencion);
    }

    void VerMenu(View v){

        Intent intencion = new Intent(this, MenuActivity.class);

        startActivity(intencion);
    }

    void VerReserva(View v){

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, "Quiero reservar mesa a nombre de: ");
        sendIntent.setType("text/plain");
        sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);


    }

    void VerServicio(View v){

        Intent intencion = new Intent(this, ServicioActivity.class);

        startActivity(intencion);
    }



}
