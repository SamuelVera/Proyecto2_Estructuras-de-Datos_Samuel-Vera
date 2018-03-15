package ManejadorDeLaApp;

import CodigoEstructuras.Cola;

public class Sala2D extends Sala{
    
    public Sala2D(int numero, Sucursal sucursal) {
        super(numero, sucursal);
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

    @Override
    public int getNumero() {
        return this.numero;
    }

    @Override
    public Pelicula getPelicula() {
        return (Pelicula)this.peliculas.getPrimeroEnCola();
    }
    
}
