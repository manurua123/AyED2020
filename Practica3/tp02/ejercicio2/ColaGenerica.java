package tp02.ejercicio2;
import tp02.ejercicio2.ListaGenerica;
public class ColaGenerica <T> extends ListaGenerica<T> {
	private ListaEnlazadaGenerica <T> datos = new ListaEnlazadaGenerica <T>();
    
    public boolean esVacia(){
        return this.datos.esVacia();        
    }
    
    public void encolar(T elemento){
            this.datos.agregarFinal(elemento);
    }
    public T desencolar(){
            T elemento =  this.datos.elemento(1);
            this.datos.eliminarEn(1);
            return elemento;
    }
    public T tope(){
            return this.datos.elemento(1);
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

	
	
	

}