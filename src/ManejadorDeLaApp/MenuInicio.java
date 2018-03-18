package ManejadorDeLaApp;

import CodigoEstructuras.*;
import java.util.Random;

public class MenuInicio <T> extends javax.swing.JFrame {

    public static Arbol sucursales = new Arbol();
    public static Arbol clientes = new Arbol();
    public static MenuInicio exe;
    
    public MenuInicio(boolean pasa) {

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
        NodoArbol aux2 = new NodoArbol(aux, aux.getCodigo());
        MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), aux2);
        aux = this.incializarSucursal("Maracaibo", dd, ddd, dx);
        aux2 = new NodoArbol(aux, aux.getCodigo());
        MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), aux2);
        aux = this.incializarSucursal("Barcelona", dd, ddd, dx);
        aux2 = new NodoArbol(aux, aux.getCodigo());
        MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), aux2);
        
    }
    
    public MenuInicio(){
        
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
        
    }

        //Inicializar Sucursal por defecto
    public Sucursal incializarSucursal(String direccion, int dd, int ddd, int dx){
    
        Random rand = new Random();
        int cont = 0, codigo = 0, multi = 1000;
        boolean tempo = false;
        do{
            codigo = codigo + multi*(rand.nextInt(9)+1);
            multi = multi/10;
            if(multi == 1){
                if(!MenuInicio.sucursales.estaNodo(MenuInicio.sucursales.getRaiz(), codigo)){
                    tempo = true;
                }else{
                    multi = 1000;
                    codigo = 0;
                }
            }
        }while(tempo == false);
        System.out.println(codigo);
        
        Sucursal aux = new Sucursal(direccion, codigo);
        
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
        
        NodoSimple<T> temp = aux.getSalas().getCabeza();
        
        int i;
        int i1 = 1, i2 = 2, i3 = 2;
        while(temp != null){
            i = rand.nextInt(3);
            if(i == 0 && i1 != 0){
                if(temp.getDato() instanceof Sala2D){
                    ((Sala2D)temp.getDato()).agregarPelicula(new Pelicula("Lista de Schindler","Español","Histórico",((Sala2D)temp.getDato())));
                }else if(temp.getDato() instanceof Sala3D){
                    ((Sala3D)temp.getDato()).agregarPelicula(new Pelicula("Lista de Schindler","Español","Histórico",((Sala3D)temp.getDato())));
                }else if(temp.getDato() instanceof Sala4DX){
                    ((Sala4DX)temp.getDato()).agregarPelicula(new Pelicula("Lista de Schindler","Español","Histórico",((Sala4DX)temp.getDato())));
                }
                i1--;
                temp = temp.getProximo();
            }else if(i == 1 && i2 != 0){
                if(temp.getDato() instanceof Sala2D){
                    ((Sala2D)temp.getDato()).agregarPelicula(new Pelicula("Whiplash","Inglés","Drama",((Sala2D)temp.getDato())));
                }else if(temp.getDato() instanceof Sala3D){
                    ((Sala3D)temp.getDato()).agregarPelicula(new Pelicula("Whiplash","Inglés","Drama",((Sala3D)temp.getDato())));
                }else if(temp.getDato() instanceof Sala4DX){
                    ((Sala4DX)temp.getDato()).agregarPelicula(new Pelicula("Whiplash","Inglés","Drama",((Sala4DX)temp.getDato())));
                }
                i2--;
                temp = temp.getProximo();
            }else if(i==2 && i3!=0){
                if(temp.getDato() instanceof Sala2D){
                    ((Sala2D)temp.getDato()).agregarPelicula(new Pelicula("Dunkerque","Inglés","Guerra",((Sala2D)temp.getDato())));
                }else if(temp.getDato() instanceof Sala3D){
                    ((Sala3D)temp.getDato()).agregarPelicula(new Pelicula("Dunkerque","Inglés","Guerra",((Sala3D)temp.getDato())));
                }else if(temp.getDato() instanceof Sala4DX){
                    ((Sala4DX)temp.getDato()).agregarPelicula(new Pelicula("Dunkerque","Inglés","Guerra",((Sala4DX)temp.getDato())));
                }
                i3--;
                temp = temp.getProximo();
            }
            
        }
        return aux;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        verSucursales = new javax.swing.JButton();
        manejarClientes = new javax.swing.JButton();
        buscarPelicula = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        precio2D = new javax.swing.JLabel();
        precio3D = new javax.swing.JLabel();
        precio4D = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verSucursales.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        verSucursales.setText("Manejar Sucursales");
        verSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSucursalesActionPerformed(evt);
            }
        });
        getContentPane().add(verSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 40));

        manejarClientes.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        manejarClientes.setText("Manejar Clientes");
        manejarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(manejarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 210, 40));

        buscarPelicula.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        buscarPelicula.setText("Buscar Película");
        buscarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(buscarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 40));

        logo.setText("Logo feo que deberias cambiar luego");
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        precio2D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 170, 30));

        precio3D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 170, 30));

        precio4D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio4D, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 170, 30));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSucursalesActionPerformed
        this.dispose();
        new ManejoSucursales();
    }//GEN-LAST:event_verSucursalesActionPerformed

    private void buscarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPeliculaActionPerformed
        this.dispose();
        new BuscarPelicula();
    }//GEN-LAST:event_buscarPeliculaActionPerformed

    private void manejarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejarClientesActionPerformed
        this.dispose();
        new ManejarClientes();
    }//GEN-LAST:event_manejarClientesActionPerformed

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
        
        new MenuInicio(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarPelicula;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JButton manejarClientes;
    private javax.swing.JLabel precio2D;
    private javax.swing.JLabel precio3D;
    private javax.swing.JLabel precio4D;
    private javax.swing.JButton verSucursales;
    // End of variables declaration//GEN-END:variables
}
