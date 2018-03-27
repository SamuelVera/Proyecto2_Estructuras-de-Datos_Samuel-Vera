package ManejadorDeLaApp;

import CodigoEstructuras.ListaSimple;
import java.util.Random;

public class Pelicula {
    
    private String nombre, idioma, genero;
    private Sala sala;
    
    public Pelicula(String nombre, String idioma, String genero, Sala sala){
        
        this.sala = sala;
        this.nombre = nombre;
        this.idioma = idioma;
        this.genero = genero;
        
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getIdioma(){
        return this.idioma;
    }
    
    public Sala getSala(){
        return this.sala;
    }
}
