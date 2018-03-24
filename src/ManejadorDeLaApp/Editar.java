package ManejadorDeLaApp;

import CodigoEstructuras.*;
import javax.swing.JOptionPane;

public class Editar extends javax.swing.JFrame {

    private int clave, clavePrevia, aux;
    private String clavePrevia2;
    
    public Editar(Sucursal aux) {
        initComponents();
        this.setTitle("Editar Sucursal");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.clave = 0;
        this.clavePrevia = aux.getCodigo();
        this.texto1.setText("Codigo");
        this.texto2.setText("Ubicación");
        this.campo1.setText(((Integer)aux.getCodigo()).toString());
        this.campo2.setText(aux.getUbicacion());
        this.campo3.setVisible(false);
        this.campo4.setVisible(false);
        this.sala2D.setVisible(false);
        this.sala3D.setVisible(false);
        this.sala4DX.setVisible(false);
    }
    
    public Editar(boolean t, Sala sala, Sucursal aux2){
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.campo2.setVisible(false);
        this.campo3.setVisible(false);
        this.campo4.setVisible(false);
        this.aux =  aux2.getCodigo();
        if(t == true){
            this.setTitle("Editar Sala");
            this.clave = 2;
            this.clavePrevia = sala.getNumero();
            this.campo1.setText(((Integer)(sala.getNumero())).toString());
            if(sala instanceof Sala2D){
                this.salas.setSelected(this.sala2D.getModel(), true);
            }else if(sala instanceof Sala3D){
                this.salas.setSelected(this.sala3D.getModel(), true);
            }else{
                this.salas.setSelected(this.sala4DX.getModel(), true);
            }
        }else{
            this.setTitle("Agregar Sala");
            this.clave = 3;
        }
        this.texto1.setText("Número");
        this.texto2.setText("Tipo de Sala");
    }
    
    public Editar(){
        initComponents();
        this.setVisible(true);
        this.setTitle("Agregar Sucursal");
        this.setLocationRelativeTo(null);
        this.clave = 1;
        this.texto1.setText("Codigo");
        this.texto2.setText("Ubicación");
        this.sala2D.setVisible(false);
        this.sala3D.setVisible(false);
        this.sala4DX.setVisible(false);
        this.campo3.setVisible(false);
        this.campo4.setVisible(false);
    }
    
    public Editar(boolean t){
        initComponents();
        this.setVisible(true);
        this.setTitle("Editar Precios de Tickets");
        this.setLocationRelativeTo(null);
        this.clave = 4;
        this.sala2D.setVisible(false);
        this.sala3D.setVisible(false);
        this.sala4DX.setVisible(false);
        this.campo2.setVisible(false);
        this.texto1.setText("Precio 2D: ");
        this.texto2.setText("Precio 3D: ");
        this.texto3.setText("Precio 4DX: ");
        this.campo1.setText(""+Ticket.getPrecio2D());
        this.campo4.setText(""+Ticket.getPrecio3D());
        this.campo3.setText(""+Ticket.getPrecio4D());
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salas = new javax.swing.ButtonGroup();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        campo2 = new javax.swing.JTextField();
        campo1 = new javax.swing.JTextField();
        campo4 = new javax.swing.JTextField();
        campo3 = new javax.swing.JTextField();
        volver = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        sala2D = new javax.swing.JRadioButton();
        sala3D = new javax.swing.JRadioButton();
        sala4DX = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 140, 30));

        texto3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

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
        getContentPane().add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, 30));

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

        campo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo4ActionPerformed(evt);
            }
        });
        campo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo4KeyTyped(evt);
            }
        });
        getContentPane().add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, 30));

        campo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo3ActionPerformed(evt);
            }
        });
        campo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo3KeyTyped(evt);
            }
        });
        getContentPane().add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, 30));

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
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! LOS LLENE LOS CAMPOS ANTES DE PROCEDER");
        }else{
            if(this.clave == 0){
                if(this.codigoValido()){
                    this.aux = Integer.parseInt(this.campo1.getText());
                    if(!MenuInicio.sucursales.estaNodo(MenuInicio.sucursales.getRaiz(), this.aux)){
                        Sucursal aux2 = new Sucursal(this.campo2.getText(),this.aux);
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
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(rootPane, "ERROR!!! YA ESTA REGISTRADO ESE CODIGO");
                    }
                }else{
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(rootPane, "ERROR!!! LOS CODIGOS DEBEN SER DE 4 DIGITOS");
                }
            }else if(this.clave == 2 || this.clave == 3){
                if(this.camposVacios() || this.salas.getSelection() == null){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(rootPane, "ERROR!!! DEBE LLENAR LOS CAMPOS");
                }else{
                    boolean pasa = true;
                    int aux2 = Integer.parseInt(this.campo1.getText());
                    Sucursal aux3 = (Sucursal)(MenuInicio.sucursales.buscarNodo(MenuInicio.sucursales.getRaiz(), this.aux)).getDato();
                    NodoSimple aux4 = aux3.getSalas().getCabeza();
                    while(aux4 != null){
                        if(aux2 == ((Sala)aux4.getDato()).getNumero()){
                            getToolkit().beep();
                            JOptionPane.showMessageDialog(rootPane, "ERROR!!! EL NUMERO DE SALA YA ESTA REGISTRADO");
                            pasa = false;
                        }
                        aux4 = aux4.getProximo();
                    }
                    if(pasa==true){
                        if(this.clave == 2){
                            Sala remp = null;
                            aux4 = aux3.getSalas().getCabeza();
                            int pos = 0;
                            while(aux4 != null){
                                if(((Sala)aux4.getDato()).getNumero() == this.clavePrevia){
                                    break;
                                }
                                pos++;
                                aux4 = aux4.getProximo();
                            }
                            
                            aux3.getSalas().eliminarPosicion(pos);
                            
                            if(this.salas.isSelected(this.sala2D.getModel())){
                                remp = new Sala2D(aux2, aux3);
                                aux3.agregarSala((Sala2D)remp);
                            }else if(this.salas.isSelected(this.sala3D.getModel())){
                                remp = new Sala3D(aux2, aux3);
                                aux3.agregarSala((Sala3D)remp);
                            }else{
                                remp = new Sala4DX(aux2, aux3);
                                aux3.agregarSala((Sala4DX)remp);
                            }
                            
                            NodoArbol remp2 = new NodoArbol(aux3,aux3.getCodigo());
                            MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(), aux3.getCodigo());
                            MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), remp2);
                            
                        }else if(this.clave == 3){
                            Sala nueva;
                            if(this.salas.isSelected(this.sala2D.getModel())){
                                nueva = new Sala2D(aux2, aux3);
                                aux3.agregarSala((Sala2D)nueva);
                            }else if(this.salas.isSelected(this.sala3D.getModel())){
                                nueva = new Sala3D(aux2, aux3);
                                aux3.agregarSala((Sala3D)nueva);
                            }else{
                                nueva = new Sala4DX(aux2, aux3);
                                aux3.agregarSala((Sala4DX)nueva);
                            }
                            
                            NodoArbol remp2 = new NodoArbol(aux3,aux3.getCodigo());
                            MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(), aux3.getCodigo());
                            MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), remp2);
                        }
                        
                        new ManejoSucursales();
                        this.dispose();
                    }
                }
            }else if(this.clave == 4){
                if(this.camposVacios()){
                    JOptionPane.showMessageDialog(rootPane, "ERROR!!! COMPLETE LOS CAMPOS");
                }else{
                    double precio2D, precio3D, precio4D;
                    precio2D = Double.valueOf(this.campo1.getText());
                    precio3D = Double.valueOf(this.campo4.getText());
                    precio4D = Double.valueOf(this.campo3.getText());
                    Ticket.setPrecio2D(precio2D);
                    Ticket.setPrecio3D(precio3D);
                    Ticket.setPrecio4D(precio4D);
                    if(!MenuInicio.clientes.isVacio()){
                        int[] aux = new int[MenuInicio.clientes.contar(MenuInicio.clientes.getRaiz())];
                        MenuInicio.clientes.getTodosLosCodigos(MenuInicio.clientes.getRaiz(), aux);
                        Cliente aux2;
                        for(int i=0;i<aux.length;i++){
                            aux2 = (Cliente)MenuInicio.clientes.buscarNodo(MenuInicio.clientes.getRaiz(), aux[i]).getDato();
                            if(!aux2.getCarro().getTicketsPorPagar().isVacio()){
                                Ticket temp2;
                                int[] temp = new int[aux2.getCarro().getTicketsPorPagar().contar(aux2.getCarro().getTicketsPorPagar().getRaiz())];
                                aux2.getCarro().getTicketsPorPagar().getTodosLosCodigos(aux2.getCarro().getTicketsPorPagar().getRaiz(), temp);
                                for(int j=0;j<temp.length;j++){
                                    temp2 = (Ticket)aux2.getCarro().getTicketsPorPagar().buscarNodo(aux2.getCarro().getTicketsPorPagar().getRaiz(), temp[j]).getDato();
                                    if(temp2.is2D()){
                                        temp2.setPrecioTicket(precio2D);
                                    }else if(temp2.is3D()){
                                        temp2.setPrecioTicket(precio3D);
                                    }else{
                                        temp2.setPrecioTicket(precio4D);
                                    }
                                    aux2.getCarro().getTicketsPorPagar().eliminarNodo(aux2.getCarro().getTicketsPorPagar().getRaiz(), temp2.getId());
                                    aux2.getCarro().getTicketsPorPagar().agregar(aux2.getCarro().getTicketsPorPagar().getRaiz(),new NodoArbol(temp2,temp2.getId()));
                                }
                                MenuInicio.clientes.eliminarNodo(MenuInicio.clientes.getRaiz(), aux2.getCi());
                                MenuInicio.clientes.agregar(MenuInicio.clientes.getRaiz(), new NodoArbol(aux2,aux2.getCi()));
                            }
                        }
                    }
                    new MenuInicio();
                    this.dispose();
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
        }else  if(this.clave == 2 || this.clave == 3){
            return this.campo1.getText().trim().length() == 0;
        }else{
            return this.campo3.getText().trim().length() == 0 || this.campo4.getText().trim().length() == 0 || this.campo1.getText().trim().length() == 0;
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

    private void campo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo3ActionPerformed

    private void campo3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_campo3KeyTyped

    private void campo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo4ActionPerformed

    private void campo4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_campo4KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JButton confirmar;
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton sala2D;
    private javax.swing.JRadioButton sala3D;
    private javax.swing.JRadioButton sala4DX;
    private javax.swing.ButtonGroup salas;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
