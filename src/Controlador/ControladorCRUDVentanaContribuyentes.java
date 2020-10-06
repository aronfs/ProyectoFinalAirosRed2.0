/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaContribuentes;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaContribuyentes {

    private final VentanaContribuentes ventanaContribuyentes;

    public ControladorCRUDVentanaContribuyentes(VentanaContribuentes ventanaContribuyentes) {
        this.ventanaContribuyentes = ventanaContribuyentes;
    }

    public void iniciar() {
        ventanaContribuyentes.setVisible(true);
        ventanaContribuyentes.setLocation(150, 30);
    }

}
