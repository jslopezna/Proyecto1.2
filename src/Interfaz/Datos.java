/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author admin
 */
public class Datos {
    private int contarjugadores;

    public int getContarjugadores() {
        return contarjugadores;
    }

    public void setContarjugadores(int contarjugadores) {
        this.contarjugadores = contarjugadores;
    }

    public Datos(){
        
    }
    protected void salirjuego(){
        System.exit(0);
    }
    
}
