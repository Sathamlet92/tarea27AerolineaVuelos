package com.sathamlet.vuelos.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Vuelo implements Comparable<Vuelo>{
    private String claveVuelo;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private String ffLlegada;
    private Date horaLlegada;
    private Integer numPasajeros;

    public Vuelo() {
    }

    public Vuelo(String claveVuelo) {
        this.claveVuelo = claveVuelo;
    }

    public Vuelo(String claveVuelo, String origen, String destino,
                 Date fechaLlegada, Date horaLlegada, Integer numPasajeros) {
        this(claveVuelo);
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.ffLlegada = fd(fechaLlegada);
        this.horaLlegada = horaLlegada;
        this.numPasajeros = numPasajeros;
    }

    public Vuelo(String claveVuelo, String origen, String destino, String fechaLlegada,
                 Date horaLlegada, Integer numPasajeros) {
        this(claveVuelo);
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fdf(fechaLlegada);
        this.horaLlegada = horaLlegada;
        this.numPasajeros = numPasajeros;
    }

    public Vuelo(String claveVuelo, String origen, String destino, Date fechaLlegada,
                 String horaLlegada, Integer numPasajeros) {
        this(claveVuelo);
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.ffLlegada = fd(fechaLlegada);
        this.horaLlegada = this.ldfp(horaLlegada);
        this.numPasajeros = numPasajeros;
    }

    public Vuelo(String claveVuelo, String origen, String destino, String fechaLlegada,
                 Integer numPasajeros) {
        this(claveVuelo);
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fdf(fechaLlegada);
        this.ffLlegada = fd(this.fechaLlegada);
        this.numPasajeros = numPasajeros;
    }

    public String getFfLlegada() {
        return ffLlegada;
    }

    private String fd(Date f) {
        SimpleDateFormat df = new SimpleDateFormat("EE dd MMM',' HH:mm yyyy");
        return df.format(f);
    }
    private Date fdf(String f){
        SimpleDateFormat formatter = new SimpleDateFormat("EE dd MMMM yyyy HH:mm");
        try {
            return formatter.parse(f);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    private Date ldfp(String hora){
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        try {
            this.horaLlegada = df.parse(hora);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return this.horaLlegada;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Integer getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(Integer numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public String getClaveVuelo() {
        return claveVuelo;
    }

    @Override
    public String toString() {
        return "Vuelo " + this.claveVuelo + " \t"
                + this.origen
                + ", \tLlegada: " + this.ffLlegada;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelo vuelo = (Vuelo) o;
        return Objects.equals(fechaLlegada, vuelo.fechaLlegada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaLlegada);
    }

    @Override
    public int compareTo(Vuelo o) {
        return this.fechaLlegada.compareTo(o.fechaLlegada);
    }

}
