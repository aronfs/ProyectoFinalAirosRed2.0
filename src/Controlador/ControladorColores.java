/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Login;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class ControladorColores extends Thread implements ActionListener {

    private final Login login;

    public ControladorColores(Login login) {
        this.login = login;
    }

    public void iniciaControlColores() {
        login.getBtnModoNocturno().addActionListener(this);
    }

    /*
    public void IntecambioColores() {
        //Login
        login.getPanel1Login().setBackground(Color.BLACK);
        login.getPanel2Login().setBackground(Color.darkGray);
        login.getBtnIngresar().setBackground(Color.BLACK);
        login.getBtnIngresar().setForeground(Color.WHITE);
        login.getBtnRegistrarse().setBackground(Color.BLACK);
        login.getBtnRegistrarse().setForeground(Color.WHITE);
        login.getTxtCedulaLogin().setBackground(Color.BLACK);
        login.getTxtCedulaLogin().setForeground(Color.WHITE);
        login.getTxtContrasenaLogin().setBackground(Color.BLACK);
        login.getTxtContrasenaLogin().setForeground(Color.WHITE);
        login.getLblUsuario().setForeground(Color.WHITE);
        login.getLblContrasena().setForeground(Color.WHITE);
        //MenuInicio
        MenuInicio menu = new MenuInicio();
        menu.getPanel1MenuInicio().setBackground(Color.BLACK);
    }
     */

    @Override
    public void run() {
        login.getPanel1Login().setBackground(Color.BLACK);
        login.getPanel2Login().setBackground(Color.darkGray);
        login.getBtnIngresar().setBackground(Color.BLACK);
        login.getBtnIngresar().setForeground(Color.WHITE);
        login.getBtnRegistrarse().setBackground(Color.BLACK);
        login.getBtnRegistrarse().setForeground(Color.WHITE);
        login.getTxtCedulaLogin().setBackground(Color.BLACK);
        login.getTxtCedulaLogin().setForeground(Color.WHITE);
        login.getTxtContrasenaLogin().setBackground(Color.BLACK);
        login.getTxtContrasenaLogin().setForeground(Color.WHITE);
        login.getLblUsuario().setForeground(Color.WHITE);
        login.getLblContrasena().setForeground(Color.WHITE);
        //MenuInicio
        //MenuInicio menu = new MenuInicio();
    //    menu.getPanel1MenuInicio().setBackground(Color.BLACK);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
