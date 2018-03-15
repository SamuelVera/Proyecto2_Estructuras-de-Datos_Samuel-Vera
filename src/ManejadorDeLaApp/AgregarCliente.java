package ManejadorDeLaApp;

public class AgregarCliente extends javax.swing.JFrame {

    public AgregarCliente() {
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        MenuInicio.exe.setVisible(false);
        this.setTitle("Agregar Cliente");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 260, -1));

        nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 260, -1));

        telefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 260, -1));

        jButton1.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 70, 20));

        agregar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        agregar.setText("Agregar");
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 130, 30));

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto1.setText("Cédula:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto2.setText("Nombre:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        texto3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto3.setText("Teléfono:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 20));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 400, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuInicio.exe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    // End of variables declaration//GEN-END:variables
}
