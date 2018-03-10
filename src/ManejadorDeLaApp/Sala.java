package ManejadorDeLaApp;

import CodigoEstructuras.Cola;
import CodigoEstructuras.ListaSimple;

public abstract class Sala {
    
    protected int numero;
    protected Cola peliculas;
    protected ListaSimple ticketsVendidosDia;
    protected double venta = 0;

    public Sala(int numero, Cola peliculas) {
        this.numero = numero;
        this.peliculas = peliculas;
    }
    
    public abstract void agregarTicketVendido();
    public abstract void ventas();
    public abstract void agregarPelicula(Pelicula pelicula);
    public abstract void verPeliculas();
}
