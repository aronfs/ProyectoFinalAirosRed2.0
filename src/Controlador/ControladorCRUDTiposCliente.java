/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaTipoCliente;

/**
 *
 * @author aaron
 */
public class ControladorCRUDTiposCliente {
    
    private final VentanaTipoCliente ventanaTipoCliente;

    public ControladorCRUDTiposCliente(VentanaTipoCliente ventanaTipoCliente) {
        this.ventanaTipoCliente = ventanaTipoCliente;
    }
    
    public void Iniciar (){
    
    ventanaTipoCliente.setVisible(true);
    ventanaTipoCliente.setLocation(150, 30);
    
    }
}
