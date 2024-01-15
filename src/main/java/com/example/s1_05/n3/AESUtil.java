package com.example.s1_05.n3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class AESUtil {

    

    public static void main(String[] args) throws Exception {
        SecretKey key = generateKey();
        IvParameterSpec iv = generateIv();
        
        // Ruta del archivo a encriptar
        String filePath = "src\\main\\java\\com\\example\\s1_05\\n2\\resultado.txt";
        
        // Leer el contenido del archivo
        FileInputStream fileInputStream = new FileInputStream(filePath);
        byte[] fileContent = fileInputStream.readAllBytes();
        fileInputStream.close();
        
        // Encriptar el contenido
        byte[] encryptedData = encrypt(new String(fileContent), key, iv);
        
        // Ruta del archivo encriptado
        String encryptedFilePath = "src\\main\\java\\com\\example\\s1_05\\n3\\resultadoEncriptado.txt";
    
        // Escribir el contenido encriptado en un nuevo archivo
        FileOutputStream fileOutputStream = new FileOutputStream(encryptedFilePath);
        fileOutputStream.write(encryptedData);
        fileOutputStream.close();
        
        // Imprimir las rutas de los archivos para referencia
        System.out.println("Archivo original: " + filePath);
        System.out.println("Archivo encriptado: " + encryptedFilePath);
    }
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // O 256, según la configuración de tu entorno JCE
        return keyGenerator.generateKey();
    }
    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16]; // AES utiliza bloques de 16 bytes
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);
    }
    public static byte[] encrypt(String input, SecretKey key, IvParameterSpec iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        return cipher.doFinal(input.getBytes());
    }
    public static String decrypt(byte[] cipherText, SecretKey key, IvParameterSpec iv) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] plainText = cipher.doFinal(cipherText);
        return new String(plainText);
    }
}
