/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaMotivosSoporte;

/**
 *
 * @author aaron
 */
public class ControladorCRUDMotivosSoporte {

    private final VentanaMotivosSoporte ventanaMotivosSoporte;

    public ControladorCRUDMotivosSoporte(VentanaMotivosSoporte ventanaMotivosSoporte) {
        this.ventanaMotivosSoporte = ventanaMotivosSoporte;
    }

    public void Iniciar() {
        ventanaMotivosSoporte.setVisible(true);
        ventanaMotivosSoporte.setLocation(150, 30);
    }
}
