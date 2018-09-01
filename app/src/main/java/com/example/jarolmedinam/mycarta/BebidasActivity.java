package com.example.jarolmedinam.mycarta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class BebidasActivity extends Activity {

    ListView listaDatos;
    ArrayList<Datos> Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        listaDatos = (ListView) findViewById(R.id.lstDatosBebidas);

        Lista = new ArrayList<Datos>();

        Lista.add(new Datos(1,"LICUADO DE CHOCOLATE CON PLÁTANO","Si estás buscando un licuado rico y saludable para el desayuno de tus hijos, con el nuevo NESQUIK 25% menos azúcar prepárales esta rica versión de chocolate y plátano con un toque de granola y fresas naturales.",R.drawable.licuadoplatano));
        Lista.add(new Datos(2,"CHAMOYADA DE TAMARINDO","Prepara esta deliciosa bebida a base de hielo raspado mezclado con pulpa de tamarindo, con su rico contraste acidito y dulce, servida con chamoy líquido, chile en polvo y un toque de jugo de limón. Sólo necesitas 10 ingredientes para prepararla.",R.drawable.chamoyatamarindo));
        Lista.add(new Datos(3,"AGUA DE LIMÓN SEVILLANO","Prepara esta espumosa y cremosa agua de limón sevillano típica del estado de Puebla. Esta refrescante bebida es una modificación de un agua de limón en donde se le agrega leche y se licúa durante pocos segundos con los limones con cáscara, lo que hace que sea única y deliciosa.",R.drawable.limonsevillano));
        Lista.add(new Datos(4,"DELICIOSO BLOODY MARY","El bloody mary es un coctel muy popular que tiene como base vodka con jugo de tomate, mezclado con un sabor acidito de jugo de limón, con salsa inglesa o worcestershire y un ligero toque picante muy característico de esta bebida. ¡Ideal para un brunch!",R.drawable.bloody));
        Lista.add(new Datos(5,"SMOOTHIES 4 WAYS","Consiéntete con estos 4 smoothies de distintos sabores y colores inspirados en los personajes de la nueva película de Han Solo®. Son muy fáciles de preparar, con la consistencia perfecta del smoothie y con sabores deliciosos: plátano con mango, zanahoria con fresa, mora azul y zarzamora.",R.drawable.smoot));
        Lista.add(new Datos(6,"DELICIOSA MARGARITA DE MANGO","Este 5 de mayo prepara esta deliciosa y fresca margarita de mango, escarchada con chile en polvo y decorada con rodajas de limón. Aprovecha la temporada de esta irresistible fruta y combínala con el increíble sabor del tequila. ¡Sólo necesitas una licuadora para prepararla!",R.drawable.margaritamango));
        Lista.add(new Datos(7,"MOJITO FRAPPÉ DE COCO","Con este calor, ¿a quién no se le antoja un rico mojito frappé de coco? Esta bebida es refrescante, ligera y llena de sabor a coco y hierbabuena con un toque de limón y ron. ¡Tienes que probarlo!",R.drawable.mojito));
        Lista.add(new Datos(8,"MALTEADA RED VELVET","La receta de Red Velvet es a base de cocoa o chocolate con un toque de colorante rojo, aquí te dejamos la versión en malteada, preparada con helado de yogurt, fresas y frambuesas para hacerla más saludable y deliciosa, esta malteada es ideal para prepararla el día de San Valentín. ¡Es riquísima!",R.drawable.malteada));

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
