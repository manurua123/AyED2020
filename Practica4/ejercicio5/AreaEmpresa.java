package ejercicio5;

public class AreaEmpresa{
	private char id;
	private int tiempo;
	
	public AreaEmpresa(char i, int t) {
		id = i;
		tiempo = t;
	}
	public String toString() {
		String aux = "("+ id + "," + tiempo+")"; 
		return aux;
	}
	public char getId() {
		return id;
	}
	public void setId(char id) {
		this.id = id;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
	

}
