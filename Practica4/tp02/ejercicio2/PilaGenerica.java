package tp02.ejercicio2;
import tp02.ejercicio2.ListaGenerica;

public class PilaGenerica<T>extends ListaGenerica<T> {
	private NodoGenerico<T> tope;
	private int tamanio;
	
	public PilaGenerica() {
		this.tope = null;
		tamanio =0;
	}
	public void apilar(T elem) {
		NodoGenerico<T> aux = null;
		aux.setDato(elem);
		aux.setSiguiente(tope);
		tope = aux;
		tamanio ++;
	}
	public T desapilar() {
		if(this.esVacio()) {
			return null;
		}
		T aux = tope.getDato();
		tope = tope.getSiguiente();
		tamanio --;
		return aux;
	}
	public T tope() {
		if(tope == null) {
			return null;
		}
		else
			return tope.getDato();
	}
	public boolean esVacio() {
		return(tope==null);
				
	}
	@Override
	public void comenzar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public T proximo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean fin() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public T elemento(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean agregarEn(T elem, int pos) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean agregarInicio(T elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean agregarFinal(T elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean eliminar(T elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean eliminarEn(int pos) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean incluye(T elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean esVacia() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int tamanio() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean reemplazarEn(T elem, int pos) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ListaGenerica<T> clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean agregar(T[] vector) {
		// TODO Auto-generated method stub
		return false;
	}
	

	

	

}
