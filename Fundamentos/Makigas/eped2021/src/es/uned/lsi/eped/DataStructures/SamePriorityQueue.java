package src.es.uned.lsi.eped.DataStructures;
/*Representa una cola con un nivel de prioridad asignado determinado*/
public class SamePriorityQueue<E> implements QueueIF<E>,Comparable<SamePriorityQueue<E>>{
 
  //LA DEFINICION DE LOS ATRIBUTOS DE LA CLASE ES TAREA DE CADA ESTUDIANTE

  /* OPERACIONES PROPIAS DE ESTA CLASE */

  /*constructor por defecto: crea cola vacia con la prioridad dada por parametro.
   *@param p: nivel de prioridad asociado a la cola
  */
  SamePriorityQueue(int p){
	  this.p = p;
  }

  /* Devuelve la prioridad de la cola
   * @return prioridad de la cola
   */
  public int getPriority(){
	  return p;
  }
  private SamePriorityQueue cabeza, ultimo;
  /* OPERACIONES PROPIAS DE QUEUEIF */

  /*Devuelve el primer elemento de la cola
   * @Pre !isEmpty()
   */
  public E getFirst() {
	  return this.cabeza;
  }
  
  
 
  /*A�ade un elemento a la cola de acuerdo al orden de llegada*/
  public void enqueue(E elem) {
	  //Codigo mio
	  SamePriorityQueueo nuevoNodo = new SamePriorityQueue(elem);
	  if(cabeza == null) {
		  cabeza = nuevoNodo;
	  }else {
		  ultimo.siguiente = nuevoNodo;
	  }
	  ultimo = nuevoNodo;
  }

  /*Elimina un elemento a la cola de acuerdo al orden de llegada
   * @Pre !isEmpty()
  */
  public void dequeue() {
	  //Codigo mio
	  if(cabeza != null) {
		  SamePriorityQueue eliminar = cabeza;
		  cabeza = cabeza.siguiente;
		  eliminar.siguiente = null;
		  if(cabeza == null) {
			  ultimo = null;
		  }
	  }
  }

  /* OPERACIONES PROPIAS DEL INTERFAZ SEQUENCEIF */

  /*Devuelve un iterador para la cola*/
  public IteratorIF<E> iterator() { … }
 
  /* OPERACIONES PROPIAS DEL INTERFAZ COLLECTIONIF */

  /*Devuelve el numero de elementos de la cola*/
  public int size() { … }

  /*Decide si la cola esta vacia*/
  public boolean isEmpty() { … }
 
  /*Decide si la cola contiene el elemento dado por parametro*/
  public boolean contains(E e) { … }
 
  /*Elimina todos los elementos de la cola*/
  public void clear() { … }
 
  /* OPERACIONES PROPIAS DEL INTERFAZ COMPARABLE */
 
  /*Comparacion entre colas segun su prioridad
   * Salida:
   *  - Valor >0 si la cola tiene mayor prioridad que la cola dada por parametro
   *  - Valor 0 si ambas colas tienen la misma prioridad
   *  - Valor <0 si la cola tiene menor prioridad que la cola dada por parametro
   */
  public int compareTo(SamePriorityQueue<E> o) { … }

}

