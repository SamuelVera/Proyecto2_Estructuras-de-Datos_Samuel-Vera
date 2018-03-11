package ManejadorDeLaApp;

import javax.swing.*;

public class MenuSucursales extends javax.swing.JFrame {

    public MenuSucursales() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        MenuInicio.exe.setVisible(false);
        
        //String [] sucur = new String[MenuInicio.estructura];
        
        //ComboBoxModel aux = new DefaultComboBoxModel<>(sucur);
        
        //this.sucursales.setModel(aux);
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto1 = new javax.swing.JLabel();
        sucursales = new javax.swing.JComboBox<>();
        texto2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto1.setText("Sucursales:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 30));

        sucursales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        sucursales.setSelectedIndex(0);
        getContentPane().add(sucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 200, -1));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto2.setText("Peliculas:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> sucursales;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
