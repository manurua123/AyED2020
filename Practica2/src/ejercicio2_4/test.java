package ejercicio2_4;
import tp02.ejercicio2.*;

public class test {
	public static void main(String[] args) {
		ListaEnlazadaGenerica<objeto_test> lista =new ListaEnlazadaGenerica<objeto_test>();
		objeto_test[] vector = new objeto_test[10];
		
		//creo un vector de Objatos_test
		for (int i= 0; i<vector.length; i++) {			
			vector[i]= new objeto_test((int)(Math.random()*9+0), "texto Ejemplo"); 
			System.out.println(i + ") "+ vector[i].toString());
		}
		System.out.println("CONTENIDO DEl VECTOR: ");
		for (int i= 0; i<vector.length; i++) {
			System.out.println(i + ") " +  vector[i].toString());
		}
		System.out.println(vector[5].toString());
		
		
			
	}
}
