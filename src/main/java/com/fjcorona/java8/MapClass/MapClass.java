package com.fjcorona.java8.MapClass;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapClass {

    private Map<Integer, String> map;

    public MapClass() {
        map = new HashMap<>();
    }

    public void poblar () {
        map.put(1, "JavoCrown");
        map.put(2, "Javo");
        map.put(3, "Crown");
    }

    public void imprimirV7() {
        /*
        this.map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer key, String value) {
                System.out.println("Key: " + key + ", Value: " + value);
            }
        });
        */

        for (Map.Entry<Integer, String> map : this.map.entrySet()) {
            System.out.println("Key: " + map.getKey() + ", Value: " + map.getValue());
        }
    }

    public void imprimirV8() {
        this.map.forEach( (k, v) -> System.out.println("Key: " + k + ", Value: " + v) );
    }

    public void recolectar() {
    }

    public void insertarSiAusente() {
    }

    public void operarSiPresente() {
    }

    public void obtenerOrPredeterminado() {
    }

    public static void main (String[] args) {
        MapClass app = new MapClass();

        app.poblar();
        app.imprimirV7();
        app.imprimirV8();
    }

}
