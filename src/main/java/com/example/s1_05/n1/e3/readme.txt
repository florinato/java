Descripción:
El programa ListadorDeDirectorio es una herramienta simple de línea de comandos escrita en Java. Su propósito es listar alfabéticamente todos los archivos y carpetas dentro de un directorio especificado por el usuario.

Requisitos:
- Java Runtime Environment (JRE) instalado en su máquina.

Compilación:
Para compilar el programa, navegue al directorio raíz del proyecto (donde se encuentra el archivo pom.xml) y ejecute el siguiente comando:

javac -d target/classes src/main/java/com/example/s1_05/n1/e3/Aplicacion.java src/main/java/com/example/s1_05/n1/e3/ListadorDeDirectorio.java


Este comando compilará la clase Aplicacion y la colocará en el directorio target/classes.

Ejecución:
Para ejecutar el programa, use el siguiente comando, reemplazando [ruta_al_directorio] con la ruta del directorio que desea listar:

java -cp target/classes com.example.s1_05.n1.e1.Aplicacion [ruta_al_directorio]

Por ejemplo:

java -cp target/classes com.example.s1_05.n1.e3.Aplicacion src\main\java\com\example\s1_04 src\main\java\com\example\s1_05\n1\e3\resultado.txt
