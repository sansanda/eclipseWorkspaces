package stackoverflowSamples;

import java.util.Date;

public class Serviciosoldado {

    private Soldado soldado;
    private Servicio servicio;
      private Date fechaservicio;
    private String codigoservicio;
 private int año;

    public Serviciosoldado(){

    }

    public Serviciosoldado(int año, Soldado soldado, Servicio servicio, String codigoservicio, Date fechaservicio) {
        this.año = año;
        this.soldado = soldado;
        this.servicio = servicio;
        this.codigoservicio = codigoservicio;
        this.fechaservicio = fechaservicio;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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
