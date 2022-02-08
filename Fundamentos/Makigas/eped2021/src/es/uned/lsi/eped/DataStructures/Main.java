package src.es.uned.lsi.eped.DataStructures;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

import es.uned.lsi.eped.DataStructures.IteratorIF;

public class Main {
	
	/*Devuelve una cadena de caracteres con la secuencia de
	 * elementos de una cola con prioridad
	 * @param PQ: cola con prioridad
	*/
	public static <E> String toString(PriorityQueueIF<E> PQ){
		String result = "";
		IteratorIF<E> iter = PQ.iterator();
		while(iter.hasNext()){
			result = result+iter.getNext().toString();
			if(iter.hasNext()){
				result = result+" ";
			}
		}
		return result;
	}
	
	/*Comprueba si la ruta de un fichero existe (devuelve cadena de 
	 * caracteres vacia) o en caso de que no (cadena de caracteres
	 * no vacia)
	 * @param path: ruta de un fichero
	 * */
	public static String existsFolder(String path){
		String separator = System.getProperty("file.separator");
		if(path.contains(separator)){
			String folder = path.substring(0,path.lastIndexOf(separator));
			File F = new File(folder);
			if(!F.exists()){
				return folder;
			}
		}
		return new String();
	}
	
	
	
	public static void main(String[] args) throws IOException {
		//Tipo de cola con prioridad. Posibles valores: 
		//   - BQ (Bucket Queue) o 
		//   - BST (Cola con prioridad mediante Arbol de busqueda binario)
		String typeQueue = args[0]; 
		PriorityQueueIF<String> PQ;
		if(typeQueue.equals("BQ")){
			PQ = new BucketQueue<String>();
		}
		else{
			if(typeQueue.equals("BST")){
				PQ = new BSTPriorityQueue<String>();
			}
			else{
				System.out.println("ERROR: el primer argumento es BQ o BST.");
				return;
			}
		}
		//Fichero de entrada
		String input = args[1]; 
		//se comprueba que existe la ruta mediante la funcion auxiliar existsFolder
		String existsPath = existsFolder(input);
		if(!existsPath.isEmpty()){
			//si no existe, se lanza mensaje de error
			System.out.println("ERROR: no existe carpeta de fichero de entrada "+existsPath+".");
			return;
		}
		//Fichero de salida
		String output = args[2];
		//se comprueba que existe la ruta mediante la funcion auxiliar existsFolder
		String existsOut = existsFolder(output);
		if(!existsOut.isEmpty()){
			//si no existe, se lanza mensaje de error
			System.out.println("ERROR: no existe carpeta de fichero de salida "+existsOut+".");
			return;
		}
		//salto de linea
		String lineFeed = System.getProperty("line.separator");
		//lectura del fichero de entrada
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input), "utf-8"));		
		//escritura en el fichero de salida
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(output), "utf-8"));
		String line;
		long t0 = System.currentTimeMillis();
		while ((line = br.readLine())!=null) {
			/*cada linea del fichero de entrada es una operacion
			 * de la cola con prioridad.
			*/
			//Obtiene cadenas separadas por espacios en blancos de la linea
			StringTokenizer st = new StringTokenizer(line, " ");
			//La primera cadena consiste en la operacion
			String op = st.nextToken();
			//resultado de la operacion
			String result = new String();
			//distinci贸n seg煤n sea la operacion
			switch(op){
				//operaci贸n enqueue
				case "enqueue":
					/*va acompa馻da de 2 parametros
					el primero es el elemento */
					String elem = st.nextToken();
					/*el segundo es una prioridad (numero entero)
					 *la cadena se pasa a entero
					*/
					int prior = Integer.parseInt(st.nextToken());
					//se aplica la operacion enqueue sobre la cola con prioridad
					PQ.enqueue(elem, prior);
					break;
				//}
				//operaci贸n dequeue
				case "dequeue":
					//se aplica la operacion dequeue sobre la cola con prioridad
					PQ.dequeue();
					break;
				//operacion size
				case "size":
					//se aplica la operacion size sobre la cola con prioridad
					result = Integer.toString(PQ.size());
					break;
				//operaci贸n iterator
				case "iterator":
					/*se obtiene la secuencia de elementos de la cola con 
					 * prioridad mediante la funcion auxiliar toString
					*/
					result = toString(PQ);
					break;
				
			}
			//solo se escriben cadenas no vacias en el fichero de salida 
			if(!result.isEmpty()){
				bw.write(result+lineFeed);
			}
		} 
		long t1 = System.currentTimeMillis() - t0;
		//muestra por consola el tiempo de ejecucion en milisegundos
		System.out.println(t1+" ms");
		//se cierra el buffer de lectura
		br.close();
		//se cierra el buffer de escritura
		bw.close();
	}
	
}