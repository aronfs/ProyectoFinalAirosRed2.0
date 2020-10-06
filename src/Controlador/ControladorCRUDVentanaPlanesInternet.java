/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaPlanesInternet;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaPlanesInternet {
    
    private final VentanaPlanesInternet ventanaPlanesInternet;

    public ControladorCRUDVentanaPlanesInternet(VentanaPlanesInternet ventanaPlanesInternet) {
        this.ventanaPlanesInternet = ventanaPlanesInternet;
    }
    
    public void Iniciar(){
        ventanaPlanesInternet.setVisible(true);
        ventanaPlanesInternet.setLocation(150, 30);
    }
    
}
