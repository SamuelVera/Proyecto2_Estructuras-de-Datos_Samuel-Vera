package EstructuraDeClases;

import CodigoEstructuras.*;
import ManejadorDeLaApp.MenuInicio;
import java.text.SimpleDateFormat;

/*Clase sala, funciona como sala padre de Sala2D, 3D y 4DX, además posee:
-Una sucursal a la cual pertence la sala.
-Número de la sala.
-Una cola de películas.
-Árbol de tickets que se han vendido para las funciones de la sala.
-Formato de fecha.
*/
public abstract class Sala {
    
    protected Sucursal sucursal;
    protected int numero;
    protected Cola peliculas = new Cola();
    protected Arbol tickets = new Arbol();
    protected SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
    
        //Constructor de la sala.
    public Sala(int numero, Sucursal sucursal) {
        this.numero = numero;
        this.sucursal = sucursal;
    }
    
        //Retornar sucursal a la cual pretenece la sala.
    public Sucursal getSucursal(){
        return this.sucursal;
    }
    
        //Método de agregar una película a la cola de la sala.
    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.encolar(pelicula);
    }
    
        //Cambiar el número de la sala.
    public void setNumero(int numero){
        this.numero = numero;
    }
    
        //Retornar el número de la sala.
    public int getNumero(){
        return this.numero;
    }
    
        //Retornar la primera película en la cola.
    public Pelicula getPelicula(){
        return (Pelicula)this.peliculas.getPrimeroEnCola();
    }
    
        //Retornar la cola de películas.
    public Cola getColaPeliculas(){
        return this.peliculas;
    }
    
        //Agregar un ticket a los vendidos.
    public void agregarTicket(Ticket ticket) {
        this.tickets.agregar(this.tickets.getRaiz(),new NodoArbol(ticket,ticket.getId()));
    }
    
        //Retornar el ABB de los tickets
    public Arbol getArbolTickets(){
        return this.tickets;
    }
    
        //Cálculo de visitas en el día presente de ejecución de la simulación.
    public int visitasDia(NodoArbol n){
        if(n!=null){
            Ticket aux = (Ticket)n.getDato();
            if(this.fd.format(aux.getFecha()).equals(this.fd.format(MenuInicio.fecha))){
                return 1 + this.visitasDia(n.getHijoD()) + this.visitasDia(n.getHijoI());
            }
            return this.visitasDia(n.getHijoD()) + this.visitasDia(n.getHijoI());
        }
        return 0;
    }
    
        //Cálculo de la ganancia de la sala en el día presente de ejecución de la simulación.
    public double ventasDia(NodoArbol n){
        if(n!=null){
            Ticket aux = (Ticket)n.getDato();
            if(this.fd.format(aux.getFecha()).equals(this.fd.format(MenuInicio.fecha))){
                return aux.getPrecioTicket() + this.ventasDia(n.getHijoD()) + this.ventasDia(n.getHijoI());
            }else{
                return this.ventasDia(n.getHijoD()) + this.ventasDia(n.getHijoI());
            }
        }
        return 0;
    }
}
