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
    private NumeroJugadores numerojugadores;
    private IngresarJugadores ingresarjugadores;


    public Control(Datos datos, PantallaInicio pantalla) {
        this.datos = datos;
        this.pantalla = pantalla;
        pantalla.riskActionListeners(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        String evento = evt.getActionCommand();
        if (evento.equals("jugar")){
                numerojugadores=new NumeroJugadores();
                numerojugadores.setVisible(true);
                numerojugadores.risknumActionListeners(new Controlingresarjugadores(datos, numerojugadores));
        }else if (evento.equals("ayuda")){
                new Instrucciones().setVisible(true);
            }else if (evento.equals("salir")){
                System.exit(0);
        
        }
    }
    
    
}

class Controlingresarjugadores implements ActionListener{
    private Datos datos;
    private NumeroJugadores pantalla;
    private IngresarJugadores ingresarjugadores;

    public Controlingresarjugadores(Datos datos, NumeroJugadores pantalla) {
        this.datos = datos;
        this.pantalla = pantalla;
    }
    public void actionPerformed (ActionEvent evt){
        String actionEvent= evt.getActionCommand();
        if (actionEvent.equals("2")){
            datos.setContarjugadores(2);
        ingresarjugadores = new IngresarJugadores(datos.getContarjugadores());
        new IngresarJugadores(datos.getContarjugadores()).setVisible(true);
        }else if (actionEvent.equals("3")){
            datos.setContarjugadores(3);

                ingresarjugadores = new IngresarJugadores(datos.getContarjugadores());
                ingresarjugadores.setVisible(true);
          
        }else if(actionEvent.equals("4")){
                ingresarjugadores = new IngresarJugadores(datos.getContarjugadores());
                ingresarjugadores.setVisible(true);
        }
            
    
}
}


