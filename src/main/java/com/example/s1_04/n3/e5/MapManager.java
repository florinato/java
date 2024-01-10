package com.example.s1_04.n3.e5;

import java.util.HashMap;
import java.util.Map;

public class MapManager {
    private Map<String, Integer> myMap;

    public MapManager() {
        myMap = new HashMap<>();
    }

    public void put(String key, Integer value) {
        myMap.put(key, value);
    }

    public boolean containsKey(String key) {
        return myMap.containsKey(key);
    }

    // Método auxiliar para pruebas
    public Map<String, Integer> getMap() {
        return myMap;
    }
}