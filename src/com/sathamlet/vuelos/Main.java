package com.sathamlet.vuelos;

import com.sathamlet.vuelos.model.Vuelo;
import com.sathamlet.vuelos.model.Vuelos;


public class Main {
    public static void main(String[] args) {
        Vuelos<Vuelo> listFly = new Vuelos<>();
        listFly.add(new Vuelo("AAL 933", "New York", "Santiago",
                "Mon 29 August 2021 05:39", 62))
                .add(new Vuelo("LAT 755", "Sao Paulo", "Santiago",
                        "Mon 31 August 2021 04:45", 47))
                .add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago",
                        "MOn 30 August 2021 16:00", 52))
                .add(new Vuelo("DAL 147","Atlanta","Santiago",
                        "Mon 29 August 2021 13:22",59))
                .add(new Vuelo("AVA 241","Bogota","Santiago",
                        "Mon 31 August 2021 14:05",25))
                .add(new Vuelo("AMX 10","Mexico City","Santiago",
                        "Mon 31 August 2021 05:20",29))
                .add(new Vuelo("IBE 6833", "Londres", "Santiago",
                        "Mon 30 August 2021 08:45", 55))
                .add(new Vuelo("LAT 2479","Frankfurt","Santiago",
                        "Mon 29 August 2021 07:41",51))
                .add(new Vuelo("SKU 803","Lima","Santiago",
                        "Mon 30 August 2021 10:35",48))
                .add(new Vuelo("LAT 533","Los Ángeles","Santiago",
                        "Mon 29 August 2021 09:14",59))
                .add(new Vuelo("LAT 1447","Guayaquil","Santiago",
                        "Mon 31 August 2021 08:33",31))
                .add(new Vuelo("CMP 111","Panama City","Santiago",
                        "Mon 31 August 2021  15:15",29))
                .add(new Vuelo("LAT 705","Madrid","Santiago",
                        "Mon 30 August 2021 08:14",47)).
                add(new Vuelo("AAL 957","Miami","Santiago",
                        "Mon 29 August 2021 22:53",60)).
                add(new Vuelo("ARG 5091","Buenos Aires","Santiago",
                        "Mon 31 August 2021 09:57 ",32));


        System.out.println("Lista de vuelos estandar");
        for (var item : listFly
        ) {
            System.out.println(item);
        }
        System.out.println();
        System.out.println("------------------");


        System.out.println("Listado de vuelos ordenados");
        listFly.getVuelos().sort(Vuelo::compareTo);
        for (var item : listFly
             ) {
            System.out.println(item);
        }

        System.out.println("********************************************");
        var geVuelos = listFly.getVuelos();
        var vuelo = listFly.getLastInComing(geVuelos);
        System.out.println("El ultimo vuelo en llegar es: " + vuelo.getClaveVuelo() + " "
                + vuelo.getOrigen()
                + " aterriza el: " + vuelo.getFfLlegada());
        System.out.println("********************************************");


        System.out.println("********************************************");
        var vuelomin = listFly.getMinNumAsientos();
        System.out.println("El vuelo con menor número de pasajeros es: " + vuelomin.getClaveVuelo()
                + " " + vuelomin.getOrigen() + " con: " + vuelomin.getNumPasajeros() + " pasajeros");
        System.out.println("********************************************");


    }

}
