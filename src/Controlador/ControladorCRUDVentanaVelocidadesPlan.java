/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaVelocidades;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaVelocidadesPlan {
    
    
    private final VentanaVelocidades ventanaVelocidades;

    public ControladorCRUDVentanaVelocidadesPlan(VentanaVelocidades ventanaVelocidades) {
        this.ventanaVelocidades = ventanaVelocidades;
    }
    
    
    public void Iniciar (){
        ventanaVelocidades.setVisible(true);
        ventanaVelocidades.setLocation(150, 30);
    }
 


}
