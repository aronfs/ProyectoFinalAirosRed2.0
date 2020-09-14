/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormularioFactura;
import Vista.MenuInicio;
import Vista.OrdenesTrabajo;
import Vista.VentanaCambioDireccion;
import Vista.VentanaCambioPlan;
import Vista.VentanaCancelacionDeServicio;
import Vista.VentanaCasosSoporte;
import Vista.VentanaCompras;
import Vista.VentanaContratos;
import Vista.VentanaContribuentes;
import Vista.VentanaFacturas;
import Vista.VentanaItems;
import Vista.VentanaMotivosSoporte;
import Vista.VentanaNombresTecnicos;
import Vista.VentanaOperarioSoporte;
import Vista.VentanaPlanesInternet;
import Vista.VentanaReactivacion;

import Vista.VentanaReportes;
import Vista.VentanaSeries;
import Vista.VentanaServicio;
import Vista.VentanaSuspension;
import Vista.VentanaTarifasInstalacion;
import Vista.VentanaTipoCliente;
import Vista.VentanaVelocidades;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author aaron
 */
public class ControladorVista implements MouseListener {

    private final MenuInicio Vista;
    


    public ControladorVista(MenuInicio Vista) {
        this.Vista = Vista;
        
        Vista.setLocationRelativeTo(null);
        Vista.setVisible(true);
        Vista.getLblFactura().setVisible(false);
        //Vista.getLblComprasPanel().setVisible(false);
        Vista.getLblContribuyentes().setVisible(false);
        Vista.getLblItems().setVisible(false);
        Vista.getLblReportesStock().setVisible(false);
        Vista.getLblNombresTecnicos().setVisible(false);
        Vista.getLblTarifaInstalacion().setVisible(false);
        Vista.getLbltipoCliente().setVisible(false);
        Vista.getLblVelocidades().setVisible(false);
        Vista.getLblPlanesInternet().setVisible(false);
        Vista.getLblSolicitudes().setVisible(false);
        Vista.getLblContratos().setVisible(false);
        Vista.getLblOrdenesTrabajo().setVisible(false);
        Vista.getLblServicio().setVisible(false);
        Vista.getLblCambioPlan().setVisible(false);
        Vista.getLblSuspension().setVisible(false);
        Vista.getLblCancelacionServicio().setVisible(false);
        Vista.getLblCambioDireccion().setVisible(false);
        Vista.getLblReactivacion().setVisible(false);
        Vista.getLblCasosSoporte().setVisible(false);
        Vista.getLblMotivoSoporte().setVisible(false);
        Vista.getLblOperariosSoporte().setVisible(false);
        Vista.getLblSeries().setVisible(false);
        Vista.getLblComprasPanel().setVisible(false);
        //Ahora vienen los botones 
    }

    
    
    public void IniciaControlVista() {
        Vista.getLblVentas().addMouseListener(this);
        Vista.getLblFactura().addMouseListener(this);
        Vista.getLblVentas().addMouseListener(this);
        Vista.getLblContribuyentes().addMouseListener(this);
        Vista.getLblSeries().addMouseListener(this);
        Vista.getLblReportesStock().addMouseListener(this);
        Vista.getLblNombresTecnicos().addMouseListener(this);
        Vista.getLblTarifaInstalacion().addMouseListener(this);
        Vista.getLbltipoCliente().addMouseListener(this);
        Vista.getLblVelocidades().addMouseListener(this);
        Vista.getLblPlanesInternet().addMouseListener(this);
        Vista.getLblSolicitudes().addMouseListener(this);
        Vista.getLblContratos().addMouseListener(this);
        Vista.getLblOrdenesTrabajo().addMouseListener(this);
        Vista.getLblServicio().addMouseListener(this);
        Vista.getLblCambioPlan().addMouseListener(this);
        Vista.getLblSuspension().addMouseListener(this);
        Vista.getLblCancelacionServicio().addMouseListener(this);
        Vista.getLblCambioDireccion().addMouseListener(this);
        Vista.getLblReactivacion().addMouseListener(this);
        Vista.getLblComprasPanel().addMouseListener(this);
        Vista.getLblCompras().addMouseListener(this);
        Vista.getLblDirectorio().addMouseListener(this);
        Vista.getLblInventario().addMouseListener(this);
        Vista.getLblProvServiciosInternet().addMouseListener(this);
        Vista.getLblRegistroLlamadas().addMouseListener(this);
        Vista.getBtnItems().addMouseListener(this);
        Vista.getBtnSalir().addMouseListener(this);
        Vista.getLblCancelacionServicio().addMouseListener(this);
        Vista.getLblMotivoSoporte().addMouseListener(this);
        Vista.getLblOperariosSoporte().addMouseListener(this);

    }

    public void IniciaControlBotones() {
        //Ahora vienen los botones

        Vista.getBtnFacturas().addMouseListener(this);
        Vista.getBtnCompras().addMouseListener(this);
        Vista.getBtnContribuyentes().addMouseListener(this);
        Vista.getBtnItems().addMouseListener(this);
        Vista.getBtnSeries().addMouseListener(this);
        Vista.getBtnReportes().addMouseListener(this);
        Vista.getBtnNombresTecnicos().addMouseListener(this);
        Vista.getBtnTarifasInstalacion().addMouseListener(this);
        Vista.getBtnTipoCliente().addMouseListener(this);
        Vista.getBtnVelocidadesPlan().addMouseListener(this);
        Vista.getBtnPlaneInternet().addMouseListener(this);
        Vista.getBtnServicio().addMouseListener(this);
        Vista.getBtnCambioPlan().addMouseListener(this);
        Vista.getBtnSuspension().addMouseListener(this);
        Vista.getBtnCancelacionServicio().addMouseListener(this);
        Vista.getBtnCambioDireccion().addMouseListener(this);
        Vista.getBtnReactivacion().addMouseListener(this);
        Vista.getBtnCasosSoporte().addMouseListener(this);
        Vista.getBtnMotivosSoporte().addMouseListener(this);
        Vista.getBtnOperarioSoporte().addMouseListener(this);
        Vista.getBtnContratos().addMouseListener(this);
        Vista.getBtnOrdenesTrabajo().addMouseListener(this);

    }
    
    
   
    @Override

    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == Vista.getBtnFacturas()) {
            VentanaFacturas f = new VentanaFacturas();
            f.setVisible(true);
            f.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnCompras()) {
            VentanaCompras compras = new VentanaCompras();
            compras.setVisible(true);
            compras.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnContribuyentes()) {
            VentanaContribuentes c = new VentanaContribuentes();
            c.setVisible(true);
            c.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnItems()) {
            VentanaItems i = new VentanaItems();
            i.setVisible(true);
            i.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnSeries()) {
            VentanaSeries s = new VentanaSeries();
            s.setVisible(true);
            s.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnReportes()) {
            VentanaReportes r = new VentanaReportes();
            r.setVisible(true);
            r.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnNombresTecnicos()) {
           VentanaNombresTecnicos n = new VentanaNombresTecnicos();
           n.setVisible(true);
           n.setLocation(200, 170);
        }
        
        if (me.getSource() == Vista.getBtnTarifasInstalacion()) {
             VentanaTarifasInstalacion t = new VentanaTarifasInstalacion();
            t.setVisible(true);
            t.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnTipoCliente()) {
            VentanaTipoCliente c = new VentanaTipoCliente();
            c.setVisible(true);
            c.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnVelocidadesPlan()) {
            VentanaVelocidades v = new VentanaVelocidades();
            v.setVisible(true);
            v.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnPlaneInternet()) {
            VentanaPlanesInternet p = new VentanaPlanesInternet();
            p.setVisible(true);
            p.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnServicio()) {
            VentanaServicio s = new VentanaServicio();
            s.setVisible(true);
            s.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnCambioPlan()) {
            VentanaCambioPlan c = new VentanaCambioPlan();
            c.setVisible(true);
            c.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnSuspension()) {
            VentanaSuspension a = new VentanaSuspension();
            a.setVisible(true);
            a.setLocation(200, 170);

        }

        if (me.getSource() == Vista.getBtnCancelacionServicio()) {
            VentanaCancelacionDeServicio c = new VentanaCancelacionDeServicio();
            c.setVisible(true);
            c.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnCambioDireccion()) {
            VentanaCambioDireccion c = new VentanaCambioDireccion();
            c.setVisible(true);
            c.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnReactivacion()) {
            VentanaReactivacion r = new VentanaReactivacion();
            r.setVisible(true);
            r.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnContratos()) {
            VentanaContratos c = new VentanaContratos();
            c.setVisible(true);
            c.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnOrdenesTrabajo()) {
            OrdenesTrabajo o = new OrdenesTrabajo();
            o.setVisible(true);
            o.setLocation(200, 170);

        }

        if (me.getSource() == Vista.getBtnMotivosSoporte()) {
            VentanaMotivosSoporte m = new VentanaMotivosSoporte();
            m.setVisible(true);
            m.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnCasosSoporte()) {
            VentanaCasosSoporte c = new VentanaCasosSoporte();
            c.setVisible(true);
            c.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getBtnOperarioSoporte()) {
            VentanaOperarioSoporte o = new VentanaOperarioSoporte();
            o.setVisible(true);
            o.setLocation(200, 170);
        }

        if (me.getSource() == Vista.getLblVentas()) {
            Vista.getLblFactura().setVisible(true);
        }
        if (me.getSource() == Vista.getLblCompras()) {
            Vista.getLblComprasPanel().setVisible(true);
        }

        if (me.getSource() == Vista.getLblDirectorio()) {
            Vista.getLblContribuyentes().setVisible(true);
        }
        if (me.getSource() == Vista.getLblInventario()) {
            Vista.getLblItems().setVisible(true);
            Vista.getLblSeries().setVisible(true);
            Vista.getLblReportesStock().setVisible(true);
        }

        if (me.getSource() == Vista.getLblProvServiciosInternet()) {
            Vista.getLblNombresTecnicos().setVisible(true);
            Vista.getLblNombresTecnicos().setVisible(true);
            Vista.getLblTarifaInstalacion().setVisible(true);
            Vista.getLbltipoCliente().setVisible(true);
            Vista.getLblVelocidades().setVisible(true);
            Vista.getLblPlanesInternet().setVisible(true);
            Vista.getLblSolicitudes().setVisible(true);
            Vista.getLblContratos().setVisible(true);
            Vista.getLblOrdenesTrabajo().setVisible(true);
        }

        if (me.getSource() == Vista.getLblSolicitudes()) {
            Vista.getLblServicio().setVisible(true);
            Vista.getLblCambioPlan().setVisible(true);
            Vista.getLblSuspension().setVisible(true);
            Vista.getLblCancelacionServicio().setVisible(true);
            Vista.getLblCambioDireccion().setVisible(true);
            Vista.getLblReactivacion().setVisible(true);
        }

        if (me.getSource() == Vista.getLblRegistroLlamadas()) {
            Vista.getLblCasosSoporte().setVisible(true);
            Vista.getLblMotivoSoporte().setVisible(true);
            Vista.getLblOperariosSoporte().setVisible(true);
        }

        if (me.getSource() == Vista.getBtnSalir()) {
            System.exit(0);
        }

    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {
        if (me.getSource() == Vista.getLblCasosSoporte()
                && me.getSource() == Vista.getLblMotivoSoporte()
                || me.getSource() == Vista.getLblOperariosSoporte()) {
            Vista.getLblCasosSoporte().setVisible(false);
            Vista.getLblMotivoSoporte().setVisible(false);
            Vista.getLblOperariosSoporte().setVisible(false);
        }

        if (me.getSource() == Vista.getLblFactura()) {
            Vista.getLblFactura().setVisible(false);
        }
        if (me.getSource() == Vista.getLblComprasPanel()) {
            Vista.getLblComprasPanel().setVisible(false);
        }
        if (me.getSource() == Vista.getLblContribuyentes()) {
            Vista.getLblContribuyentes().setVisible(false);
        }

        if (me.getSource() == Vista.getLblItems()
                && me.getSource() == Vista.getLblSeries()
                || me.getSource() == Vista.getLblReportesStock()) {
            Vista.getLblItems().setVisible(false);
            Vista.getLblSeries().setVisible(false);
            Vista.getLblReportesStock().setVisible(false);
        }

        if (me.getSource() == Vista.getLblNombresTecnicos()
                && me.getSource() == Vista.getLblTarifaInstalacion()
                || me.getSource() == Vista.getLblVelocidades()
                && me.getSource() == Vista.getLblPlanesInternet()
                || me.getSource() == Vista.getLblSolicitudes()
                && me.getSource() == Vista.getLblContratos()
                || me.getSource() == Vista.getLblOrdenesTrabajo()) {

            Vista.getLblNombresTecnicos().setVisible(false);
            Vista.getLblTarifaInstalacion().setVisible(false);
            Vista.getLbltipoCliente().setVisible(false);
            Vista.getLblVelocidades().setVisible(false);
            Vista.getLblPlanesInternet().setVisible(false);
            Vista.getLblSolicitudes().setVisible(false);
            Vista.getLblContratos().setVisible(false);
            Vista.getLblOrdenesTrabajo().setVisible(false);
            Vista.getLblServicio().setVisible(false);
            Vista.getLblCambioPlan().setVisible(false);
            Vista.getLblSuspension().setVisible(false);
            Vista.getLblCancelacionServicio().setVisible(false);
            Vista.getLblCambioDireccion().setVisible(false);
            Vista.getLblReactivacion().setVisible(false);
        }

        if (me.getSource() == Vista.getLblServicio() && me.getSource() == Vista.getLblCambioPlan()
                || me.getSource() == Vista.getLblSuspension() && me.getSource() == Vista.getLblCancelacionServicio()
                || me.getSource() == Vista.getLblCambioDireccion() && me.getSource() == Vista.getLblReactivacion()) {

            Vista.getLblServicio().setVisible(false);
            Vista.getLblCambioPlan().setVisible(false);
            Vista.getLblSuspension().setVisible(false);
            Vista.getLblCancelacionServicio().setVisible(false);
            Vista.getLblCambioDireccion().setVisible(false);
            Vista.getLblReactivacion().setVisible(false);

        }

    }

    

}
