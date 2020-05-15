package ejercicio1_6;
import tp02.ejercicio1.ListaDeEnterosEnlazada;


public class Test {
	public static ListaDeEnterosEnlazada calcularSucesion(int n) {
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		calculo(lista,n);
		return lista;	
	}
	private static void calculo(ListaDeEnterosEnlazada lista, int n) {
		lista.agregarFinal(n);
		if(n !=1) {
			if(n%2==0) {
				calculo(lista,n/2);
			}
			else {
				calculo(lista,3*n+1);
			}
		}
	}
	public static void main(String[] args) {
		ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
		l = calcularSucesion(6);
		l.comenzar();
		while(!l.fin()) {
			System.out.print(l.proximo()+ " | ");
		}
	}
}
