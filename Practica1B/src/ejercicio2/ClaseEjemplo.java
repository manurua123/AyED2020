package ejercicio2;

public class ClaseEjemplo {
	private static int [] vector;
	
	public ClaseEjemplo(int a) {
		ClaseEjemplo.vector = new int[a];
		for (int i=0; i < vector.length; i++) {
			vector[i]= i+1* vector.length;
		}	
		
	}
	public void imprimir() {
		for(int i=0; i < vector.length; i++) {
			System.out.println(i+1 + " x " + vector.length + " = " + vector[i]);
			System.out.println("-------------------");
		}
	}
}
