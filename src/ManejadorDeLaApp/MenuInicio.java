/*
*   Universidad Metropolitana
*   Estructuras de Datos
*   Proyecto 2
*   Samuel Vera
*   Carnet: 20171110080
*/

package ManejadorDeLaApp;

import EstructuraDeClases.Sucursal;
import EstructuraDeClases.Ticket;
import EstructuraDeClases.Sala2D;
import EstructuraDeClases.Sala4DX;
import EstructuraDeClases.Pelicula;
import EstructuraDeClases.Sala;
import EstructuraDeClases.Sala3D;
import CodigoEstructuras.*;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Date;

/*
*   Clase main donde comienza la ejecución
*   
*   Además desde esta clase se manejan en un contexto estático
*   a lo árboles que funcionan como principal estructura del programa y 
*   la fecha de la simulación.
*/

public class MenuInicio <T> extends javax.swing.JFrame {
    
    public static Arbol sucursales = new Arbol();
    public static Arbol clientes = new Arbol();
    public static MenuInicio exe;
    public static Date fecha = new Date(); //La fecha comienza desde como la del sistema(computador).
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
        //Constructor a llamar al comienzo de la ejecución
    public MenuInicio(boolean pasa) {
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("MetroCine");
        Ticket.setPrecio2D(100);
        Ticket.setPrecio3D(200);
        Ticket.setPrecio4D(400);
        this.precio2D.setText("Ticket 2D: "+Ticket.getPrecio2D());
        this.precio3D.setText("Ticket 3D: "+Ticket.getPrecio3D());
        this.precio4D.setText("Ticket 4DX: "+Ticket.getPrecio4D());
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
        this.dia.setText(this.df.format(MenuInicio.fecha));
    }
    
        /*Contructor a llamar para las demás interacciones de la ventana con otra
        para no alterar los valores de los arboles de datos*/
    public MenuInicio(){
        
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("MetroCine");
        this.precio2D.setText("Ticket 2D: "+Ticket.getPrecio2D());
        this.precio3D.setText("Ticket 3D: "+Ticket.getPrecio3D());
        this.precio4D.setText("Ticket 4DX: "+Ticket.getPrecio4D());
        this.dia.setText(this.df.format(MenuInicio.fecha));
        
    }

        //Método para inicializar las sucursales por defecto
    public Sucursal incializarSucursal(String direccion, int dd, int ddd, int dx){
    
        Random rand = new Random();
        int cont = 0, codigo = 0, multi = 10000;
        
        while(multi!=1){
            multi = multi/10;
            codigo = codigo + multi*(rand.nextInt(9)+1);
            if(multi == 1 && MenuInicio.sucursales.estaNodo(MenuInicio.sucursales.getRaiz(), codigo)){
                multi = 1000;
                codigo = 0;
            }
        }
        
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
        
            //Agregar películas por defecto
        int i;
        int i1 = 1, i2 = 1, i3 = 1, i4 = 1, i5 = 1;
        while(temp != null){
            i = rand.nextInt(5);
            if(i == 0 && i1 != 0){
                ((Sala)temp.getDato()).agregarPelicula(new Pelicula("Lista de Schindler", "Español", "Histórico", (Sala)temp.getDato()));
                i1--;
                temp = temp.getProximo();
            }else if(i == 1 && i2 != 0){
                ((Sala)temp.getDato()).agregarPelicula(new Pelicula("Whiplash", "Inglés", "Drama", (Sala)temp.getDato()));
                i2--;
                temp = temp.getProximo();
            }else if(i==2 && i3!=0){
                ((Sala)temp.getDato()).agregarPelicula(new Pelicula("Dunkerque", "Inglés", "Guerra", (Sala)temp.getDato()));
                i3--;
                temp = temp.getProximo();
            }else if(i==3 && i4!=0){
                ((Sala)temp.getDato()).agregarPelicula(new Pelicula("Después de la Guerra", "Francés", "Drama", (Sala)temp.getDato()));
                i4--;
                temp = temp.getProximo();
            }else if(i==4 && i5!=0){
                ((Sala)temp.getDato()).agregarPelicula(new Pelicula("Regresión", "Español", "Thriller", (Sala)temp.getDato()));
                i5--;
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
        cambiarPrecio = new javax.swing.JButton();
        precio2D = new javax.swing.JLabel();
        precio3D = new javax.swing.JLabel();
        precio4D = new javax.swing.JLabel();
        avanzarDia = new javax.swing.JButton();
        dia = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verSucursales.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        verSucursales.setText("Manejar Sucursales");
        verSucursales.setOpaque(false);
        verSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verSucursalesActionPerformed(evt);
            }
        });
        getContentPane().add(verSucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 30));

        manejarClientes.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        manejarClientes.setText("Manejar Clientes");
        manejarClientes.setOpaque(false);
        manejarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(manejarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 30));

        buscarPelicula.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        buscarPelicula.setText("Buscar Película");
        buscarPelicula.setOpaque(false);
        buscarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(buscarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 30));

        cambiarPrecio.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        cambiarPrecio.setText("Cambiar Precios");
        cambiarPrecio.setOpaque(false);
        cambiarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(cambiarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 30));

        precio2D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 170, 30));

        precio3D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio3D, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, 30));

        precio4D.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        getContentPane().add(precio4D, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 170, 30));

        avanzarDia.setText("+1 Día");
        avanzarDia.setOpaque(false);
        avanzarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avanzarDiaActionPerformed(evt);
            }
        });
        getContentPane().add(avanzarDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 20));

        dia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 130, 20));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verSucursalesActionPerformed
        this.dispose();
        new ManejarElementos();//Ir a la ventana de ver sucursales, salas, películas, etc.
    }//GEN-LAST:event_verSucursalesActionPerformed

    private void buscarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPeliculaActionPerformed
        this.dispose();
        new BuscarPelicula();//Ir a ventana de buscar películas.
    }//GEN-LAST:event_buscarPeliculaActionPerformed

    private void manejarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manejarClientesActionPerformed
        this.dispose();
        new ManejarClientes();//Ir a ventana para manejar datos de los clientes.
    }//GEN-LAST:event_manejarClientesActionPerformed

    private void cambiarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarPrecioActionPerformed
        this.dispose();
        new Editar(true);//Ir a ventana para cambiar precios de los tickets.
    }//GEN-LAST:event_cambiarPrecioActionPerformed

    private void avanzarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avanzarDiaActionPerformed
        this.dispose();
        new FinalDia();//Avanzar un día en la simulación.
    }//GEN-LAST:event_avanzarDiaActionPerformed
    
    /**
     * @param args
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
    private javax.swing.JButton avanzarDia;
    private javax.swing.JButton buscarPelicula;
    private javax.swing.JButton cambiarPrecio;
    private javax.swing.JLabel dia;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo;
    private javax.swing.JButton manejarClientes;
    private javax.swing.JLabel precio2D;
    private javax.swing.JLabel precio3D;
    private javax.swing.JLabel precio4D;
    private javax.swing.JButton verSucursales;
    // End of variables declaration//GEN-END:variables
}
