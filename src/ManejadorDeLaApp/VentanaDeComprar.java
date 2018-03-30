package ManejadorDeLaApp;

import EstructuraDeClases.Sucursal;
import EstructuraDeClases.Ticket;
import EstructuraDeClases.Sala2D;
import EstructuraDeClases.Cliente;
import EstructuraDeClases.Pelicula;
import EstructuraDeClases.Sala;
import EstructuraDeClases.Sala3D;
import CodigoEstructuras.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/*Desde esta ventana se efectuan las compras de n tickets para una película
que este ofertada.*/
public class VentanaDeComprar extends javax.swing.JFrame {

    private Sucursal temp;
    private Sala temp2;
    private Pelicula temp3;
    private double precio;
    private SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        //Constructor con el que se inicializan los elementos gráficos de la ventana.
    public VentanaDeComprar(Pelicula pelicula) {
        initComponents();
        this.setTitle("Ventana de Comprar");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.temp3 = pelicula;
        this.temp2 = pelicula.getSala();
        this.temp = this.temp2.getSucursal();
        this.texto1.setText("Película: "+this.temp3.getNombre());
        if(this.temp2 instanceof Sala2D){
            this.texto2.setText("Función tipo: 2D");
            this.precio = Ticket.getPrecio2D();
        }else if(this.temp2 instanceof Sala3D){
            this.texto2.setText("Función tipo: 3D");
            this.precio = Ticket.getPrecio3D();
        }else{
            this.texto2.setText("Función tipo: 4DX");
            this.precio = Ticket.getPrecio4D();
        }
        this.texto3.setText("Precio: "+this.precio+" Bs.");
        this.texto4.setText("Género: "+this.temp3.getGenero());
        this.texto5.setText("Idioma: "+this.temp3.getIdioma());
        this.texto8.setText("Fecha de la función");
        this.inicializarFechas();
    }
    
        //Inicializar lista de los próximos 5 días que se oferta la película.
    private void inicializarFechas(){
        String[] fechas = new String[5];
        Date aux = MenuInicio.fecha;
        
        for(int i=0;i<fechas.length;i++){
            aux.setDate(aux.getDate()+i);
            fechas[i] = (this.df.format(aux));
            aux.setDate(aux.getDate()-i);
        }
        
        ComboBoxModel aux2 = new DefaultComboBoxModel(fechas);
        this.fechas.setModel(aux2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        texto7 = new javax.swing.JLabel();
        texto8 = new javax.swing.JLabel();
        texto9 = new javax.swing.JLabel();
        fechas = new javax.swing.JComboBox<>();
        numeroBoletos = new javax.swing.JComboBox<>();
        comprar = new javax.swing.JButton();
        campo = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 30));

        texto3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, 30));

        texto4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 310, 30));

        texto5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 30));

        texto6.setText("Número de Boletos:");
        getContentPane().add(texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, 10));

        texto7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto7.setText("C.I cliente:");
        getContentPane().add(texto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        texto8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 210, 30));

        texto9.setText("Fecha:");
        getContentPane().add(texto9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 80, 10));

        fechas.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        fechas.setMaximumRowCount(7);
        getContentPane().add(fechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 100, -1));

        numeroBoletos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        numeroBoletos.setMaximumRowCount(200);
        numeroBoletos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
        numeroBoletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroBoletosActionPerformed(evt);
            }
        });
        getContentPane().add(numeroBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 100, 20));

        comprar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        comprar.setText("Comprar");
        comprar.setOpaque(false);
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 90, -1));

        campo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        campo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoKeyTyped(evt);
            }
        });
        getContentPane().add(campo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Acción del botón comprar.
    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        if(this.campo.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(rootPane, "COMPLETE LOS CAMPOS ANTES DE CONTINUAR","  ¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }else if(Integer.parseInt(this.campo.getText()) <= 0){
            JOptionPane.showMessageDialog(rootPane, "CÉDULA INGRESADA MENOR A CERO(0)","  ¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }else{
            
            int aux2 = this.numeroBoletos.getSelectedIndex()+1;
            Cliente clien = null;
            int cod = Integer.parseInt(this.campo.getText());
            Ticket aux;
            boolean pago;
            Date fecha = null;
            
            try {
                fecha = df.parse(this.fechas.getSelectedItem().toString());
            } catch (ParseException ex) {
                Logger.getLogger(VentanaDeComprar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            if(!MenuInicio.clientes.estaNodo(MenuInicio.clientes.getRaiz(), cod)){
                    JOptionPane.showMessageDialog(rootPane, "El cliente no está registrado en el sistema, deberá pagar al momento");
                    clien = null;
                    /*Si la cédula no se encuentra registrada no se guarda como orden
                    del cliente y el pago se efectua de inmediato.*/
                }else{
                    JOptionPane.showMessageDialog(rootPane, "El cliente está registrado en el sistema, tiene facilidades para pagar su ticker luego");
                    clien = (Cliente)MenuInicio.clientes.buscarNodo(MenuInicio.clientes.getRaiz(), cod).getDato();
                    /*Si la cédula se encuentra registrada los tickets se guardan en la orden
                    del cliente para que pueda pagarlos luego.*/
                }
            
            while(aux2 != 0){
                int multi = 1000000, codigo = 0;
                Random rand = new Random();
                while(multi != 1){
                    codigo = codigo + (rand.nextInt(9)+1)*multi;
                    multi = multi/10;
                    if(multi == 1 && this.temp2.getArbolTickets().estaNodo(this.temp2.getArbolTickets().getRaiz(), codigo)){
                        multi = 1000000;
                        codigo = 0;
                    }
                }
                if(this.temp2  instanceof Sala2D){
                    aux = new Ticket(codigo, this.temp3, this.temp2, clien, true, false, false, fecha);
                }else if(this.temp2 instanceof Sala3D){
                    aux = new Ticket(codigo, this.temp3, this.temp2, clien, false, true, false, fecha);
                }else{
                    aux = new Ticket(codigo, this.temp3, this.temp2, clien, false, false, true, fecha);
                }
                if(clien != null){
                    clien.agregarTickets(aux);
                }else{
                    this.temp2.agregarTicket(aux);
                }
                aux2--;
            }
            
            int pos = 0;
            NodoSimple n = this.temp.getSalas().getCabeza();
            while(n!=null){
                if(((Sala)n.getDato()).getNumero() == this.temp2.getNumero()){
                    break;
                }
                pos++;
                n = n.getProximo();
            }
            
            if(clien!=null){
                
                MenuInicio.clientes.eliminarNodo(MenuInicio.clientes.getRaiz(),clien.getCi());
                MenuInicio.clientes.agregar(MenuInicio.clientes.getRaiz(),new NodoArbol(clien,clien.getCi()));
                
            }
            
            this.temp.getSalas().eliminarPosicion(pos);
            this.temp.getSalas().insertPrimero(this.temp2);
            MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(), this.temp.getCodigo());
            MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), new NodoArbol(this.temp,this.temp.getCodigo()));
            
            new ManejarElementos();
            this.dispose();
        }
    }//GEN-LAST:event_comprarActionPerformed

    private void campoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoKeyTyped
        char validar = evt.getKeyChar();
        //Validar que la cédula no se pueda ingresar con letras
        if(Character.isLetter(validar)|| Character.isSpaceChar(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! INGRESAR SOLO NÚMEROS");
        }
    }//GEN-LAST:event_campoKeyTyped

        //Despliegue del precio de la orden o compra.
    private void numeroBoletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroBoletosActionPerformed
        double precion;
        precion = this.precio * (this.numeroBoletos.getSelectedIndex()+1);
        this.texto3.setText("Precio: "+precion+" Bs.");
    }//GEN-LAST:event_numeroBoletosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo;
    private javax.swing.JButton comprar;
    private javax.swing.JComboBox<String> fechas;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> numeroBoletos;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JLabel texto7;
    private javax.swing.JLabel texto8;
    private javax.swing.JLabel texto9;
    // End of variables declaration//GEN-END:variables
}
