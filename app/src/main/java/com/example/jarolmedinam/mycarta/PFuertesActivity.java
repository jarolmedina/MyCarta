package com.example.jarolmedinam.mycarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class PFuertesActivity extends Activity {


    ListView listaDatos;
    ArrayList<Datos> Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pfuertes);

        listaDatos = (ListView) findViewById(R.id.lstDatosPFuerte);

        Lista = new ArrayList<Datos>();

        Lista.add(new Datos(1,"Bandeja Paisa","Un plato típico de la zona de Antioquia, a condición de 9 ingredientes: Arroz, huevos, salchichas, carne picada, aguacate, plátano, carne de cerdo, frijoles y pan de maíz y, aunque los Paisas son sus mayores consumidores, en cualquier parte del país puede encontrar este delicioso plato.",R.drawable.uno));
        Lista.add(new Datos(2,"Ajiaco","Una sopa muy popular en la capital colombiana. Compuesto de 3 tipos diferentes de papas, maíz, pollo, guisantes, zanahorias, y su guasca (ingrediente esencial, que es una hierba aromática, la cual le da un sabor singular). Principalmente se puede encontrar en Bogotá y algunas ciudades en el departamento de Cundinamarca.",R.drawable.dos));
        Lista.add(new Datos(3,"Tamal","Es ideal para un buen desayuno o una onces de la tarde. Hecho de arroz, harina de color amarillo o blanco, carne de cerdo, pollo, huevo, zanahoria, a veces, guisantes, patatas y envuelto y cocinado en hojas de plátano. Hay diferentes versiones con cambio de algunos ingredientes. Dependiendo de la región puede ser llamado hallaca o tamal.",R.drawable.tres));
        Lista.add(new Datos(4,"Sancocho","Esta es una sopa que se hace con diferentes tipos de carne. Puede ser carne de res, cerdo, pollo o incluso todos juntos en un plato. Además, de patata, plátano verde, yuca y maíz, una preparación sencilla. Es conocida en todo el país. Hará del paladar una delicia.",R.drawable.cuatro));
        Lista.add(new Datos(5,"Lechona Tolimense","Uno de los platos más divertidos si usted es un extranjero que visita Colombia, es un plato hecho de arroz y carne de cerdo, junto con los guisantes y las especias. Se ha elaborado de piel de cerdo y su presentación incluye la cabeza. Particular delicia gastronómica",R.drawable.cinco));
        Lista.add(new Datos(6,"Arroz con Coco","Muy popular en el área del Caribe y de la costa. Es posible encontrar en un restaurante donde se vende pescado, ya que es el acompañamiento perfecto. Una preparación de arroz, coco, cola o leche de coco, con textura interesante y un sabor único.",R.drawable.seis));
        Lista.add(new Datos(7,"Arroz con Pollo","Es algo así como la paella de fama mundial, pero sólo mariscos pollo, su consistencia es similar y se prepara con arroz, guisantes, zanahoria, pimentón, cebolla, chorizo y frijoles. Se puede encontrar en cualquier región de Colombia.",R.drawable.siete));
        Lista.add(new Datos(8,"La Chiquita Zamora","Una vez más una sopa, siendo una preparación cundiboyasense toma algunas de las cosas que se cultivan en la región. Tales como habas, nabos, cubios entre otras cosas. La carne que hizo que el plato fuera especial, es la carne de callos. Sopa que tiene un sabor delicioso.",R.drawable.ocho));
        Lista.add(new Datos(9,"Flanco","Puede ser asado o criollo salsa (salsa a base de tomate, cebolla, pimentón y cilantro), el bistec de falda es un corte de carne que debe ser cocido durante varias horas, pero es después tierna y deliciosa, la carne hijo da una textura especial.",R.drawable.nueve));
        Lista.add(new Datos(10,"Pescado","Gracias a que tenemos costas del Atlántico y del Pacífico, la cantidad de peces es abundante y se puede comer en varias preparaciones y variedades: Salsa de Bagre, viudo de pescado, mojarra frita o asada. Si se viaja a la costa, no se pierda el pescado fresco.",R.drawable.diez));

        Adaptador miadaptador = new Adaptador(getApplicationContext(),Lista);

        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Datos obj = (Datos) parent.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
                paso.putExtra("objeto",(Serializable) obj); //serializamos el objeto dentro del campo llamado objeto
                startActivity(paso);

            }
        });


    }
}
