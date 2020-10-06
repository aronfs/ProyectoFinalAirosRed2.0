/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormularioCambioPlan;
import Vista.VentanaCambioPlan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class ControladorCRUDCambioPlan implements ActionListener{
    private final  FormularioCambioPlan formularioCambioPlan;
    private final VentanaCambioPlan ventanaCambioPlan;

    public ControladorCRUDCambioPlan(FormularioCambioPlan formularioCambioPlan, VentanaCambioPlan ventanaCambioPlan) {
        this.formularioCambioPlan = formularioCambioPlan;
        this.ventanaCambioPlan = ventanaCambioPlan;
    }

    ControladorCRUDCambioPlan(VentanaCambioPlan ventanaCambioPlan, FormularioCambioPlan formulario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void IniciaControl(){
        ventanaCambioPlan.getVentanaCambioPlanBnt_Nuevo().addActionListener(i->MostrarFormulario());
    }
   
    public void MostrarFormulario(){
        formularioCambioPlan.setVisible(true);
        formularioCambioPlan.setLocationRelativeTo(null);
    }
    
    
    public void Iniciar(){
        ventanaCambioPlan.setVisible(true);
        ventanaCambioPlan.setLocation(150, 30);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
