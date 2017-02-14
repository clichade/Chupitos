
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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Chupito_list_Activity extends AppCompatActivity  {

    ArrayList<Chupito> listChupitos;
    ListView listView ;
    Button btAnadir;
    Custom_Adapter adapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        System.out.println("Llega hasta aqui");

        listChupitos = new ArrayList<>();

        listChupitos.add(new Chupito("Jagger", Tipo.EXOTICO,
                "Chupito Normal, que no es ninguna locura", "Jagger", "Lima"));
        listChupitos.add(new Chupito("BlueTropic", Tipo.EXOTICO,
                "Este almenos sabe rico", "Trópico", "Azul"));
        listChupitos.add(new Chupito("Absenta", Tipo.EXOTICO,
                "Es absenta, este te lo conoces", "absenta", "SATÁN","REDES"));

        adapter = new Custom_Adapter(this, R.layout.row_listview, listChupitos);
        listView = (ListView) this.findViewById(R.id.lvList_chupito);
        btAnadir = (Button) this.findViewById(R.id.btAnadir);
        listView.setAdapter(adapter);
    }

}