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
public class IngresarJugadores extends javax.swing.JFrame{
    private javax.swing.JButton siguiente;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private int numerojugadores;
    private int numeroj;
    
    public IngresarJugadores(int numerojugadores) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.numerojugadores=numerojugadores;
        this.numeroj=0;
        
    }
    
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        siguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(606, 604));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medico", "ingeniero", "abogado", "artista", "matematico" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medico", "ingeniero", "abogado", "artista", "matematico" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));
        jTextField1.setText("Jorge");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 210, 120, -1));

        jTextField2.setText("Lcochon");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 250, 120, -1));
        if (numerojugadores==3){
             jComboBox3 = new javax.swing.JComboBox<>();
             jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medico", "ingeniero", "abogado", "artista", "matematico" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));
        jTextField3 = new javax.swing.JTextField();
        jTextField3.setText("sebastian");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 290, 120, -1));
        }
        if (numerojugadores==4){
            jComboBox4 = new javax.swing.JComboBox<>();
            jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medico", "ingeniero", "abogado", "artista", "matematico" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));
        jTextField4 = new javax.swing.JTextField();
        jTextField4.setText("karl");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 330, 120, -1));
        }
        siguiente.setText("SIGUIENTE");
        getContentPane().add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagen un.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        pack();
    }
    protected void addActionListeners(ActionListener e){
        jComboBox1.addActionListener(e);
    }
}
