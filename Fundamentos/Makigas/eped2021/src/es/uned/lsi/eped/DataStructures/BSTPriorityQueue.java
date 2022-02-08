package src.es.uned.lsi.eped.DataStructures;
/*Representa una cola con prioridad implementada mediante un Arbol binario de busqueda de SamePriorityQueue*/
public class BSTPriorityQueue<E> extends Collection<E> implements PriorityQueueIF<E> {
 
  //LA DEFINICIÓN DE LOS ATRIBUTOS DE LA CLASE ES TAREA DE CADA ESTUDIANTE

  /* Clase privada que implementa un iterador para la *
   * cola con prioridad basada en secuencia.          */
  public class PriorityQueueIterator implements IteratorIF<E> {

    //LA DEFINICIÓN DE LOS ATRIBUTOS DE LA CLASE ES TAREA DE CADA ESTUDIANTE
	private IteratorID<E> iteratorIF;
    /*Constructor por defecto*/
    protected PriorityQueueIterator(){
    	iteratorIF = (IteratorIF<E>) lista.iterator();
    }

    /*Devuelve el siguiente elemento de la iteración*/
    public E getNext() {
    	iteratorIF.getNext();
    }
    
    /*Comprueba si queda algún elemento por iterar*/
    public boolean hasNext() {
    	iteratorIF.hasNext();
    }
 
    /*Reinicia el iterador a la posición inicial*/
    public void reset() {
    	iteratorIF.reset();
    }
  }



  /* OPERACIONES PROPIAS DE ESTA CLASE */

  /*constructor por defecto: crea cola con prioridad vacia
   */
  BSTPriorityQueue(){ … }

  /* OPERACIONES PROPIAS DE LA INTERFAZ PRIORITYQUEUEIF */

  /*Devuelve el elemento más prioritario de la cola y que
   *llegó en primer lugar
   * @Pre !isEmpty()
   */
  public E getFirst() { … }
 
  /*Añade un elemento a la cola de acuerdo a su prioridad
   *y su orden de llegada
   */
  public void enqueue(E elem, int prior) { … }

  /*Elimina el elemento más prioritario y que llegó a la cola
   *en primer lugar
   * @Pre !isEmpty()
   */
  public void dequeue() { … }

  /* OPERACIONES PROPIAS DE LA INTERFAZ SEQUENCEIF */

  /*Devuelve un iterador para la cola*/
  public IteratorIF<E> iterator() { … }
 
  /* OPERACIONES PROPIAS DE LA INTERFAZ COLLECTIONIF */

  /*Devuelve el número de elementos de la cola*/
  public int size() { … }

  /*Decide si la cola está vacía*/
  public boolean isEmpty() { … }
 
  /*Decide si la cola contiene el elemento dado por parámetro*/
  public boolean contains(E e) { … }
 
  /*Elimina todos los elementos de la cola*/
  public void clear() { … }
 
}

