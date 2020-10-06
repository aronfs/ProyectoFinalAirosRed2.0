/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author aaron
 */
public class Contribuyente {

    private String RUC;
    private String Razon_Social;
    private String Id_Representante;
    private float Ingresos_Anuales;
    private String Ciudad;
    private String Nombre_Comercial;
    private String Direccion;
    private String Telefono;
    private String Provincia;

    public Contribuyente() {
    }

    public Contribuyente(String RUC, String Razon_Social, String Id_Representante, float Ingresos_Anuales, String Ciudad, String Nombre_Comercial, String Direccion, String Telefono, String Provincia) {
        this.RUC = RUC;
        this.Razon_Social = Razon_Social;
        this.Id_Representante = Id_Representante;
        this.Ingresos_Anuales = Ingresos_Anuales;
        this.Ciudad = Ciudad;
        this.Nombre_Comercial = Nombre_Comercial;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Provincia = Provincia;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getRazon_Social() {
        return Razon_Social;
    }

    public void setRazon_Social(String Razon_Social) {
        this.Razon_Social = Razon_Social;
    }

    public String getId_Representante() {
        return Id_Representante;
    }

    public void setId_Representante(String Id_Representante) {
        this.Id_Representante = Id_Representante;
    }

    public float getIngresos_Anuales() {
        return Ingresos_Anuales;
    }

    public void setIngresos_Anuales(float Ingresos_Anuales) {
        this.Ingresos_Anuales = Ingresos_Anuales;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getNombre_Comercial() {
        return Nombre_Comercial;
    }

    public void setNombre_Comercial(String Nombre_Comercial) {
        this.Nombre_Comercial = Nombre_Comercial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

}
