package data;

import model.Objetivo;

import java.util.ArrayList;

public class ObjetivosData {
    private ArrayList<Objetivo> objetivos = new ArrayList<Objetivo>();
    public ArrayList<Objetivo> createObjetivos(){
        return objetivos;
    }

    public ArrayList<Objetivo> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(ArrayList<Objetivo> objetivos) {
        this.objetivos = objetivos;
    }
}
