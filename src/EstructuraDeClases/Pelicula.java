package EstructuraDeClases;

import CodigoEstructuras.ListaSimple;
import java.util.Random;

/*Clase Película, posee:
-Nombre.
-Idioma.
-Género.
-Sala en la que se emite.
*/
public class Pelicula {
    
    private String nombre, idioma, genero;
    private Sala sala;
    
        //Constructor de la clase.
    public Pelicula(String nombre, String idioma, String genero, Sala sala){
        
        this.sala = sala;
        this.nombre = nombre;
        this.idioma = idioma;
        this.genero = genero;
        
    }
    
        //Retornar el género de la película.
    public String getGenero(){
        return this.genero;
    }
    
        //Retornar el nombre de la película.
    public String getNombre(){
        return this.nombre;
    }
    
        //Retornar el idioma de la película.
    public String getIdioma(){
        return this.idioma;
    }
    
        //Retornar la sala en la cual se emite.
    public Sala getSala(){
        return this.sala;
    }
}
