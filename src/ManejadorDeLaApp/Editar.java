package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class Editar extends javax.swing.JFrame {

    private int clave;
    private int clavePrevia;
    private String clavePrevia2;
    
    public Editar(Sucursal aux) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.clave = 0;
        this.clavePrevia = aux.getCodigo();
        this.texto1.setText("Codigo");
        this.texto2.setText("Ubicación");
        this.campo.setText(((Integer)aux.getCodigo()).toString());
        this.campo1.setText(aux.getUbicacion());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        campo = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 30));

        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });
        getContentPane().add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, 30));

        campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoActionPerformed(evt);
            }
        });
        getContentPane().add(campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 30));

        volver.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 170, 70, 20));

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 20));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoActionPerformed
        
    }//GEN-LAST:event_campoActionPerformed

    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        
    }//GEN-LAST:event_campo1ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new ManejoSucursales();
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if(this.clave == 0){
            int aux = Integer.parseInt(this.campo.getText());
                
            if(!MenuInicio.sucursales.estaNodo(MenuInicio.sucursales.getRaiz(), aux)){
                Sucursal aux2 = new Sucursal(this.campo1.getText(),aux);
                NodoArbol cambio = new NodoArbol(aux2, aux2.getCodigo());
                MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(),cambio);
                new ManejoSucursales();
                this.dispose();
            }else{
                
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo;
    private javax.swing.JTextField campo1;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
