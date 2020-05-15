package ejercicio1;

public class Test {
	public static void main(String[] args) {
		ClaseEjemplo claseTest = new ClaseEjemplo(4, 7);
		System.out.println("METODO FOR");
		claseTest.metodoA();
		System.out.println("METODO WHILE");
		claseTest.metodoB();
		System.out.println("METODO RECURSIVO");
		claseTest.metodoC(claseTest.getNumeroA());
		
	}

}
