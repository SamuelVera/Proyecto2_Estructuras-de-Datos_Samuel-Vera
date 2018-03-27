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
    
    public void setSalas(ListaSimple salas){
        this.salas = salas;
    }
    
    public ListaSimple getSalas() {
        return this.salas;
    }
    
    public Sala getSala(int num){
        NodoSimple aux = this.salas.getCabeza();
        while(aux != null){
            if(aux.getDato() instanceof Sala){
                if(((Sala)aux.getDato()).getNumero() == num){
                    return (Sala)aux.getDato();
                }
            }
            aux = aux.getProximo();
        }
        return null;
    }
    
    public double gananciaDia(){
        double aux = 0, mayor = -1;
        NodoSimple n = this.salas.getCabeza();
        
        while(n!=null){
            aux = aux+((Sala)n.getDato()).ventasDia(((Sala)n.getDato()).getArbolTickets().getRaiz());
            n = n.getProximo();
        }
        return aux;
    }
}
