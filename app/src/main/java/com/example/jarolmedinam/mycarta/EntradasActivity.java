package com.example.jarolmedinam.mycarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class EntradasActivity extends Activity {

    ListView listaDatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);

        listaDatos = (ListView) findViewById(R.id.lstDatos);

        Lista = new ArrayList<Datos>(); //inicializamos la lista

        Lista.add(new Datos(1,"Ceviche de mango","Este refrescante ceviche de mango se prepara con mangos frescos, cebolla colorada, jugo de limón, jugo de naranja, ajíes o chiles (puede ser habanero, fresno, amarillo, ají común, etc), cilantro, y sal.",R.drawable.ceichemango));
        Lista.add(new Datos(2,"Aguacates rellenos con ensalada de huevo duro","Esta deliciosa receta de aguacates rellenos con ensalada de huevo duro se prepara usando paltas o aguacates maduros y se los rellena con una exquisita ensalada de huevo duro, rábanos, cebolla, apio. La ensalada de huevo duro lleva un aderezo de mayonesa, yogurt, mostaza, jugo de limón, comino, y jalapeño.",R.drawable.aguacateconhuevo));
        Lista.add(new Datos(3,"Ensalada de garbanzos con atún y aguacate","Esta ensalada de garbanzos con atún y aguacate es una receta sencilla y deliciosa que queda perfecta para una comida rápida de último momento, pero al mismo también se puede preparar de antemano y tenerla lista para una fiesta o un picnic. Esta ensalada rápida y refrescante se prepara con garbanzos, aguacate, atún de lata, cebolla, tomate, y un aderezo básico de limón con mostaza y cilantro.",R.drawable.ensaladagarbanzo));
        Lista.add(new Datos(4,"Empanadas de carne","Estas exquisitas empanadas de carne se preparan con un relleno de picadillo de carne de res. El relleno o condumio de estas empanadas casera es muy sencillo y delicioso, lleva carne molida de res, cebolla, ajo, orégano, comino, achiote, sal, y pimienta. ",R.drawable.empanadacarne));
        Lista.add(new Datos(5,"Ceviche de camarón y aguacate","Este delicioso ceviche de camarón y aguacate se prepara con camarones, aguacate, cebolla colorada, tomates, pimientos, naranja agria, limón, cilantro, y sal.",R.drawable.cevichedecamaron));
        Lista.add(new Datos(6,"Ensalada de camarón","Esta deliciosa ensalada de camarón se prepara con camarones, cebolla, rábanos, pimiento, apio, huevo duro, y mayonesa de cilantro. Esta ensalada de camarones se sirve fría – se puede servir al momento de prepararla o se puede hacer de antemano y guardarla refrigerada hasta el momento de servirla.",R.drawable.ensaladacamaron));
        Lista.add(new Datos(7,"Ceviche de pescado","Esta es la receta del ceviche de pescado que prepara mi hermano Ramón. Se prepara con pescado marinado en jugo de limón con ajíes o chiles picantes y ajo, y luego se mezcla con cebolla colorada, tomate, pimientos, y cilantro. Los que han probado el ceviche de Ramón, también conocido como Monchito, saben que es una delicia. ",R.drawable.cevichepescado));
        Lista.add(new Datos(8,"Empanadas de langostino y chorizo","Estas empanadas de langostino y chorizo fueron inspiradas por los sabores de la comida criolla del estado de Luisiana (Louisiana en inglés). Una de las cosas de me encanta de la comida típica criolla o cajun de Luisiana, aparte de los gratos recuerdos de la comida de mi abuelita, es la combinación perfecta de sabores españoles y franceses. ",R.drawable.empanalangosti));



        Adaptador miadaptador = new Adaptador(getApplicationContext(),Lista);
        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //obj tendra el objetivo selecciona con toda la información
                Datos obj = (Datos) parent.getItemAtPosition(position);

               Intent paso = new Intent(getApplicationContext(), DetalleActivity.class);
               paso.putExtra("objeto",(Serializable) obj); //serializamos el objeto dentro del campo llamado objeto
               startActivity(paso);

            }
        });


    }
}
