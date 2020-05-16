package ejercicio3;
import tp02.ejercicio2.*;
import tp03.ejercicio1.*;

public class ContadorArbol {
	private ArbolBinario<Integer> arbol;
	
	public ContadorArbol(ArbolBinario<Integer> a) {
		arbol = a;
	}
	
	public ListaGenerica<Integer> numerosParesPreOrden(){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer> ();
		numerosParesPreOrden(l,arbol);
		return l;
	}
	private void numerosParesPreOrden(ListaGenerica<Integer> l,  ArbolBinario<Integer> a) {
		if(!a.esVacio()) {
			if(a.getDatoRaiz()%2==0) {
				l.agregarFinal(a.getDatoRaiz());
			}
			numerosParesPreOrden(l,a.getHijoIzquierdo());
			numerosParesPreOrden(l,a.getHijoDerecho());	
		}
	}
	
	public ListaGenerica<Integer> numerosParesInOrden(){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer> ();
		numerosParesInOrden(l,arbol);
		return l;
	}
	private void numerosParesInOrden(ListaGenerica<Integer> l,  ArbolBinario<Integer> a) {
		if(!a.esVacio()) {
			numerosParesInOrden(l,a.getHijoIzquierdo());
			if(a.getDatoRaiz()%2==0) {
				l.agregarFinal(a.getDatoRaiz());
			}
			numerosParesInOrden(l,a.getHijoDerecho());	
		}
	}
	
	public ListaGenerica<Integer> numerosParesPostOrden(){
		ListaGenerica<Integer> l = new ListaEnlazadaGenerica<Integer> ();
		numerosParesPostOrden(l,arbol);
		return l;
	}
	private void numerosParesPostOrden(ListaGenerica<Integer> l,  ArbolBinario<Integer> a) {
		if(!a.esVacio()) {
			numerosParesPostOrden(l,a.getHijoIzquierdo());
			numerosParesPostOrden(l,a.getHijoDerecho());	
			if(a.getDatoRaiz()%2==0) {
				l.agregarFinal(a.getDatoRaiz());
			}
		}
	}
}
