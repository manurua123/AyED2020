package ejercicio3;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int maxEstudiante = 2; 
		int maxProfesor = 3;
		Estudiante[] vecEstudiante = new Estudiante[maxEstudiante];
		Profesor[] vecProfesor = new Profesor [maxProfesor];
		Estudiante estudiante;
		Profesor profesor; 
		
		Random rnd = new Random();
		
		for (int i = 0; i<maxEstudiante; i++) {
			estudiante = new Estudiante("Nombre"+rnd.nextInt(), "Apellido"+rnd.nextInt(),rnd.nextInt(),"Email"+rnd.nextInt(),"direcion"+rnd.nextInt());
			vecEstudiante[i]=estudiante; 
		}
		
		for (int i= 0; i<maxProfesor; i++) {
			profesor = new Profesor("Nombre"+rnd.nextInt(), "Apellido"+rnd.nextInt(),"Email"+rnd.nextInt(),"Catedra"+rnd.nextInt(),"direcion"+rnd.nextInt());
			vecProfesor[i] = profesor;
		}
		
		for(int i = 0; i<maxEstudiante; i++) {
			System.out.println(vecEstudiante[i].tusDatos());
			System.out.println("---------------------------------------------------------------------------------");
		}
		System.out.println("-.-.-.PROFRESORES-.-.-.-.");
		for(int i = 0; i<maxProfesor; i++) {
			System.out.println(vecProfesor[i].tusDatos());
			System.out.println("---------------------------------------------------------------------------------");
		}		 
		
		
		
		
		
		
	}
}
