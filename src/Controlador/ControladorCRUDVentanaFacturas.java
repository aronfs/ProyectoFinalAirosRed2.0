/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormularioFactura;
import Vista.VentanaFacturas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class ControladorCRUDVentanaFacturas implements ActionListener {

    private final VentanaFacturas Ventanafactura;
    private final FormularioFactura formulariofactura;

    public ControladorCRUDVentanaFacturas(VentanaFacturas Ventanafactura, FormularioFactura formulariofactura) {
        this.Ventanafactura = Ventanafactura;
        this.formulariofactura = formulariofactura;

    }

    public void iniciar() {
        Ventanafactura.setVisible(true);
        Ventanafactura.setLocation(150, 30);
    }

    public void IniciaControlVentanaFactura() {
        Ventanafactura.getBtnNuevoVentanaFactura().addActionListener(i -> MostrarFormularioFactura());
    }

    public void MostrarFormularioFactura() {
        FormularioFactura formularioFactura = new FormularioFactura();
        formularioFactura.setVisible(true);
        formularioFactura.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
