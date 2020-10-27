package others;

import java.util.ArrayList;

public class Paciente extends Persona {
	private String grupoSanguineo; 
	private ArrayList<String> medicamentosAlergia;
	
	public Paciente(String DNI, String NSS, String nombre, String apellido, String direccion,String grupoSanguineo, String[] medicamentos){
	   
	   super(DNI,NSS,nombre,apellido,direccion);
	   
	   this.grupoSanguineo = grupoSanguineo;	
	   medicamentosAlergia= new ArrayList<String>();
	   for(String medicamento : medicamentos)
	   {
		  this.medicamentosAlergia.add(medicamento);
	   }

	}
	


	@Override
	public String toString() {
		return "Paciente [grupoSanguineo=" + grupoSanguineo + ", medicamentosAlergia=" + medicamentosAlergia
				+ ", toString()=" + super.toString() + "]";
	}



	public static void main (String [ ] args) {
		Paciente p = new Paciente("0000","00000","Alberto","Sanchez","direccion1","B", new String[]{"Ibuprofeno","Amoxicilina"});
		System.out.println(p.toString());
		
	}

}