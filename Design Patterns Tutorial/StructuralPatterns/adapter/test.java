package adapter;

import java.util.Date;
import java.util.GregorianCalendar;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(1947, 12, 2);
		
		PersonaVieja pv = new PersonaVieja("Manolo", "Garcia", gc.getTime());
		ViejaToNuevaAdapter adapter = new ViejaToNuevaAdapter(pv);
		System.out.println(adapter.getNombre());
		System.out.println(adapter.getEdad());
		
	}

}
