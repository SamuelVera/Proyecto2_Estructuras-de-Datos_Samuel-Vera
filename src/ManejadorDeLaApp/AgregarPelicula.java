package ManejadorDeLaApp;

import EstructuraDeClases.Sucursal;
import EstructuraDeClases.Pelicula;
import EstructuraDeClases.Sala;
import CodigoEstructuras.*;
import javax.swing.JOptionPane;

/*Clase para agregar una película a una determinada sala.
*/
public class AgregarPelicula extends javax.swing.JFrame {

    private Sala temp;
    
        //Inicialización de los elementos básicos de la ventana.
    public AgregarPelicula(Sala sala) {
        initComponents();
        this.setTitle("Agregar Película");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.temp = sala;
        this.texto3.setText("Sala número: "+this.temp.getNumero());
        this.texto5.setText("Sucursal: "+this.temp.getSucursal().getUbicacion());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generos = new javax.swing.ButtonGroup();
        idiomas = new javax.swing.ButtonGroup();
        texto1 = new javax.swing.JLabel();
        texto2 = new javax.swing.JLabel();
        texto3 = new javax.swing.JLabel();
        texto4 = new javax.swing.JLabel();
        texto5 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        accion = new javax.swing.JRadioButton();
        thriller = new javax.swing.JRadioButton();
        scifi = new javax.swing.JRadioButton();
        terror = new javax.swing.JRadioButton();
        fantasia = new javax.swing.JRadioButton();
        historico = new javax.swing.JRadioButton();
        guerra = new javax.swing.JRadioButton();
        deporte = new javax.swing.JRadioButton();
        comedia = new javax.swing.JRadioButton();
        musical = new javax.swing.JRadioButton();
        drama = new javax.swing.JRadioButton();
        romance = new javax.swing.JRadioButton();
        agregar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        espanol = new javax.swing.JRadioButton();
        ingles = new javax.swing.JRadioButton();
        frances = new javax.swing.JRadioButton();
        italiano = new javax.swing.JRadioButton();
        aleman = new javax.swing.JRadioButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto1.setText("Nombre:");
        getContentPane().add(texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        texto2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto2.setText("Género:");
        getContentPane().add(texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 30));
        getContentPane().add(texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 260, 20));

        texto4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        texto4.setText("Idioma:");
        getContentPane().add(texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        getContentPane().add(texto5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 314, 260, 20));

        campoNombre.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        getContentPane().add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 280, 30));

        generos.add(accion);
        accion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        accion.setText("Acción");
        accion.setOpaque(false);
        getContentPane().add(accion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        generos.add(thriller);
        thriller.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        thriller.setText("Thriller");
        thriller.setOpaque(false);
        getContentPane().add(thriller, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        generos.add(scifi);
        scifi.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        scifi.setText("Sci-fi");
        scifi.setOpaque(false);
        getContentPane().add(scifi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        generos.add(terror);
        terror.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        terror.setText("Terror");
        terror.setOpaque(false);
        getContentPane().add(terror, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        generos.add(fantasia);
        fantasia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        fantasia.setText("Fantasía");
        fantasia.setOpaque(false);
        getContentPane().add(fantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        generos.add(historico);
        historico.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        historico.setText("Histórico");
        historico.setOpaque(false);
        getContentPane().add(historico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        generos.add(guerra);
        guerra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        guerra.setText("Guerra");
        guerra.setOpaque(false);
        getContentPane().add(guerra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        generos.add(deporte);
        deporte.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        deporte.setText("Deporte");
        deporte.setOpaque(false);
        getContentPane().add(deporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        generos.add(comedia);
        comedia.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        comedia.setText("Comedia");
        comedia.setOpaque(false);
        getContentPane().add(comedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        generos.add(musical);
        musical.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        musical.setText("Musical");
        musical.setOpaque(false);
        getContentPane().add(musical, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        generos.add(drama);
        drama.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        drama.setText("Drama");
        drama.setOpaque(false);
        getContentPane().add(drama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        generos.add(romance);
        romance.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        romance.setText("Romance");
        romance.setOpaque(false);
        getContentPane().add(romance, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        agregar.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        agregar.setText("Agregar");
        agregar.setOpaque(false);
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, 20));

        volver.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        volver.setText("Volver");
        volver.setOpaque(false);
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });
        getContentPane().add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 80, 20));

        idiomas.add(espanol);
        espanol.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        espanol.setText("Español");
        espanol.setOpaque(false);
        getContentPane().add(espanol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        idiomas.add(ingles);
        ingles.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ingles.setText("Inglés");
        ingles.setOpaque(false);
        getContentPane().add(ingles, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        idiomas.add(frances);
        frances.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        frances.setText("Francés");
        frances.setOpaque(false);
        getContentPane().add(frances, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        idiomas.add(italiano);
        italiano.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        italiano.setText("Italiano");
        italiano.setOpaque(false);
        getContentPane().add(italiano, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        idiomas.add(aleman);
        aleman.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        aleman.setText("Alemán");
        aleman.setOpaque(false);
        getContentPane().add(aleman, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAzul.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

        //Acción del botón agregar.
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
            //Validación de que los campos esten completos.
        if(this.campoNombre.getText().trim().length() == 0 || this.generos.isSelected(null) || this.idiomas.isSelected(null)){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "LLENE LOS CAMPOS ANTES DE PROCEDER","    ¡¡ERROR!!",JOptionPane.ERROR_MESSAGE);
        }else{
            //Construcción de los parámetros de la película.
            int aux, aux2;
            Pelicula aux3;
            String idioma, genero;
                //Género.
            if(this.generos.isSelected(this.accion.getModel())){
                genero = "Acción";
            }else if(this.generos.isSelected(this.comedia.getModel())){
                genero = "Comedia";
            }else if(this.generos.isSelected(this.deporte.getModel())){
                genero = "Deporte";
            }else if(this.generos.isSelected(this.drama.getModel())){
                genero = "Drama";
            }else if(this.generos.isSelected(this.thriller.getModel())){
                genero = "Thriller";
            }else if(this.generos.isSelected(this.fantasia.getModel())){
                genero = "Fantasía";
            }else if(this.generos.isSelected(this.guerra.getModel())){
                genero = "Guerra";
            }else if(this.generos.isSelected(this.historico.getModel())){
                genero = "Histórico";
            }else if(this.generos.isSelected(this.musical.getModel())){
                genero = "Musical";
            }else if(this.generos.isSelected(this.romance.getModel())){
                genero = "Romance";
            }else if(this.generos.isSelected(this.scifi.getModel())){
                genero = "Ciencia Ficción";
            }else{
                genero = "Terror";
            }
            
                //Idioma.
            if(this.idiomas.isSelected(this.aleman.getModel())){
                idioma ="Alemán";
            }else if(this.idiomas.isSelected(this.espanol.getModel())){
                idioma = "Español";
            }else if(this.idiomas.isSelected(this.frances.getModel())){
                idioma = "Francés";
            }else if(this.idiomas.isSelected(this.italiano.getModel())){
                idioma = "Italiano";
            }else{
                idioma = "Inglés";
            }
            
            aux3 = new Pelicula(this.campoNombre.getText(),idioma,genero,this.temp);
            this.temp.agregarPelicula(aux3);
            
            Sucursal aux4 = this.temp.getSucursal();
            int aux5 = aux4.getCodigo();
            NodoArbol n = new NodoArbol(aux4,aux5);
            
            MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(),aux5);
            MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), n);
            
            new ManejarElementos();
            this.dispose();
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        new ManejarElementos();//Volver a la ventana de ver informaciones.
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton accion;
    private javax.swing.JButton agregar;
    private javax.swing.JRadioButton aleman;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JRadioButton comedia;
    private javax.swing.JRadioButton deporte;
    private javax.swing.JRadioButton drama;
    private javax.swing.JRadioButton espanol;
    private javax.swing.JRadioButton fantasia;
    private javax.swing.JLabel fondo;
    private javax.swing.JRadioButton frances;
    private javax.swing.ButtonGroup generos;
    private javax.swing.JRadioButton guerra;
    private javax.swing.JRadioButton historico;
    private javax.swing.ButtonGroup idiomas;
    private javax.swing.JRadioButton ingles;
    private javax.swing.JRadioButton italiano;
    private javax.swing.JRadioButton musical;
    private javax.swing.JRadioButton romance;
    private javax.swing.JRadioButton scifi;
    private javax.swing.JRadioButton terror;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel texto2;
    private javax.swing.JLabel texto3;
    private javax.swing.JLabel texto4;
    private javax.swing.JLabel texto5;
    private javax.swing.JRadioButton thriller;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
