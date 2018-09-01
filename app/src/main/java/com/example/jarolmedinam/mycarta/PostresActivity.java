package com.example.jarolmedinam.mycarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class PostresActivity extends Activity {


    ListView listaDatos;
    ArrayList<Datos> Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);

        listaDatos = (ListView) findViewById(R.id.lstDatosPostres);

        Lista = new ArrayList<Datos>();

        Lista.add(new Datos(1,"Tiramisú","Tan deliciosos como popular, el tiramisú el postre más característico de Italia (proveniente de la Toscana). Es un postre liviano y fresco, desde su forma tradicional con café se han creado otras variantes como el tiramisú de chocolate e incluso de limón. ",R.drawable.tiramisu));
        Lista.add(new Datos(2,"Postre pavlova","Este postre, además de ser increíblemente delicioso, tiene una historia muy particular, pues el origen del mismo es aún algo incierto. Lo que sí podemos afirmar es que la combinación del merengue con los frutos rojos del postre pavlova es un éxito asegurado que no puedes dejar de intentar. ",R.drawable.pavlova));
        Lista.add(new Datos(3,"Macarons","Estos coloridos y simpáticos bocaditos dulces hacen el postre perfecto para cualquier comida. Se elabora con clara de huevo, almendra molida, azúcar glas y azúcar. Estos postres se realizan en una amplia variedad de sabores según la época del año y la zona. Los macarons son particularmente conocidos por la gran gama de colores en la que se realizan. ",R.drawable.macarons));
        Lista.add(new Datos(4,"Torta negra del diablo","Una de las recetas más famosas y, sin dudas, la más rica de tortas de chocolate. La torta negra del diablo es muy sencilla de realizar y su sabor es muy intenso, permitiendo sentir en todo el paladar el chocolate. Una combinación excelsa es el relleno tanto de dulce de leche como de mermelada de fresa para la torta, sencillamente espectacular.",R.drawable.tortanegra));
        Lista.add(new Datos(5,"Flan","El flan, también conocido como leche asada, es uno de los favoritos de todas las familias, pues a grandes y chicos les encanta, con dulce de leche o con caramelo el flan es un postre ideal para cualquier ocasión, sin dudas, cualquiera de las dos opciones será mejor que la de sus inicios en el imperio romano donde se solía espolvorear con pimienta, por suerte más tarde se sustituyó por azúcar.",R.drawable.flan));
        Lista.add(new Datos(6,"Cheesecake ","El cheesecake es uno de los postres característicos de la cocina estadounidense (a pesar de su origen europeo). Si bien el cheesecake es el más popular, creo que el más delicioso es el cheesecake de fresas, pues brinda una dimensión más profunda de sabor. Es uno de los postres que nadie puede dejar de degustar.",R.drawable.chee));
        Lista.add(new Datos(7,"Brownies con helado","Imagina que acabas de comer un delicioso plato en el almuerzo, ahora el mesero sirve en tu mesa un plato con una porción de brownie acompañada con una bola de helado de vainilla típico de Florencia, pues no sé a tí, pero a mí se me ha hecho agua la boca. Los brownies son pequeños pasteles de chocolate con nueces picadas y van de maravilla con un buen helado.",R.drawable.brownie));
        Lista.add(new Datos(8,"Gula Melaka","Elaborada con azúcar de palmera y leche de coco, el Gula Melaka es un postre que tienes que probar cuando estés en Malasia o un restaurante de la gastronomía típica de dicho país. Es un postre liviano y muy dulce, perfecto para el verano.",R.drawable.gula));





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
