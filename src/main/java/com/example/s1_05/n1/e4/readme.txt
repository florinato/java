Descripción:
El programa ListadorDeDirectorio es una herramienta de línea de comandos escrita en Java. Su propósito es doble: puede listar alfabéticamente todos los archivos y carpetas dentro de un directorio especificado por el usuario y también leer y mostrar el contenido de archivos TXT.

Requisitos:
- Java Runtime Environment (JRE) instalado en su máquina.

Compilación:
Para compilar el programa, navegue al directorio raíz del proyecto (donde se encuentra el archivo pom.xml) y ejecute el siguiente comando:

javac -d target/classes src/main/java/com/example/s1_05/n1/e4/Aplicacion.java src/main/java/com/example/s1_05/n1/e4/ListadorDeDirectorio.java src/main/java/com/example/s1_05/n1/e4/LectorDeArchivo.java

Este comando compilará las clases Aplicacion, ListadorDeDirectorio y LectorDeArchivo en un solo paso y las colocará en el directorio target/classes.

Ejecución:
Para ejecutar el programa, use uno de los siguientes comandos, dependiendo de lo que desee hacer:

1. Para listar el contenido de un directorio en un archivo:
java -cp target/classes com.example.s1_05.n1.e4.Aplicacion [ruta_al_directorio] [nombre_del_archivo_de_salida]

Por ejemplo:
java -cp target/classes com.example.s1_05.n1.e4.Aplicacion src/main/java/com/example/s1_05/n1/e4 resultado.txt

2. Para leer y mostrar el contenido de un archivo TXT:
java -cp target/classes com.example.s1_05.n1.e4.Aplicacion [ruta_al_archivo_TXT]

Por ejemplo:
java -cp target/classes com.example.s1_05.n1.e4.Aplicacion src/main/java/com/example/s1_05/n1/e4/mi_archivo.txt

Asegúrese de reemplazar [ruta_al_directorio], [nombre_del_archivo_de_salida] o [ruta_al_archivo_TXT] con la ruta del directorio o archivo que desea procesar.

java -cp target/classes com.example.s1_05.n1.e4.Aplicacion src\main\java\com\example\s1_04 src\main\java\com\example\s1_05\n1\e4\resultado.txt
