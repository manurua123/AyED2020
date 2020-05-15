package ejercicio3;
import tp04.ejercicio1.ArbolGeneral;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;


public class Test {
	public static void main(String[] args) {
		ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a31 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a32 = new ArbolGeneral<Integer>(5);
		ListaGenerica<ArbolGeneral<Integer>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<Integer>>();
		a3.agregarHijo(a31);
		a3.agregarHijo(a32);
		hijos.agregarInicio(a1); 
		hijos.agregarInicio(a2); 
		hijos.agregarInicio(a3);
		
		ArbolGeneral<Integer>  a = new ArbolGeneral<Integer>(0, hijos);
		System.out.println("Arbol PreOrden: "+ a.preOrden());
		System.out.println("Arbol PostOrden: "+ a.postOrden());
		System.out.println("Arbol InOrden: "+ a.inOrden());
		System.out.println("Arbol Por Nivel: " + a.recorridoPorNiveles());
		
		int x = 3;
		int y = 5;
		System.out.println("Arbol ansestros entre "+ y + " y " + x + a.esAncestro(x, y));
	

		System.out.println("Hojas: "+a.contarHojas());
		
	}
	
}
