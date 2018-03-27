package ManejadorDeLaApp;

import CodigoEstructuras.*;
import java.text.SimpleDateFormat;

public abstract class Sala {
    
    protected Sucursal sucursal;
    protected int numero;
    protected Cola peliculas = new Cola();
    protected Arbol tickets = new Arbol();
    protected SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
    
    public Sala(int numero, Sucursal sucursal) {
        this.numero = numero;
        this.sucursal = sucursal;
    }
    
    public Sucursal getSucursal(){
        return this.sucursal;
    }
    
    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.encolar(pelicula);
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public Pelicula getPelicula(){
        return (Pelicula)this.peliculas.getPrimeroEnCola();
    }
    
    public Cola getColaPeliculas(){
        return this.peliculas;
    }
    
    public void agregarTicket(Ticket ticket) {
        this.tickets.agregar(this.tickets.getRaiz(),new NodoArbol(ticket,ticket.getId()));
    }
    
    public Arbol getArbolTickets(){
        return this.tickets;
    }
    
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
    
    public abstract double ventasDia(NodoArbol n);
}
