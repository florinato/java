package com.example.s1_07.n2n3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // Aplicable a clases
public @interface JsonSerializable {
    String directory(); // Directorio donde se guardará el archivo JSON
}

