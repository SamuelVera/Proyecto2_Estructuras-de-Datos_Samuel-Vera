package ManejadorDeLaApp;

import EstructuraDeClases.Sucursal;
import EstructuraDeClases.Pelicula;
import EstructuraDeClases.Sala;
import CodigoEstructuras.*;
import javax.swing.*;

/*Desde esta clase se puede:
-Filtrar películas por género e idioma.
-Ordenar las películas alfabéticamente y en orden inverso.
-Ver datos de la película seleccionada.
*/
public class BuscarPelicula extends javax.swing.JFrame {
    
    private String[] nombrePeliculas; 
    private Arbol peliculas = new Arbol(), auxIdiomas = new Arbol(), auxGeneros = new Arbol();
    
    public BuscarPelicula(){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setTitle("Buscar Película");
        this.generos.setVisible(false);
        this.idiomas.setVisible(false);
        this.texto3.setVisible(false);
        this.texto4.setVisible(false);
        this.insertarPeliculas(MenuInicio.sucursales.getRaiz());
        this.inicializarLista();
    }
    
        //Método para crear un ABB con los nombres de las películas como códigos.
    private void insertarPeliculas(NodoArbol aux){
        if(aux != null){
            NodoSimple temp = ((Sucursal)aux.getDato()).getSalas().getCabeza();
            while(temp != null){
                ListaSimple l = new ListaSimple();
                while(((Sala)temp.getDato()).getColaPeliculas().getPrimeroEnCola() != null){
                    l.insertarUltimo((((Sala)temp.getDato()).getColaPeliculas()).desencolar());
                }
                NodoSimple temp2 = l.getCabeza();
                String s;
                while(temp2 != null){
                    s = ((Pelicula)temp2.getDato()).getNombre();
                    this.peliculas.agregarString(this.peliculas.getRaiz(), new NodoArbol(((Pelicula)temp2.getDato()),s));
                    ((Sala)temp.getDato()).getColaPeliculas().encolar((Pelicula)temp2.getDato());
                    temp2 = temp2.getProximo();
                }
                temp = temp.getProximo();
            }
            this.insertarPeliculas(aux.getHijoD());
            this.insertarPeliculas(aux.getHijoI());
        }
    }
    
        /*Inicializar la lista con todas las películas sin copiar la misma 
        película 2 o más veces.*/
    private void inicializarLista(){
        String[] aux = new String[this.peliculas.contar(this.peliculas.getRaiz())];
        this.peliculas.getTodosLosCodigos(this.peliculas.getRaiz(), aux);
        DefaultListModel<String> aux2 = new DefaultListModel<>();
        for(int i=0;i<aux.length;i++){
            aux2.addElement(aux[i]);
        }
        this.ordenados.setModel(aux2);
        this.nombrePeliculas = aux;
    }
    
        /*Este método retorna un árbol binario de búsqueda
        cuyos datos son los géneros o los idiomas de las películas ofertadas,
        para luego desplegarlos en las listas. Si el parámetro boolean auxiliar
        es true se despliega la lista en función de los idiomas, y si es false
        en función de los géneros.*/
    private Arbol primerFiltro(boolean auxiliar){
        
        Arbol arbol = new Arbol();
        String[] aux = new String[this.peliculas.contar(this.peliculas.getRaiz())];
        this.peliculas.getTodosLosCodigos(this.peliculas.getRaiz(), aux);
        
        if(auxiliar == true){
            for(int i=0;i<aux.length;i++){
                this.peliculas.getRaiz();
                Pelicula aux2 = (Pelicula)(this.peliculas.buscarNodo(this.peliculas.getRaiz(), aux[i])).getDato();
                NodoArbol aux3 = new NodoArbol(aux2,aux2.getIdioma());
                arbol.agregarString(arbol.getRaiz(), aux3);
            }
        }else{
            for(int i=0;i<aux.length;i++){
                this.peliculas.getRaiz();
                Pelicula aux2 = (Pelicula)(this.peliculas.buscarNodo(this.peliculas.getRaiz(), aux[i])).getDato();
                NodoArbol aux3 = new NodoArbol(aux2,aux2.getGenero());
                arbol.agregarString(arbol.getRaiz(), aux3);
            }
        }
        
        return arbol;
    }
    
        /*En este método se filtran las películas según el idioma selecionado o,
        si el parámetro boolean auxiliar es true, o según el género seleccionado
        si auxiliar es false.*/
    private void segundoFiltro(String comparativa, boolean auxiliar){
        
        String[] aux = new String[this.peliculas.contar(this.peliculas.getRaiz())];
        ListaSimple temp = new ListaSimple();
        this.peliculas.getTodosLosCodigos(this.peliculas.getRaiz(), aux);
        
        for(int i=0;i<aux.length;i++){
            Pelicula aux2 = ((Pelicula)this.peliculas.buscarNodo(this.peliculas.getRaiz(), aux[i]).getDato());
            temp.insertPrimero(aux2);
            aux[i] = null;
        }
        
        int i=0;
        NodoSimple aux2 = temp.getCabeza();
        
        while(aux2!=null){
            if(auxiliar == true){
                if(comparativa == ((Pelicula)aux2.getDato()).getIdioma()){
                    aux[i] = ((Pelicula)aux2.getDato()).getNombre();
                    i++;
                }
            }else{
                if(comparativa == ((Pelicula)aux2.getDato()).getGenero()){
                    aux[i] = ((Pelicula)aux2.getDato()).getNombre();
                    i++;
                }
            }
            aux2 = aux2.getProximo();
        }
        
        i=0;
        DefaultListModel<String> aux3 = new DefaultListModel<>();
        
        for(int j=0;j<aux.length;j++){
            if(aux[j] != null){
                aux3.addElement(aux[j]);
                i++;
            }
        }
        this.nombrePeliculas = new String[aux3.getSize()];
        
        for(int j=0;j<this.nombrePeliculas.length;j++){
            this.nombrePeliculas[j] = aux3.get(j);
        }
        
        this.ordenados.setModel(aux3);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filtroYFiltro = new javax.swing.ButtonGroup();
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
        verDatos = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        filtroYFiltro.add(filtrarGenero);
        filtrarGenero.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        filtrarGenero.setText("Género");
        filtrarGenero.setOpaque(false);
        filtrarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(filtrarGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        filtroYFiltro.add(filtrarIdioma);
        filtrarIdioma.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        filtrarIdioma.setText("Idioma");
        filtrarIdioma.setOpaque(false);
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 360, 210));

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

        filtroYFiltro.add(odenarAlfabetico);
        odenarAlfabetico.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        odenarAlfabetico.setText("Alfabeticamente");
        odenarAlfabetico.setOpaque(false);
        odenarAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odenarAlfabeticoActionPerformed(evt);
            }
        });
        getContentPane().add(odenarAlfabetico, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        filtroYFiltro.add(odenarInverso);
        odenarInverso.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        odenarInverso.setText("Inversamente");
        odenarInverso.setOpaque(false);
        odenarInverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odenarInversoActionPerformed(evt);
            }
        });
        getContentPane().add(odenarInverso, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        volver.setText("Volver");
        volver.setOpaque(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 20));

        verDatos.setText("Ver Datos");
        verDatos.setOpaque(false);
        verDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosActionPerformed(evt);
            }
        });
        getContentPane().add(verDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Ordenar las películas de manera inversa a la alfabética.
    private void odenarInversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odenarInversoActionPerformed
        
        String aux;
        
        for(int i=0;i<this.nombrePeliculas.length;i++){
           
        }
        
        for(int i=0;i<this.nombrePeliculas.length;i++){
            int c = i;
            for(int j=c;j<this.nombrePeliculas.length;j++){
                int comp = this.nombrePeliculas[i].compareTo(this.nombrePeliculas[j]);
                if(comp < 0){
                    aux = this.nombrePeliculas[i];
                    this.nombrePeliculas[i] = this.nombrePeliculas[j];
                    this.nombrePeliculas[j] = aux;
                }
            }
        }
        
        DefaultListModel<String> aux3 = new DefaultListModel<>();
        aux3.removeAllElements();
        
        for(int j=0;j<this.nombrePeliculas.length;j++){
            aux3.addElement(this.nombrePeliculas[j]);
        }
        
        this.ordenados.setModel(aux3);
    }//GEN-LAST:event_odenarInversoActionPerformed

    private void filtrarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarIdiomaActionPerformed
        
        this.generos.setVisible(false);
        this.texto3.setVisible(false);
        this.idiomas.setVisible(true);
        this.texto4.setVisible(true);
        
        this.auxIdiomas = this.primerFiltro(true);
        
        String[] idiomas2 = new String[this.auxIdiomas.contar(this.auxIdiomas.getRaiz())+1];
        this.auxIdiomas.getTodosLosCodigos(this.auxIdiomas.getRaiz(), idiomas2);
        ComboBoxModel aux3 = new DefaultComboBoxModel(idiomas2);
        this.idiomas.setModel(aux3);
        this.inicializarLista();
        
    }//GEN-LAST:event_filtrarIdiomaActionPerformed

    private void filtrarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarGeneroActionPerformed

        this.idiomas.setVisible(false);
        this.texto4.setVisible(false);
        this.generos.setVisible(true);
        this.texto3.setVisible(true);
        
        this.auxGeneros = this.primerFiltro(false);
        
        String[] generos2 = new String[this.auxGeneros.contar(this.auxGeneros.getRaiz())+1];
        this.auxGeneros.getTodosLosCodigos(this.auxGeneros.getRaiz(), generos2);
        ComboBoxModel aux3 = new DefaultComboBoxModel(generos2);
        this.generos.setModel(aux3);
        this.inicializarLista();
        
    }//GEN-LAST:event_filtrarGeneroActionPerformed

    private void generosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generosActionPerformed
        this.segundoFiltro(this.generos.getSelectedItem().toString(),false);
    }//GEN-LAST:event_generosActionPerformed

    private void idiomasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idiomasActionPerformed
        this.segundoFiltro(this.idiomas.getSelectedItem().toString(),true);
    }//GEN-LAST:event_idiomasActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.dispose();
        MenuInicio aux = new MenuInicio();
    }//GEN-LAST:event_volverActionPerformed

        //Ordenar las películas filtradas de forma alfabética.
    private void odenarAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odenarAlfabeticoActionPerformed
        
        String aux;
        for(int i=0;i<this.nombrePeliculas.length;i++){
            int c = i;
            for(int j=c;j<this.nombrePeliculas.length;j++){
                int comp = this.nombrePeliculas[i].compareTo(this.nombrePeliculas[j]);
                if(comp > 0){
                    aux = this.nombrePeliculas[i];
                    this.nombrePeliculas[i] = this.nombrePeliculas[j];
                    this.nombrePeliculas[j] = aux;
                }
            }
        }
        
        DefaultListModel<String> aux3 = new DefaultListModel<>();
        aux3.removeAllElements();
        
        for(int j=0;j<this.nombrePeliculas.length;j++){
            aux3.addElement(this.nombrePeliculas[j]);
        }
        
        this.ordenados.setModel(aux3);
        
    }//GEN-LAST:event_odenarAlfabeticoActionPerformed

        //Desplegar ventana con los datos de la película seleccionada.
    private void verDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosActionPerformed
        Pelicula aux = (Pelicula)this.peliculas.buscarNodo(this.peliculas.getRaiz(), this.ordenados.getSelectedValue()).getDato();
        String s = "Nombre: "+aux.getNombre()+"\nIdioma: "+aux.getIdioma()+"\nGénero: "+aux.getGenero();
        JOptionPane.showMessageDialog(rootPane, s, "Datos de la Película", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_verDatosActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton filtrarGenero;
    private javax.swing.JRadioButton filtrarIdioma;
    private javax.swing.ButtonGroup filtroYFiltro;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> generos;
    private javax.swing.JComboBox<String> idiomas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton odenarAlfabetico;
    private javax.swing.JRadioButton odenarInverso;
    private javax.swing.JList<String> ordenados;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JButton verDatos;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
