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

    public void adicionaObjetivo(Objetivo objetivo){
        System.out.println(objetivos.add(objetivo));
    }

    public void atualizaObjetivo(Objetivo objetivo, Objetivo newObjetivo){
       if(objetivos.isEmpty()){
           throw new IllegalArgumentException();
       }
       int index = objetivos.indexOf(objetivo);
       objetivos.set(index, newObjetivo);
    }

    public void apagarObjetivo(Objetivo objetivo){
        if(objetivos.isEmpty()){
            throw new IllegalArgumentException();
        }
        objetivos.remove(objetivo);
    }

    public void listarObjetivos(){
        objetivos.forEach(o -> System.out.println(o.toString()));
    }


}
