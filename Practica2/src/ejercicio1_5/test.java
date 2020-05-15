package ejercicio1_5;

import tp02.ejercicio1.ListaDeEnterosEnlazada;

public class test {
	private static void imprimirInveso(ListaDeEnterosEnlazada lista){	
		if(!lista.fin()) {
			Integer dato = lista.proximo();
			imprimirInveso(lista);
			System.out.print(dato + " | ");
		}	
	}	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		
		 for (int i = 0; i < args.length; i++) {
			 l.agregarFinal(Integer.parseInt(args[i]));
		 }
	
		l.comenzar();
		System.out.print("lista orginal: ");
		while(!l.fin()) {
			System.out.print(l.proximo()+ " | ");
		}
		
		System.out.println("");
		System.out.print("lista inversa: ");
		l.comenzar();
		imprimirInveso(l);	
	}
	
}
