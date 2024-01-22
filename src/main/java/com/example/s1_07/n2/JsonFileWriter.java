package com.example.s1_07.n2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {
    public static void writeJsonToFile(String json, String directory, String filename) {
        
        if (!directory.endsWith(File.separator)) {
            directory += File.separator;
        }

        // Combinar el directorio y el nombre del archivo
        String fullPath = directory + filename;

        // Verificar si el archivo ya existe
        File file = new File(fullPath);
        if (file.exists()) {
            System.out.println("El archivo ya existe en la ruta especificada.");
        } else {
            try {
                if (!file.getParentFile().exists()) {
                    System.out.println("El directorio no existe. Creándolo...");
                    file.getParentFile().mkdirs();
                }

                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write(json);
                    System.out.println("Archivo escrito exitosamente.");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.err.println("Error al escribir el archivo.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Error general.");
            }
        }
    }
}



