/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaCancelacionDeServicio;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaCancelacionServicio {

    private final VentanaCancelacionDeServicio ventanaCancelacionDeServicio;

    public ControladorCRUDVentanaCancelacionServicio(VentanaCancelacionDeServicio ventanaCancelacionDeServicio) {
        this.ventanaCancelacionDeServicio = ventanaCancelacionDeServicio;
    }

    public void Iniciar() {
        ventanaCancelacionDeServicio.setVisible(true);
        ventanaCancelacionDeServicio.setLocation(150, 30);
    }
}
