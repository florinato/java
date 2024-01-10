package com.example.s1_04.n3.e4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListManager {
    private List<Object> myList;

    public ListManager(Object... objects) {
        myList = new ArrayList<>(Arrays.asList(objects));
    }

    public boolean isOrderCorrect(Object... objects) {
        return myList.equals(Arrays.asList(objects));
    }

    public boolean containsInAnyOrder(Object... objects) {
        List<Object> tempList = new ArrayList<>(Arrays.asList(objects));
        return myList.containsAll(tempList) && tempList.containsAll(myList);
    }

    public boolean containsOnlyOnce(Object object) {
        return myList.indexOf(object) == myList.lastIndexOf(object);
    }

    public boolean doesNotContain(Object object) {
        return !myList.contains(object);
    }

    // Método auxiliar para pruebas
    public List<Object> getList() {
        return myList;
    }
}
