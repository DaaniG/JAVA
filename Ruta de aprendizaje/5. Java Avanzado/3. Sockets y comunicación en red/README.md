# Sockets y comunicación de red en Java

En términos generales, un socket es un extremo de una conexión de red bidireccional entre dos dispositivos en una red. En Java, se utilizan los sockets para establecer una conexión entre un servidor y uno o varios clientes y permitir que se comuniquen entre sí.

Para establecer una conexión de socket en Java, se necesita conocer la dirección IP y el puerto del dispositivo con el que se desea comunicar. El puerto es un número que identifica una aplicación o servicio específico en el dispositivo. Por ejemplo, el puerto 80 se utiliza para el protocolo HTTP (Hipertexto de transferencia de protocolo), mientras que el puerto 443 se utiliza para el protocolo HTTPS (Hipertexto de transferencia de protocolo seguro).

En Java, se utilizan dos clases principales para trabajar con sockets: Socket y ServerSocket. La clase Socket se utiliza para establecer una conexión con otro dispositivo en una red y la clase ServerSocket se utiliza para esperar conexiones entrantes de otros dispositivos.

Para crear un socket de servidor en Java, primero se crea un objeto ServerSocket y se le pasa un número de puerto. Luego, se utiliza el método accept() para esperar a que un cliente se conecte al socket de servidor. Cuando se establece una conexión, se crea un objeto Socket que representa la conexión entre el servidor y el cliente.

Por ejemplo, este código crea un socket de servidor en el puerto 8080 y espera a que un cliente se conecte:

```java
try {
    ServerSocket serverSocket = new ServerSocket(8080);
    Socket clientSocket = serverSocket.accept();
    // Se estableció la conexión con el cliente, se puede utilizar el objeto Socket para enviar y recibir datos
} catch (IOException e) {
    e.printStackTrace();
}
```

Por otro lado, para crear un socket de cliente en Java, se crea un objeto Socket y se le pasa la dirección IP y el número de puerto del servidor al que se desea conectarse. Cuando se establece una conexión, se crea un objeto Socket que representa la conexión entre el cliente y el servidor.

Por ejemplo, este código crea un socket de cliente que se conecta al servidor en la dirección IP "localhost" y el puerto 8080:

```java
try {
    Socket socket = new Socket("localhost", 8080);
    // Se estableció la conexión con el servidor, se puede utilizar el objeto Socket para enviar y recibir datos
} catch (IOException e) {
    e.printStackTrace();
}
```

Una vez que se ha establecido una conexión, se pueden enviar y recibir datos a través del objeto Socket utilizando los métodos getInputStream() y getOutputStream() para obtener flujos de entrada y salida de datos, respectivamente.

Por ejemplo, este código envía la cadena "Hola, servidor!" al servidor a través del objeto Socket:

```java
try {
    Socket socket = new Socket("localhost", 8080);
    OutputStream outputStream = socket.getOutputStream();
    outputStream.write("Hola, servidor!".getBytes());
} catch (IOException e) {
    e.printStackTrace();
}
```
