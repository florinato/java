
# Instrucciones para Ejecutar ConfiguracionEjecutor

Este documento proporciona instrucciones paso a paso para ejecutar el programa `ConfiguracionEjecutor` desde la línea de comandos.

## Preparación

Antes de ejecutar el programa, asegúrate de que todos los archivos `.java` estén presentes en la siguiente estructura de directorios y que hayas configurado el archivo `config.properties` con los parámetros necesarios.

Estructura de Directorios:

```
C:\Users\oscar\Desktop\Nueva carpeta\demo\src\main\java
└── com
    └── example
        └── s1_05
            ├── ConfiguracionEjecutor.java
            ├── DirectorioOArchivo.java
            └── ... (otros archivos .java si existen)
```

## Compilación

1. Abre la línea de comandos y navega al directorio `C:\Users\oscar\Desktop\Nueva carpeta\demo\src\main\java`.
2. Ejecuta el siguiente comando para compilar los archivos `.java`:

   ```cmd
   javac com/example/s1_05/*.java
   ```

Esto generará los archivos `.class` correspondientes en el mismo directorio de los archivos `.java`.

## Ejecución

Para ejecutar el programa `ConfiguracionEjecutor`, sigue estos pasos:

1. Asegúrate de estar todavía en el directorio `C:\Users\oscar\Desktop\Nueva carpeta\demo\src\main\java`.
2. Ejecuta el siguiente comando:

   ```cmd
   "C:\Program Files\Eclipse Adoptium\jdk-17.0.8.7-hotspot\bin\java.exe" -cp . com.example.s1_05.ConfiguracionEjecutor
   ```

El programa se ejecutará y procesará los datos según lo especificado en tu archivo `config.properties`.
