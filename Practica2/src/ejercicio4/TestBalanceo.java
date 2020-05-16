package ejercicio4;
import ejercicio3.PilaGenerica;
import java.util.Scanner;


public class TestBalanceo {
	static PilaGenerica<Character> pila = new PilaGenerica<Character>();  

  public static void main (String [] pps) {
      try (Scanner teclado = new Scanner(System.in)) {
		System.out.println("Ingrese el texto");
		  String texto = teclado.nextLine();
		  balanceo(texto);
	}
      
      }

  public static void balanceo(String linea){
      for (int i = 0; i < linea.length(); i++) {
    	  System.out.println(linea.charAt(i));
    	  if (linea.charAt(i) == '(') {
    		  pila.apilar(')');
    		  }
    	  else if (linea.charAt(i) == '{') {
    		  pila.apilar('}');
    		  }
    	  else if (linea.charAt(i) == '[') {
    		  pila.apilar(']');
    		  }
    	  else if (linea.charAt(i) == ')') {
    		  verifica(')');
    		  }
    	  else if (linea.charAt(i) == '}') {
    		  verifica('}');
    		  }
    	  else if (linea.charAt(i) == ']') {
			 verifica(']');
			 }
      }

      if (pila.esVacia())
    	  System.out.println("balanceados");
      else 
    	  System.out.println(" NO balanceados");	  
  }

  private static void verifica (char c) {
      if (pila.esVacia()) {
    	  System.out.println("NO balanceados"); 
    	  System.exit(0); 
      } else {
	  char s = (char) pila.desapilar();  
	  System.out.println("DESAPIOLO  " + s);
	  if (c != s) {
	      System.out.println("NO balanceados"); 
	      System.exit(0); 
	  }
      }
  }
}

