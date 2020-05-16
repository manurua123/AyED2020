package tp03.ejercicio1;

import tp02.ejercicio2.*;
public class ArbolBinario<T> {

	private NodoBinario<T> raiz;

	public ArbolBinario(T dato) {
		this.raiz = new NodoBinario<T>(dato);
	}

	private ArbolBinario(NodoBinario<T> nodo) {
		this.raiz = nodo;
	}

	private NodoBinario<T> getRaiz() {
		return raiz;
	}

	public T getDatoRaiz() {
		if (this.getRaiz() != null) {
			return this.getRaiz().getDato();
		} else {
			return null;
		}
	}

	public ArbolBinario<T> getHijoIzquierdo() {
		return new ArbolBinario<T>(this.raiz.getHijoIzquierdo());
	}

	public ArbolBinario<T> getHijoDerecho() {
		return new ArbolBinario<T>(this.raiz.getHijoDerecho());
	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.raiz.setHijoIzquierdo(hijo.getRaiz());
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.raiz.setHijoDerecho(hijo.getRaiz());
	}

	public void eliminarHijoIzquierdo() {
		this.raiz.setHijoIzquierdo(null);
	}

	public void eliminarHijoDerecho() {
		this.raiz.setHijoDerecho(null);
	}

	public boolean esVacio() {
		return this.getDatoRaiz() == null;
	}

	public boolean esHoja() {
		return this.getDatoRaiz() != null && this.getHijoIzquierdo().esVacio() && this.getHijoDerecho().esVacio();
	}
	
	public int contarHojas() {
		return contarHojas(this,0);
	}
	
	private int contarHojas( ArbolBinario<T> arbol, int h ) {
		if(arbol.esHoja()) {
			return 1;
		}
		else {
			h = h + contarHojas(arbol.getHijoDerecho(),h);
			h = h + contarHojas(arbol.getHijoIzquierdo(),h);
			return h;
		}	
	}
	
	
	private  ArbolBinario<T> espejo( ArbolBinario<T> arbol){
		if(arbol.esVacio()) {
			return null;
		}
		ArbolBinario<T> arbol_aux = arbol.getHijoIzquierdo();
		arbol.agregarHijoIzquierdo(espejo(arbol.getHijoDerecho()));
		arbol.agregarHijoDerecho(espejo(arbol_aux));
		return arbol;	
	}
	
	public ArbolBinario<T> espejo(){
		ArbolBinario<T> arbol = this;
		return espejo(arbol);
	}
	
	
	public ListaGenerica<T> preOrden(){
		ListaEnlazadaGenerica <T>  l = new ListaEnlazadaGenerica <T>();
		preOrden(l,this);
		return l; 
	}
	
	private void preOrden(ListaEnlazadaGenerica<T> l,ArbolBinario<T> arbol){  
	  if(!arbol.esVacio()) {
    	l.agregarFinal(arbol.getDatoRaiz());
    	preOrden(l,arbol.getHijoIzquierdo());
    	preOrden(l,arbol.getHijoDerecho());	
	  }  	
	}
	
	public ListaGenerica<T> inOrden(){
		ListaEnlazadaGenerica <T>  l = new ListaEnlazadaGenerica <T>();
		inOrden(l,this);
		return l; 
	}
	
	private void inOrden(ListaEnlazadaGenerica<T> l,ArbolBinario<T> arbol){  
	  if(!arbol.esVacio()) {
    	inOrden(l,arbol.getHijoIzquierdo());
    	l.agregarFinal(arbol.getDatoRaiz());
    	inOrden(l,arbol.getHijoDerecho());	
	  }  	
	}
	public ListaGenerica<T> postOrden(){
		ListaEnlazadaGenerica <T>  l = new ListaEnlazadaGenerica <T>();
		postOrden(l,this);
		return l; 
	}
	
	private void postOrden(ListaEnlazadaGenerica<T> l,ArbolBinario<T> arbol){  
	  if(!arbol.esVacio()) {	
    	postOrden(l,arbol.getHijoIzquierdo());
    	postOrden(l,arbol.getHijoDerecho());
    	l.agregarFinal(arbol.getDatoRaiz());
	  }  	
	}
    
	
	public ListaGenerica<T> recorridoPorNiveles() {
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		ListaEnlazadaGenerica <T>  lista = new ListaEnlazadaGenerica <T> ();
		cola.encolar(this);
		cola.encolar(null);
		while (!cola.esVacia()) {
			ArbolBinario<T> arbol = null;
			arbol = cola.desencolar();
			if (arbol != null) {
				lista.agregarFinal(arbol.getDatoRaiz());
				if (!arbol.getHijoIzquierdo().esVacio()) {
					cola.encolar(arbol.getHijoIzquierdo());
				}
				if (!arbol.getHijoDerecho().esVacio()) {
					cola.encolar(arbol.getHijoDerecho());
				}
			} else if (!cola.esVacia()) {
				cola.encolar(null);
			}

		}
		return lista;
	}
	
	public ListaGenerica<T> entreNiveles(int n, int m) {
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		ListaEnlazadaGenerica <T>  lista = new ListaEnlazadaGenerica <T> ();
		cola.encolar(this);
		cola.encolar(null);
		int nivel = 1; 
		while (!cola.esVacia()) {
			ArbolBinario<T> arbol = null;
			arbol = cola.desencolar();
			if (arbol != null) {
				if(nivel  >= n &&  nivel <= m){
					lista.agregarFinal(arbol.getDatoRaiz());
				}
				if (!arbol.getHijoIzquierdo().esVacio()) {
					cola.encolar(arbol.getHijoIzquierdo());
				}
				if (!arbol.getHijoDerecho().esVacio()) {
					cola.encolar(arbol.getHijoDerecho());
				}
			} else 
				if (!cola.esVacia()) {
				cola.encolar(null);
				nivel ++;
			}

		}
		return lista;
	}
	
	public ArbolBinario<Character> convertirPostfija(String exp){
		ArbolBinario<Character> result;
		PilaGenerica<ArbolBinario<Character>> p = new PilaGenerica<ArbolBinario<Character>>();
		for (int i = 0; i < exp.length(); i++) {
			Character c = exp.charAt(i);
			result= new ArbolBinario<Character>(c);
			if ((c == '+') || (c == '-') || (c == '/') || (c == '*')) {
				// Es operador
				result.agregarHijoDerecho(p.desapilar());
				result.agregarHijoIzquierdo(p.desapilar());
			}
			p.apilar(result);
		}
		return(p.desapilar());
	}

	
}
