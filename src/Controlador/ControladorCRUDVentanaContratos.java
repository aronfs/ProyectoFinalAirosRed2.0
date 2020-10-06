/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaContratos;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaContratos {

    private final VentanaContratos ventanaContratos;

    public ControladorCRUDVentanaContratos(VentanaContratos ventanaContratos) {
        this.ventanaContratos = ventanaContratos;
    }

    public void Iniciar() {
        ventanaContratos.setVisible(true);
        ventanaContratos.setLocation(150, 30);
    }

}
