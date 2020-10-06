/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaServicio;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaServicio {

    private final VentanaServicio ventanaServicio;

    public ControladorCRUDVentanaServicio(VentanaServicio ventanaServicio) {
        this.ventanaServicio = ventanaServicio;
    }

    public void Iniciar() {
        ventanaServicio.setVisible(true);
        ventanaServicio.setLocation(150, 30);
    }
}
