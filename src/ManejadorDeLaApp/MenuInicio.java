package ManejadorDeLaApp;

import CodigoEstructuras.*;
import java.util.Random;

public class MenuInicio <T> extends javax.swing.JFrame {

    protected static MenuInicio exe;
    public static ListaSimple sucursales = new ListaSimple();
    
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
        
        int dd = 0, ddd = 0, dx = 0;
        
        Sucursal aux = this.incializarSucursal("Caracas", dd, ddd, dx);
        MenuInicio.sucursales.insertPrimero(aux);
        aux = this.incializarSucursal("Maracaibo", dd, ddd, dx);
        MenuInicio.sucursales.insertPrimero(aux);
        aux = this.incializarSucursal("Barcelona", dd, ddd, dx);
        MenuInicio.sucursales.insertPrimero(aux);
        
    }

        //Inicializar Sucursal por defecto
    public Sucursal incializarSucursal(String direccion, int dd, int ddd, int dx){
    
        Random rand = new Random();
    
        int cont = 0;
        
        Sucursal aux = new Sucursal(direccion);
        
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

        verSucursales = new javax.swing.JButton();
        agregarCliente = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        buscarPelicula = new javax.swing.JButton();
        buscarCliente = new javax.swing.JButton();
        agregarSala = new javax.swing.JButton();
        agregarPelicula = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        precio2D = new javax.swing.JLabel();
        precio3D = new javax.swing.JLabel();
        precio4D = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verSucursales.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        verSucursales.setText("Ver Sucursales");
        verSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSucursalesActionPerformed(evt);
            }
        });
        getContentPane().add(verSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 40));

        agregarCliente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        agregarCliente.setText("Nuevo Cliente");
        getContentPane().add(agregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 180, 40));

        salir.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 20));

        buscarPelicula.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        buscarPelicula.setText("Buscar Película");
        getContentPane().add(buscarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 40));

        buscarCliente.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        buscarCliente.setText("Buscar Cliente");
        getContentPane().add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 40));

        agregarSala.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        agregarSala.setText("Agregar Sala");
        getContentPane().add(agregarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 180, 40));

        agregarPelicula.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        agregarPelicula.setText("Agregar Película");
        getContentPane().add(agregarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 180, 40));

        logo.setText("Logo feo que deberias cambiar luego");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        precio2D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 170, 30));

        precio3D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 30));

        precio4D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio4D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSucursalesActionPerformed
        
        VerSucursalInfo aux = new VerSucursalInfo();
        
    }//GEN-LAST:event_verSucursalesActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        
        System.exit(0);
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        MenuInicio.exe = new MenuInicio();
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarCliente;
    private javax.swing.JButton agregarPelicula;
    private javax.swing.JButton agregarSala;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JButton buscarPelicula;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel precio2D;
    private javax.swing.JLabel precio3D;
    private javax.swing.JLabel precio4D;
    private javax.swing.JButton salir;
    private javax.swing.JButton verSucursales;
    // End of variables declaration//GEN-END:variables
}
