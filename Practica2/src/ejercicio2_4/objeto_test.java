package ejercicio2_4;

public class objeto_test {
	private static int contenido;
	private static String def;
	public objeto_test(int n, String d) {
		objeto_test.setContenido(n);
		objeto_test.setDef(d);
	}
	public static int getContenido() {
		return contenido;
	}
	public static void setContenido(int contenido) {
		objeto_test.contenido = contenido;
	}
	public static String getDef() {
		return def;
	}
	public static void setDef(String def) {
		objeto_test.def = def;
	}
	public String toString() {
		String mensaje = "numero: " + contenido + " string: " + def; 
		return mensaje;
	}
}
