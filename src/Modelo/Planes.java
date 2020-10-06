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
public class Planes {

    private String Id_Plan;
    private String Nombre_Plan;
    private String Nombre_Tecnico;
    private Date FechaCreacion;
    private String CompartacionCanal;
    private int Velocidades;
    private float Precio_Planes;

    public Planes() {
    }

    public Planes(String Id_Plan, String Nombre_Plan, String Nombre_Tecnico, Date FechaCreacion, String CompartacionCanal, int Velocidades, float Precio_Planes) {
        this.Id_Plan = Id_Plan;
        this.Nombre_Plan = Nombre_Plan;
        this.Nombre_Tecnico = Nombre_Tecnico;
        this.FechaCreacion = FechaCreacion;
        this.CompartacionCanal = CompartacionCanal;
        this.Velocidades = Velocidades;
        this.Precio_Planes = Precio_Planes;
    }

    public String getId_Plan() {
        return Id_Plan;
    }

    public void setId_Plan(String Id_Plan) {
        this.Id_Plan = Id_Plan;
    }

    public String getNombre_Plan() {
        return Nombre_Plan;
    }

    public void setNombre_Plan(String Nombre_Plan) {
        this.Nombre_Plan = Nombre_Plan;
    }

    public String getNombre_Tecnico() {
        return Nombre_Tecnico;
    }

    public void setNombre_Tecnico(String Nombre_Tecnico) {
        this.Nombre_Tecnico = Nombre_Tecnico;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public String getCompartacionCanal() {
        return CompartacionCanal;
    }

    public void setCompartacionCanal(String CompartacionCanal) {
        this.CompartacionCanal = CompartacionCanal;
    }

    public int getVelocidades() {
        return Velocidades;
    }

    public void setVelocidades(int Velocidades) {
        this.Velocidades = Velocidades;
    }

    public float getPrecio_Planes() {
        return Precio_Planes;
    }

    public void setPrecio_Planes(float Precio_Planes) {
        this.Precio_Planes = Precio_Planes;
    }

}
