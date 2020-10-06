/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.OrdenesTrabajo;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaOrdenesTrabajo {
    
    private final OrdenesTrabajo ordenesTrabajo;

    public ControladorCRUDVentanaOrdenesTrabajo(OrdenesTrabajo ordenesTrabajo) {
        this.ordenesTrabajo = ordenesTrabajo;
    }
    
    public void Iniciar (){
        ordenesTrabajo.setVisible(true);
        ordenesTrabajo.setLocation(150, 30);
    }
            
}
