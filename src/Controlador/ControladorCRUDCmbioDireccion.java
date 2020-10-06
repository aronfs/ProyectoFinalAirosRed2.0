/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaCambioDireccion;

/**
 *
 * @author aaron
 */
public class ControladorCRUDCmbioDireccion {

    private final VentanaCambioDireccion ventanaCambioDireccion;

    public ControladorCRUDCmbioDireccion(VentanaCambioDireccion ventanaCambioDireccion) {
        this.ventanaCambioDireccion = ventanaCambioDireccion;
    }

    public void Iniciar() {
        ventanaCambioDireccion.setVisible(true);
        ventanaCambioDireccion.setLocation(150, 30);
    }
}
