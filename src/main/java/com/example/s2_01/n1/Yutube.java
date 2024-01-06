package com.example.s2_01.n1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Yutube {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String usuario = "root"; // Ajusta según tu configuración
        String contraseña = ""; // Ajusta según tu configuración

        try {
            // Conectar a MySQL
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();
            // Crear la base de datos
            String sql = "CREATE DATABASE IF NOT EXISTS Yutube";
            statement.executeUpdate(sql);
            System.out.println("Base de datos creada o ya existente.");

            // Cerrar la conexión y reconectar a la base de datos específica
            statement.close();
            conexion.close();
            // Reconectar a la base de datos Yutube
            url = "jdbc:mysql://localhost:3306/Yutube"; // Actualizar la URL para apuntar a la base de datos Yutube
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            statement = conexion.createStatement();
            sql = "CREATE TABLE IF NOT EXISTS Usuarios (" +
                "email VARCHAR(255) PRIMARY KEY, " +
                "password VARCHAR(255), " +
                "nombre_usuario VARCHAR(255), " +
                "fecha_nacimiento DATE, " +
                "sexo VARCHAR(50), " +
                "pais VARCHAR(255), " +
                "codigo_postal VARCHAR(10))";
            statement.executeUpdate(sql);
            System.out.println("Tabla Usuarios creada con éxito.");

            sql = "CREATE TABLE IF NOT EXISTS Canales (" +
                "id_canal INT AUTO_INCREMENT PRIMARY KEY, " +
                "nombre VARCHAR(255), " +
                "descripcion TEXT, " +
                "fecha_creacion DATE, " +
                "email_usuario VARCHAR(255), " +
                "FOREIGN KEY (email_usuario) REFERENCES Usuarios(email))";
            statement.executeUpdate(sql);
            System.out.println("Tabla Canales creada con éxito.");

            sql = "CREATE TABLE IF NOT EXISTS Videos (" +
                    "id_video INT AUTO_INCREMENT PRIMARY KEY, " +
                    "titulo VARCHAR(255), " +
                    "descripcion TEXT, " +
                    "tamano INT, " +
                    "nombre_archivo VARCHAR(255), " +
                    "duracion INT, " + // Duración en segundos o formato que prefieras
                    "thumbnail VARCHAR(255), " +
                    "num_reproducciones INT DEFAULT 0, " +
                    "num_likes INT DEFAULT 0, " +
                    "num_dislikes INT DEFAULT 0, " +
                    "estado VARCHAR(50), " + // 'público', 'oculto', 'privado'
                    "fecha_publicacion DATETIME, " +
                    "email_usuario VARCHAR(255), " +
                    "FOREIGN KEY (email_usuario) REFERENCES Usuarios(email))";
            statement.executeUpdate(sql);
            System.out.println("Tabla Videos creada con éxito.");

            sql = "CREATE TABLE IF NOT EXISTS Etiquetas (" +
                    "id_etiqueta INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre_etiqueta VARCHAR(255))";
            statement.executeUpdate(sql);
            System.out.println("Tabla Etiquetas creada con éxito.");

            sql = "CREATE TABLE IF NOT EXISTS VideoEtiquetas (" +
                "id_video INT, " +
                "id_etiqueta INT, " +
                "PRIMARY KEY (id_video, id_etiqueta), " +
                "FOREIGN KEY (id_video) REFERENCES Videos(id_video), " +
                "FOREIGN KEY (id_etiqueta) REFERENCES Etiquetas(id_etiqueta))";
            statement.executeUpdate(sql);
            System.out.println("Tabla VideoEtiquetas creada con éxito.");
            sql = "CREATE TABLE IF NOT EXISTS Playlists (" +
                    "id_playlist INT AUTO_INCREMENT PRIMARY KEY, " +
                    "nombre VARCHAR(255), " +
                    "fecha_creacion DATETIME, " +
                    "estado VARCHAR(50), " + // 'pública' o 'privada'
                    "email_usuario VARCHAR(255), " +
                    "FOREIGN KEY (email_usuario) REFERENCES Usuarios(email))";
            statement.executeUpdate(sql);
            System.out.println("Tabla Playlists creada con éxito.");

            sql = "CREATE TABLE IF NOT EXISTS PlaylistVideos (" +
                "id_playlist INT, " +
                "id_video INT, " +
                "PRIMARY KEY (id_playlist, id_video), " +
                "FOREIGN KEY (id_playlist) REFERENCES Playlists(id_playlist), " +
                "FOREIGN KEY (id_video) REFERENCES Videos(id_video))";
            statement.executeUpdate(sql);
            System.out.println("Tabla PlaylistVideos creada con éxito.");

            sql = "CREATE TABLE IF NOT EXISTS Comentarios (" +
                "id_comentario INT AUTO_INCREMENT PRIMARY KEY, " +
                "texto TEXT, " +
                "fecha_hora DATETIME, " +
                "email_usuario VARCHAR(255), " +
                "id_video INT, " +
                "FOREIGN KEY (email_usuario) REFERENCES Usuarios(email), " +
                "FOREIGN KEY (id_video) REFERENCES Videos(id_video))";
            statement.executeUpdate(sql);
            System.out.println("Tabla Comentarios creada con éxito.");

            sql = "CREATE TABLE IF NOT EXISTS LikesDislikesVideos (" +
                "email_usuario VARCHAR(255), " +
                "id_video INT, " +
                "tipo VARCHAR(50), " + // 'like' o 'dislike'
                "fecha_hora DATETIME, " +
                "PRIMARY KEY (email_usuario, id_video), " +
                "FOREIGN KEY (email_usuario) REFERENCES Usuarios(email), " +
                "FOREIGN KEY (id_video) REFERENCES Videos(id_video))";
            statement.executeUpdate(sql);
            System.out.println("Tabla LikesDislikesVideos creada con éxito.");

            sql = "CREATE TABLE IF NOT EXISTS LikesDislikesComentarios (" +
                "email_usuario VARCHAR(255), " +
                "id_comentario INT, " +
                "tipo VARCHAR(50), " + // 'like' o 'dislike'
                "fecha_hora DATETIME, " +
                "PRIMARY KEY (email_usuario, id_comentario), " +
                "FOREIGN KEY (email_usuario) REFERENCES Usuarios(email), " +
                "FOREIGN KEY (id_comentario) REFERENCES Comentarios(id_comentario))";
            statement.executeUpdate(sql);
            System.out.println("Tabla LikesDislikesComentarios creada con éxito.");

              
             // Cerrar las conexiones     
            statement.close();
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}