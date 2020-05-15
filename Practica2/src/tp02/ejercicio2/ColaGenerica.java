package tp02.ejercicio2;
import tp02.ejercicio2.ListaGenerica;
public class ColaGenerica <T> extends ListaGenerica<T> {
	private NodoGenerico<T> inicio;
	private NodoGenerico<T> actual;
	private NodoGenerico<T> fin;
	private int tamanio;
	
	public ColaGenerica() {
		this.inicio = null;
		this.actual= null;
		this.fin = null; 
		this.tamanio = 0;
	}
	
	public void encolar(T elem) {
		NodoGenerico<T> aux = new NodoGenerico<T>();
		aux.setDato(elem);
		if(this.inicio ==null) {
			this.inicio = aux;
			this.fin = aux;
		}
		else {
			fin.setSiguiente(aux);
			fin = aux;
		}
		tamanio ++;
	}
	public T desencolar() {
		T aux = inicio.getDato();
		if(inicio !=null) {
			inicio = inicio.getSiguiente();
			tamanio --;
		}
		return aux; 
	}
	
	public T tope() {
		if(inicio == null) {
			return null;
		}
		else
			return inicio.getDato();
	}
	public boolean EsVacio() {
		if(inicio == null) {
			return true;
		}
		else {
			return false; 
		}
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
	@Override
	public boolean agregar(T[] vector) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
