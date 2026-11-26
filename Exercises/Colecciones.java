package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Colecciones {
    public ArrayList<String> cars;
    public String[] bikes;
    public Set<String> bicicles;
    public HashMap<Integer, String> transport;

    public Colecciones() {
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport = new HashMap<Integer, String>();
    }

    public void inicializar() {
        // carros
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");

        // motos
        this.bikes[1] = "Yamaha V-Star 250";
        this.bikes[2] = "Royal Enfield Meteor 350";
        this.bikes[3] = "Kawasaki Eliminator";
        this.bikes[4] = "Honda CMX500A2 SE Rebel.";

        // bicicletas
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    private void agregarSiEsValido(String item) {

        if (item != null && !item.trim().isEmpty() && !this.transport.containsValue(item)) {
            this.transport.put(this.transport.size() + 1, item);
        }

    }

    public HashMap<Integer, String> obtenerHash() {

        this.transport.clear();

        if (this.cars != null) {
            for (String car : this.cars) {
                agregarSiEsValido(car);
            }
        }

        if (this.bikes != null) {
            for (String bike : this.bikes) {
                agregarSiEsValido(bike);
            }
        }

        if (this.bicicles != null) {
            for (String bicicle : this.bicicles) {
                agregarSiEsValido(bicicle);
            }
        }

        return this.transport;

    }
}