package ManejadorDeLaApp;

import CodigoEstructuras.Cola;

public class Sala2D extends Sala{
    
    public Sala2D(int numero, Cola peliculas) {
        super(numero, peliculas);
    }

    @Override
    public void verPeliculas() {
        System.out.println("Función en 2D");
    }
    
    @Override
    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.encolar(pelicula);
    }

    @Override
    public void ventas() {
        this.venta += Ticket.getPrecio2D();
    }

    @Override
    public void agregarTicketVendido() {
        this.ticketsVendidosDia.insertPrimero(1);
    }
}
