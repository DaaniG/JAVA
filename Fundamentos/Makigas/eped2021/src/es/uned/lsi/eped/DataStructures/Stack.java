package es.uned.lsi.eped.DataStructures;
//Pila//
public class Stack<E> extends Sequence<E> implements StackIF<E> {
	
	/* Constructor por defecto: crea una pila vacía */
	public Stack(){
		super();
	}
	
	/* Constructor por copia: delega en el constructor por copia *
	 * de la secuencia                                           */
    public Stack(Stack<E> s) {
    	super(s);
    }
	
	/* Devuelve el elemento en la cima de la pila */
	public E getTop() {
		return this.firstNode.getValue();
	}

	/* Añade un nuevo elemento a la cima de la pila */
	public void push(E elem) {
		NodeSequence newNode = new NodeSequence(elem);
		if(!isEmpty()){
			newNode.setNext(this.firstNode);
		}
		this.firstNode = newNode;
		this.size++;
	}

	/* Elimina el elemento situado en la cima de la pila */
	public void pop() {
		this.firstNode = this.firstNode.getNext();
		this.size--;
	}

}
