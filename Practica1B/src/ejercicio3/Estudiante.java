package ejercicio3;

public class Estudiante {
	private static String nombre;
	private static String apellido;
	private static int comision;
	private static String email;
	private static String direccion;
	
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Estudiante.nombre = nombre;
	}
	public static String getApellido() {
		return apellido;
	}
	public static void setApellido(String apellido) {
		Estudiante.apellido = apellido;
	}
	public static int getComision() {
		return comision;
	}
	public static void setComision(int comision) {
		Estudiante.comision = comision;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Estudiante.email = email;
	}
	public static String getDireccion() {
		return direccion;
	}
	public static void setDireccion(String direccion) {
		Estudiante.direccion = direccion;
	} 

	public String tusDatos(){
		String datos;
		datos = "Nombre: " + Estudiante.getNombre() + "\n" + "Apellido: " + Estudiante.getApellido() + "\n" + "Email: " + Estudiante.getEmail() + "\n" + "Comision:  " + Estudiante.getComision() + "\n" + "Direccion: " + Estudiante.getDireccion();
		return datos;
	}
	
	public Estudiante(String nom,String apee,int com,String mail,String direc) {
		Estudiante.setApellido(apee);
		Estudiante.setComision(com);
		Estudiante.setNombre(nom);
		Estudiante.setEmail(mail);
		Estudiante.setDireccion(direc);
	}

	
}
