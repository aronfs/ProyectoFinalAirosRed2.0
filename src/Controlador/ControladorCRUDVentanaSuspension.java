/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaSuspension;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaSuspension {

    private final VentanaSuspension ventanaSuspensio;

    public ControladorCRUDVentanaSuspension(VentanaSuspension ventanaSuspensio) {
        this.ventanaSuspensio = ventanaSuspensio;
    }

    public void Iniciar() {
        ventanaSuspensio.setVisible(true);
        ventanaSuspensio.setLocation(150, 30);
    }
}
