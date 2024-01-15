package com.example.s1_07.n2;

import com.google.gson.Gson;


public class JsonUtil {
    public static String serializeObjectToJson(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }
}

