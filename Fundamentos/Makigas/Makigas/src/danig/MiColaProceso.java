public class MiColaProceso implements ColaProceso {
	private class NodoProceso{
		public Trabajo trabajo;
		public NodoProceso siguiente;
		public NodoProceso(Trabajo trabajo) {
			this.trabajo = trabajo;
		}
	}
	
	private NodoProceso cabeza, ultimo;
	
	@Override
	public void encolar(Trabajo t) {
		NodoProceso nuevoNodo = new NodoProceso(t);
		if(cabeza == null) {
			cabeza = nuevoNodo;
		}else {
			ultimo.siguiente = nuevoNodo;
		}
		ultimo = nuevoNodo;
	}
	
	@Override
	public void eliminar() {
		if(cabeza != null) {
			NodoProceso eliminar = cabeza;
			cabeza=cabeza.siguiente;
			eliminar.siguiente = null;
			if(cabeza == null) {
				ultimo = null;
			}
		}
	}
	
	@Override
	public Trabajo obtener() {
		if(cabeza == null) {
			return null;
		}else {
			return cabeza.trabajo;
		}
	}
}
