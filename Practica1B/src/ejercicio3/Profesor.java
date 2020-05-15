package ejercicio3;

public class Profesor {
	private static String nombre;
	private static String apellido;
	private static String email;
	private static String catedra;
	private static String direccion;
	
	
	
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Profesor.nombre = nombre;
	}
	public static String getApellido() {
		return apellido;
	}
	public static void setApellido(String apellido) {
		Profesor.apellido = apellido;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		Profesor.email = email;
	}
	public static String getCatedra() {
		return catedra;
	}
	public static void setCatedra(String catedra) {
		Profesor.catedra = catedra;
	}
	public static String getDireccion() {
		return direccion;
	}
	public static void setDireccion(String direccion) {
		Profesor.direccion = direccion;
	}
	
	public String tusDatos(){
		String datos;
		datos = "Nombre: " + Profesor.getNombre() + "\n" + "Apellido: " + Profesor.getApellido() + "\n" + "Email: " + Profesor.getEmail() + "\n" + "Catedra:  " + Profesor.getCatedra() + "\n" + "Direccion: " + Profesor.getDireccion();
		return datos;
	}
	public Profesor (String nom, String ape, String mail, String cate, String direcc) {
		Profesor.setApellido(ape);
		Profesor.setNombre(nom);
		Profesor.setEmail(mail);
		Profesor.setCatedra(cate);
		Profesor.setDireccion(direcc);
	}
	
	
	
	
	
	
}

