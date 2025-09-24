# Sistema de Gestión Bancaria en Java

Aplicación de escritorio desarrollada como proyecto académico para simular las operaciones básicas de un banco.

## Descripción

El programa permite a un usuario registrar nuevos clientes, buscar clientes existentes por RUT, y realizar transacciones como depósitos, giros y transferencias entre cuentas. La aplicación cuenta con una interfaz gráfica de usuario (GUI) y se conecta a una base de datos MySQL para guardar y gestionar toda la información de forma persistente.

## Tecnologías Utilizadas
* **Lenguaje:** Java
* **Interfaz Gráfica:** Java Swing
* **Base de Datos:** MySQL
* **Conexión a BD:** JDBC (Java Database Connectivity)
* **Principios:** Programación Orientada a Objetos (POO)

## Cómo Ejecutar el Proyecto
1.  Asegúrate de tener una instancia de MySQL en funcionamiento.
2.  Crea una base de datos llamada `WestBank`.
3.  Importa el archivo `WestBankBD.sql` (no incluido en este repo por seguridad) para crear las tablas y los datos iniciales.
4.  Configura tus credenciales de la base de datos en el archivo `src/west_bank_ejec/ConexionBD.java`.
5.  Abre el proyecto con un IDE como Apache NetBeans y ejecútalo.