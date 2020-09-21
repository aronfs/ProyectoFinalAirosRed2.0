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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import Vista.FormularioFactura;

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
        
        
        //validaciones
        Validad_VentanaCambioDireccion_Txt();
        Validad_VentanaCasosSoporte_txt();
        validar_VentanaCompras_txt();
        validar_Ventana_Contratos_txt();
        validar_Ventana_Servicio_txt();
        Validad_Ventana_Serie_txt();
        Validar_Formulario_Factura_txt();
        Validar_Ventana_Reactivacion_txt();
        Validar_Ventana_Cancelacion_Servicio_txt();
        Validar_Ventana_Cambio_Plan_Txt();
        Validar_Ordenes_Trabajo_Txt();

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

    
    //Validaciones
    public void Validar_Formulario_Factura_txt(){
        
        //Formulario Factura
        FormularioFactura FF = new FormularioFactura();
        
        FF.getFormulariofacturatxt_cliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || FF.getFormulariofacturatxt_cliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
       
        
        FF.getFormulariofacturatxt_observaciones().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || FF.getFormulariofacturatxt_observaciones().getText().length()==1000) {
                    evt.consume();
                }
            }
        });
   
  
    }
    
    public void Validar_Ordenes_Trabajo_Txt(){
        
        OrdenesTrabajo OT = new OrdenesTrabajo();
        
        OT.getOrdenesTrabajotxt_cliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || OT.getOrdenesTrabajotxt_cliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
        OT.getOrdenesTrabajotxt_asignadoA().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || OT.getOrdenesTrabajotxt_asignadoA().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
        OT.getOrdenesTrabajotxt_Ejecutadopor().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || OT.getOrdenesTrabajotxt_Ejecutadopor().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
    }
    
    public void Validad_VentanaCambioDireccion_Txt(){
        VentanaCambioDireccion VCD = new VentanaCambioDireccion();
        
        VCD.getVentanaCambioDirecciontxt_Cliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VCD.getVentanaCambioDirecciontxt_Cliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
    }
    
    public void Validar_Ventana_Cambio_Plan_Txt(){
        
        VentanaCambioPlan VCP = new VentanaCambioPlan();
        
        VCP.getVentanaCambioPlantxt_cliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VCP.getVentanaCambioPlantxt_cliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
    }
    
    public void Validar_Ventana_Cancelacion_Servicio_txt(){
        
        VentanaCancelacionDeServicio VCDS = new VentanaCancelacionDeServicio();
        
       VCDS.getVentanaCancelacionServicio_txtCliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VCDS.getVentanaCancelacionServicio_txtCliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
            
    }
    
    public void Validad_VentanaCasosSoporte_txt(){
        
        VentanaCasosSoporte VCSO = new VentanaCasosSoporte();
        
         VCSO.getVentanaCasosSoporte_txtcliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VCSO.getVentanaCasosSoporte_txtcliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
         
        VCSO.getVentanaCasosSoporte_txtMotivo().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VCSO.getVentanaCasosSoporte_txtMotivo().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
         VCSO.getVentanaCasosSoporte_txtAsigadoA().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VCSO.getVentanaCasosSoporte_txtAsigadoA().getText().length()==70) {
                    evt.consume();
                }
            }
        });
         
          VCSO.getVentanaCasosSoporte_txtEjecutadoPor().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VCSO.getVentanaCasosSoporte_txtEjecutadoPor().getText().length()==70) {
                    evt.consume();
                }
            }
        });
          
    }
    
    public void validar_VentanaCompras_txt(){
        
        VentanaCompras VC = new VentanaCompras();
        
          VC.getVentanaCompras_txtCreadoPor().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VC.getVentanaCompras_txtCreadoPor().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
    }
    
    public void validar_Ventana_Contratos_txt(){
        
        VentanaContratos VCTRA = new VentanaContratos();
        
         VCTRA.getVentanaContratos_txtCliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VCTRA.getVentanaContratos_txtCliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
    }
    
    public void Validar_Ventana_Reactivacion_txt(){
        
        VentanaReactivacion VR = new VentanaReactivacion();
        
         VR.getVentanaReactivacion_txtCliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VR.getVentanaReactivacion_txtCliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
    }
    
    public void Validad_Ventana_Serie_txt(){
        
        VentanaSeries VSRIE = new VentanaSeries();
        
         VSRIE.getVentanaSeries_txtItem().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VSRIE.getVentanaSeries_txtItem().getText().length()==70) {
                    evt.consume();
                }
            }
        });
    }
    
    public void validar_Ventana_Servicio_txt(){
        
        VentanaServicio VSER = new VentanaServicio();
        
         VSER.getVentanaServicio_txtCliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VSER.getVentanaServicio_txtCliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
    }
    
    public void Validad_ventana_suspencion_txt(){
        
        VentanaSuspension VSUS = new VentanaSuspension();
        
         VSUS.getVentanaSuspencion_txtCliente().addKeyListener(new KeyAdapter() {
             @Override
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isAlphabetic(c) || VSUS.getVentanaSuspencion_txtCliente().getText().length()==70) {
                    evt.consume();
                }
            }
        });
        
    }
   
}
