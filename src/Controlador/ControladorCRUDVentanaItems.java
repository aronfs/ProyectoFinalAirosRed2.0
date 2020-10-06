/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaItems;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaItems {

    private final VentanaItems ventanaitems;

    public ControladorCRUDVentanaItems(VentanaItems ventanaitems) {
        this.ventanaitems = ventanaitems;
    }

    public void iniciar() {
        ventanaitems.setVisible(true);
        ventanaitems.setLocation(150, 40);
    }

}
