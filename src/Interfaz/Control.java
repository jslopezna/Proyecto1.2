/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author admin
 */
public class Control implements ActionListener{
    private Datos datos;
    private PantallaInicio pantalla;

    public Control(Datos datos, PantallaInicio pantalla) {
        this.datos = datos;
        this.pantalla = pantalla;
        pantalla.riskActionListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String evento = evt.getActionCommand();
        if (evento.equals("jugar")){
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumeroJugadores().setVisible(true);
            }
        });
            }else if (evento.equals("ayuda")){
                
                new Instrucciones().setVisible(true);
            }else if (evento.equals("salir")){
                System.exit(0);
        
        }
    }
    
    
}
