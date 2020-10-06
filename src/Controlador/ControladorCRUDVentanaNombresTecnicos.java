/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaNombresTecnicos;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaNombresTecnicos {
    
    private final VentanaNombresTecnicos ventanaNombresTecnicos;

    public ControladorCRUDVentanaNombresTecnicos(VentanaNombresTecnicos ventanaNombresTecnicos) {
        this.ventanaNombresTecnicos = ventanaNombresTecnicos;
    }
    
    public void Iniciar(){
        ventanaNombresTecnicos.setVisible(true);
        ventanaNombresTecnicos.setLocation(150, 30);
    }
    
}
