# Sockets y comunicación de red en Java

En Java, los sockets son una forma de establecer una conexión entre dos dispositivos a través de una red y permitir la comunicación entre ellos. La comunicación a través de sockets se basa en el protocolo TCP/IP, que es el protocolo de red más común utilizado en la actualidad.

Hay dos tipos de sockets en Java: sockets de servidor y sockets de cliente. Los sockets de servidor esperan a que los clientes se conecten y, cuando se establece la conexión, se crea un objeto Socket que representa la conexión. El servidor puede usar este objeto Socket para enviar y recibir datos al cliente.

Por otro lado, los sockets de cliente se conectan a un socket de servidor utilizando una dirección IP y un número de puerto. Cuando se establece la conexión, se crea un objeto Socket que representa la conexión y el cliente puede enviar y recibir datos a través de este objeto.

Para utilizar sockets en Java, se utilizan las clases Socket y ServerSocket. La clase Socket representa un socket cliente y se utiliza para conectarse a un socket de servidor. La clase ServerSocket representa un socket de servidor y se utiliza para esperar conexiones de sockets clientes.

### Socket de servidor:

```java
try {
    ServerSocket serverSocket = new ServerSocket(8080); // Crea un socket de servidor en el puerto 8080
    Socket socket = serverSocket.accept(); // Espera a que un cliente se conecte al socket de servidor y crea un objeto Socket que representa la conexión
    // Usa el objeto Socket para enviar y recibir datos
} catch (IOException e) {
    e.printStackTrace();
}
```

### Socket de cliente:

```java
try {
    Socket socket = new Socket("localhost", 8080); // Crea un objeto Socket que se conecta al servidor en el puerto 8080
    // Usa el objeto Socket para enviar y recibir datos
} catch (IOException e) {
    e.printStackTrace();
}
```
