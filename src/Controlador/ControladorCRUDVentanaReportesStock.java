/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaReportes;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaReportesStock {

    private final VentanaReportes ventanaReportes;

    public ControladorCRUDVentanaReportesStock(VentanaReportes ventanaReportes) {
        this.ventanaReportes = ventanaReportes;
    }

    public void Iniciar() {
        ventanaReportes.setVisible(true);
        ventanaReportes.setLocation(150, 30);
    }
}
