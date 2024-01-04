package com.example.s1_07.n2n3;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JsonUtil {
    public static void serializeObjectToJson(Object object, String filename) {
        Gson gson = new Gson();
        String json = gson.toJson(object);

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


