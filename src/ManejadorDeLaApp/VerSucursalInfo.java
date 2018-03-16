package ManejadorDeLaApp;

import CodigoEstructuras.*;
import javax.swing.*;

public class VerSucursalInfo<T> extends javax.swing.JFrame {

    private int[] sucur;
    private String[] aux;
    
    public VerSucursalInfo() {
        
        initComponents();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Información de Sucursales");
        
        this.sucur = new int[MenuInicio.sucursales.contar(MenuInicio.sucursales.getRaiz())];
        MenuInicio.sucursales.getTodosLosCodigos(MenuInicio.sucursales.getRaiz(), this.sucur, 0);
        this.aux = new String[this.sucur.length];
        
        for(int i=0;i<this.aux.length;i++){
            this.aux[i] = ""+this.sucur[i];
        }
        
        ComboBoxModel aux2 = new DefaultComboBoxModel(this.aux);
        
        this.sucursales.setModel(aux2);
        
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
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Selección del ComboBox de salas de la sucursal
    private void sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalesActionPerformed
        
        NodoArbol auxi;
        Sucursal temp;
        
        auxi = MenuInicio.sucursales.buscarNodo(MenuInicio.sucursales.getRaiz(), Integer.parseInt(this.sucursales.getSelectedItem().toString()));
        temp = (Sucursal)auxi.getDato();
        this.texto2.setText("");
        
        if(temp != null){
            this.texto3.setText("Ubicación: "+temp.getUbicacion());
            NodoSimple aux2 = temp.getSalas().getCabeza();
            
            while(aux2 != null){
                if(aux2.getDato() instanceof Sala2D){
                    this.texto2.setText(this.texto2.getText()+"Sala"+((Sala2D)aux2.getDato()).getNumero()+": Sala2D ");
                }else if(aux2.getDato() instanceof Sala3D){
                    this.texto2.setText(this.texto2.getText()+"Sala"+((Sala3D)aux2.getDato()).getNumero()+": Sala3D ");
                }else{
                    this.texto2.setText(this.texto2.getText()+"Sala"+((Sala4DX)aux2.getDato()).getNumero()+": Sala4DX ");
                }
                aux2 = aux2.getProximo();
            }
        }
        
        this.texto2.setVisible(true);
    }//GEN-LAST:event_sucursalesActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        
        this.setVisible(false);
        new MenuInicio();
        this.dispose();
        
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
