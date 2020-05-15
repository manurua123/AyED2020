package ejercicio1_2;

import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class TestListaDeEnterosConArreglos {
	public ListaDeEnterosConArreglos lista; 
	
	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		int valor;
		 for (int i = 0; i < args.length; i++) {
			 valor = Integer.parseInt(args[i]);
			 lista.agregarFinal(valor);
		 }
		while(!lista.fin()) {
		System.out.print(lista.proximo() + " | ");
		}
	}
			
}
