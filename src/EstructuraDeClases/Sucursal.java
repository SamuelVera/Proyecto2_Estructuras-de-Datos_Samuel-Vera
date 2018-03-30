package EstructuraDeClases;

import CodigoEstructuras.*;

/*Clase sucursal, posee:
-Código único de 4 dígitos.
-Ubicación.
-Lista de salas.
*/
public class Sucursal {
    
    private int codigo;
    private String ubicacion;
    private ListaSimple salas = new ListaSimple();
    
        //Constructor de la clase.
    public Sucursal(String ubicacion, int codigo){
        this.codigo = codigo;
        this.ubicacion = ubicacion;
    }
    
        //Retornar el código.
    public int getCodigo(){
        return this.codigo;
    }
    
        //Retornar la ubicación.
    public String getUbicacion(){
        return this.ubicacion;
    }
    
        //Agregar una sala 2D.
    public void agregarSala(Sala2D aux){
        this.salas.insertPrimero(aux);
    }
    
        //Agregar una sala 3D.
    public void agregarSala(Sala3D aux){
        this.salas.insertPrimero(aux);
    }
    
        //Agregar una sala 4DX.
    public void agregarSala(Sala4DX aux){
        this.salas.insertPrimero(aux);
    }
    
        //Método empleado de forma auxiliar para refrescar la lista de las salas.
    public void setSalas(ListaSimple salas){
        this.salas = salas;
    }
    
        //Retornar ListaSimple de las salas.
    public ListaSimple getSalas() {
        return this.salas;
    }
    
        //Retornar una sala de la lista conociendo su número.
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
    
        //Ganancia del día presente en la ejecución del sistema en venta de tickets.
    public double gananciaDia(){
        double aux = 0;
        NodoSimple n = this.salas.getCabeza();
        
        while(n!=null){
            aux = aux+((Sala)n.getDato()).ventasDia(((Sala)n.getDato()).getArbolTickets().getRaiz());
            n = n.getProximo();
        }
        
        return aux;
    }
}
