package ejercicio1_3;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class TestListaDeEnterosEnlazada {
	public static void main(String[] args) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		int valor;
		for (int i=1; i<10;i++ ) {
			valor = (int)(Math.random()*9+0);
			lista.agregarInicio(valor);			
		}
		
	}
}
