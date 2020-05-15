package tp04.ejercicio1;

import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;


public class ArbolGeneral<T> {

	private NodoGeneral<T> raiz;

	public ArbolGeneral() {

		this.raiz = null;
	}

	public ArbolGeneral(T dato) {

		this.raiz = new NodoGeneral<T>(dato);
		
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> lista) {

		this(dato);
		ListaGenerica<NodoGeneral<T>> hijos = new ListaEnlazadaGenerica<NodoGeneral<T>>();

		lista.comenzar();
		while (!lista.fin()) {
			ArbolGeneral<T> arbolTemp = lista.proximo();
			hijos.agregarFinal(arbolTemp.getRaiz());
			
		}

		raiz.setListaHijos(hijos);
	}

	private ArbolGeneral(NodoGeneral<T> nodo) {

		this.raiz = nodo;
	}


	private NodoGeneral<T> getRaiz() {

		return this.raiz;
	}

	public T getDatoRaiz() {

		return this.raiz.getDato();
	}

	
	public ListaGenerica<ArbolGeneral<T>> getHijos() {

		ListaGenerica<ArbolGeneral<T>> lista = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		ListaGenerica<NodoGeneral<T>> hijos = (ListaGenerica<NodoGeneral<T>>) this.getRaiz().getHijos();
		lista.comenzar();
		hijos.comenzar();
		while (!hijos.fin()) {
			lista.agregarFinal(new ArbolGeneral<T>(hijos.proximo()));	
		}
		return lista;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {
		NodoGeneral<T> hijo = unHijo.getRaiz();
		this.raiz.getHijos().agregarFinal(hijo);
	}

	
	public void eliminarHijo(ArbolGeneral<T> unHijo) {
		NodoGeneral<T> hijo = unHijo.getRaiz();
		boolean ok = false;
		ListaGenerica<NodoGeneral<T>> listaHijos = (ListaGenerica<NodoGeneral<T>>) this.getRaiz().getHijos();
		listaHijos.comenzar();
		while (!listaHijos.fin() && !ok) {
			NodoGeneral<T> hijoTemp = listaHijos.proximo();
			if (hijoTemp.getDato().equals(hijo.getDato())) {
				ok = listaHijos.eliminar(hijoTemp);	
			}
		}	
	}
	  
    private void preOrden(ListaEnlazadaGenerica<T>  l){  
    	l.agregarFinal(this.getRaiz().getDato());    
    	ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();    
    	lHijos.comenzar();    
    	while(!lHijos.fin()){       
    		lHijos.proximo().preOrden(l);    
    		}
    }
    public ListaEnlazadaGenerica<T> preOrden(){
		ListaEnlazadaGenerica<T> l = new ListaEnlazadaGenerica<T>();
		this.preOrden(l);
		return l;
	}
    
    private void inOrden(ListaGenerica<T> l){  
    	ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();    
    	lHijos.comenzar();
    	if(!lHijos.esVacia()) {
    		lHijos.proximo().inOrden(l);
    	}
    	l.agregarFinal(this.getRaiz().getDato());
    	while(!lHijos.fin()){ 
    		lHijos.proximo().inOrden(l);  
    	}   		 
    }
    public ListaEnlazadaGenerica<T> inOrden(){
		ListaEnlazadaGenerica<T> l = new ListaEnlazadaGenerica<T>();
		this. inOrden(l);
		return l;
	}
    
    
    private void postOrden(ListaGenerica<T> l){  
    	ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();    
    	lHijos.comenzar();    
    	while(!lHijos.fin()){       
    		lHijos.proximo().postOrden(l);    
    		}
    	l.agregarFinal(this.getRaiz().getDato());  
    }
    public ListaEnlazadaGenerica<T>  postOrden(){
		ListaEnlazadaGenerica<T> l = new ListaEnlazadaGenerica<T>();
		this. postOrden(l);
		return l;
	}
    
    public ListaGenerica <T> recorridoPorNiveles () {
    	ListaEnlazadaGenerica <T>  lista = new ListaEnlazadaGenerica <T> ();
		ColaGenerica <ArbolGeneral<T>> cola = new ColaGenerica <ArbolGeneral<T>>(); 
		ArbolGeneral <T> arbol = null;
		cola.encolar(this);
		cola.encolar(null);
		while(!cola.esVacia()){
			arbol=cola.desencolar();
			if(arbol!=null){
				lista.agregarFinal(arbol.getDatoRaiz());
				ListaGenerica<ArbolGeneral<T>> listahijos = arbol.getHijos();
				while(!listahijos.fin()) {
					cola.encolar(listahijos.proximo());
				}
			}else {
				if(!cola.esVacia()) {
					cola.encolar(null);
				}
			}
		}
		return lista;
	}
    
    public Integer altura() {
	   int altura=5;
       return altura(this,altura);
       
   }

   private int altura(ArbolGeneral<T> arbol ,int altura) {
	   int max_altura = altura; 
	   if(!arbol.esVacio()){
		   ListaGenerica<ArbolGeneral<T>> lhijos = arbol.getHijos();
		   lhijos.comenzar();
		   while(!lhijos.fin()) {
			   ArbolGeneral<T> hijo= lhijos.proximo();
			   int altura_nueva=altura(hijo,altura+1);
			   Math.max(max_altura, altura_nueva);        
			   }
		   return max_altura;
       }
	   else { 
		   return 0;
	   }
	}
   
   	
	public Integer nivel( T dato){
		//falta implementar
	   return -1;
	}


	public Integer ancho(){
	   //Falta implementar..
	   return 0;
	}

	
	public Boolean esHoja(){
		if (this.getHijos().esVacia()) {
			return true;
		}
		else 
			return false;
	}
	private void contarHojas(ListaEnlazadaGenerica<T>  l){  
		if(this.esHoja()) {
			l.agregarFinal(this.getRaiz().getDato());    
		}
    	ListaGenerica<ArbolGeneral<T>> lHijos = this.getHijos();    
    	lHijos.comenzar();    
    	while(!lHijos.fin()){       
    		lHijos.proximo().contarHojas(l);    
    		}
    }
	public ListaEnlazadaGenerica<T> contarHojas(){
		ListaEnlazadaGenerica<T> l = new ListaEnlazadaGenerica<T>();
		this.contarHojas(l);
		return l;
	}
	
	
	
	public Boolean esVacio(){
		if(this.getHijos().esVacia() && this.getDatoRaiz()== null) {
			return true;
		}
		else {
			return false;
		}
	}
	

	private boolean esAncetro(T b) {
		if(this.getDatoRaiz()==b) {
			return true;
		}
		else {
			ListaGenerica<ArbolGeneral<T>> lHijos;
			lHijos = this.getHijos();
			lHijos.comenzar();
			boolean listo = false;
			while((!lHijos.fin())&&(!listo)){
				listo = lHijos.proximo().esAncetro(b);
			}
			return listo;
		}					
	}
	public Boolean esAncestro(T a, T b) {
		if(this.getDatoRaiz()==a) {
			return(this.esAncetro(b));
		}
		else {
			ListaGenerica<ArbolGeneral<T>> lHijos;
			lHijos = this.getHijos();
			lHijos.comenzar();
			boolean listo = false;
			while((!lHijos.fin())&&(!listo)){
				listo = lHijos.proximo().esAncestro(a,b);
			}
			return listo;
		}					
		}
}
