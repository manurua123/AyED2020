package ejercicio5;

public class Test {
	public static void main(String[] args) {
		Arreglo vector = new Arreglo(5);
		vector.imprimir();
		System.out.println("el maximo es: " + vector.maximo());
		System.out.println("el mimimo es: " + vector.minimo());
		System.out.println("el promedio es: " + vector.promedio());
		System.out.println();
		System.out.println("METODO A: ");
		System.out.println();
		
		System.out.println("METODO B: ");
		int max=0;
		int min=0;
		double prom=0;
		vector.metodoB(max, min, prom);
		System.out.println("el maximo es: " + max);
		System.out.println("el mimimo es: " + min);
		System.out.println("el promedio es: " + prom);
		System.out.println();
		System.out.println("METODO C: ");
		System.out.println("el maximo es: " + vector.metodoC().getMaximo());
		System.out.println("el mimimo es: " + vector.metodoC().getMinimo());
		System.out.println("el promedio es: " + vector.metodoC().getPromedio());
		
	}

}
