# 🎵 Generador de Playlist JSON – TP03 Ejercicio 2

Este proyecto fue desarrollado como parte del **Trabajo Práctico N°3** de la materia **Laboratorio de Programación (2025)** de la **Licenciatura en Sistemas** de la **Universidad Nacional de la Patagonia Austral (UNPA-UARG)**.

El objetivo principal es generar, guardar y visualizar una lista de reproducción en formato **JSON** utilizando la biblioteca `org.json`.

---

## 🧠 Descripción

El programa permite:

- Crear una **playlist personalizada** con nombre, creador y canciones.
- Guardarla en un **archivo plano `.json`**.
- Mostrar su contenido por consola de forma indentada.
- Generar documentación automática usando **Javadoc**.

---

## 📂 Estructura del proyecto
ldp_tp3_p2/ 
├── lib/ 
        # Librerías externas 
        │   # Biblioteca org.json
        └── json-20230227.jar  
    ├── src/      
        │   #Código fuente y documentación
        ├── GeneradorJSON.java # Clase principal 
        │ 
        ├── Playlist.java # Clase auxiliar (opcional) 
        │ 
        └── javadoc/ # Carpeta generada con Javadoc 
    └── README.md # Este archivo

---

## 🧩 Requisitos

- Java JDK 21 (o compatible)
- `json-20230227.jar` [descargable desde el repositorio oficial de org.json](https://repo1.maven.org/maven2/org/json/json/)
- SO recomendado: **openSUSE Tumbleweed** 😎 lo mejor

---

## 🧪 Ejecución del programa

### 1. Asegurarse de tener compilado el código:

```bash
javac -cp ./lib/json-20230227.jar ./src/*.java
```
### 2 Ejecutar la clase principal:

```
java -cp ./lib/json-20230227.jar:./src GeneradorJSON
```
## 💡 En Windows, reemplazá : por ; en el classpath.

##📄 Generar la documentación Javadoc
- Para generar la documentación Javadoc (con soporte para la biblioteca org.json):

```"/usr/lib64/jvm/java-21-openjdk-21/bin/javadoc" \
-sourcepath "./src" \
-classpath "./lib/json-20230227.jar" \
-d "./src/javadoc" \
src/GeneradorJSON.java \
src/Playlist.java
```
✅ Esto generará una carpeta javadoc/ dentro de src/ con la documentación navegable.

📬 Contacto
📧 Nicolás Butterfield – nicobutter@gmail.com
Siempre listo para compilar ideas y ejecutar soluciones.


