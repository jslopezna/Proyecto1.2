/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author admin
 */
public class ControlInterfaz implements ActionListener {
    
    private Datos datos;
    private PantallaInicio pantallainicio;
    private NumeroJugadores numerojugadores;

    public ControlInterfaz(Datos datos, PantallaInicio pantallainicio) {
        this.datos = datos;
        this.pantallainicio = pantallainicio;
        pantallainicio.riskActionListeners(this);
    }
    public void actionPerformed(ActionEvent evt) {
	
		String actionEvent = evt.getActionCommand();
		
		if (actionEvent.equals("jugar")) {
		
			numerojugadores =new NumeroJugadores();
			numerojugadores.addActionListeners(this);
			numerojugadores.setVisible(true);
			
		} else if (actionEvent.equals("ayuda")) {
                    
                } else if (actionEvent.equals("salir")) {
				System.exit(0);
	}
}
/*class Contadorjugadores implements ActionListener{

    public Contadorjugadores(Datos datos, NumeroJugadores pantalla) {
        this.datos = datos;
        this.pantalla = pantalla;
    }
    private Datos datos;
    private NumeroJugadores pantalla;

public void actionPerformed(ActionEvent evt) {
	
		String actionEvent = evt.getActionCommand();
		
		if (actionEvent.equals("2")) {
		
			datos.setContarjugadores(2);						
			 = new PlayerSettingsDialog(view, true, model.getPlayerCount());
			playerSettingsDialog.addActionListeners(new PlayerSettingsController(model, playerSettingsDialog));
			playerSettingsDialog.setVisible(true);
		}
		
		else if (actionEvent.equals("fourPlayersBtn")) {
		
			model.setPlayerCount(4);
			
			System.out.println("Loading PlayerSettingsDialog...");
			
			playerSettingsDialog = new PlayerSettingsDialog(view, true, model.getPlayerCount());
			playerSettingsDialog.addActionListeners(new PlayerSettingsController(model, playerSettingsDialog));
			playerSettingsDialog.setVisible(true);
		}
		
		else if (actionEvent.equals("fivePlayersBtn"))
		{
			model.setPlayerCount(5);
			
			System.out.println("Loading PlayerSettingsDialog...");
			
			playerSettingsDialog = new PlayerSettingsDialog(view, true, model.getPlayerCount());
			playerSettingsDialog.addActionListeners(new PlayerSettingsController(model, playerSettingsDialog));
			playerSettingsDialog.setVisible(true);
		}*/
}

