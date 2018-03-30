package ManejadorDeLaApp;

import EstructuraDeClases.Ticket;
import EstructuraDeClases.Sala2D;
import EstructuraDeClases.Cliente;
import EstructuraDeClases.Sala;
import EstructuraDeClases.Sala3D;
import CodigoEstructuras.*;
import java.text.SimpleDateFormat;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/*En esta clase se cumple:
-Manejar las ordenenes de los clientes registrados.
-Eliminar tickets de la orden de un cliente.
-Efectuar compra de los tickets de la orden de un cliente.
-Ver historial de compras de un cliente.
*/
public class ManejarOrdenes extends javax.swing.JFrame {

    private Cliente temp;
    private Arbol temp2;
    
        /*Constructor a llamar cuando se va a modificar una orden
        o a comprar tickets.*/
    public ManejarOrdenes(Cliente cliente) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Manejador de Ordenes");
        this.temp = cliente;
        this.temp2 = this.temp.getCarro().getTicketsPorPagar();
        this.texto1.setText("CI: "+this.temp.getCi());
        this.texto2.setText(this.temp.getNombre());
        this.ver.setVisible(false);
        this.inicializarLista();
    }
    
        //Constructor a llamar cuando se va a ver el historial de compras de un cliente.
    public ManejarOrdenes(Cliente cliente, int t){
        this.initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pagar.setVisible(false);
        this.deshacer.setVisible(false);
        this.setTitle("Historial de Compras");
        this.temp = cliente;
        this.temp2 = this.temp.getCarro().getTicketsPagados();
        this.texto1.setText("CI: "+this.temp.getCi());
        this.texto2.setText(this.temp.getNombre());
        this.texto3.setText("Seleccione un Ticket");
        this.inicializarLista();
        this.tickets.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
        //Inicializador de la lista de tickets a desplegar del cliente.
    private void inicializarLista(){
        int[] aux = new int[this.temp2.contar(this.temp2.getRaiz())];
        this.temp2.getTodosLosCodigos(this.temp2.getRaiz(), aux);
        String[] aux2 = new String[aux.length];
        for(int i=0;i<aux2.length;i++){
            aux2[i] = ""+aux[i];
        }
        ComboBoxModel aux3 = new DefaultComboBoxModel(aux2);
        this.tickets.setModel(aux3);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        texto7 = new javax.swing.JLabel();
        texto8 = new javax.swing.JLabel();
        ver = new javax.swing.JButton();
        pagar = new javax.swing.JButton();
        deshacer = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        tickets = new javax.swing.JList<>();
        fondo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 30));

        texto3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        texto3.setText("Seleccione los tickets");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, -1));

        texto4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 20));

        texto5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 20));

        texto6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 190, 20));

        texto7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(texto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, 20));
        getContentPane().add(texto8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, 20));

        ver.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ver.setText("Ver Datos del Ticket");
        ver.setOpaque(false);
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        getContentPane().add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, 20));

        pagar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        pagar.setText("Pagar");
        pagar.setOpaque(false);
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        getContentPane().add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 30));

        deshacer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        deshacer.setText("Devolver Tickets");
        deshacer.setOpaque(false);
        deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshacerActionPerformed(evt);
            }
        });
        getContentPane().add(deshacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 30));

        volver.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        volver.setText("Volver");
        volver.setOpaque(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        tickets.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JScrollPane.setViewportView(tickets);

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 180));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Acción de pagar los tickets seleccionados de la lista.
    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        if(this.tickets.isSelectionEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "NO SE HA SELECCIONADO NINGÚN TICKET","    ¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }else{
            int dialogButton;
            dialogButton = JOptionPane.showConfirmDialog (null, "¿Está seguro que la compra es correcta?","PRECAUCIÓN",JOptionPane.YES_NO_OPTION);
            if(dialogButton == JOptionPane.YES_OPTION){
                double precio = 0;
                int[] aux = new int[this.tickets.getSelectedValuesList().size()];
                Object[] aux2 = this.tickets.getSelectedValuesList().toArray();
                for(int i=0;i<aux.length;i++){
                    aux[i] = Integer.parseInt(aux2[i].toString());
                }
                NodoArbol aux3;
                Sala sala;
                for(int i=0;i<aux.length;i++){
                    aux3 = this.temp.getCarro().getTicketsPorPagar().buscarNodo(this.temp.getCarro().getTicketsPorPagar().getRaiz(), aux[i]);
                    precio = precio+((Ticket)aux3.getDato()).getPrecioTicket();
                    this.temp.hacerCompra(((Ticket)aux3.getDato()).getId());
                    sala = ((Ticket)aux3.getDato()).getSala();
                    sala.agregarTicket((Ticket)aux3.getDato());
                    MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(), sala.getSucursal().getCodigo());
                    MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), new NodoArbol(sala.getSucursal(),sala.getSucursal().getCodigo()));
                }
                this.temp2 = this.temp.getCarro().getTicketsPorPagar();
                MenuInicio.clientes.eliminarNodo(MenuInicio.clientes.getRaiz(), this.temp.getCi());
                MenuInicio.clientes.agregar(MenuInicio.clientes.getRaiz(), new NodoArbol(this.temp,this.temp.getCi()));
                JOptionPane.showMessageDialog(rootPane, "Precio de la compra: "+precio+" Bs.");
                this.inicializarLista();
            }else{
                remove(dialogButton);
            }
        }
    }//GEN-LAST:event_pagarActionPerformed

        //Acción de eliminar los tickets seleccionados de la lista.
    private void deshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshacerActionPerformed
         if(this.tickets.isSelectionEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "NO SE HA SELECCIONADO NINGÚN TICKET","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else{
            int dialogButton;
            dialogButton = JOptionPane.showConfirmDialog (null, "¿Está Seguro?","PRECAUCIÓN",JOptionPane.YES_NO_OPTION);
            if(dialogButton == JOptionPane.YES_OPTION){
                int[] aux = new int[this.tickets.getSelectedValuesList().size()];
                Object[] aux2 = this.tickets.getSelectedValuesList().toArray();
                for(int i=0;i<aux.length;i++){
                    aux[i] = Integer.parseInt(aux2[i].toString());
                }
                for(int i=0;i<aux.length;i++){
                    this.temp.deshacerCompra(aux[i]);
                }
                this.temp2 = this.temp.getCarro().getTicketsPorPagar();
                MenuInicio.clientes.eliminarNodo(MenuInicio.clientes.getRaiz(), this.temp.getCi());
                MenuInicio.clientes.agregar(MenuInicio.clientes.getRaiz(), new NodoArbol(this.temp,this.temp.getCi()));
                this.inicializarLista();
            }else{
                remove(dialogButton);
            }
        }
    }//GEN-LAST:event_deshacerActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new ManejarClientes();//Volver a ventana de ver los clientes
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

        //Ver datos de un ticket ya comprado.
    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        if(this.tickets.getSelectedValue() == null){
            JOptionPane.showMessageDialog(rootPane, "SELECCIONA UN TICKET","   ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else{
            Ticket aux = (Ticket)this.temp2.buscarNodo(this.temp2.getRaiz(), Integer.parseInt(this.tickets.getSelectedValue())).getDato();
            this.texto4.setText("Sucursal: "+aux.getSala().getSucursal().getUbicacion());
            if(aux.getSala() instanceof Sala2D){
                this.texto5.setText("Sala: "+aux.getSala().getNumero()+" (2D)");
            }else if(aux.getSala() instanceof Sala3D){
                this.texto5.setText("Sala: "+aux.getSala().getNumero()+" (3D)");
            }else{
                this.texto5.setText("Sala: "+aux.getSala().getNumero()+" (4DX)");
            }
            this.texto6.setText("Pelicula: "+aux.getNombrePelicula());
            this.texto7.setText("Precio: "+aux.getPrecioTicket()+" Bs.");
            SimpleDateFormat aux2 = new SimpleDateFormat("dd-MM-yyyy");
            this.texto8.setText(aux2.format(aux.getFecha()));
        }
    }//GEN-LAST:event_verActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton deshacer;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton pagar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JLabel texto7;
    private javax.swing.JLabel texto8;
    private javax.swing.JList<String> tickets;
    private javax.swing.JButton ver;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
