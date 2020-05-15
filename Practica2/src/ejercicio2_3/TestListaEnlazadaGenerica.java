package ejercicio2_3;
import tp02.ejercicio2.ListaEnlazadaGenerica;


public class TestListaEnlazadaGenerica {
	public static void main(String[] args) {
		ListaEnlazadaGenerica<Estudiante> lista =new ListaEnlazadaGenerica<Estudiante>();
		lista.agregarFinal(new Estudiante("manuel",2));
		lista.agregarFinal(new Estudiante("milagros",5));
		lista.agregarFinal(new Estudiante("lautaro",4));
		lista.agregarFinal(new Estudiante("micaela",7));
		
		lista.comenzar();
		while(!lista.fin()) {
			System.out.print(lista.proximo().getNombre()+ " | ");
			
		}
		
		
	}
	
}
