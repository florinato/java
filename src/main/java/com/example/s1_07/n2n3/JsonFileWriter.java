package com.example.s1_07.n2n3;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {
    public static void writeJsonToFile(String json, String directory, String filename) {
        // Asegúrate de que el directorio termina con un separador de archivos
        if (!directory.endsWith(System.getProperty("file.separator"))) {
            directory += System.getProperty("file.separator");
        }

        try (FileWriter fileWriter = new FileWriter(directory + filename)) {
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

