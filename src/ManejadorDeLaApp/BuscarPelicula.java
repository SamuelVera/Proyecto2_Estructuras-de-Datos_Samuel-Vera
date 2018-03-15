package ManejadorDeLaApp;

import CodigoEstructuras.*;
import javax.swing.*;

public class BuscarPelicula extends javax.swing.JFrame {

    public BuscarPelicula() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        MenuInicio.exe.setVisible(false);
        this.generos.setVisible(false);
        this.idiomas.setVisible(false);
        this.texto3.setVisible(false);
        this.texto4.setVisible(false);
    }
    public Arbol primerFiltro(boolean auxiliar){
        Arbol arbol = new Arbol();
        NodoSimple aux = MenuInicio.sucursales.getCabeza();
        NodoSimple aux2;
        while(aux!=null){
            aux2 = ((Sucursal)aux.getDato()).getSalas().getCabeza();
            while(aux2!=null){
                if(auxiliar == false){
                    if(aux2.getDato() instanceof Sala2D){
                        arbol.agregar(arbol.getRaiz(), new NodoArbol(((Sala2D)aux2.getDato()).getPelicula().getGenero()));
                    }else if(aux2.getDato() instanceof Sala3D){
                        arbol.agregar(arbol.getRaiz(), new NodoArbol(((Sala3D)aux2.getDato()).getPelicula().getGenero()));
                    }else{
                        arbol.agregar(arbol.getRaiz(), new NodoArbol(((Sala4DX)aux2.getDato()).getPelicula().getGenero()));
                    }
                }else{
                    if(aux2.getDato() instanceof Sala2D){
                        arbol.agregar(arbol.getRaiz(), new NodoArbol(((Sala2D)aux2.getDato()).getPelicula().getIdioma()));
                    }else if(aux2.getDato() instanceof Sala3D){
                        arbol.agregar(arbol.getRaiz(), new NodoArbol(((Sala3D)aux2.getDato()).getPelicula().getIdioma()));
                    }else{
                        arbol.agregar(arbol.getRaiz(), new NodoArbol(((Sala4DX)aux2.getDato()).getPelicula().getIdioma()));
                    }
                }
                aux2 = aux2.getProximo();
            }
            aux = aux.getProximo();
        }
        return arbol;
    }
    
    public void segundoFiltro(String comparativa, boolean auxiliar){
         
        String[] peliculas;
        Arbol temp = new Arbol();
        NodoSimple aux = MenuInicio.sucursales.getCabeza();
        NodoSimple aux2;
        int i = 0;
        while(aux!=null){
            aux2 = ((Sucursal)aux.getDato()).getSalas().getCabeza();
            while(aux2!=null){
                if(auxiliar == false){
                    if(aux2.getDato() instanceof Sala2D){
                        if(comparativa == ((Sala2D)aux2.getDato()).getPelicula().getGenero()){
                            temp.agregar(temp.getRaiz(), new NodoArbol(((Sala2D)aux2.getDato()).getPelicula().getNombre()));
                        }
                    }else if(aux2.getDato() instanceof Sala3D){
                        if(comparativa == ((Sala3D)aux2.getDato()).getPelicula().getGenero()){
                            temp.agregar(temp.getRaiz(), new NodoArbol(((Sala3D)aux2.getDato()).getPelicula().getNombre()));
                        }
                    }else{
                        if(comparativa == ((Sala4DX)aux2.getDato()).getPelicula().getGenero()){
                            temp.agregar(temp.getRaiz(), new NodoArbol(((Sala4DX)aux2.getDato()).getPelicula().getNombre()));
                        }
                    }
                }else{
                    if(aux2.getDato() instanceof Sala2D){
                        if(comparativa == ((Sala2D)aux2.getDato()).getPelicula().getIdioma()){
                            temp.agregar(temp.getRaiz(), new NodoArbol(((Sala2D)aux2.getDato()).getPelicula().getNombre()));
                        }
                    }else if(aux2.getDato() instanceof Sala3D){
                        if(comparativa == ((Sala3D)aux2.getDato()).getPelicula().getIdioma()){
                            temp.agregar(temp.getRaiz(), new NodoArbol(((Sala3D)aux2.getDato()).getPelicula().getNombre()));
                        }
                    }else{
                        if(comparativa == ((Sala4DX)aux2.getDato()).getPelicula().getIdioma()){
                            temp.agregar(temp.getRaiz(), new NodoArbol(((Sala4DX)aux2.getDato()).getPelicula().getNombre()));
                        }
                    }
                }
                aux2 = aux2.getProximo();
            }
            aux = aux.getProximo();
        }
        peliculas = new String[temp.contar(temp.getRaiz())];
        recorrer(peliculas,temp.getRaiz(),0);
        DefaultListModel<String> aux3 = new DefaultListModel<>();
        aux3.removeAllElements();
        
        for(int j=0;j<peliculas.length;j++){
            aux3.addElement(peliculas[j]);
        }
        
        this.ordenados.setModel(aux3);
    }
    
    public void recorrer(String[] aux, NodoArbol n, int i){
        
        if(n != null){
            aux[i] = (String)n.getDato();
            i++;
            this.recorrer(aux,n.getHijoD(),i);
            this.recorrer(aux,n.getHijoI(),i);
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtro = new javax.swing.ButtonGroup();
        ordenar = new javax.swing.ButtonGroup();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        filtrarGenero = new javax.swing.JRadioButton();
        filtrarIdioma = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordenados = new javax.swing.JList<>();
        idiomas = new javax.swing.JComboBox<>();
        generos = new javax.swing.JComboBox<>();
        odenarAlfabetico = new javax.swing.JRadioButton();
        odenarInverso = new javax.swing.JRadioButton();
        volver = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto1.setText("Filtrar por:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto2.setText("Ordenar:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        texto4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        texto4.setText("Idiomas:");
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 20));

        texto3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        texto3.setText("Géneros:");
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 70, 20));

        filtro.add(filtrarGenero);
        filtrarGenero.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        filtrarGenero.setText("Género");
        filtrarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(filtrarGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        filtro.add(filtrarIdioma);
        filtrarIdioma.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        filtrarIdioma.setText("Idioma");
        filtrarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarIdiomaActionPerformed(evt);
            }
        });
        getContentPane().add(filtrarIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        ordenados.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ordenados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ordenados.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(ordenados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 360, 210));

        idiomas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        idiomas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idiomasActionPerformed(evt);
            }
        });
        getContentPane().add(idiomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, -1));

        generos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generosActionPerformed(evt);
            }
        });
        getContentPane().add(generos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, -1));

        ordenar.add(odenarAlfabetico);
        odenarAlfabetico.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        odenarAlfabetico.setText("Alfabeticamente");
        getContentPane().add(odenarAlfabetico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        ordenar.add(odenarInverso);
        odenarInverso.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        odenarInverso.setText("Inversamente");
        odenarInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odenarInversoActionPerformed(evt);
            }
        });
        getContentPane().add(odenarInverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 20));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void odenarInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odenarInversoActionPerformed
        
    }//GEN-LAST:event_odenarInversoActionPerformed

    private void filtrarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarIdiomaActionPerformed
        
        this.filtrarGenero.setContentAreaFilled(false);
        this.generos.setVisible(false);
        this.texto3.setVisible(false);
        this.idiomas.setVisible(true);
        this.texto4.setVisible(true);
        
        Arbol filtro = this.primerFiltro(true);
        
        String[] idiomas2 = new String[filtro.contar(filtro.getRaiz())+1];
        this.recorrer(idiomas2,filtro.getRaiz(),0);
        ComboBoxModel aux3 = new DefaultComboBoxModel(idiomas2);
        this.idiomas.setModel(aux3);
        
    }//GEN-LAST:event_filtrarIdiomaActionPerformed

    private void filtrarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarGeneroActionPerformed

        this.filtrarIdioma.setContentAreaFilled(false);
        this.idiomas.setVisible(false);
        this.texto4.setVisible(false);
        this.generos.setVisible(true);
        this.texto3.setVisible(true);
        
        Arbol filtro = this.primerFiltro(false);
        
        String[] generos2 = new String[filtro.contar(filtro.getRaiz())+1];
        this.recorrer(generos2,filtro.getRaiz(),0);
        ComboBoxModel aux3 = new DefaultComboBoxModel(generos2);
        this.generos.setModel(aux3);
        
    }//GEN-LAST:event_filtrarGeneroActionPerformed

    private void generosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generosActionPerformed
        
        this.segundoFiltro(this.generos.getSelectedItem().toString(),false);
       
    }//GEN-LAST:event_generosActionPerformed

    private void idiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomasActionPerformed
        
        this.segundoFiltro(this.idiomas.getSelectedItem().toString(),true);
        
    }//GEN-LAST:event_idiomasActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.dispose();
        MenuInicio.exe.setVisible(true);
    }//GEN-LAST:event_volverActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton filtrarGenero;
    private javax.swing.JRadioButton filtrarIdioma;
    private javax.swing.ButtonGroup filtro;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> generos;
    private javax.swing.JComboBox<String> idiomas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton odenarAlfabetico;
    private javax.swing.JRadioButton odenarInverso;
    private javax.swing.JList<String> ordenados;
    private javax.swing.ButtonGroup ordenar;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
