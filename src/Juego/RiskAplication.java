
package Juego;

import Interfaz.Control;
import Interfaz.Datos;
import Interfaz.PantallaInicio;

/**
 *
 * @author admin
 */
public class RiskAplication  {
      public static void main(String[] args) {
      PantallaInicio pantalla= new PantallaInicio();
      Datos datos = new Datos();
      Control control= new Control(datos, pantalla);
      pantalla.setVisible(true);
      
  }
}
