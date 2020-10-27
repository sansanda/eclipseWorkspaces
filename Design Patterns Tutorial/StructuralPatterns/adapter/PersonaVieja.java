package adapter;

import java.util.Date;

public class PersonaVieja implements IPersonaVieja {

	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	
	

	public PersonaVieja(String nombre, String apellidos, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	@Override
	public String getApellidos() {
		// TODO Auto-generated method stub
		return apellidos;
	}

	@Override
	public void setApellidos(String apellidos) {
		// TODO Auto-generated method stub
		this.apellidos = apellidos;
	}

	@Override
	public Date getFechaNacimiento() {
		// TODO Auto-generated method stub
		return fechaNacimiento;
	}

	@Override
	public void setFechaNacimiento(Date fechaNacimiento) {
		// TODO Auto-generated method stub
		this.fechaNacimiento = fechaNacimiento;
	}

}
