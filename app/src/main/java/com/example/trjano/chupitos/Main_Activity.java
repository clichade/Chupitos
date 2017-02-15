package com.example.trjano.chupitos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Un fragment es digamos una sub activity (una activity dentro de otra), y se usa dentro de una acivity
 */

public class Main_Activity extends AppCompatActivity implements View.OnClickListener{

    Button btSuave; Button btExotico; Button btA_Matar;
    TextView tvTipos;
    ArrayList<Chupito> listC;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        listC = new ArrayList<>();


        //creamos los 3 chupitos que nos interesa cojer
        listC.add(new Chupito("Jagger", Tipo.EXOTICO,
                "Chupito Normal, que no es ninguna locura", "Jagger", "Lima"));
        listC.add(new Chupito("BlueTropic", Tipo.SUAVE,
                "Por el nombre seguro que deduces que es azul", "Trópico", "Azul"));
        listC.add(new Chupito("Absenta", Tipo.DURO,
                "Es absenta, este te lo conoces", "absenta", "SATÁN","REDES"));

        btSuave = (Button) this.findViewById(R.id.btSuave);
        btExotico = (Button) this.findViewById(R.id.btExotico);
        btA_Matar = (Button) this.findViewById(R.id.btA_Matar) ;
        tvTipos = (TextView) this.findViewById(R.id.tvTipos);


        //set on click listener les permite a los botones reaccionar a los clicks
        btSuave.setOnClickListener(this);
        btExotico.setOnClickListener(this);
        btA_Matar.setOnClickListener(this);
    }





    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,Chupito_Activity.class);
        Bundle b = new Bundle();
        Chupito chupito = listC.get(0);


       switch (v.getId()){

            case R.id.btSuave:

                b.putString("ingredientes", chupito.getIngredientes());
                b.putString("nombre", chupito.getNombre());
                b.putString("descripcion",chupito.getDescripcion());
                b.putInt("ivIcon",chupito.getIcon());
                intent.putExtras(b);
                startActivity(intent);
                break;

            case R.id.btExotico:

                chupito = listC.get(1);
                b.putString("ingredientes", chupito.getIngredientes());
                b.putString("nombre", chupito.getNombre());
                b.putString("descripcion",chupito.getDescripcion());
                b.putInt("ivIcon",chupito.getIcon());
                intent.putExtras(b);
                startActivity(intent);
                break;

            case R.id.btA_Matar:

                chupito = listC.get(2);
                b.putString("ingredientes", chupito.getIngredientes());
                b.putString("nombre", chupito.getNombre());
                b.putString("descripcion",chupito.getDescripcion());
                b.putInt("ivIcon",chupito.getIcon());

                intent.putExtras(b);
                startActivity(intent);
                break;

        }


    }
}