package ManejadorDeLaApp;

import EstructuraDeClases.Sucursal;
import EstructuraDeClases.Ticket;
import EstructuraDeClases.Sala2D;
import EstructuraDeClases.Cliente;
import EstructuraDeClases.Sala4DX;
import EstructuraDeClases.Pelicula;
import EstructuraDeClases.Sala;
import EstructuraDeClases.Sala3D;
import CodigoEstructuras.*;
import javax.swing.*;

/*Esta clase cumple con las siguientes acciones:
-Buscar sucursales.
-Buscar salas de las sucursales.
-Acceder a la edición y adición de salas, sucursales y películas.
-Ver cola de películas de una sala.
-Acceder a la ventana de comprar un ticket.
-Eliminar la primera película en cola(En emisión) de una sala.
*/

public class ManejarElementos extends javax.swing.JFrame {

    private Sucursal temp;
    private Sala temp2;
    private Pelicula temp3;
    
        //Constructor para inicializar los elementos básicos de la ventana
    public ManejarElementos() {
        initComponents();
        
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Información de Sucursales");
        this.agregarSala.setVisible(false);
        this.verPeliculas.setVisible(false);
        this.editar.setVisible(false);
        this.editarSala.setVisible(false);
        this.peliculas.setVisible(false);
        this.agregarPelicula.setVisible(false);
        this.eliminarPelicula.setVisible(false);
        this.comprarPelicula.setVisible(false);
        
        String[] aux = new String[MenuInicio.sucursales.contar(MenuInicio.sucursales.getRaiz())];;
        int[] sucur = new int[MenuInicio.sucursales.contar(MenuInicio.sucursales.getRaiz())];
        MenuInicio.sucursales.getTodosLosCodigos(MenuInicio.sucursales.getRaiz(), sucur);
        
        for(int i=0;i<aux.length;i++){
            aux[i] = ""+sucur[i];
        }
        
        ComboBoxModel aux2 = new DefaultComboBoxModel(aux);
        
        this.sucursales.setModel(aux2);
        this.salas.setVisible(false);
        this.texto5.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto3 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto1 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        texto6 = new javax.swing.JLabel();
        texto7 = new javax.swing.JLabel();
        peliculas = new javax.swing.JComboBox<>();
        salas = new javax.swing.JComboBox<>();
        sucursales = new javax.swing.JComboBox<>();
        volver = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        agregarSucursal = new javax.swing.JButton();
        agregarSala = new javax.swing.JButton();
        editarSala = new javax.swing.JButton();
        verPeliculas = new javax.swing.JButton();
        agregarPelicula = new javax.swing.JButton();
        eliminarPelicula = new javax.swing.JButton();
        comprarPelicula = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 210, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto1.setText("Sucursales:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        texto4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, 30));

        texto5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto5.setText("Peliculas:");
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 30));

        texto6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(texto6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 380, 30));

        texto7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(texto7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, 20));

        peliculas.setMaximumRowCount(20);
        peliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peliculasActionPerformed(evt);
            }
        });
        getContentPane().add(peliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 250, 30));

        salas.setMaximumRowCount(20);
        salas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salasActionPerformed(evt);
            }
        });
        getContentPane().add(salas, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 250, 30));

        sucursales.setMaximumRowCount(20);
        sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalesActionPerformed(evt);
            }
        });
        getContentPane().add(sucursales, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 250, 30));

        volver.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        volver.setText("Volver");
        volver.setOpaque(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, 20));

        editar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        editar.setText("Editar");
        editar.setOpaque(false);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 70, 20));

        agregarSucursal.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        agregarSucursal.setText("Añadir Sucursal");
        agregarSucursal.setOpaque(false);
        agregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarSucursalActionPerformed(evt);
            }
        });
        getContentPane().add(agregarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 130, 20));

        agregarSala.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        agregarSala.setText("Añadir Sala");
        agregarSala.setOpaque(false);
        agregarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarSalaActionPerformed(evt);
            }
        });
        getContentPane().add(agregarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 20));

        editarSala.setFont(new java.awt.Font("Verdana", 0, 11));
        editarSala.setText("Editar Sala");
        editarSala.setOpaque(false);
        editarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarSalaActionPerformed(evt);
            }
        });
        getContentPane().add(editarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 90, 20));

        verPeliculas.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        verPeliculas.setText("Ver Películas");
        verPeliculas.setOpaque(false);
        verPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPeliculasActionPerformed(evt);
            }
        });
        getContentPane().add(verPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 20));

        agregarPelicula.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        agregarPelicula.setText("Agregar Película");
        agregarPelicula.setOpaque(false);
        agregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, 20));

        eliminarPelicula.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        eliminarPelicula.setText("Eliminar Primera");
        eliminarPelicula.setOpaque(false);
        eliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 130, 20));

        comprarPelicula.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        comprarPelicula.setText("ComprarTicket");
        comprarPelicula.setOpaque(false);
        comprarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(comprarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        /*Despliegue de la información de la sucursal selecionada, botones de
        editar la sucursal y agregar sala, y la lista de las salas pertenecientes 
        a la sucursal.*/
    private void sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalesActionPerformed
        NodoArbol auxi;
        this.texto2.setText("Salas:");
        auxi = MenuInicio.sucursales.buscarNodo(MenuInicio.sucursales.getRaiz(), Integer.parseInt(this.sucursales.getSelectedItem().toString()));
        temp = (Sucursal)auxi.getDato();
        String[] aux3 = new String[temp.getSalas().contarElementos()];
        int i=0;

        if(temp != null){
            this.texto3.setText("Ubicación: "+temp.getUbicacion());
            NodoSimple aux2 = temp.getSalas().getCabeza();

            while(aux2 != null){
                aux3[i] = ((Integer)((Sala)aux2.getDato()).getNumero()).toString();
                i++;
                aux2 = aux2.getProximo();
            }
        }

        ComboBoxModel aux2 = new DefaultComboBoxModel(aux3);
        this.salas.setModel(aux2);
        
        this.salas.setVisible(true);
        this.agregarSucursal.setVisible(true);
        this.agregarSala.setVisible(true);
        this.editar.setVisible(true);
        this.editarSala.setVisible(false);
        this.verPeliculas.setVisible(false);
        this.peliculas.setVisible(false);
        this.texto5.setVisible(false);
        this.agregarPelicula.setVisible(false);
        this.eliminarPelicula.setVisible(false);
        this.comprarPelicula.setVisible(false);
        this.texto6.setVisible(false);
        this.texto4.setText("");
        this.texto7.setText("");
    }//GEN-LAST:event_sucursalesActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new MenuInicio(); //Volver al menú de inicio
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

        /*Despliegue de la información de la sala selecionada; botones de editar
        sala, agregar película y ver cola de películas; además que al pulsar el
        último se despliega la cola de películas de la sala. */
    private void salasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salasActionPerformed
        
        int aux2 = Integer.parseInt(this.salas.getSelectedItem().toString());
        NodoSimple aux3 = this.temp.getSalas().getCabeza();
        while(aux3 != null){
            if(aux3.getDato() instanceof Sala2D){
                if(((Sala2D)aux3.getDato()).getNumero() == aux2){
                    this.texto4.setText("Tipo: 2D");
                    this.temp2 = ((Sala2D)aux3.getDato());
                }
            }else if(aux3.getDato() instanceof Sala3D){
                if(((Sala3D)aux3.getDato()).getNumero() == aux2){
                    this.texto4.setText("Tipo: 3D");
                    this.temp2 = ((Sala3D)aux3.getDato());
                }
            }else{
                if(((Sala4DX)aux3.getDato()).getNumero() == aux2){
                    this.texto4.setText("Tipo: 4DX");
                    this.temp2 = ((Sala4DX)aux3.getDato());
                }
            }
            aux3 = aux3.getProximo();
        }
        this.peliculas.setVisible(false);
        this.texto5.setVisible(false);
        this.texto6.setVisible(false);
        this.agregarPelicula.setVisible(false);
        this.comprarPelicula.setVisible(false);
        this.eliminarPelicula.setVisible(false);
        this.editarSala.setVisible(true);
        this.verPeliculas.setVisible(true);
        this.texto7.setText("");
    }//GEN-LAST:event_salasActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        new Editar(this.temp);
        this.dispose();
    }//GEN-LAST:event_editarActionPerformed

    private void agregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarSucursalActionPerformed
        new Editar();
        this.dispose();
    }//GEN-LAST:event_agregarSucursalActionPerformed

    private void agregarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarSalaActionPerformed
        new Editar(false, null, this.temp);
        this.dispose();
    }//GEN-LAST:event_agregarSalaActionPerformed

    private void editarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarSalaActionPerformed
        new Editar(true,this.temp2,this.temp);
        this.dispose();
    }//GEN-LAST:event_editarSalaActionPerformed

        /*Despliegue de la cola de películas de la sala selecionada, 
        la película en emisión, y los botones de eliminar primera en cola
        y comprar tickets.*/
    private void verPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPeliculasActionPerformed
        ListaSimple aux4 = new ListaSimple();
        
        if(this.temp2.getPelicula() != null){
            this.texto6.setText("Película en emisión: "+(this.temp2.getPelicula().getNombre()));
        }else{
            this.texto6.setText("No hay película en emisión");
        }
        this.temp3 = this.temp2.getPelicula();
        while(this.temp2.getColaPeliculas().getPrimeroEnCola() != null){
            aux4.insertarUltimo(this.temp2.getColaPeliculas().desencolar());
        }
        
        String[] aux3 = new String[aux4.contarElementos()];
        for(int i=0;i<aux3.length && !aux4.isVacio();i++){
            aux3[i] = ((Pelicula)aux4.getCabeza().getDato()).getNombre();
            this.temp2.getColaPeliculas().encolar((Pelicula)aux4.eliminarPrimero());
        }
        
        ComboBoxModel aux2 = new DefaultComboBoxModel(aux3);
        this.peliculas.setModel(aux2);
        this.peliculas.setVisible(true);
        this.texto5.setVisible(true);
        this.texto6.setVisible(true);
        this.agregarPelicula.setVisible(true);
        this.eliminarPelicula.setVisible(true);
    }//GEN-LAST:event_verPeliculasActionPerformed

    private void peliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peliculasActionPerformed
        if(this.peliculas.getSelectedItem().toString() == this.temp2.getPelicula().getNombre()){
            this.comprarPelicula.setVisible(true);
            this.texto7.setText("(En emisión)");
        }else{
            this.comprarPelicula.setVisible(false);
            this.texto7.setText("(No en emisión)");
        }
        
        this.eliminarPelicula.setVisible(true);
    }//GEN-LAST:event_peliculasActionPerformed

    private void agregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPeliculaActionPerformed
        new AgregarPelicula(this.temp2);
        this.dispose();
    }//GEN-LAST:event_agregarPeliculaActionPerformed
        
    private void comprarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarPeliculaActionPerformed
        new VentanaDeComprar(this.temp3);
        this.dispose();
    }//GEN-LAST:event_comprarPeliculaActionPerformed

        //Acción al pulsar botón de eliminar una película
    private void eliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPeliculaActionPerformed
        if(this.temp2.getPelicula() == null){
            JOptionPane.showMessageDialog(rootPane, "NO HAY PELÍCULAS EN COLA","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else{
            this.temp2.getColaPeliculas().desencolar();
            NodoSimple n = this.temp.getSalas().getCabeza();
            int i = 0;
            while(n!=null){
                if(((Sala)n.getDato()).getNumero() == this.temp2.getNumero()){
                    i++;
                    break;
                }
                n = n.getProximo();
            }
            this.temp.getSalas().eliminarPosicion(i);
            if(this.temp2 instanceof Sala2D){
                this.temp.agregarSala((Sala2D)this.temp2);
            }else if(this.temp2 instanceof Sala3D){
                this.temp.agregarSala((Sala3D)this.temp2);
            }else{
                this.temp.agregarSala((Sala4DX)this.temp2);
            }
            
            ListaSimple aux4 = new ListaSimple();
            this.temp3 = this.temp2.getPelicula();
            while(this.temp2.getColaPeliculas().getPrimeroEnCola() != null){
                aux4.insertarUltimo(this.temp2.getColaPeliculas().desencolar());
            }
        
            String[] aux3 = new String[aux4.contarElementos()];
            for(i=0;i<aux3.length && !aux4.isVacio();i++){
                aux3[i] = ((Pelicula)aux4.getCabeza().getDato()).getNombre();
                this.temp2.getColaPeliculas().encolar((Pelicula)aux4.eliminarPrimero());
            }
        
            ComboBoxModel aux2 = new DefaultComboBoxModel(aux3);
            this.peliculas.setModel(aux2);
            if(this.temp2.getPelicula() != null){
                this.texto6.setText("Película en emisión: "+this.temp2.getPelicula().getNombre());
            }
            this.eliminarPelicula(MenuInicio.clientes.getRaiz());
        }
    }//GEN-LAST:event_eliminarPeliculaActionPerformed

    private void eliminarPelicula(NodoArbol n){
        if(n!=null){
            Cliente clien = (Cliente)n.getDato();
            this.eliminarTicket(clien.getCarro().getTicketsPorPagar().getRaiz(),clien.getCarro().getTicketsPorPagar());
            MenuInicio.clientes.eliminarNodo(MenuInicio.clientes.getRaiz(), clien.getCi());
            MenuInicio.clientes.agregar(MenuInicio.clientes.getRaiz(), new NodoArbol(clien,clien.getCi()));
            this.eliminarPelicula(n.getHijoD());
            this.eliminarPelicula(n.getHijoI());
        }
    }
    
        //Método para eliminar Tickets de las películas que se dejan de ofertar
    private void eliminarTicket(NodoArbol n, Arbol a){
        if(n!=null){
            if(((Ticket)n.getDato()).getSala().getNumero() == this.temp2.getNumero() && ((Ticket)n.getDato()).getSala().getSucursal().getCodigo() == this.temp.getCodigo()){
                a.eliminarNodo(a.getRaiz(), n.getCodigo());
                this.eliminarTicket(n.getHijoD(),a);
                this.eliminarTicket(n.getHijoI(), a);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarPelicula;
    private javax.swing.JButton agregarSala;
    private javax.swing.JButton agregarSucursal;
    private javax.swing.JButton comprarPelicula;
    private javax.swing.JButton editar;
    private javax.swing.JButton editarSala;
    private javax.swing.JButton eliminarPelicula;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> peliculas;
    private javax.swing.JComboBox<String> salas;
    private javax.swing.JComboBox<String> sucursales;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JLabel texto7;
    private javax.swing.JButton verPeliculas;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
