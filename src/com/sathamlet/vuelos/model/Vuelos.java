package com.sathamlet.vuelos.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Vuelos<T> implements Iterable<T> {
    List<T> vuelos;

    public Vuelos() {
        vuelos = new LinkedList<>();
    }

    @Override
    public Iterator<T> iterator() {
        return this.vuelos.iterator();
    }
}
