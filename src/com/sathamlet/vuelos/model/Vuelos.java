package com.sathamlet.vuelos.model;

import java.util.*;

public class Vuelos<T> implements Iterable<T> {
    List<T> vuelos;

    public Vuelos() {
        vuelos = new LinkedList<>();
    }
    public Vuelos<T> add(T t){
        this.vuelos.add(t);
        return this;
    }

    public List<T> getVuelos() {
        return this.vuelos;
    }
    public T getMinNumAsientos(){
        T aux = null;
        int aux2 = Integer.MAX_VALUE;
        for (int i = 0; i < this.vuelos.size(); i++) {
            Vuelo vas = (Vuelo) this.vuelos.get(i);
            if(aux2 > vas.getNumPasajeros()){
                aux = (T) vas;
                aux2 = vas.getNumPasajeros();
            }
        }
        return aux;
    }

    public int getMinNumAsientos(List<T> list){
        int aux = Integer.MAX_VALUE;
        int indice = 0;
        for (int i = 0; i < list.size(); i++) {
            Vuelo vas = (Vuelo) list.get(i);
            if(aux > vas.getNumPasajeros()){
                indice = i;
                aux = vas.getNumPasajeros();
            }
        }
        return indice;
    }
    public T getLastInComing(List<T> t){
        T aux = null;
        Date auxF = ((List<Vuelo>)this.vuelos).get(0).getFechaLlegada();   ;
        for (int i = 0; i < t.size(); i++) {
            Vuelo vaux = (Vuelo) t.get(i);
            if(vaux.getFechaLlegada().compareTo(auxF) > 0) {
                auxF = vaux.getFechaLlegada();
                aux = (T)vaux;
            }
        }
        return aux;
    }

    @Override
    public Iterator<T> iterator() {
        return this.vuelos.iterator();
    }
}
