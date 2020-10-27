package stackoverflowSamples;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Prueba {

    public static void main(String[] args) {


        Soldado soldado1=new Soldado();

        soldado1.setCodigo("1143400436");
        soldado1.setNombre("Carlos andres");
        soldado1.setApellido("castillo");

         Soldado soldado2=new Soldado();
           soldado2.setCodigo("1143400436");
        soldado2.setNombre("Carlos andres");
        soldado2.setApellido("castillo");

        Servicio servicio1=new Servicio("12345","limpiaarmas");
        Servicio servicio2=new Servicio("99999","armero");


        Date fechaactual=new Date();

        Serviciosoldado s1=new Serviciosoldado(2019, soldado1, servicio1, "77777", fechaactual);

        soldado1.agregarServicio(s1);
        servicio1.agregarServicio(s1);

        HashMap <String,Serviciosoldado>servicios_año=soldado1.buscarporaño(2019);

        int i=1;

        for(Map.Entry<String,Serviciosoldado>elemento: servicios_año.entrySet()){
            String key=elemento.getKey();
            Serviciosoldado s=elemento.getValue();

            System.out.println("Primer"+i);
            System.out.println("Codigo"+s.getCodigoservicio());
            System.out.println("Soldado"+s.getSoldado().getNombre());
            System.out.println("Servicio"+s.getServicio().getDescripcion());
            System.out.println("Año"+s.getAño());
        i++;


        }




    }

}