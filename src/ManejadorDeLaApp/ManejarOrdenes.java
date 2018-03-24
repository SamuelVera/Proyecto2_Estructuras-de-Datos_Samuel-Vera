package ManejadorDeLaApp;

import CodigoEstructuras.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ManejarOrdenes extends javax.swing.JFrame {

    private Cliente temp;
    private Arbol temp2;
    
    public ManejarOrdenes(Cliente cliente) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Manejador de Ordenes");
        this.temp = cliente;
        this.temp2 = this.temp.getCarro().getTicketsPorPagar();
        this.filtrarPagos(this.temp2.getRaiz());
        this.texto1.setText("CI: "+this.temp.getCi());
        this.texto2.setText(this.temp.getNombre());
        int[] aux = new int[this.temp2.contar(this.temp2.getRaiz())];
        this.temp2.getTodosLosCodigos(this.temp2.getRaiz(), aux);
        String[] aux2 = new String[aux.length];
        for(int i=0;i<aux2.length;i++){
            aux2[i] = ""+aux[i];
        }
        ComboBoxModel aux3 = new DefaultComboBoxModel(aux2);
        this.ticketsPorPagar.setModel(aux3);
    }
    
    public ManejarOrdenes(Cliente cliente, int j){
        this.initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.pagar.setVisible(false);
        this.deshacer.setVisible(false);
        this.setTitle("Manejador de Ordenes");
        this.temp = cliente;
        this.temp2 = this.temp.getCarro().getTicketsPagados();
        this.texto1.setText("CI: "+this.temp.getCi());
        this.texto2.setText(this.temp.getNombre());
        int[] aux = new int[this.temp2.contar(this.temp2.getRaiz())];
        this.temp2.getTodosLosCodigos(this.temp2.getRaiz(), aux);
        String[] aux2 = new String[aux.length];
        for(int i=0;i<aux2.length;i++){
            aux2[i] = ""+aux[i];
        }
        ComboBoxModel aux3 = new DefaultComboBoxModel(aux2);
        this.ticketsPorPagar.setModel(aux3);
    }

    private void filtrarPagos(NodoArbol n){
        if(n!=null){
            if(((Ticket)n.getDato()).isPagado()){
                this.temp2.eliminarNodo(this.temp2.getRaiz(), n.getCodigo());
            }
            filtrarPagos(n.getHijoI());
            filtrarPagos(n.getHijoD());
        }
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
        ver = new javax.swing.JButton();
        pagar = new javax.swing.JButton();
        deshacer = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        ticketsPorPagar = new javax.swing.JList<>();
        fondo = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 30));

        texto3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        texto3.setText("Seleccione los tickets");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, -1));

        texto4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 20));

        texto5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, 20));

        texto6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 20));

        texto7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(texto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 20));

        ver.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ver.setText("Ver Datos del Ticket");
        getContentPane().add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, 20));

        pagar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        pagar.setText("Pagar");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        getContentPane().add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 20));

        deshacer.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        deshacer.setText("Devolver Tickets");
        deshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshacerActionPerformed(evt);
            }
        });
        getContentPane().add(deshacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 20));

        volver.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 20));

        ticketsPorPagar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JScrollPane.setViewportView(ticketsPorPagar);

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 180));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarActionPerformed
        if(this.ticketsPorPagar.isSelectionEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! NO SE HA SELECCIONADO NINGÚN TICKET");
        }else{
            int[] aux = new int[this.ticketsPorPagar.getSelectedValuesList().size()];
            Object[] aux2 = this.ticketsPorPagar.getSelectedValuesList().toArray();
            for(int i=0;i<aux.length;i++){
                aux[i] = Integer.parseInt(aux2[i].toString());
            }
            NodoArbol aux3;
            Sala sala;
            for(int i=0;i<aux.length;i++){
                aux3 = this.temp.getCarro().getTicketsPorPagar().buscarNodo(this.temp.getCarro().getTicketsPorPagar().getRaiz(), aux[i]);
                this.temp.getCarro().getTicketsPorPagar().eliminarNodo(this.temp.getCarro().getTicketsPorPagar().getRaiz(), aux3.getCodigo());
                ((Ticket)aux3.getDato()).setPagado(true);
                this.temp.getCarro().getTicketsPagados().agregar(this.temp.getCarro().getTicketsPagados().getRaiz(), new NodoArbol(((Ticket)aux3.getDato()),((Ticket)aux3.getDato()).getId()));
                sala = ((Ticket)aux3.getDato()).getSala();
                sala.agregarTicket((Ticket)aux3.getDato());
                MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(), sala.getSucursal().getCodigo());
                MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), new NodoArbol(sala.getSucursal(),sala.getSucursal().getCodigo()));
            }
            MenuInicio.clientes.eliminarNodo(MenuInicio.clientes.getRaiz(), this.temp.getCi());
            MenuInicio.clientes.agregar(MenuInicio.clientes.getRaiz(), new NodoArbol(this.temp,this.temp.getCi()));
            new ManejarClientes();
            this.dispose();
        }
    }//GEN-LAST:event_pagarActionPerformed

    private void deshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshacerActionPerformed
         if(this.ticketsPorPagar.isSelectionEmpty()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! NO SE HA SELECCIONADO NINGÚN TICKET");
        }else{
            int[] aux = new int[this.ticketsPorPagar.getSelectedValuesList().size()];
            Object[] aux2 = this.ticketsPorPagar.getSelectedValuesList().toArray();
            for(int i=0;i<aux.length;i++){
                aux[i] = Integer.parseInt(aux2[i].toString());
            }
            for(int i=0;i<aux.length;i++){
                this.temp.getCarro().getTicketsPorPagar().eliminarNodo(this.temp.getCarro().getTicketsPorPagar().getRaiz(), aux[i]);
            }
            MenuInicio.clientes.eliminarNodo(MenuInicio.clientes.getRaiz(), this.temp.getCi());
            MenuInicio.clientes.agregar(MenuInicio.clientes.getRaiz(), new NodoArbol(this.temp,this.temp.getCi()));
            new ManejarClientes();
            this.dispose();
        }
    }//GEN-LAST:event_deshacerActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new ManejarClientes();
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

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
    private javax.swing.JList<String> ticketsPorPagar;
    private javax.swing.JButton ver;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
