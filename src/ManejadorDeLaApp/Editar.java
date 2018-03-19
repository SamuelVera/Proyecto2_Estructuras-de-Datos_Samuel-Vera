package ManejadorDeLaApp;

import CodigoEstructuras.*;
import javax.swing.JOptionPane;

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
        this.campo1.setText(((Integer)aux.getCodigo()).toString());
        this.campo2.setText(aux.getUbicacion());
        this.sala2D.setVisible(false);
        this.sala3D.setVisible(false);
        this.sala4DX.setVisible(false);
    }
    
    public Editar(boolean t, Sala sala){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.campo2.setVisible(false);
        if(t == true){
            this.clave = 2;
            this.campo1.setText(((Integer)(sala.getNumero())).toString());
            if(sala instanceof Sala2D){
                
            }else if(sala instanceof Sala3D){
                
            }else{
                
            }
        }else{
            this.clave = 3;
        }
        this.texto1.setText("Número");
        this.texto2.setText("Tipo de Sala");
    }
    
    public Editar(){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.clave = 1;
        this.texto1.setText("Codigo");
        this.texto2.setText("Ubicación");
        this.sala2D.setVisible(false);
        this.sala3D.setVisible(false);
        this.sala4DX.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salas = new javax.swing.ButtonGroup();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        campo2 = new javax.swing.JTextField();
        campo1 = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        sala2D = new javax.swing.JRadioButton();
        sala3D = new javax.swing.JRadioButton();
        sala4DX = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 30));

        campo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo2ActionPerformed(evt);
            }
        });
        campo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo2KeyTyped(evt);
            }
        });
        getContentPane().add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, 30));

        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });
        campo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo1KeyTyped(evt);
            }
        });
        getContentPane().add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 30));

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

        salas.add(sala2D);
        sala2D.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        sala2D.setText("Sala 2D");
        getContentPane().add(sala2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        salas.add(sala3D);
        sala3D.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        sala3D.setText("Sala 3D");
        getContentPane().add(sala3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        salas.add(sala4DX);
        sala4DX.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        sala4DX.setText("Sala 4DX");
        getContentPane().add(sala4DX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        
    }//GEN-LAST:event_campo1ActionPerformed

    private void campo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo2ActionPerformed
        
    }//GEN-LAST:event_campo2ActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new ManejoSucursales();
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if(this.camposVacios()){
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! LOS LLENE LOS CAMPOS ANTES DE PROCEDER");
        }else{
            if(this.clave == 0){
                if(this.codigoValido()){
                    int aux = Integer.parseInt(this.campo1.getText());
                    if(!MenuInicio.sucursales.estaNodo(MenuInicio.sucursales.getRaiz(), aux)){
                        Sucursal aux2 = new Sucursal(this.campo2.getText(),aux);
                        NodoArbol aux3 = (MenuInicio.sucursales.buscarNodo(MenuInicio.sucursales.getRaiz(), this.clavePrevia));
                        aux2.setSalas(((Sucursal)aux3.getDato()).getSalas());
                        NodoArbol cambio = new NodoArbol(aux2, aux2.getCodigo());
                        MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(), this.clavePrevia);
                        MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(),cambio);
                        new ManejoSucursales();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "ERROR!!! YA ESTA REGISTRADO ESE CODIGO");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "ERROR!!! LOS CODIGOS DEBEN SER DE 4 DIGITOS");
                }
            }else if(this.clave == 1){
                if(this.codigoValido()){
                    int aux = Integer.parseInt(this.campo1.getText());
                    if(!MenuInicio.sucursales.estaNodo(MenuInicio.sucursales.getRaiz(), aux)){
                        Sucursal temp = new Sucursal(this.campo2.getText(),aux);
                        NodoArbol temp2 = new NodoArbol(temp, temp.getCodigo());
                        MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), temp2);
                        new ManejoSucursales();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "ERROR!!! YA ESTA REGISTRADO ESE CODIGO");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "ERROR!!! LOS CODIGOS DEBEN SER DE 4 DIGITOS");
                }
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

    public boolean codigoValido(){
        return this.campo1.getText().trim().length() == 4;
    }
    
    public boolean camposVacios(){
        if(this.clave == 0 || this.clave == 1){
            return this.campo2.getText().trim().length() == 0 || this.campo1.getText().trim().length() == 0;
        }else{
            return this.campo1.getText().trim().length() == 0;
        }
    }
    
    
    private void campo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo1KeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)|| Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! INGRESAR SOLO NÚMEROS");
        }
    }//GEN-LAST:event_campo1KeyTyped

    private void campo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo2KeyTyped
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! INGRESAR SOLO NÚMEROS");
        }
    }//GEN-LAST:event_campo2KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton sala2D;
    private javax.swing.JRadioButton sala3D;
    private javax.swing.JRadioButton sala4DX;
    private javax.swing.ButtonGroup salas;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
