/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VentanaCompras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaCompras implements ActionListener{
    
    
    private final VentanaCompras ventanaCompras;

    public ControladorCRUDVentanaCompras(VentanaCompras ventanaCompras) {
        this.ventanaCompras = ventanaCompras;
    }
    
    public void iniciar(){
        ventanaCompras.setVisible(true);
        ventanaCompras.setLocation(150, 30);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
