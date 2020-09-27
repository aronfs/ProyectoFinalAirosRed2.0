/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormularioContribuyentes;
import Vista.FormularioFactura;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author aaron
 */
public class ControladorValidaciones implements KeyListener{

    private final FormularioContribuyentes formularioContribuyentes;
    private final FormularioFactura formulariofactura;

    public ControladorValidaciones(FormularioContribuyentes formularioContribuyentes, FormularioFactura formulariofactura) {
        this.formularioContribuyentes = formularioContribuyentes;
        this.formulariofactura = formulariofactura;
        formularioContribuyentes.setVisible(true);
        formulariofactura.setVisible(true);
    }
    
   public void IniciaValidaciones (){
       //Validaciones formulario contribuyente
       formularioContribuyentes.getTxtRuc().addKeyListener(this);
       formularioContribuyentes.getFormulariocontribuyente_txtrazonsocial().addKeyListener(this);
       formularioContribuyentes.getFormulariocontribuyente_txtcedula().addKeyListener(this);
       formularioContribuyentes.getFormulariocontribuyente_txtcuidad().addKeyListener(this);
       formularioContribuyentes.getFormulariocontribuyente_txtnombrecomercial().addKeyListener(this);
       formularioContribuyentes.getFormulariocontribuyente_txtdireccion().addKeyListener(this);
       
       //validaciones formulario factura
       formulariofactura.getFormulariofacturatxt_cliente().addKeyListener(this);
       formulariofactura.getFormulariofacturatxt_observaciones().addKeyListener(this);
       
      
   } 
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        // Validaciones del Formulario Contribuyetes
       if(ke.getSource() == formularioContribuyentes.getTxtRuc()){
          // Ruc
           char num = ke.getKeyChar();
           if(!Character.isDigit(num) || formularioContribuyentes.getTxtRuc().getText().length() == 13 ){
               ke.consume();
              
           }   
       }
       
       if(ke.getSource() == formularioContribuyentes.getFormulariocontribuyente_txtrazonsocial()){
          // Razon Social
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) || formularioContribuyentes.getFormulariocontribuyente_txtrazonsocial().getText().length() == 50 && formularioContribuyentes.getFormulariocontribuyente_txtrazonsocial().getText().matches("[\\D]")){
               ke.consume();
           }   
       }
       
       if(ke.getSource() == formularioContribuyentes.getFormulariocontribuyente_txtcedula()){
          // Cedula
           char cedula = ke.getKeyChar();
           if(!Character.isDigit(cedula) || formularioContribuyentes.getFormulariocontribuyente_txtcedula().getText().length() == 10 ){
               ke.consume();
           }   
       }
       
       if(ke.getSource() == formularioContribuyentes.getFormulariocontribuyente_txtcuidad()){
          // Ciudad
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) || formularioContribuyentes.getFormulariocontribuyente_txtcuidad().getText().length() == 50 && formularioContribuyentes.getFormulariocontribuyente_txtcuidad().getText().matches("[\\D]")){
               ke.consume();
           }   
       }
       if(ke.getSource() == formularioContribuyentes.getFormulariocontribuyente_txtnombrecomercial()){
          // Nombre Comercial
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) || formularioContribuyentes.getFormulariocontribuyente_txtnombrecomercial().getText().length() == 50 && formularioContribuyentes.getFormulariocontribuyente_txtnombrecomercial().getText().matches("[\\D\\s]")){
               ke.consume();
           }   
       }
       if(ke.getSource() == formularioContribuyentes.getFormulariocontribuyente_txtdireccion()){
          // direccion
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) || formularioContribuyentes.getFormulariocontribuyente_txtdireccion().getText().length() == 30 && formularioContribuyentes.getFormulariocontribuyente_txtdireccion().getText().matches("[\\d]")){
               ke.consume();
           }   
       }
     
       //Validaciones del Formulario
       if(ke.getSource() == formulariofactura.getFormulariofacturatxt_cliente()){
          // direccion
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) || formulariofactura.getFormulariofacturatxt_cliente().getText().length() == 30 && formulariofactura.getFormulariofacturatxt_cliente().getText().matches("[\\D]")){
               ke.consume();
           }   
       }
       
       if(ke.getSource() == formulariofactura.getFormulariofacturatxt_observaciones()){
          // direccion
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) || formulariofactura.getFormulariofacturatxt_observaciones().getText().length() == 30 && formulariofactura.getFormulariofacturatxt_observaciones().getText().matches("[\\D]")){
               ke.consume();
           }   
       }
    
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    
    }

    
    
    @Override
    public void keyReleased(KeyEvent ke) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
      
      
    
    }
    
}
