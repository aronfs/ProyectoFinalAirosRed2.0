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
public class Empleado {

    private String Cod_Empleado;

    public Empleado() {
    }

    public Empleado(String Cod_Empleado) {
        this.Cod_Empleado = Cod_Empleado;
    }

    public String getCod_Empleado() {
        return Cod_Empleado;
    }

    public void setCod_Empleado(String Cod_Empleado) {
        this.Cod_Empleado = Cod_Empleado;
    }

}
