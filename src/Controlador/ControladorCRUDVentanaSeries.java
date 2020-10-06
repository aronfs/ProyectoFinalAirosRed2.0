/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.*;
/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaSeries {
        
    private final VentanaSeries ventanaSeries;

    public ControladorCRUDVentanaSeries(VentanaSeries ventanaSeries) {
        this.ventanaSeries = ventanaSeries;
    }
    
    public void Iniciar(){
        ventanaSeries.setVisible(true);
        ventanaSeries.setLocation(150, 40);
                
    }
    
    
}
