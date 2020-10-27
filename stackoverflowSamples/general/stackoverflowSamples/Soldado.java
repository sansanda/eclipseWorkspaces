package stackoverflowSamples;

import java.util.HashMap;
import java.util.Map;

public class Soldado {

    private String codigo;
    private String  nombre;
    private String apellido;

    private HashMap<String,Serviciosoldado>listaservicio=new HashMap<String,Serviciosoldado>();


    public Soldado(){

    }

    public Soldado(String codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



   public boolean agregarServicio(Serviciosoldado s){
	System.out.println(s.getCodigoservicio());

    if(!listaservicio.containsKey(s.getCodigoservicio())){
        listaservicio.put(s.getCodigoservicio(),s);
     return true;


    }else{
   return false;

    }


    }

   public Serviciosoldado buscarservicio(String codigo){
  Serviciosoldado s=listaservicio.get(codigo);
  return s;

    }


   public boolean eliminarServicio(String codigo){
    if(listaservicio.get(codigo).equals(codigo)==true){
    if(listaservicio.size()>1){
    listaservicio.remove(codigo);
    return true;


    }else{
    return false;

    }



    }
    else{

        return false;

    }


    }



public boolean editarServicio(Serviciosoldado s){

if(listaservicio.get(s.getCodigoservicio()).equals(s)==true){
    listaservicio.put(s.getCodigoservicio(),s);
    return true;
}

else{

return false;

}


}

public boolean editarservicio(Serviciosoldado s){
    if(listaservicio.get(s.getCodigoservicio()).equals(s)==true){
    listaservicio.put(s.getCodigoservicio(),s);
    return true;

    }
    else{
    return false;

    }

    }

public HashMap<String,Serviciosoldado>buscarporaño(Integer año) {
    HashMap<String,Serviciosoldado>listaporaños=new HashMap<String,Serviciosoldado>();
    for(Map.Entry<String,Serviciosoldado> elemento: listaservicio.entrySet()){

    Serviciosoldado s=elemento.getValue();
    if(s.getAño()==año){

    listaservicio.put(s. getCodigoservicio(),s);
    }

    }

    return listaporaños;
    }



}
