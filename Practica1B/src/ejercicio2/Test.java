package ejercicio2;
import java.util.Scanner;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("ingrese un valor");
		int valor = Obj.nextInt();
		ClaseEjemplo claseTest = new ClaseEjemplo(valor);
		System.out.println("todo OK");
		claseTest.imprimir();
	
	}
}
