package ejercicio3;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class PilaGenerica<T> extends ListaGenerica<T> {
private ListaEnlazadaGenerica <T> datos = new ListaEnlazadaGenerica <T>();
	
	
	public PilaGenerica() {
		this.datos = null;
	}
	public void apilar(T elemento){
        this.datos.agregarInicio(elemento);
	}
	public T desapilar(){
		T elemento =  this.datos.elemento(1);
		this.datos.eliminarEn(1);
		return elemento;
	}
	
	public T tope(){
        return this.datos.elemento(1);
	}
	 
	@Override
	public boolean esVacia(){
        return this.datos.esVacia();        
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
	public boolean eliminarEn(int pos) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public int tamanio() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public ListaGenerica<T> clonar() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean agregar(Object[] vector) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean incluye(Object elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean reemplazarEn(Object elem, int pos) {
		// TODO Auto-generated method stub
		return false;
	}

}

	


