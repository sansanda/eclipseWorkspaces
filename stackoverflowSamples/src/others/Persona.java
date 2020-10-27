package others;

public class Persona {
	String DNI;
	String NSS;
	String nombre;
	String apellido;
	String direccion;
	
	public Persona(String dNI, String nSS, String nombre, String apellido, String direccion) {
		super();
		DNI = dNI;
		NSS = nSS;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", NSS=" + NSS + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ direccion + ", toString()=" + super.toString() + "]";
	}
	
}	
