package ManejadorDeLaApp;

import CodigoEstructuras.*;
import java.util.Random;

public class MenuInicio <T> extends javax.swing.JFrame {

    public static Arbol estructura = new Arbol();
    public static MenuInicio exe;
    
    public MenuInicio() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("MetroCine");
        Ticket.setPrecio2D(100);
        Ticket.setPrecio3D(200);
        Ticket.setPrecio4D(400);
        precio2D.setText("Ticket 2D: "+Ticket.getPrecio2D());
        precio3D.setText("Ticket 3D: "+Ticket.getPrecio3D());
        precio4D.setText("Ticket 4DX: "+Ticket.getPrecio4D());
        MenuInicio.estructura.agregar(this, ABORT, 0);
        int dd = 0, ddd = 0, dx = 0;
        Sucursal aux = this.incializarSucursal("Carcas", dd, ddd, dx);
        MenuInicio.estructura.agregar(aux, 0, aux.getCodigo());
        aux = this.incializarSucursal("Maracaibo", dd, ddd, dx);
        MenuInicio.estructura.agregar(aux, 0, aux.getCodigo());
        aux = this.incializarSucursal("Barcelona", dd, ddd, dx);
        MenuInicio.estructura.agregar(aux, 0, aux.getCodigo());
    }

        //Inicializar Sucursal por defecto
    public Sucursal incializarSucursal(String direccion, int dd, int ddd, int dx){
        
        Random rand = new Random();
        
        int codigo = 0, cont = 0;
        
        Sucursal aux = new Sucursal(codigo, direccion);
        
            //Agregar salas por defecto
        while(cont != 5){
            
            int aux2 = rand.nextInt(3);
            
            if(aux2 == 0 && dd!=5){
                cont++;
                aux.agregarSala(new Sala2D(cont,aux));
                dd++;
            }else if(aux2 == 1 && ddd!=5){
                cont++;
                aux.agregarSala(new Sala3D(cont,aux));
                ddd++;
            }else if(aux2 == 2 && dx!=5){
                cont++;
                aux.agregarSala(new Sala4DX(cont,aux));
                dx++;
            }
            
        }
        
        /*NodoSimple<T> temp = aux.getSalas().getCabeza();
        
        while(temp != null){
            
            if(temp.getDato() instanceof Sala2D){
                ((Sala2D)temp.getDato()).agregarPelicula(new Pelicula("","","",5,((Sala2D)temp.getDato())));
            }else if(temp.getDato() instanceof Sala3D){
                ((Sala3D)temp.getDato()).agregarPelicula(new Pelicula("","","",5,((Sala3D)temp.getDato())));
            }else if(temp.getDato() instanceof Sala4DX){
                ((Sala4DX)temp.getDato()).agregarPelicula(new Pelicula("","","",5,((Sala4DX)temp.getDato())));
            }
            
            temp = temp.getProximo();
            
        }*/
        
        return aux;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar = new javax.swing.JButton();
        agregarCliente = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        precio2D = new javax.swing.JLabel();
        precio3D = new javax.swing.JLabel();
        precio4D = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 170, 40));

        agregarCliente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        agregarCliente.setText("Nuevo Cliente");
        getContentPane().add(agregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 170, 40));

        salir.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 20));

        logo.setText("Logo feo que deberias cambiar luego");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        precio2D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 170, 30));

        precio3D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 30));

        precio4D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio4D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 170, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        exe = new MenuInicio();
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCliente;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel precio2D;
    private javax.swing.JLabel precio3D;
    private javax.swing.JLabel precio4D;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
