package ejercicio5;

public class Arreglo {
	private static int [] vector;
	
	public Arreglo(int a) {
		Arreglo.vector = new int[a];
		for (int i=0; i < vector.length; i++) {
			vector[i]= (int)(Math.random()*9+0);
		}	
	}
	public  void imprimir(){
		System.out.println("-------------------");
		for (int i = 0;i < vector.length; i++) {
			System.out.print(vector[i] + " | ");
		}
		System.out.println();
		System.out.println("-------------------");
	}
	public int maximo(){
		int max = 0;
		for (int i = 0;i < vector.length; i++) {
			if (vector[i] > max) {
				max = vector[i];
			}
		}
		 return max;
	}
	public int minimo(){
		int min = 99999999;
		for (int i = 0;i < vector.length; i++) {
			if (vector[i] < min) {
				min = vector[i];
			}
		}
		 return min;
	}
	public  double promedio() {
		double total = 0;
		for(int i=0; i< vector.length; i++) {
			total = total + vector[i];
		}
		total = total/vector.length;
		return total; 
	}
	
	public  int metodoA() {
		int a =0;
		
		return a; 
	}
	
	public  void metodoB(int max, int min, double prom){
		max = 0;
		for (int i = 0;i < vector.length; i++) {
			if (vector[i] > max) {
				max = vector[i];
			}
		}
		min = 99999999;
		for (int i = 0;i < vector.length; i++) {
			if (vector[i] < min) {
				min = vector[i];
			}
		}
		prom = 0;
		for(int i=0; i< vector.length; i++) {
			prom = prom + vector[i];
		}
		prom = prom/vector.length;
		
	}
	
	public  Datos metodoC() {
		Datos obj = new Datos();
		int max = 0;
		for (int i = 0;i < vector.length; i++) {
			if (vector[i] > max) {
				max = vector[i];
			}
		}
		int min = 99999999;
		for (int i = 0;i < vector.length; i++) {
			if (vector[i] < min) {
				min = vector[i];
			}
		}
		double prom = 0;
		for(int i=0; i< vector.length; i++) {
			prom = prom + vector[i];
		}
		prom = prom/vector.length;
		
		obj.setMaximo(max);
		obj.setMinimo(min);
		obj.setPromedio(prom);
		return obj; 
	}
		
}
