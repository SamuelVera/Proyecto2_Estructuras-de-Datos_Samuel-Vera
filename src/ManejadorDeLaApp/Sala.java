package ManejadorDeLaApp;

import CodigoEstructuras.*;

public abstract class Sala {
    
    protected Sucursal sucursal;
    protected int numero;
    protected Cola peliculas = new Cola();
    protected Arbol ticketsDia = new Arbol();
    protected double venta = 0;

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
        this.ticketsDia.agregar(this.ticketsDia.getRaiz(),new NodoArbol(ticket,ticket.getId()));
    }
    
    public abstract void ventas();
    public abstract void verPeliculas();
}
