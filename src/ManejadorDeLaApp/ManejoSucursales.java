package ManejadorDeLaApp;

import CodigoEstructuras.*;
import javax.swing.*;


public class ManejoSucursales extends javax.swing.JFrame {

    private Sucursal temp;
    private Sala temp2;
    private Pelicula temp3;
    
    public ManejoSucursales() {
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
        peliculas = new javax.swing.JComboBox<>();
        salas = new javax.swing.JComboBox<>();
        sucursales = new javax.swing.JComboBox<>();
        volver = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        agregarSala = new javax.swing.JButton();
        editarSala = new javax.swing.JButton();
        verPeliculas = new javax.swing.JButton();
        agregarPelicula = new javax.swing.JButton();
        eliminarPelicula = new javax.swing.JButton();
        comprarPelicula = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        volver.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        editar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        getContentPane().add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 70, 20));

        agregar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        agregar.setText("Añadir");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 70, 20));

        agregarSala.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        agregarSala.setText("Añadir Sala");
        agregarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarSalaActionPerformed(evt);
            }
        });
        getContentPane().add(agregarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, 20));

        editarSala.setFont(new java.awt.Font("Verdana", 0, 12));
        editarSala.setText("Editar Sala");
        editarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarSalaActionPerformed(evt);
            }
        });
        getContentPane().add(editarSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, 20));

        verPeliculas.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        verPeliculas.setText("Ver Películas");
        verPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPeliculasActionPerformed(evt);
            }
        });
        getContentPane().add(verPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, 20));

        agregarPelicula.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        agregarPelicula.setText("Agregar Película");
        agregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(agregarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, 20));

        eliminarPelicula.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        eliminarPelicula.setText("Eliminar Primera");
        eliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(eliminarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 130, 20));

        comprarPelicula.setText("ComprarBoleto");
        comprarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(comprarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 120, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        this.agregar.setVisible(true);
        this.agregarSala.setVisible(true);
        this.verPeliculas.setVisible(false);
        this.editar.setVisible(true);
        this.editarSala.setVisible(false);
        this.texto4.setText("");
        this.peliculas.setVisible(false);
        this.texto5.setVisible(false);
        this.agregarPelicula.setVisible(false);
        this.eliminarPelicula.setVisible(false);
        this.comprarPelicula.setVisible(false);
        this.texto6.setVisible(false);
    }//GEN-LAST:event_sucursalesActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
        new MenuInicio();
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

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
        this.editarSala.setVisible(true);
        this.verPeliculas.setVisible(true);
    }//GEN-LAST:event_salasActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        new Editar(this.temp);
        this.dispose();
    }//GEN-LAST:event_editarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        new Editar();
        this.dispose();
    }//GEN-LAST:event_agregarActionPerformed

    private void agregarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarSalaActionPerformed
        new Editar(false, null, this.temp);
        this.dispose();
    }//GEN-LAST:event_agregarSalaActionPerformed

    private void editarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarSalaActionPerformed
        new Editar(true,this.temp2,this.temp);
        this.dispose();
    }//GEN-LAST:event_editarSalaActionPerformed

    private void verPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPeliculasActionPerformed
        ListaSimple aux4 = new ListaSimple();
        
        if(this.temp2.getPelicula() != null){
            this.texto6.setText("Película en emisión: "+(this.temp2.getPelicula().getNombre()));
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
        this.comprarPelicula.setVisible(true);
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

    private void eliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPeliculaActionPerformed
        if(this.temp2.getPelicula() == null){
            JOptionPane.showMessageDialog(rootPane, "ERROR!!! NO HAY PELÍCULAS EN COLA");
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
        }
    }//GEN-LAST:event_eliminarPeliculaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregarPelicula;
    private javax.swing.JButton agregarSala;
    private javax.swing.JButton comprarPelicula;
    private javax.swing.JButton editar;
    private javax.swing.JButton editarSala;
    private javax.swing.JButton eliminarPelicula;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> peliculas;
    private javax.swing.JComboBox<String> salas;
    private javax.swing.JComboBox<String> sucursales;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JLabel texto6;
    private javax.swing.JButton verPeliculas;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
