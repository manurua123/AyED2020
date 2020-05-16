package ejercicio2;

import tp03.ejercicio1.*;

public class Test {
	public static void main(String[] args) {
	ArbolBinario<Integer> arbol = new ArbolBinario<Integer>(40);
	ArbolBinario<Integer> hijoIzquierdo = new ArbolBinario<Integer>(25);
	hijoIzquierdo.agregarHijoDerecho(new ArbolBinario<Integer>(10));
	hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario<Integer>(35));
	ArbolBinario<Integer> hijoDerecho = new ArbolBinario<Integer>(78);
	arbol.agregarHijoDerecho(hijoDerecho);
	arbol.agregarHijoIzquierdo(hijoIzquierdo);
	
	
	System.out.println("Cantidad de Hojas: " + arbol.contarHojas());

	
	System.out.println("recorrido por pre orden : " + arbol.preOrden());
	System.out.println("recorrido por in orden : " + arbol.inOrden());
	System.out.println("recorrido por post orden : " + arbol.postOrden());
	System.out.println("recorrido por nivel: " + arbol.recorridoPorNiveles());
	System.out.println("recorrido entre nivel 1 y 2 : " + arbol.entreNiveles(1, 2));
	
	
	
	
	
	
	
	}
}
