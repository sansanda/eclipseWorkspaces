package others;


import java.io.DataInputStream;
import java.io.IOException;

public class IngresosMensuales {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// TODO Auto-generated method stub
	    String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "setiembre", "octubre", "noviembre", "diciembre"};
	    int ingresoBrutoAnual = 0;
	    DataInputStream in = new DataInputStream(System.in);
	    
	    for (int i=0;i<mes.length;i++) {
		    System.out.println("Ingrese los ingresos brutos mensuales del mes " + mes[i] + " de la persona: ");
			int ingresosBrutosMensuales = Integer.parseInt(in.readLine());
			ingresoBrutoAnual = ingresoBrutoAnual + ingresosBrutosMensuales;
	    }

	    System.out.println("Los ingresos brutos del años son: " + ingresoBrutoAnual);
	    
	}
	
}
