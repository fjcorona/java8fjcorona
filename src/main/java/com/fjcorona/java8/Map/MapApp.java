package com.fjcorona.java8.Map;
import java.util.HashMap;
import java.util.Map;

public class MapApp {

    private Map<Integer, String> map;

    public MapApp() {
        map = new HashMap<>();
    }

    public void fillIn () {
        map.put(1, "JavoCrown");
        map.put(2, "Javo");
        map.put(3, "Crown");
    }

    public void printV7() {
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

    public void printV8() {
        this.map.forEach( (k, v) -> System.out.println("Key: " + k + ", Value: " + v) );
    }

    public void collect() {
    }

    public void insertIfabsent() {
    }

    public void performIfPresent() {
    }

    public void getOrDefault() {
    }

    public static void main (String[] args) {
        MapApp app = new MapApp();

        app.fillIn();
        app.printV7();
        app.printV8();
    }

}
