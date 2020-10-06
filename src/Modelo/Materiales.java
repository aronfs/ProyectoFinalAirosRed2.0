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
public class Materiales {
    
    private String Cod_Material;
    private Date Fecha;
    private float Precio;
    private float IVA;
    private String Marca;

    public Materiales() {
    }

    public Materiales(String Cod_Material, Date Fecha, float Precio, float IVA, String Marca) {
        this.Cod_Material = Cod_Material;
        this.Fecha = Fecha;
        this.Precio = Precio;
        this.IVA = IVA;
        this.Marca = Marca;
    }

    public String getCod_Material() {
        return Cod_Material;
    }

    public void setCod_Material(String Cod_Material) {
        this.Cod_Material = Cod_Material;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public float getIVA() {
        return IVA;
    }

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    
}
