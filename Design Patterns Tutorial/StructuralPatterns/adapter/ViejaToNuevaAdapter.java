package adapter;

import java.util.GregorianCalendar;

public class ViejaToNuevaAdapter {
	private IPersonaVieja personaVieja;

	public ViejaToNuevaAdapter(IPersonaVieja personaVieja) {
		super();
		this.personaVieja = personaVieja;
	}
	
	public String getNombre() {
		// TODO Auto-generated method stub
		String nombreCompleto = personaVieja.getNombre() + " " + personaVieja.getApellidos();
		return nombreCompleto;
	}

	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		String[] nombreCompleto = nombre.split(" ");
		personaVieja.setNombre(nombreCompleto[0]);
		personaVieja.setApellidos(nombreCompleto[1]);
	}

	public int getEdad() {
		// TODO Auto-generated method stub
		GregorianCalendar gC = new  GregorianCalendar();
		GregorianCalendar gC2 = new  GregorianCalendar();
		gC.setTime(personaVieja.getFechaNacimiento());
		return (gC2.get(1) - gC.get(1));
		
	}

	public void setEdad(int edad) {
		GregorianCalendar gC = new  GregorianCalendar();
		int actualYear = gC.get(1);
		gC.set(1, actualYear-edad);
		personaVieja.setFechaNacimiento(gC.getTime());  
	}
}