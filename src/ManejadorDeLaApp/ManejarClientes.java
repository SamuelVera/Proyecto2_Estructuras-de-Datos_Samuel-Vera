package ManejadorDeLaApp;

import EstructuraDeClases.Cliente;
import CodigoEstructuras.*;
import javax.swing.JOptionPane;

/*Clase desde la cual se hacen las operaciones de
-Buscar un cliente.
-Agregar cliente.
-Acceder al historial de compras de un cliente.
-Acceder a los tickets pendientes de pago de un cliente.
*/

public class ManejarClientes extends javax.swing.JFrame {

    private Cliente temp;
    
    public ManejarClientes() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Manejador de Clientes");
        this.pagar.setVisible(false);
        this.historial.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarCliente = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        campo = new javax.swing.JTextField();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        pagar = new javax.swing.JButton();
        historial = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarCliente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        agregarCliente.setText("Agregar Cliente");
        agregarCliente.setOpaque(false);
        agregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(agregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 30));

        volver.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        volver.setText("Volver");
        volver.setOpaque(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, 20));

        buscar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        buscar.setText("Buscar");
        buscar.setOpaque(false);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 30));

        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoKeyTyped(evt);
            }
        });
        getContentPane().add(campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, -1));

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto2.setText("Buscar por cédula:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        texto3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 310, 30));

        texto4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 220, 20));

        pagar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        pagar.setText("Pagar/Deshacer");
        pagar.setOpaque(false);
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        getContentPane().add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 140, 20));

        historial.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        historial.setText("Historial Compras");
        historial.setOpaque(false);
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });
        getContentPane().add(historial, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 150, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        MenuInicio aux = new MenuInicio();
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void agregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarClienteActionPerformed
        AgregarCliente aux = new AgregarCliente();
        this.dispose();
    }//GEN-LAST:event_agregarClienteActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        if(this.campo.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! COMPLETE EL CAMPO DE BÚSQUEDA");
        }else{
            int key = Integer.parseInt(this.campo.getText());    
            if(MenuInicio.clientes.estaNodo(MenuInicio.clientes.getRaiz(), key)){
                NodoArbol aux = MenuInicio.clientes.buscarNodo(MenuInicio.clientes.getRaiz(), key);
                this.temp = ((Cliente)aux.getDato());
                this.texto1.setText("Nombre: "+((Cliente)aux.getDato()).getNombre());
                this.texto3.setText("Telefono: "+((Cliente)aux.getDato()).getTelefono());
                if(!((Cliente)aux.getDato()).isSolvente()){
                    this.texto4.setText("Hay pagos pendientes");
                    this.pagar.setVisible(true);
                }else{
                    this.texto4.setText("El cliente está solvente");
                    this.pagar.setVisible(false);
                }
                this.historial.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "NO EXISTE CLIENTE REGISTRADO POR ESA C.I "+this.campo.getText());
            }
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void campoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKeyTyped
        char validar = evt.getKeyChar();
            //Validación de ingresar solo números en la cédula
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! INGRESAR SOLO NÚMEROS");
        }
    }//GEN-LAST:event_campoKeyTyped

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        new ManejarOrdenes(this.temp); //Acceder a la orden pendiente del cliente
        this.dispose();
    }//GEN-LAST:event_pagarActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        new ManejarOrdenes(this.temp,0); //Acceder al historial de compras del cliente
        this.dispose();
    }//GEN-LAST:event_historialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCliente;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField campo;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton historial;
    private javax.swing.JButton pagar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
