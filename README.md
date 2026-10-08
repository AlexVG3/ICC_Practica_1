# Práctica 01 — Introducción a las Ciencias de la Computación

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completado-success?style=for-the-badge)

Repositorio correspondiente a la Práctica 01 del curso Introducción a las Ciencias de la Computación (ICC). El objetivo de las prácticas es familiarizarse con el flujo básico de entrada y salida estándar en Java, la captura de datos del usuario mediante la clase Scanner y el procesamiento de cadenas de texto (String).

---

## Estructura del Directorio

```text
AVillegas/
└── practica01/
    └── src/
        └── icc/
            ├── Psicologo.java
            ├── RFC.java
            ├── .gitignore
            └── README.md
```

---

## Descripción de los Programas

### 1. Psicologo.java
Programa interactivo por consola que simula una consulta con un psicólogo automatizado.
* Conceptos aplicados: Uso del paquete java.util.Scanner, captura de entradas (nextLine()), concatenación de cadenas y formato de salida.
* Comportamiento: Solicita los datos personales y motivos de consulta del usuario para devolver respuestas procesadas en pantalla.

### 2. RFC.java
Programa centrado en la manipulación y segmentación de texto para el cálculo o generación del Registro Federal de Contribuyentes (RFC).
* Conceptos aplicados: Métodos de la clase String (tales como substring, toUpperCase, charAt), manejo de índices e indexación posicional.

---

## Requisitos

* Java Development Kit (JDK): Versión 8 o superior.
* Consola o terminal de comandos.

---

## Compilación y Ejecución

Para compilar y ejecutar los archivos desde la terminal, ubícate en la carpeta `src/`:

### Compilación

```bash
javac icc/*.java
```

### Ejecución

Para ejecutar el programa del psicólogo:
```bash
java icc.Psicologo
```

Para ejecutar el generador de RFC:
```bash
java icc.RFC
```

> Nota: Si las clases no tienen declarada la sentencia `package icc;` en su primera línea, puedes ingresar directamente a la carpeta `icc` y ejecutar:
> ```bash
> cd icc
> javac Psicologo.java
> java Psicologo
> ```

---

## Autor

* AVillegas
