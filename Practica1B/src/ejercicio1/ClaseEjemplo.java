package ejercicio1;

public class ClaseEjemplo {
	private static int numeroA;
	private static int numeroB; 
	

	
	public ClaseEjemplo(int A, int B) {
		ClaseEjemplo.numeroA = A;
		ClaseEjemplo.numeroB = B;
		
	}
	public int getNumeroA(){
		return numeroA;
	}
	public int getNumeroB(){
		return numeroB;
	}
	public void metodoA() {
		for (int i= numeroA; i <= numeroB; i++) {
			System.out.println(i);
		}
	}
	
	public void metodoB() {
		int i = numeroA;
		while (i <= numeroB) {
			System.out.println(i);
			i ++;
		}	
	}
	
	public void metodoC(int numeroA) {
		if (numeroA <= numeroB) {
			System.out.println(numeroA);
			metodoC(numeroA+1);
		}		
	}
	
}

