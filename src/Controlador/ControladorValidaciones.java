/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormularioContribuyentes;
import Vista.FormularioFactura;
import Vista.FormularioPlanesInternet;
import Vista.FormularioReactivacion;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author aaron
 */
public class ControladorValidaciones implements KeyListener{

    private final FormularioContribuyentes formularioContribuyentes;
    private final FormularioFactura formulariofactura;
    private final FormularioPlanesInternet formularioplanesinternet;
    private final FormularioReactivacion formularioreactivacion;

    public ControladorValidaciones(FormularioContribuyentes formularioContribuyentes, FormularioFactura formulariofactura, FormularioPlanesInternet formularioplanesinternet, FormularioReactivacion formularioreactivacion) {
        this.formularioContribuyentes = formularioContribuyentes;
        this.formulariofactura = formulariofactura;
        this.formularioplanesinternet = formularioplanesinternet;
        this.formularioreactivacion=formularioreactivacion;
        formularioContribuyentes.setVisible(true);
        formulariofactura.setVisible(true);
        formularioplanesinternet.setVisible(true);
        formularioreactivacion.setVisible(true);
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
       
       //Validaciones formulario planes internet
       formularioplanesinternet.getFormularioPlanesIntenet_txt_IDPlna().addKeyListener(this);
       formularioplanesinternet.getFormularioPlanesIntenet_txt_NombrePlan().addKeyListener(this);
       formularioplanesinternet.getFormularioPlanesIntenet_txt_comparticionCanal().addKeyListener(this);
       formularioplanesinternet.getFormularioPlanesIntenet_txt_tipoCliente().addKeyListener(this);
       formularioplanesinternet.getFormularioPlanesIntenet_Txt_Nombre_Tecnico().addKeyListener(this);
       formularioplanesinternet.getFormularioPlanesIntenet_txt_Velocidad().addKeyListener(this);
       formularioplanesinternet.getFormularioPlanesIntenet_txt_Precio().addKeyListener(this);
       formularioplanesinternet.getFormularioplanesinternet_txtcodigoempleado().addKeyListener(this);
       formularioplanesinternet.getFormularioplanesinternet_txtRuc().addKeyListener(this);
       
       //Validaciones del formulario de reactivacion
       formularioreactivacion.getFormularioReactivacion_txtNumero().addKeyListener(this);
       formularioreactivacion.getFormularioReactivacion_txtCentroCostos().addKeyListener(this);
       formularioreactivacion.getFormularioReactivacion_txtCedula().addKeyListener(this);
       formularioreactivacion.getFormularioReactivacion_txtCliente().addKeyListener(this);
       formularioreactivacion.getFormularioReactivacion_txtContrato().addKeyListener(this);
       
       
       
       
      
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
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioContribuyentes.getFormulariocontribuyente_txtrazonsocial().getText().length() == 50 && formularioContribuyentes.getFormulariocontribuyente_txtrazonsocial().getText().matches("[\\D]")){
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
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioContribuyentes.getFormulariocontribuyente_txtnombrecomercial().getText().length() == 50 && formularioContribuyentes.getFormulariocontribuyente_txtnombrecomercial().getText().matches("[\\D\\s]")){
               ke.consume();
           }   
       }
       if(ke.getSource() == formularioContribuyentes.getFormulariocontribuyente_txtdireccion()){
          // direccion
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioContribuyentes.getFormulariocontribuyente_txtdireccion().getText().length() == 30 && formularioContribuyentes.getFormulariocontribuyente_txtdireccion().getText().matches("[\\d]")){
               ke.consume();
           }   
       }
     
       //Validaciones del Formulario
       if(ke.getSource() == formulariofactura.getFormulariofacturatxt_cliente()){
          // cliente
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formulariofactura.getFormulariofacturatxt_cliente().getText().length() == 30 && formulariofactura.getFormulariofacturatxt_cliente().getText().matches("[\\D]")){
               ke.consume();
           }   
       }
       
       if(ke.getSource() == formulariofactura.getFormulariofacturatxt_observaciones()){
          // observacion
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formulariofactura.getFormulariofacturatxt_observaciones().getText().length() == 30 && formulariofactura.getFormulariofacturatxt_observaciones().getText().matches("[\\D]")){
               ke.consume();
           }   
       }
       
       //validaciones formulario planes internet
       
       if(ke.getSource() == formularioplanesinternet.getFormularioPlanesIntenet_txt_IDPlna()){
          // observacion
           char ID = ke.getKeyChar();
           if(!Character.isDigit(ID) || formularioplanesinternet.getFormularioPlanesIntenet_txt_IDPlna().getText().length() == 5){
               ke.consume();
           }   
       }
       
       if(ke.getSource() == formularioplanesinternet.getFormularioPlanesIntenet_txt_NombrePlan()){
          // nombre plan
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioplanesinternet.getFormularioPlanesIntenet_txt_NombrePlan().getText().length() == 30 ){
               ke.consume();
           }   
       }
       
       
       if(ke.getSource() == formularioplanesinternet.getFormularioPlanesIntenet_txt_comparticionCanal()){
          // comparticion canal
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioplanesinternet.getFormularioPlanesIntenet_txt_comparticionCanal().getText().length() == 30 ){
               ke.consume();
           }   
       }
       if(ke.getSource() == formularioplanesinternet.getFormularioPlanesIntenet_txt_tipoCliente()){
          // tipo cliente
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioplanesinternet.getFormularioPlanesIntenet_txt_tipoCliente().getText().length() == 30 ){
               ke.consume();
           }   
       }
       
       if(ke.getSource() == formularioplanesinternet.getFormularioPlanesIntenet_Txt_Nombre_Tecnico()){
          // nombre tecnico
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioplanesinternet.getFormularioPlanesIntenet_Txt_Nombre_Tecnico().getText().length() == 30 ){
               ke.consume();
           }   
       }
       if(ke.getSource() == formularioplanesinternet.getFormularioPlanesIntenet_txt_Velocidad()){
          // velocidad
           char velo = ke.getKeyChar();
           if( Character.isAlphabetic(velo) || Character.isUnicodeIdentifierPart('.') || formularioplanesinternet.getFormularioPlanesIntenet_txt_Velocidad().getText().length() == 5 ){
               ke.consume();
           }   
       }
       if(ke.getSource() == formularioplanesinternet.getFormularioPlanesIntenet_txt_Precio()){
          // precio
           char letra = ke.getKeyChar();
           if( Character.isAlphabetic(letra) || Character.isUnicodeIdentifierPart('.') || formularioplanesinternet.getFormularioPlanesIntenet_txt_Precio().getText().length() == 6 ){
               ke.consume();
           }   
       }
       
       if(ke.getSource() == formularioplanesinternet.getFormularioplanesinternet_txtcodigoempleado()){
          // codigo empleado
           char CE = ke.getKeyChar();
           if(!Character.isDigit(CE) || formularioplanesinternet.getFormularioplanesinternet_txtcodigoempleado().getText().length() == 5 ){
               ke.consume();
           }   
       }
       if(ke.getSource() == formularioplanesinternet.getFormularioplanesinternet_txtRuc()){
          // ruc
           char CE = ke.getKeyChar();
           if(!Character.isDigit(CE) || formularioplanesinternet.getFormularioplanesinternet_txtRuc().getText().length() == 13 ){
               ke.consume();
           }   
       }
       
       //Validaciones del formulario de reactivacion
        if(ke.getSource() == formularioreactivacion.getFormularioReactivacion_txtNumero()){
          // numero
           char CE = ke.getKeyChar();
           if(!Character.isDigit(CE) || formularioreactivacion.getFormularioReactivacion_txtNumero().getText().length() == 5 ){
               ke.consume();
           }   
       }
        
       if(ke.getSource() == formularioreactivacion.getFormularioReactivacion_txtCentroCostos()){
          // centro de costos
           char letra = ke.getKeyChar();
           if( Character.isAlphabetic(letra) || Character.isUnicodeIdentifierPart('.') || formularioreactivacion.getFormularioReactivacion_txtCentroCostos().getText().length() == 6 ){
               ke.consume();
           }   
       }
       
       if(ke.getSource() == formularioreactivacion.getFormularioReactivacion_txtCedula()){
          // cedula
           char CE = ke.getKeyChar();
           if(!Character.isDigit(CE) || formularioreactivacion.getFormularioReactivacion_txtCedula().getText().length() == 10 ){
               ke.consume();
           }   
       }
       
      if(ke.getSource() == formularioreactivacion.getFormularioReactivacion_txtCliente()){
          // cliente
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioreactivacion.getFormularioReactivacion_txtCliente().getText().length() == 10 ){
               ke.consume();
           }   
       }
       if(ke.getSource() == formularioreactivacion.getFormularioReactivacion_txtContrato()){
          // contrato
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) && letra != KeyEvent.VK_SPACE || formularioreactivacion.getFormularioReactivacion_txtContrato().getText().length() == 50 ){
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
