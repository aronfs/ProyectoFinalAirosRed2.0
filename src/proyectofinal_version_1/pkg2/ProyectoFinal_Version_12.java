/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_version_1.pkg2;

import Controlador.ControladorVista;
import Controlador.ControladorVistaVentanas;

import Vista.*;

/**
 *
 * @author aaron
 */
public class ProyectoFinal_Version_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuInicio Vista = new MenuInicio();
        VentanaFacturas ventanaFac = new VentanaFacturas();
        ControladorVistaVentanas ventanas = new ControladorVistaVentanas(ventanaFac);
        ControladorVista vista = new ControladorVista(Vista);
        vista.IniciaControlVista();
        vista.IniciaControlBotones();
        ventanas.IniciaControlVentana();
        

    }

}