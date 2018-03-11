package ManejadorDeLaApp;

import CodigoEstructuras.ListaSimple;
import java.util.Random;

public class Pelicula {
    
    private String nombre, idioma, genero;
    private Sala sala;
    private int fun;
    private ListaSimple funciones = new ListaSimple();
    
    public Pelicula(String nombre, String idioma, String genero, int fun, Sala sala){
        
        this.sala = sala;
        this.nombre = nombre;
        this.idioma = idioma;
        this.genero = genero;
        this.agregarFunciones(fun);
        
    }
    
        //Cantidad de días de función de la película
    public void agregarFunciones(int aux){
        
        while(aux != 0){
            this.funciones.insertPrimero(1);
            aux--;
        }
        
        this.fun = this.funciones.contarElementos();
        
    }
    
    public void verDatos(){
        
        System.out.println("Pelicula: "+this.nombre);
        System.out.println("Idioma: "+this.idioma);
        System.out.println("Género: "+this.genero);
        System.out.println("Cantidad de funciones: "+this.fun);
        
    }
}
