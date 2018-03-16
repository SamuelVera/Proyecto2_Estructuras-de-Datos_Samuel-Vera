package ManejadorDeLaApp;

import CodigoEstructuras.*;
import java.util.Random;

public class Sucursal {
    
    private int codigo;
    private String ubicacion;
    private ListaSimple salas = new ListaSimple();
    
    public Sucursal(String ubicacion, int codigo){
        
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void agregarSala(Sala2D aux){
        this.salas.insertPrimero(aux);
    }
    
    public void agregarSala(Sala3D aux){
        this.salas.insertPrimero(aux);
    }
    
    public void agregarSala(Sala4DX aux){
        this.salas.insertPrimero(aux);
    }

    public ListaSimple getSalas() {
        return this.salas;
    }
    
}
