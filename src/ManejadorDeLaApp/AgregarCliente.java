package ManejadorDeLaApp;

import EstructuraDeClases.Cliente;
import CodigoEstructuras.*;
import javax.swing.JOptionPane;

/*Desde esta clase se puede:
-Agregar un cliente al sistema.
*/
public class AgregarCliente extends javax.swing.JFrame {

        //Inicialización de los elementos de la ventana.
    public AgregarCliente() {
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Agregar Cliente");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cedula = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedula.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 260, -1));

        nombre.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 260, -1));

        telefono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 260, -1));

        volver.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        volver.setText("Volver");
        volver.setOpaque(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 70, 20));

        agregar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        agregar.setText("Agregar");
        agregar.setOpaque(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
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

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        ManejarClientes aux = new ManejarClientes();//Volver a la ventana de manejar los clientes.
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

        //Acción del botón agregar.
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
            //Validación de los campos.
        if(this.cedula.getText().trim().length() == 0 || this.telefono.getText().trim().length() == 0 || this.nombre.getText().trim().length() == 0){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "COMPLETAR LOS CAMPOS ANTES DE PROCEDER","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else{
            int temp = Integer.parseInt(this.cedula.getText());
                //Validación de que la cédula no sea negativa y no este registrada en el sistema.
            if(!MenuInicio.clientes.estaNodo(MenuInicio.clientes.getRaiz(),temp) && temp>0){
                int ci = temp, tlf = Integer.parseInt(this.telefono.getText());
                Cliente aux = new Cliente(ci,tlf,this.nombre.getText());
                MenuInicio.clientes.agregar(MenuInicio.clientes.getRaiz(),new NodoArbol(aux,aux.getCi()));
                ManejarClientes aux3 = new ManejarClientes();
                this.dispose();
            }else if(temp < 0){
                getToolkit().beep();
                JOptionPane.showMessageDialog(rootPane, "LA CÉDULA ES MENOR QUE CERO (0)","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
            }else{
                getToolkit().beep();
                JOptionPane.showMessageDialog(rootPane, "ESA CÉDULA DE CLIENTE YA ESTA ASIGNADA","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_agregarActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char validar = evt.getKeyChar();
            //Cédula sin letras ni espacios.
        if(Character.isLetter(validar) || Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        char validar = evt.getKeyChar();
            //Telefono sin letras ni espacios.
        if(Character.isLetter(validar) || Character.isSpace(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_telefonoKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char validar = evt.getKeyChar();
            //Nombre sin números.
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO LETRAS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nombreKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
