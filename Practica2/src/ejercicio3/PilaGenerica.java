package ejercicio3;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.NodoGenerico;

public class PilaGenerica<T> extends ListaGenerica {
	private NodoGenerico<T> tope;              
    private int tamanio;
    
    public PilaGenerica() {
		this.tope= null;
		tamanio = 0;
	}
	
	public void apilar(T elem) {
		NodoGenerico <T> aux = null;
		aux.setDato(elem);
		aux.setSiguiente(tope);
		tope=aux;
		tamanio ++;
	}
	
	public T desapilar() {
		if(this.esVacia()) {
			return null;
		}
		T aux = tope.getDato();
		tope = tope.getSiguiente();
		tamanio--;
		return aux;
	}
	
	public T tope(){
		if(tope == null) {
			return null;
		} 
		else
			return tope.getDato(); 
		
	}
	public boolean EsVacio() {
		return (tope == null);
	}
	
	@Override
	public void comenzar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Object proximo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean fin() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Object elemento(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean agregarEn(Object elem, int pos) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean agregarInicio(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean agregarFinal(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean eliminar(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean eliminarEn(int pos) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean incluye(Object elem) {
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
	public boolean reemplazarEn(Object elem, int pos) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ListaGenerica clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean agregar(Object[] vector) {
		// TODO Auto-generated method stub
		return false;
	}
	
		
}	

	


