/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaReactivacion;

/**
 *
 * @author aaron
 */
public class ControladorCRUDReactivacion {

    private final VentanaReactivacion ventanaReactivacion;

    public ControladorCRUDReactivacion(VentanaReactivacion ventanaReactivacion) {
        this.ventanaReactivacion = ventanaReactivacion;
    }

    public void Iniciar() {
        ventanaReactivacion.setVisible(true);
        ventanaReactivacion.setLocation(150, 30);
    }
}
