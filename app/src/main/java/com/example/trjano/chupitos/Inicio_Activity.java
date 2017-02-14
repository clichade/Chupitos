package com.example.trjano.chupitos;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Un fragment es digamos una sub activity (una activity dentro de otra), y se usa dentro de una acivity
 */

public class Inicio_Activity extends AppCompatActivity implements View.OnClickListener{

    Button btSuave; Button btExotico; Button btA_Matar;
    TextView tvTipos;
    ArrayList<Chupito> listC;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_view);
        listC = new ArrayList<>();

        listC.add(new Chupito("Piporro", Tipo.EXOTICO, "Chupito Normal, que no es ninguna locura",
                "Piperro", "Manifiesto comunista"));

        listC.add(new Chupito("Piporro", Tipo.EXOTICO, "Chupito Normal, que no es ninguna locura",
                "Piperro", "Manifiesto comunista"));

        listC.add(new Chupito("Piporro", Tipo.EXOTICO, "Chupito Normal, que no es ninguna locura",
                "Piperro", "Manifiesto comunista"));

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
                System.out.println("entra en suave");
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
                System.out.println("entra en matar");
                intent.putExtras(b);
                startActivity(intent);
                break;

        }


    }
}