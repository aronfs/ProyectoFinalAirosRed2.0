/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaOperarioSoporte;

/**
 *
 * @author aaron
 */
public class ControladorCRUDOperarioSoporte {

    private final VentanaOperarioSoporte ventanaOperarioSoporte;

    public ControladorCRUDOperarioSoporte(VentanaOperarioSoporte ventanaOperarioSoporte) {
        this.ventanaOperarioSoporte = ventanaOperarioSoporte;
    }

    public void Iniciar() {
        ventanaOperarioSoporte.setVisible(true);
        ventanaOperarioSoporte.setLocation(150, 30);
    }

}
