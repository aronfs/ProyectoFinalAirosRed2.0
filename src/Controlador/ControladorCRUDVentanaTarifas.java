/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaTarifasInstalacion;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaTarifas {
    
    private final VentanaTarifasInstalacion ventanaTarifas;

    public ControladorCRUDVentanaTarifas(VentanaTarifasInstalacion ventanaTarifas) {
        this.ventanaTarifas = ventanaTarifas;
    }
    
    public void Iniciar(){
        ventanaTarifas.setVisible(true);
        ventanaTarifas.setLocation(150, 30);
    }
}
