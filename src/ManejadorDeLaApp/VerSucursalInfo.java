package ManejadorDeLaApp;

import CodigoEstructuras.*;
import javax.swing.*;

public class VerSucursalInfo<T> extends javax.swing.JFrame {

    protected static String[] sucur;
    
    public VerSucursalInfo() {
        
        initComponents();
        
        MenuInicio.exe.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
        sucur = new String[MenuInicio.sucursales.contarElementos()];
        NodoSimple n = MenuInicio.sucursales.getCabeza();
        int i=0;
        
        while(n!=null){
            
            VerSucursalInfo.sucur[i] = ((Sucursal)n.getDato()).getUbicacion();
            n = n.getProximo();
            i++;
        
        }
        
        ComboBoxModel aux = new DefaultComboBoxModel<>(sucur);
        this.sucursales.setModel(aux);
        
        this.texto2.setVisible(false);
        this.texto2.setLineWrap(true);
        
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto1 = new javax.swing.JLabel();
        sucursales = new javax.swing.JComboBox<>();
        texto3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto2 = new javax.swing.JTextArea();
        volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto1.setText("Sucursal:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalesActionPerformed(evt);
            }
        });
        getContentPane().add(sucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 210, 30));

        texto3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 30));

        texto2.setColumns(20);
        texto2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        texto2.setRows(5);
        jScrollPane1.setViewportView(texto2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 350, 290));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Despliega ComboBoc de salas de la sucursal
    private void sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalesActionPerformed
        
        String i = (this.sucursales.getSelectedItem()).toString();
        
        NodoSimple aux = MenuInicio.sucursales.getCabeza();
        while(aux != null){
            if(i == ((Sucursal)(aux.getDato())).getUbicacion()){
                
                this.texto3.setText("Codigo: "+((Sucursal)aux.getDato()).getCodigo());
                aux = ((Sucursal)(aux.getDato())).getSalas().getCabeza();
                break;
                
            }
            aux = aux.getProximo();
        }
        
        this.texto2.setText("Salas: ");
        
        while(aux!=null){
            
            if(aux.getDato() instanceof Sala2D){
                
                this.texto2.setText(this.texto2.getText()+"Sala"+((Sala2D)aux.getDato()).getNumero()+": Sala2D ");
                
            }else if(aux.getDato() instanceof Sala3D){
                
                this.texto2.setText(this.texto2.getText()+"Sala"+((Sala3D)aux.getDato()).getNumero()+": Sala3D ");
                
            }else{
                
                this.texto2.setText(this.texto2.getText()+"Sala"+((Sala4DX)aux.getDato()).getNumero()+": Sala4DX ");
                
            }
            aux = aux.getProximo();
        }
        
        this.texto2.setVisible(true);
        
    }//GEN-LAST:event_sucursalesActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        this.setVisible(false);
        this.dispose();
        MenuInicio.exe.setVisible(true);
        
    }//GEN-LAST:event_volverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sucursales;
    private javax.swing.JLabel texto1;
    private javax.swing.JTextArea texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}