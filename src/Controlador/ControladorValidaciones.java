/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.FormularioContribuyentes;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author aaron
 */
public class ControladorValidaciones implements KeyListener{

    private final FormularioContribuyentes formularioContribuyentes;

    public ControladorValidaciones(FormularioContribuyentes formularioContribuyentes) {
        this.formularioContribuyentes = formularioContribuyentes;
        formularioContribuyentes.setVisible(true);
    }
    
   public void IniciaValidaciones (){
       formularioContribuyentes.getTxtRuc().addKeyListener(this);
   } 
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       if(ke.getSource() == formularioContribuyentes.getTxtRuc()){
          // Ojo NUmeros COntrolar por favor!!!!!!!!!
           char letra = ke.getKeyChar();
           if(!Character.isAlphabetic(letra) ||formularioContribuyentes.getTxtRuc().getText().length() == 13 ){
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
