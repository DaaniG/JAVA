![primerprograma](https://user-images.githubusercontent.com/75398496/233857513-9203b441-f72a-431b-acbb-2b3f94f5e422.png)

# Chat MVC
Este es un programa de chat básico que sigue el patrón de diseño Modelo-Vista-Controlador (MVC). 

### El patrón de diseño MVC (Modelo-Vista-Controlador) 
Es un patrón arquitectónico ampliamente utilizado en el desarrollo de aplicaciones de software.

El patrón MVC divide una aplicación en tres componentes principales:

El Modelo (Model): Es responsable de representar los datos y la lógica de negocios de la aplicación. El modelo actúa como una capa de acceso a datos que maneja la persistencia de los datos y cualquier lógica necesaria para manipularlos.

La Vista (View): Es responsable de mostrar la información al usuario y de proporcionar una interfaz de usuario (UI) para interactuar con la aplicación. La vista se encarga de la presentación de datos al usuario y la interacción con el mismo.

El Controlador (Controller): Es responsable de recibir las solicitudes del usuario, procesarlas y coordinar la interacción entre el Modelo y la Vista. El controlador se encarga de recibir la entrada del usuario y actualizar el modelo y la vista en consecuencia.

El patrón MVC ayuda a separar las preocupaciones de la aplicación, lo que facilita la creación de aplicaciones escalables y mantenibles. Al dividir la aplicación en componentes, los desarrolladores pueden trabajar en diferentes áreas sin interferir en el trabajo de los demás. También permite la reutilización de componentes y la fácil modificación de la aplicación sin afectar a otros componentes.

El programa se compone de cuatro clases:

## ChatModel: 
La clase ChatModel contiene una lista de mensajes y los métodos necesarios para agregar y cargar mensajes desde y hacia un archivo.

El constructor de ChatModel toma como parámetro el nombre del archivo donde se almacenarán los mensajes. Cuando se crea una nueva instancia de ChatModel, se crea una lista vacía para almacenar los mensajes.

El método addMessage() agrega un mensaje a la lista de mensajes y lo guarda en el archivo. Cuando se llama a este método, se agrega el mensaje a la lista y luego se llama al método saveMessagesToFile() para guardar la lista actualizada en el archivo.

El método getMessages() devuelve la lista de mensajes actual.

El método saveMessagesToFile() guarda la lista de mensajes actual en el archivo especificado. Para hacer esto, se crea un objeto BufferedWriter que se utiliza para escribir cada mensaje en una línea separada en el archivo.

El método loadMessagesFromFile() carga la lista de mensajes desde el archivo especificado. Este método primero borra todos los mensajes actuales en la lista y luego lee cada línea del archivo utilizando un objeto BufferedReader y agrega cada línea a la lista de mensajes.

## ChatView:
Esta clase es responsable de la interfaz de usuario y cómo se presentan los datos al usuario final.

La clase ChatView extiende la clase JFrame, que es la ventana principal de la aplicación. Dentro del constructor de la clase ChatView, se define la interfaz de usuario.

La ventana se compone de tres elementos principales: un área de chat, un campo de entrada de texto y un botón de enviar. El área de chat es un objeto JTextArea que se encuentra dentro de un JScrollPane, lo que permite desplazarse por los mensajes que se reciben. El campo de entrada de texto es un objeto JTextField y el botón de enviar es un objeto JButton.

La clase ChatView define varios métodos para interactuar con los componentes de la interfaz de usuario. Por ejemplo, el método getMessage() devuelve el mensaje introducido por el usuario en el campo de entrada de texto, el método setMessage() establece el mensaje a mostrar en el campo de entrada de texto y el método appendMessage() añade un mensaje al área de chat.

La clase ChatView también tiene un método llamado addSendButtonListener() que permite agregar un ActionListener al botón "Send". Este método es útil para capturar la acción del usuario al hacer clic en el botón "Send".

Finalmente, la clase ChatView tiene un método llamado displayMessages() que muestra una lista de mensajes en el área de chat. Este método recibe una lista de mensajes y llama al método appendMessage() para agregar cada mensaje a la vista del usuario.

## ChatController:
El controlador se encarga de manejar la lógica del programa y la interacción entre la vista y el modelo.

El controlador utiliza la clase ChatModel para mantener los mensajes y la clase ChatView para mostrarlos en la vista. La clase ChatController se encarga de escuchar eventos del botón "Send" en la vista y agregar mensajes al modelo, así como enviar los mensajes a todos los clientes conectados. También maneja la conexión con los clientes utilizando sockets, lo que permite a los usuarios enviar y recibir mensajes en tiempo real.

En el método start() del controlador, se cargan los mensajes desde un archivo y se muestran en la vista. Además, se agrega el controlador como listener del botón "Send", se inicia el servidor y se inicializa una lista de clientes conectados.

El controlador también incluye varios métodos privados que se utilizan para manejar la conexión con los clientes, como startServer(), sendToClients(), sendToClient(), listenToClient(), addClient() y removeClient(). Estos métodos permiten enviar y recibir mensajes y agregar o eliminar clientes de la lista de clientes conectados.

## Main:
La clase Main crea instancias del modelo, vista y controlador, y muestra la ventana principal de la aplicación.

En el método main, se crean las instancias del modelo, vista y controlador. La instancia del modelo se crea utilizando un nombre de archivo que se utiliza para almacenar y cargar los mensajes de la aplicación. La instancia de la vista se crea sin ningún argumento. Y la instancia del controlador se crea pasando el modelo y la vista como argumentos.

Después de crear las instancias, se llama al método show() de la vista para mostrar la ventana principal de la aplicación. Y luego se llama al método start() del controlador para iniciar el controlador de la aplicación.

El controlador es responsable de escuchar los eventos de la vista, procesar los datos de entrada del usuario y actualizar el modelo. La vista es responsable de mostrar los datos del modelo al usuario y enviar eventos al controlador. Y el modelo es responsable de almacenar y recuperar los datos de la aplicación.
