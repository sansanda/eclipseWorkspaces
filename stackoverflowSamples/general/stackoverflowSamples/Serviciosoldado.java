package stackoverflowSamples;

import java.util.Date;

public class Serviciosoldado {

    private Soldado soldado;
    private Servicio servicio;
      private Date fechaservicio;
    private String codigoservicio;
 private int a�o;

    public Serviciosoldado(){

    }

    public Serviciosoldado(int a�o, Soldado soldado, Servicio servicio, String codigoservicio, Date fechaservicio) {
        this.a�o = a�o;
        this.soldado = soldado;
        this.servicio = servicio;
        this.codigoservicio = codigoservicio;
        this.fechaservicio = fechaservicio;
    }

    public int getA�o() {
        return a�o;
    }

    public void setA�o(int a�o) {
        this.a�o = a�o;
    }

    public Soldado getSoldado() {
        return soldado;
    }

    public void setSoldado(Soldado soldado) {
        this.soldado = soldado;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String getCodigoservicio() {
        return codigoservicio;
    }

    public void setCodigoservicio(String codigoservicio) {
        this.codigoservicio = codigoservicio;
    }

    public Date getFechaservicio() {
        return fechaservicio;
    }

    public void setFechaservicio(Date fechaservicio) {
        this.fechaservicio = fechaservicio;
    }



}
