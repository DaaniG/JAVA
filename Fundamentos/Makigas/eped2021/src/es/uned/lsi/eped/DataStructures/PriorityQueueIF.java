package src.es.uned.lsi.eped.DataStructures;

import es.uned.lsi.eped.DataStructures.SequenceIF;

/* Representa una cola de prioridad, en la que los elementos    * 
 * salen según su nivel de prioridad y su orden de entrada.     */ 
public interface PriorityQueueIF<E> extends SequenceIF<E> {

	/* Devuelve el elemento más prioritario de la cola con prioridad.*
	/* @Pre !isEmpty()                                               *
	 * @return el elemento más prioritario de la cola con prioridad. */
	public E getFirst();
	
    /* Incluye un elemento con una cierta prioridad en la cola con prioridad *
     * @param elem: el elemento a encolar (añadir).       					 *
     * @param prior: prioridad                                               *
    */
	public void enqueue(E elem, int prior);
	
    /* Elimina el elemento más prioritario de la cola con prioridad *
     * @Pre !isEmpty();                                             */
	public void dequeue();
	

	
	
}
