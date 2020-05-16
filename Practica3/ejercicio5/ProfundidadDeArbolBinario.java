package ejercicio5;

import tp02.ejercicio2.ColaGenerica;

import tp03.ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinario{
	private ArbolBinario<Integer> arbol;
	public ProfundidadDeArbolBinario( ArbolBinario<Integer> a) {
		arbol = a;
	}
	
	public int sumaElementosProfundidad(int p) {
		int cant = 0; 
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		cola.encolar(arbol);
		cola.encolar(null);
		int nivel = 0; 
		while (!cola.esVacia() && nivel <= p) {
			ArbolBinario<Integer> arbol = null;
			arbol = cola.desencolar();
			if (arbol != null) {
				if(nivel  == p){
					cant ++;
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
		return cant;
	}
	
}
