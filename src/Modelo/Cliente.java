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
public class Cliente {

    private String Cod_Cliente;

    public Cliente() {
    }

    public Cliente(String Cod_Cliente) {
        this.Cod_Cliente = Cod_Cliente;
    }

    public String getCod_Cliente() {
        return Cod_Cliente;
    }

    public void setCod_Cliente(String Cod_Cliente) {
        this.Cod_Cliente = Cod_Cliente;
    }

}
