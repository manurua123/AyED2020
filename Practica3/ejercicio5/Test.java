package ejercicio5;

import tp03.ejercicio1.ArbolBinario;

public class Test {
	public static void main(String[] args) {
	ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(40);
	ArbolBinario<Integer> hijoIzquierdo = new ArbolBinario<Integer>(25);
	hijoIzquierdo.agregarHijoDerecho(new ArbolBinario<Integer>(10));
	hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario<Integer>(35));
	ArbolBinario<Integer> hijoDerecho = new ArbolBinario<Integer>(78);
	arbol.agregarHijoDerecho(hijoDerecho);
	arbol.agregarHijoIzquierdo(hijoIzquierdo);
	
	ProfundidadDeArbolBinario arbolTest = new ProfundidadDeArbolBinario(arbol);
	
	System.out.print("la cantidad de elementos a profundidad 1 es: " + arbolTest.sumaElementosProfundidad(2));
	
	}
}
