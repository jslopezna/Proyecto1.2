package Interfaz;

public class Instrucciones extends javax.swing.JFrame {

    public Instrucciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("   Buen día Director,\n\nSoy el Secretario de dirección de la \nFacultad, y estoy aquí para guiaros en los \nprimeros pasos de la dirección académica.\n\nCada turno llegan cinco refuerzos, que \npueden aumentar por los bonos específicos \nde las facultades controladas. Estos deben \nser colocados en su totalidad en los \nedificios aliados.\n\nLuego comienza la fase de Transferencia y \nAtaque, en que se podrán mover las tropas \na territorios conectados directamente, que, \nen caso de estar controlados por el enemigo, \nentrarán en batalla.\n\nRecuerde Director no desproteger sus \nedificios, y que SIEMPRE, al menos un hombre \ndebe permanecer presente en cada edificio.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 370, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/imagen un.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
