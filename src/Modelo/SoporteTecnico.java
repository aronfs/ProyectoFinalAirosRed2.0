/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author aaron
 */
public class SoporteTecnico {

    private String Numero_Caso;
    private Date fecha;
    private String Medio_Comunicacion;
    private String Motivo;

    public SoporteTecnico() {
    }

    public SoporteTecnico(String Numero_Caso, Date fecha, String Medio_Comunicacion, String Motivo) {
        this.Numero_Caso = Numero_Caso;
        this.fecha = fecha;
        this.Medio_Comunicacion = Medio_Comunicacion;
        this.Motivo = Motivo;
    }

    public String getNumero_Caso() {
        return Numero_Caso;
    }

    public void setNumero_Caso(String Numero_Caso) {
        this.Numero_Caso = Numero_Caso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMedio_Comunicacion() {
        return Medio_Comunicacion;
    }

    public void setMedio_Comunicacion(String Medio_Comunicacion) {
        this.Medio_Comunicacion = Medio_Comunicacion;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

}
