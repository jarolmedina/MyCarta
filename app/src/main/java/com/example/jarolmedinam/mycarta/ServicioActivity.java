package com.example.jarolmedinam.mycarta;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.hsalf.smilerating.SmileRating;

public class ServicioActivity extends Activity {

    ImageButton btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio);

        btn1 = (ImageButton) findViewById(R.id.imgButtonCa);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Calificado. Gracias por utilizar nuestro servicio. Esperamos su regreso a JM Food's", Toast.LENGTH_LONG).show();
            }
        });



        SmileRating smileRating = (SmileRating) findViewById(R.id.smile_rating);
        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {

                switch (smiley) {
                    case SmileRating.BAD:
                        Toast.makeText(ServicioActivity.this,"BAD", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(ServicioActivity.this,"GOOD", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(ServicioActivity.this,"GREAT", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(ServicioActivity.this,"OKAY", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(ServicioActivity.this,"TERRIBLE", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        });

        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
            @Override
            public void onRatingSelected(int level, boolean reselected) {

                Toast.makeText(ServicioActivity.this,"Selected rating " + level, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
