package com.example.tpb;
/*Crear una aplicación que contenga 4 botones los cuales muestren 4 recetas diferentes por pantalla.*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton arroz,milanesa,omellete,pan;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arroz=findViewById(R.id.arroz);
        milanesa=findViewById(R.id.milanesa);
        omellete=findViewById(R.id.omellete);
        pan=findViewById(R.id.pan);
        textView =findViewById(R.id.textView);

    }
    public void mostrar(View view){
    if(arroz.isChecked()){
        String texto="1. Trocear el pollo en pedazos pequeños y saltearlo en la sartén caliente (con un chorrito de aceite) hasta que esté dorado de ambas partes. Retirar y reservar.\n" +
                "2. Saltear en el fondo de cocción del pollo la cebolla, el morrón y el ajo, todo picado pequeño." +
                "3. Cuando la cebolla esté transparente, incorporar el tomate, también picado. Sofreír hasta que tome un color amarronado.\n" +
                "4. Incorporar los trozos de pollo que habíamos reservado. Agregar el arroz y remover, salteando a fuego medio, hasta que los granos de arroz se vean transparentes.\n" +
                "5. Agregar el doble de agua (2 tazas), salpimentar y condimentar. Agregar también el chorro de aceto o vino. Revolver una sola vez y dejar que hierva. Cuando hirvió, bajar el fuego a medio y cocinar destapado, hasta que el arroz haya consumido toda el agua. No revolver durante la cocción.\n" +
                "6. Servir y llover con ciboulette picado. Se puede comer con limón.\n";
        textView.setText(texto);

    } else if (milanesa.isChecked()) {
        String texto="1. Para empezar con la receta de milanesa de carne, primero debes sazonar la carne con la sal, la pimienta y el orégano al gusto. Luego, pasa cada uno de los filetes de ternera por el pan rallado que necesites (por ambos lados).\n" +
                "2.En un recipiente aparte, bate los huevos y baña los filetes de carne en ellos. Después, para fijar el rebozado de las milanesas, vuelve a pasarlos por el pan rallado.\n" +
                "3.Ahora, pon el aceite a calentar y, cuando esté caliente, fríe los filetes de carne rebozados a fuego medio. Deberás freírlos hasta que estén dorados por ambos lados.\n" +
                "4.Para retirar el exceso de aceite de las milanesas de carne puedes colocarlas en papel absorbente. ¡Listas para comer! Cuéntanos en los comentarios tu opinión y comparte con nosotros una fotografía del resultado final.\n";
        textView.setText(texto);

    } else if (omellete.isChecked()) {
        String texto="1.Para hacer un omelette de huevo delicioso es importante contar con una buena sartén antiadherente, solo así conseguirás que no se pegue y que quede delicioso. Además recuerda que puedes hacer esta tortilla francesa completamente redonda o doblarla por la mitad.\n" +
                "2.Coloca un chorrito de aceite en la sartén y llévala a fuego medio. Mientras tanto añade los huevos a un bol, agrega dos cucharadas de leche para un resultado más esponjo, salpimienta al gusto y remueve hasta obtener una mezcla perfectamente homogénea. Si quieres que el omelette de huevo te quede suave es importante que no remuevas demasiado, pues mientras más lo haces más consistente será.\n" +
                "3.Una vez que el aceite esté caliente agrega el huevo a la sartén. El mismo comenzará a cocinarse, cuando los bordes estén ligeramente cocinados, levanta el omelette de un lado con una espátula permitiendo que el huevo que esté aún líquido se vaya a los bordes y se cocine. Voltea cuando esté casi lista.\n" +
                "4.Si te gusta el omelette suave y no demasiado cocinado puedes dejarlo al fuego un minuto más y luego doblarlo por la mitad y retirarlo. Si por el contrario lo prefieres bien cocido, entonces deja que se haga hasta el punto que quieres. Cuando esté a tu gusto retira de la sartén con la ayuda de una espátula o con un plato.\n" +
                "5.Sirve tu omelette de huevo acompañado de pan, jamón, pavo o queso. ¡Un desayuno delicioso!";
        textView.setText(texto);

    } else if (pan.isChecked()) {
        String texto="1.En un recipiente mediano colocar 375 ml. de agua a temperatura ambiente (ni muy fría ni caliente). En el mismo agregar 6gr de levadura fresca y disolverla en el agua. Reservar.\n" +
                "2.Por otro lado, separar ½ kg de harina 000 y disponer la harina en forma corona, armando un hueco en el centro. Por los costados agregar 1 cucharada de sal y en el centro agregar la levadura reservada.\n" +
                "3.Con una cuchara comenzar a integrar la harina con la levadura, desde dentro hacia fuera. Todo tiene que quedar muy bien mezclado, con la ayuda de las manos terminar de unir el líquido con la harina, sin amasar, solo unir. Tiene que quedar una masa unida pero pegajosa.\n" +
                "4.Una vez logrado, estirar la masa y doblarla sobre sí misma 5 o 6 veces repetidas, agarrar, estirar y doblar. Después, taparla con un trapo y dejarla en reposo por 15 minutos.\n" +
                "5.Pasado el tiempo, nuevamente se repite el paso anterior, estirar la masa y doblarla sobre sí misma 5 veces más. Luego tapar el recipiente con papel film o bee wrap y llevar a la heladera por 1 noche o al menos 8 horas.\n" +
                "6.Pasado el tiempo, debe haber crecido y estar mucho más manejable. Colocar harina sobre una superficie lisa y volcar la masa, con mucho cuidado, sobre la mesada.\n" +
                "7.Estirar y desgasificar la masa, aplastando un poco con ayuda de las manos. Todavía sin amasar, solo estirarla. Ahora es momento de darle forma a los panes.\n" +
                "8.En una fuente para horno con bastante harina o manteca y harina, ubicar los panes y taparlos nuevamente para dejar levar por un rato más, al menos una hora.\n" +
                "9.Pasado el tiempo ya estaría todo listo para llevar los panes al horno precalentado, bien caliente, más o menos a 200 – 230. Cocinar por 30 – 40 minutos.";

        textView.setText(texto);
    }
        textView.setMovementMethod(new ScrollingMovementMethod());


    }
}