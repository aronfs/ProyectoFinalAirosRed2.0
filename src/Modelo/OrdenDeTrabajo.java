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
public class OrdenDeTrabajo {

    private String Numero_Orden;
    private String Tipo_Orden;
    private Date FechaInicio;
    private Date FechaFinal;
    private String Estado;

    public OrdenDeTrabajo() {
    }

    public OrdenDeTrabajo(String Numero_Orden, String Tipo_Orden, Date FechaInicio, Date FechaFinal, String Estado) {
        this.Numero_Orden = Numero_Orden;
        this.Tipo_Orden = Tipo_Orden;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
        this.Estado = Estado;
    }

    public String getNumero_Orden() {
        return Numero_Orden;
    }

    public void setNumero_Orden(String Numero_Orden) {
        this.Numero_Orden = Numero_Orden;
    }

    public String getTipo_Orden() {
        return Tipo_Orden;
    }

    public void setTipo_Orden(String Tipo_Orden) {
        this.Tipo_Orden = Tipo_Orden;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFinal() {
        return FechaFinal;
    }

    public void setFechaFinal(Date FechaFinal) {
        this.FechaFinal = FechaFinal;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
