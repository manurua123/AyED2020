package ejercicio3;
import ejercicio3.PilaGenerica;

public class Test {
	public static <T> void main(String[] args) {
		PilaGenerica pila = new PilaGenerica();
		
		int valor;
		System.out.println("VALORES INGRESADOR:");
		pila.comenzar();
		while (!pila.fin()) {
			System.out.println(pila.proximo());
		}
		for (int i=1; i<10;i++ ) {
			valor = (int)(Math.random()*9+0);
			pila.apilar(valor);	
			System.out.println(valor);
				
		}
		System.out.println("PILA:");
		pila.comenzar();
		while (!pila.fin()) {
			System.out.println(pila.proximo());
		}
		
		
	
	
		
	}
}
