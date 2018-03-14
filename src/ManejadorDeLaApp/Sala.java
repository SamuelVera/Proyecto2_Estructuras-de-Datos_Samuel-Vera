package ManejadorDeLaApp;

import CodigoEstructuras.*;

public abstract class Sala {
    
    protected Sucursal sucursal;
    protected int numero;
    protected Cola peliculas;
    protected ListaSimple ticketsVendidosDia;
    protected double venta = 0;

    public Sala(int numero, Sucursal sucursal) {
        
        this.numero = numero;
        this.sucursal = sucursal;
        
    }
    
    public abstract int getNumero();
    public abstract void agregarTicketVendido();
    public abstract void ventas();
    public abstract void agregarPelicula(Pelicula pelicula);
    public abstract void verPeliculas();
}
