package src.es.uned.lsi.eped.DataStructures;
/*Representa una cola con prioridad implementada mediante una secuencia de SamePriorityQueue*/
public class BucketQueue<E> extends Collection<E> implements PriorityQueueIF<E> {
 
  //LA DEFINICION DE LOS ATRIBUTOS DE LA CLASE ES TAREA DE CADA ESTUDIANTE

  /* Clase privada que implementa un iterador para la *
   * cola con prioridad basada en secuencia.          */
  public class PriorityQueueIterator implements IteratorIF<E> {

    //LA DEFINICION DE LOS ATRIBUTOS DE LA CLASE ES TAREA DE CADA ESTUDIANTE

    /*Constructor por defecto*/
    protected PriorityQueueIterator(){ â€¦ }

    /*Devuelve el siguiente elemento de la iteracion*/
    public E getNext() { â€¦ }
    
    /*Comprueba si queda algun elemento por iterar*/
    public boolean hasNext() { â€¦ }
 
    /*Reinicia el iterador a la posicion inicial*/
    public void reset() { â€¦ }
  }



  /* OPERACIONES PROPIAS DE ESTA CLASE */

  /*constructor por defecto: crea cola con prioridad vacia
   */
  BucketQueue(){
	 //Aqui va codigo 
  }

  /* OPERACIONES PROPIAS DE LA INTERFAZ PRIORITYQUEUEIF */

  /*Devuelve el elemento mas prioritario de la cola y que
   *llega en primer lugar
   * @Pre !isEmpty()
   */
  public E getFirst() {
	  //Codigo mio -- añadir la prioridad tambien
	  return this.firstNode.getValue();
  }
 
  /*Añade un elemento a la cola de acuerdo a su prioridad
   *y su orden de llegada
   */
  public void enqueue(E elem, int prior) {
	  //Codigo mio -- Tengo que añadir la prioridad para que se añada antes que otro
	  NodeSequence newNode = new NodeSequence(elem);
		if(isEmpty()){
			this.firstNode = newNode;
		} else{
			this.lastNode.setNext(newNode);
		}
		this.lastNode = newNode;
		this.size++;
  }

  /*Elimina el elemento mas prioritario y que llega a la cola
   *en primer lugar
   * @Pre !isEmpty()
   */
  public void dequeue() {
	  //Codigo mio -- añadir prioridad
	  this.firstNode = this.firstNode.getNext();
		this.size--;
		if(this.size == 0){
			this.lastNode = null;
		}
  }

  /* OPERACIONES PROPIAS DE LA INTERFAZ SEQUENCEIF */

  /*Devuelve un iterador para la cola*/
  public IteratorIF<E> iterator() {
	  //Codigo mio
	  this.iterator = firstNode;
  }
 
  /* OPERACIONES PROPIAS DE LA INTERFAZ COLLECTIONIF */

  /*Devuelve el numero de elementos de la cola*/
  public int size() {
	  //Codigo mio
	  return this.size();
  }

  /*Decide si la cola esta vacia*/
  public boolean isEmpty() {
	  //Codigo mio
	  if(this.size == 0){
			this.lastNode = true;
	  }
  }
 
  /*Decide si la cola contiene el elemento dado por parametro*/
  public boolean contains(E e) { â€¦ }
 
  /*Elimina todos los elementos de la cola*/
  public void clear() {
	  //Codigo mio
	  super.clear();   /* Vaciamos la secuencia */
		this.lastNode = null; /* No hay ultimo nodo */
  }
 
}

