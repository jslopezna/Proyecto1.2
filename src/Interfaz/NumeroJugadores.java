/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.event.ActionListener;

/**
 *
 * @author admin
 */
public class NumeroJugadores extends javax.swing.JFrame{
    private javax.swing.JButton jugadores2;
    private javax.swing.JButton jugadores3;
    private javax.swing.JButton jugadores4;
    private javax.swing.JLabel jLabel1;
  
    


    

    public NumeroJugadores() {
        initComponents();
        this.setLocationRelativeTo(null);
    
    }
        private void initComponents() {

        jugadores2 = new javax.swing.JButton();
        jugadores3 = new javax.swing.JButton();
        jugadores4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugadores2.setText("2 JUGADORES");
        getContentPane().add(jugadores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 120, -1));
        jugadores3.setText("3 JUGADORES");
        getContentPane().add(jugadores3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 120, -1));
        jugadores4.setText("4 JUGADORES");
        getContentPane().add(jugadores4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 120, -1));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagen un.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jugadores2.setActionCommand("2");
        jugadores3.setActionCommand("3");
        jugadores4.setActionCommand("4");
        pack();
                       
        }
        protected void risknumActionListeners(ActionListener evt)
	{
		jugadores2.addActionListener(evt);
		jugadores3.addActionListener(evt);
		jugadores4.addActionListener(evt);
	}
     
}

