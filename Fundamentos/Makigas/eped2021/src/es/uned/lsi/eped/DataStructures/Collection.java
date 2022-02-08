package es.uned.lsi.eped.DataStructures;

public abstract class Collection<E> implements CollectionIF<E> {
	protected int size;

	/* Constructor por defecto de una coleccion */
	public Collection () {
		size = 0;
	}
	
	/* Devuelve el numero de elementos de la coleccion */
	public int size() {
		return size;
	}
	
	/* Nos dice si la coleccion esta vacia o no */
	public boolean isEmpty() {
		return size == 0;
	}
	
	/* Vacia la coleccion */
	public void clear() {
		size = 0;
	}
	
	abstract public boolean contains(E e);
}
