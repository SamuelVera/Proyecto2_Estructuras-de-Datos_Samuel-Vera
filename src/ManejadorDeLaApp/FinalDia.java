package ManejadorDeLaApp;

import EstructuraDeClases.Sucursal;
import EstructuraDeClases.Ticket;
import EstructuraDeClases.Sala2D;
import EstructuraDeClases.Cliente;
import EstructuraDeClases.Sala4DX;
import EstructuraDeClases.Sala;
import EstructuraDeClases.Sala3D;
import CodigoEstructuras.*;
import java.text.SimpleDateFormat;

/*En esta clase se pone la información del día como
-Sala más concurrida y su información.
-Ganancias del día en ventas de tickets.
-Avanzar al siguiente día correspondiente en la simulación.
*/
public class FinalDia extends javax.swing.JFrame {

    private ListaSimple salas = new ListaSimple();
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
        //Constructor desde el cual se inicializan los elementos gráficos de la ventana
    public FinalDia() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Reporte del día");
        this.obtenerTodasLasSalas(MenuInicio.sucursales.getRaiz());
        Sala aux = this.salasMasConcurrida();
        this.texto2.setText("Reporte día: "+df.format(MenuInicio.fecha));
        this.salaMayorSucursal.setText("Sucursal: "+aux.getSucursal().getUbicacion()+"  Número: "+aux.getNumero());
        if(aux instanceof Sala2D){
            this.salaMayorTipo.setText("Sala 2D");
            this.salaMayorGanancia.setText("Ganancia generada: "+((Sala2D)aux).ventasDia(aux.getArbolTickets().getRaiz())+" Bs.");
        }else if(aux instanceof Sala3D){
            this.salaMayorTipo.setText("Sala 3D");
            this.salaMayorGanancia.setText("Ganancia generada: "+((Sala3D)aux).ventasDia(aux.getArbolTickets().getRaiz())+" Bs.");
        }else{
            this.salaMayorTipo.setText("Sala 4DX");
            this.salaMayorGanancia.setText("Ganancia generada: "+((Sala4DX)aux).ventasDia(aux.getArbolTickets().getRaiz())+" Bs.");
        }
        this.salaMayorTicketsVendidos.setText("Tickets Vendidos: "+aux.visitasDia(aux.getArbolTickets().getRaiz()));
        this.gananciaDia.setText("Ganancia del Dia "+this.gananciaTotal(MenuInicio.sucursales.getRaiz())+" Bs.");
        this.buscarTickets(MenuInicio.clientes.getRaiz());
    }

        /*Método que se emplea de manera auxiliar para colocar todas las salas
        de las diferentes sucursales en una lista*/
    private void obtenerTodasLasSalas(NodoArbol n){
        if(n!=null){
            NodoSimple n2 = ((Sucursal)n.getDato()).getSalas().getCabeza();
            while(n2!=null){
                this.salas.insertarUltimo((Sala)n2.getDato());
                n2 = n2.getProximo();
            }
            this.obtenerTodasLasSalas(n.getHijoD());
            this.obtenerTodasLasSalas(n.getHijoI());
        }
    }
    
        /*Con la lista de todas las salas se busca cual tiene
        mayor cantidad de tickets vendidos para el día presente en la
        simulación*/
    private Sala salasMasConcurrida(){
        Sala aux = null, temp;
        int aux2 = 0;
        NodoSimple n = this.salas.getCabeza();
        while(n!=null){
            temp = (Sala)n.getDato();
            if(temp.visitasDia(temp.getArbolTickets().getRaiz()) >= aux2){
                aux2 = temp.visitasDia(temp.getArbolTickets().getRaiz());
                aux = temp;
            }
            n = n.getProximo();
        }
        return aux;
    }
    
        //Cálculo de la ganancia total de la sala más concurrida
    private double gananciaTotal(NodoArbol n){
        if(n!=null){
            return ((Sucursal)n.getDato()).gananciaDia() + this.gananciaTotal(n.getHijoD()) + this.gananciaTotal(n.getHijoI());
        }
        return 0;
    }
    
        /*Método que se emplea para eliminar los tickets de los clientes que tengan
        fecha del día presente de la simulación que no hayan sido pagados*/
    private void buscarTickets(NodoArbol n){
        if(n!=null){
            this.eliminarTicketsNoPagos(((Cliente)n.getDato()).getCarro().getTicketsPorPagar().getRaiz(), (Cliente)n.getDato());
            this.buscarTickets(n.getHijoD());
            this.buscarTickets(n.getHijoI());
        }
    }
    
        /*Método que se emplea para eliminar los tickets de los clientes que tengan
        fecha del día presente de la simulación que no hayan sido pagados*/
    private void eliminarTicketsNoPagos(NodoArbol n, Cliente c){
        if(n!=null){
            Ticket aux = (Ticket)n.getDato();
            if(this.df.format(aux.getFecha()).equals(this.df.format(MenuInicio.fecha))){
                c.getCarro().getTicketsPorPagar().eliminarNodo(c.getCarro().getTicketsPorPagar().getRaiz(), aux.getId());
            }
            this.eliminarTicketsNoPagos(n.getHijoD(),c);
            this.eliminarTicketsNoPagos(n.getHijoI(),c);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        salaMayorTicketsVendidos = new javax.swing.JLabel();
        gananciaDia = new javax.swing.JLabel();
        salaMayorSucursal = new javax.swing.JLabel();
        salaMayorTipo = new javax.swing.JLabel();
        salaMayorGanancia = new javax.swing.JLabel();
        continuar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto1.setText("Sala más concurrida");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

        salaMayorTicketsVendidos.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(salaMayorTicketsVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 30));

        gananciaDia.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(gananciaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 380, 30));

        salaMayorSucursal.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(salaMayorSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 30));

        salaMayorTipo.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(salaMayorTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 30));

        salaMayorGanancia.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(salaMayorGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 400, 30));

        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        getContentPane().add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        MenuInicio.fecha.setDate(MenuInicio.fecha.getDate()+1); //Avanzar un día
        new MenuInicio(); //Volver al menu de inicio
        this.dispose();
    }//GEN-LAST:event_continuarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel gananciaDia;
    private javax.swing.JLabel salaMayorGanancia;
    private javax.swing.JLabel salaMayorSucursal;
    private javax.swing.JLabel salaMayorTicketsVendidos;
    private javax.swing.JLabel salaMayorTipo;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    // End of variables declaration//GEN-END:variables
}
