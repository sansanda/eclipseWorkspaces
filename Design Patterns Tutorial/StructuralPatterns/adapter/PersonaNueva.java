package adapter;

public class PersonaNueva implements IPersonaNueva {

	private String nombre;
	private int edad;
	
	public PersonaNueva(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}

	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		this.edad = edad;
	}

}
