
README - DirectorioListador

Descripción:
El programa DirectorioListador es una herramienta simple de línea de comandos escrita en Java. Su propósito es listar alfabéticamente todos los archivos y carpetas dentro de un directorio especificado por el usuario.

Requisitos:
- Java Runtime Environment (JRE) instalado en su máquina.

Compilación:
Para compilar el programa, navegue al directorio raíz del proyecto (donde se encuentra el archivo pom.xml) y ejecute el siguiente comando:

javac -d target/classes src/main/java/com/example/s1_05/DirectorioListador.java

Este comando compilará la clase y la colocará en el directorio target/classes.

Ejecución:
Para ejecutar el programa, use el siguiente comando, reemplazando [ruta_al_directorio] con la ruta del directorio que desea listar:

java -cp target/classes com.example.s1_05.DirectorioListador [ruta_al_directorio]

Por ejemplo:

java -cp target/classes com.example.s1_05.DirectorioListador C:\Users\oscar\Documents

Este comando listará el contenido del directorio C:\Users\oscar\Documents.

Notas Importantes:
- Asegúrese de que la ruta proporcionada sea un directorio válido y tenga los permisos necesarios para acceder a él.
- Si se proporciona una ruta incorrecta o inaccesible, el programa mostrará un mensaje de error.
