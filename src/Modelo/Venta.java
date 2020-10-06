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
public class Venta {
    
    private String Id__Venta;
    private String Estado_Documento;
    private String Forma_Pago;
    private String Bodega;
    private Date FechaInicio;
    private Date FechaFinal;

    public Venta() {
    }

    public Venta(String Id__Venta, String Estado_Documento, String Forma_Pago, String Bodega, Date FechaInicio, Date FechaFinal) {
        this.Id__Venta = Id__Venta;
        this.Estado_Documento = Estado_Documento;
        this.Forma_Pago = Forma_Pago;
        this.Bodega = Bodega;
        this.FechaInicio = FechaInicio;
        this.FechaFinal = FechaFinal;
    }

    public String getId__Venta() {
        return Id__Venta;
    }

    public void setId__Venta(String Id__Venta) {
        this.Id__Venta = Id__Venta;
    }

    public String getEstado_Documento() {
        return Estado_Documento;
    }

    public void setEstado_Documento(String Estado_Documento) {
        this.Estado_Documento = Estado_Documento;
    }

    public String getForma_Pago() {
        return Forma_Pago;
    }

    public void setForma_Pago(String Forma_Pago) {
        this.Forma_Pago = Forma_Pago;
    }

    public String getBodega() {
        return Bodega;
    }

    public void setBodega(String Bodega) {
        this.Bodega = Bodega;
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
    
    
    
    
}
