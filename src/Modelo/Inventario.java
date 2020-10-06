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
public class Inventario {
    
    private String Cod_Inventario;
    private String Numero_Serie;
    private String Bodega;
    private String estado_Material;
    private String disponibilidad_inventario;
    private Date fecha;

    public Inventario() {
    }

    public Inventario(String Cod_Inventario, String Numero_Serie, String Bodega, String estado_Material, String disponibilidad_inventario, Date fecha) {
        this.Cod_Inventario = Cod_Inventario;
        this.Numero_Serie = Numero_Serie;
        this.Bodega = Bodega;
        this.estado_Material = estado_Material;
        this.disponibilidad_inventario = disponibilidad_inventario;
        this.fecha = fecha;
    }

    public String getCod_Inventario() {
        return Cod_Inventario;
    }

    public void setCod_Inventario(String Cod_Inventario) {
        this.Cod_Inventario = Cod_Inventario;
    }

    public String getNumero_Serie() {
        return Numero_Serie;
    }

    public void setNumero_Serie(String Numero_Serie) {
        this.Numero_Serie = Numero_Serie;
    }

    public String getBodega() {
        return Bodega;
    }

    public void setBodega(String Bodega) {
        this.Bodega = Bodega;
    }

    public String getEstado_Material() {
        return estado_Material;
    }

    public void setEstado_Material(String estado_Material) {
        this.estado_Material = estado_Material;
    }

    public String getDisponibilidad_inventario() {
        return disponibilidad_inventario;
    }

    public void setDisponibilidad_inventario(String disponibilidad_inventario) {
        this.disponibilidad_inventario = disponibilidad_inventario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
            
    
    
}
