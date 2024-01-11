# Aplicación de Chat con Patrón MVC

Este repositorio contiene una aplicación de chat simple implementada en Java utilizando el patrón de diseño Modelo-Vista-Controlador (MVC). La aplicación permite a los usuarios enviar y recibir mensajes a través de una interfaz gráfica.

## Estructura del Proyecto

El proyecto está estructurado en tres componentes principales: Modelo, Vista y Controlador.

### Modelo

La clase `ChatModel` representa el modelo de datos de la aplicación de chat. Gestiona una lista de mensajes y proporciona métodos para agregar mensajes, cargar mensajes desde un archivo y guardar mensajes en un archivo.

### Vista

La clase `ChatView` es responsable de la interfaz gráfica (GUI) de la aplicación de chat. Incluye un área de chat para mostrar mensajes, un campo de entrada para escribir mensajes y un botón "Enviar" para enviar mensajes.

### Controlador

La clase `ChatController` actúa como el controlador en la arquitectura MVC. Maneja la entrada del usuario, se comunica con el modelo para actualizar datos y actualiza la vista en consecuencia. Además, gestiona un servidor simple para facilitar la comunicación entre múltiples clientes.

## Cómo Ejecutar

Para ejecutar la aplicación de chat, sigue estos pasos:

1. Clona el repositorio en tu máquina local.

2. Abre el proyecto en tu IDE Java preferido.

3. Ejecuta la clase `Main` ubicada en la raíz del proyecto.

4. La interfaz gráfica de la aplicación de chat aparecerá, permitiéndote interactuar con el chat.

## Características

- **Interfaz Gráfica Simple**: La aplicación proporciona una interfaz gráfica sencilla para enviar y recibir mensajes.
- **Comunicación Cliente-Servidor**: La aplicación utiliza un servidor simple para facilitar la comunicación entre clientes.

## Captura
![image](https://github.com/TitoDevs/Java/assets/75398496/e6f9370a-05d0-45ed-8769-24613ae399f8)

## Contribución

Siéntete libre de contribuir al proyecto abriendo problemas (issues) o enviando solicitudes de extracción (pull requests). Tus comentarios y contribuciones son muy apreciados.

## Licencia

Este proyecto está bajo la [Licencia MIT](LICENSE).

---

¡Disfruta chateando con la aplicación de chat basada en MVC! Si tienes alguna pregunta o sugerencia, no dudes en abrir un problema. ¡Feliz codificación!
