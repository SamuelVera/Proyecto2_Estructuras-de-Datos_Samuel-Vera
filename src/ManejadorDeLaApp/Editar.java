package ManejadorDeLaApp;

import EstructuraDeClases.Sucursal;
import EstructuraDeClases.Ticket;
import EstructuraDeClases.Sala2D;
import EstructuraDeClases.Cliente;
import EstructuraDeClases.Sala4DX;
import EstructuraDeClases.Sala;
import EstructuraDeClases.Sala3D;
import CodigoEstructuras.*;
import javax.swing.JOptionPane;

/*Desde está clase se efectuan las modificaciones a sucursales, salas
y precios de tickets además de las acciones de agregar salas y sucursales
nuevas al sistema*/

public class Editar extends javax.swing.JFrame {

    private int clave, clavePrevia, aux;
    private String clavePrevia2;
    
    /*Constructor llamado cuando se va a editar
    la información de una sucursal*/
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
    
    /*Constructor llamado cuando se va a agregar
    una nueva sucursal*/
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
    
    /*Constructor llamado cuando se va a editar
    la información de una sala o se va a agregar
    una nueva sala*/
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
        }
        this.clave = 2;
        this.texto1.setText("Número");
        this.texto2.setText("Tipo de Sala");
    }
    
    /*Constructor llamado cuando se va a cambiar
    los precios de los tickets*/
    public Editar(boolean t){
        initComponents();
        this.setVisible(true);
        this.setTitle("Editar Precios de Tickets");
        this.setLocationRelativeTo(null);
        this.clave = 3;
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
    
    //Método para editar la información de una sucursal
    private void editarSucursal(){
        if(Integer.parseInt(this.campo1.getText())<= 0){
            JOptionPane.showMessageDialog(rootPane, "CODIGO NEGATIVO","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else if(this.codigoValido()){
            this.aux = Integer.parseInt(this.campo1.getText());
            if(!MenuInicio.sucursales.estaNodo(MenuInicio.sucursales.getRaiz(), this.aux)){
                Sucursal aux2 = new Sucursal(this.campo2.getText(),this.aux);
                NodoArbol aux3 = (MenuInicio.sucursales.buscarNodo(MenuInicio.sucursales.getRaiz(), this.clavePrevia));
                aux2.setSalas(((Sucursal)aux3.getDato()).getSalas());
                NodoArbol cambio = new NodoArbol(aux2, aux2.getCodigo());
                MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(), this.clavePrevia);
                MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(),cambio);
                new ManejarElementos();
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane, "YA ESTÁ REGISTRADO ESE CODIGO","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "LOS CODIGOS DEBEN SER DE 4 DIGITOS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método para agregar una nueva sucursal al sistema
    private void agregarSucursal(){
        if(Integer.parseInt(this.campo1.getText())<= 0){
            JOptionPane.showMessageDialog(rootPane, "CODIGO NEGATIVO","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else if(this.codigoValido()){
                    int aux = Integer.parseInt(this.campo1.getText());
                    if(!MenuInicio.sucursales.estaNodo(MenuInicio.sucursales.getRaiz(), aux)){
                        Sucursal temp = new Sucursal(this.campo2.getText(),aux);
                        NodoArbol temp2 = new NodoArbol(temp, temp.getCodigo());
                        MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), temp2);
                        new ManejarElementos();
                        this.dispose();
                    }else{
                        getToolkit().beep();
                        JOptionPane.showMessageDialog(rootPane, "YA ESTA REGISTRADO ESE CODIGO","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE );
                    }
                }else{
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(rootPane, "LOS CODIGOS DEBEN SER DE 4 DIGITOS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
                }
    }
    
    //Método para agregar o editar una sala de una sucursal
    private void agregarEditarSala(){
        if(this.camposVacios() || this.salas.getSelection() == null){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "DEBE LLENAR LOS CAMPOS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else if(Integer.parseInt(this.campo1.getText()) <= 0){
            JOptionPane.showMessageDialog(rootPane, "NÚMERO DE SALA NEGATIVO","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else{
            boolean pasa = true;
            int aux2 = Integer.parseInt(this.campo1.getText());
            Sucursal aux3 = (Sucursal)(MenuInicio.sucursales.buscarNodo(MenuInicio.sucursales.getRaiz(), this.aux)).getDato();
            NodoSimple aux4 = aux3.getSalas().getCabeza();
            while(aux4 != null){
                if(aux2 == ((Sala)aux4.getDato()).getNumero()){
                    getToolkit().beep();
                    JOptionPane.showMessageDialog(rootPane, "EL NUMERO DE SALA YA ESTA REGISTRADO","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
                    pasa = false;
                }
                aux4 = aux4.getProximo();
            }
            if(pasa==true){
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
                new ManejarElementos();
                this.dispose();
            }
        }
    }
    
        //Método en el que se modifica el precio de los tickets
    private void modificarPrecio(){
        if(this.camposVacios()){
            JOptionPane.showMessageDialog(rootPane, "LLENE LOS CAMPOS ANTES DE PROCEDER","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
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

        campo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo2KeyTyped(evt);
            }
        });
        getContentPane().add(campo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, 30));

        campo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo1KeyTyped(evt);
            }
        });
        getContentPane().add(campo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 30));

        campo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo4KeyTyped(evt);
            }
        });
        getContentPane().add(campo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 170, 30));

        campo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo3KeyTyped(evt);
            }
        });
        getContentPane().add(campo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 170, 30));

        volver.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        volver.setText("Volver");
        volver.setOpaque(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 170, 70, 20));

        confirmar.setText("Confirmar");
        confirmar.setOpaque(false);
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, 20));

        salas.add(sala2D);
        sala2D.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        sala2D.setText("Sala 2D");
        sala2D.setOpaque(false);
        getContentPane().add(sala2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        salas.add(sala3D);
        sala3D.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        sala3D.setText("Sala 3D");
        sala3D.setOpaque(false);
        getContentPane().add(sala3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        salas.add(sala4DX);
        sala4DX.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        sala4DX.setText("Sala 4DX");
        sala4DX.setOpaque(false);
        getContentPane().add(sala4DX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        if(this.clave != 3){//Volver a la ventana de manejo de sucursales/salas/película
            new ManejarElementos();
        }else{//Volver al menu de inicio
            new MenuInicio();
        }
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if(this.camposVacios()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "LLENE LOS CAMPOS ANTES DE PROCEDER","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else{
            if(this.clave == 0){
                this.editarSucursal();//Editar sucursal
            }else if(this.clave == 1){
                this.agregarSucursal();//Agregar sucursal
            }else if(this.clave == 2){
                this.agregarEditarSala();//Editar o agregar sala
            }else if(this.clave == 3){
                this.modificarPrecio();//Modificar precio de los tickets
            }
        }
    }//GEN-LAST:event_confirmarActionPerformed

        //Validar que un codigo de sucursal sea de 4 dígitos
    private boolean codigoValido(){
        return this.campo1.getText().trim().length() == 4;
    }
    
        //Validar si los campos están vacios
    private boolean camposVacios(){
        if(this.clave == 0 || this.clave == 1){
            return this.campo2.getText().trim().length() == 0 || this.campo1.getText().trim().length() == 0;
        }else  if(this.clave == 2){
            return this.campo1.getText().trim().length() == 0;
        }else{
            return this.campo3.getText().trim().length() == 0 || this.campo4.getText().trim().length() == 0 || this.campo1.getText().trim().length() == 0;
        }
    }
    
    
    private void campo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo1KeyTyped
        char validar = evt.getKeyChar();
            //Validar si se ingresa una letra o espacio
        if(Character.isLetter(validar)|| Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_campo1KeyTyped

    private void campo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo2KeyTyped
        char validar = evt.getKeyChar();
            //Validar si se ingresa un número
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO LETRAS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_campo2KeyTyped

    private void campo3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo3KeyTyped
        char validar = evt.getKeyChar();
            //Validar si se ingresa una letra o espacio
        if(Character.isLetter(validar)|| Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_campo3KeyTyped

    private void campo4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo4KeyTyped
        char validar = evt.getKeyChar();
            //Validar si se ingresa una letra o espacio
        if(Character.isLetter(validar)|| Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }
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
