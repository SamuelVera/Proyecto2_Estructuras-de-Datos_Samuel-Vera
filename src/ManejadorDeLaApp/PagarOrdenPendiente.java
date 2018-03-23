package ManejadorDeLaApp;

import CodigoEstructuras.*;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PagarOrdenPendiente extends javax.swing.JFrame {

    private Cliente temp;
    private Arbol temp2;
    
    public PagarOrdenPendiente(Cliente cliente) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.temp = cliente;
        this.temp2 = this.temp.getArbolTickets();
        this.texto1.setText("CI: "+this.temp.getCi());
        this.texto2.setText(this.temp.getNombre());
        int[] aux = new int[this.temp2.contar(this.temp2.getRaiz())];
        String[] aux2 = new String[aux.length];
        this.filtrarPagos(this.temp2.getRaiz());
        this.temp2.getTodosLosCodigos(this.temp2.getRaiz(), aux);
        for(int i=0;i<aux.length;i++){
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

        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        pagar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        JScrollPane = new javax.swing.JScrollPane();
        ticketsPorPagar = new javax.swing.JList<>();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, 30));

        pagar.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        pagar.setText("Pagar");
        pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarActionPerformed(evt);
            }
        });
        getContentPane().add(pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 80, 20));

        volver.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        volver.setText("Volver");
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 80, 20));

        ticketsPorPagar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JScrollPane.setViewportView(ticketsPorPagar);

        getContentPane().add(JScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 160, 200));
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
            for(int i=0;i<aux.length;i++){
                this.temp.pagar(aux[i]);
            }
            new ManejarClientes();
            this.dispose();
        }
    }//GEN-LAST:event_pagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton pagar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JList<String> ticketsPorPagar;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
