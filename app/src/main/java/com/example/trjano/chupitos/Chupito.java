package com.example.trjano.chupitos;

import java.util.ArrayList;

/**
 * Created by trjano on 26/01/2017.
 */
public class Chupito {

    //El nombre del chupito
    String nombre;

    //La lista con el nombre de los ingredientes
    ArrayList<String> ingredientes;

    //Una descripción que quieras añadir al chupito
    String descripcion;

    //El tipo de chupito que puede ser SUAVE,EXOTICO O DURO
    Tipo tipo;


    public Chupito(String nombre,Tipo tipo,
                   String descripcion, String ingrediente1){
        this.nombre = nombre;
        ingredientes = new ArrayList<String>();
        this.tipo = tipo;
        ingredientes.add(ingrediente1 +" \n");
        this.descripcion = descripcion;
    }
    public Chupito(String nombre,Tipo tipo, String descripcion,
                   String ingre1, String ingre2){
        this.nombre = nombre;
        ingredientes = new ArrayList<String>();
        this.tipo = tipo;
        ingredientes.add(ingre1 +" \n");
        ingredientes.add(ingre2 +" \n");
        this.descripcion = descripcion;
    }

    public Chupito(String nombre,Tipo tipo, String descripcion,
                   String ingre1, String ingre2, String ingre3) {
        this.nombre = nombre;
        ingredientes = new ArrayList<String>();
        this.tipo = tipo;
        ingredientes.add(ingre1 + " \n");
        ingredientes.add(ingre2 + " \n");
        ingredientes.add(ingre3 + " \n");
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getIngredientes() {
        String string ="";
        for (String ingre:ingredientes) {
            string += "-" + ingre + "\n";
        }
        return string;
    }

    public Tipo getTipo() {
        return tipo;
    }

    /**
     *
     * @return dependiendo del tipo de chupito que es devolverá el identificador de una imagen u otra
     */
    public int getIcon(){
        int icon = R.mipmap.duro_icon;
        switch (tipo){
            case SUAVE:
                icon = R.mipmap.suave_icon;
                break;
            case EXOTICO:
                icon = R.mipmap.exotico_icon;
                break;
            case DURO:
                icon = R.mipmap.duro_icon;
                break;
        }

        return icon;
    }

}
